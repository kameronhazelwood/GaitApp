package com.example.gaitlabapp.services;

import javafx.beans.property.*;
import javafx.concurrent.ScheduledService;
import javafx.concurrent.Task;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.*;

import static java.nio.file.LinkOption.NOFOLLOW_LINKS;
import static java.nio.file.StandardWatchEventKinds.*;

import static java.nio.file.StandardWatchEventKinds.*;

public class WatchDirService {
    private final WatchService watcher;
    private final Map<WatchKey,Path> keys;
    private boolean trace;

    private ReadOnlyStringWrapper dir = new ReadOnlyStringWrapper(this, "dir");
    public final String getDir() { return dir.get(); }
    public final ReadOnlyStringProperty dirProperty() { return dir.getReadOnlyProperty(); }

    private ReadOnlyBooleanWrapper recursive = new ReadOnlyBooleanWrapper(this, "recursive");
    public boolean isRecursive() { return recursive.get(); }
    public ReadOnlyBooleanProperty recursiveProperty() { return recursive; }

    @SuppressWarnings("unchecked")
    private static <T> WatchEvent<T> cast(WatchEvent<?> event) {
        return (WatchEvent<T>)event;
    }

    /**
     * Creates a WatchService and registers the given directory
     */
    public WatchDirService(Path dir, boolean recursive) throws IOException {
        this.watcher = FileSystems.getDefault().newWatchService();
        this.keys = new HashMap<>();
        this.dir.set(dir.toString());
        this.recursive.set(recursive);

        if (recursive) {
            System.out.format("Scanning %s ...\n", dir);
            registerAll(dir);
            System.out.println("Done.");
        } else {
            register(dir);
        }

        // enable trace after initial registration
        this.trace = true;
    }

    /**
     * Register the given directory with the WatchService
     */
    private void register(Path dir) throws IOException {
        WatchKey key = dir.register(watcher, ENTRY_CREATE, ENTRY_DELETE, ENTRY_MODIFY);
        if (trace) {
            Path prev = keys.get(key);
            if (prev == null) {
                System.out.format("register: %s\n", dir);
            } else {
                if (!dir.equals(prev)) {
                    System.out.format("update: %s -> %s\n", prev, dir);
                }
            }
        }
        keys.put(key, dir);
    }

    /**
     * Register the given directory, and all its sub-directories, with the
     * WatchService.
     */
    private void registerAll(final Path start) throws IOException {
        // register directory and sub-directories
        Files.walkFileTree(start, new SimpleFileVisitor<Path>() {
            @Override
            public FileVisitResult preVisitDirectory(Path dir, BasicFileAttributes attrs)
                    throws IOException
            {
                register(dir);
                return FileVisitResult.CONTINUE;
            }
        });
    }


    protected Task<List<WatchEvent<Path>>> createTask() {
        return new WatchTask();
    }

    class WatchTask extends Task<List<WatchEvent<Path>>> {
        @Override
        protected List<WatchEvent<Path>> call() {
            // wait for key to be signalled
            WatchKey key;
            try {
                key = watcher.take();
            } catch (InterruptedException x) {
                if (isCancelled()) {
                    updateMessage("Cancelled");
                }

                return Collections.emptyList();
            }

            Path dir = keys.get(key);
            if (dir == null) {
                System.err.println("WatchKey not recognized");
                return Collections.emptyList();
            }

            List<WatchEvent<Path>> interestingEvents = new ArrayList<>();
            for (WatchEvent<?> event: key.pollEvents()) {
                WatchEvent.Kind kind = event.kind();

                if (kind == OVERFLOW) {
                    continue;
                }

                // Context for directory entry event is the file name of entry
                WatchEvent<Path> pathWatchEvent = cast(event);
                Path name = pathWatchEvent.context();
                Path child = dir.resolve(name);

                interestingEvents.add(pathWatchEvent);

                // if directory is created, and watching recursively, then
                // register it and its sub-directories
                if (recursive.get() && (kind == ENTRY_CREATE)) {
                    try {
                        if (Files.isDirectory(child, NOFOLLOW_LINKS)) {
                            registerAll(child);
                        }
                    } catch (IOException x) {
                        System.err.println("Unable to register created directory for watching: " + child);
                    }
                }
            }

            // reset key and remove from set if directory no longer accessible
            boolean valid = key.reset();
            if (!valid) {
                keys.remove(key);


                // if all directories are inaccessible
                // even the root watch directory
                // might wight want to cancel the service.
                if (keys.isEmpty()) {
                    System.out.println("No directories being watched");
                }
            }

            return Collections.unmodifiableList(
                    interestingEvents
            );
        }
    }


}

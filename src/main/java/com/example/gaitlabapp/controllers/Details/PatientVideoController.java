package com.example.gaitlabapp.controllers.Details;

import javafx.application.Platform;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.event.ChangeListener;
import java.io.File;
import java.io.IOException;
import java.nio.file.*;

public class PatientVideoController {
    public Button addNewButton;
    public Pane pane;
    public ListView<File> videos;
  //  private static final Path VIDEOS_FOLDER = Paths.get(System.getProperty("user.home"), "images");


    @FXML
    public void initialize() {
//        if (!Files.exists(VIDEOS_FOLDER)) {
//            try {
//                Files.createDirectory(VIDEOS_FOLDER);
//                System.out.println(VIDEOS_FOLDER);
//                System.out.println(Files.createDirectory(VIDEOS_FOLDER));
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }

        Thread watchFilesThread = new Thread(this::onWatchListener);
        watchFilesThread.setDaemon(true);
        watchFilesThread.start();

    }

    public void onWatchListener() {
        try {
            Path directoryPath = Paths.get("C:\\Users\\test");

            WatchService watchService = FileSystems.getDefault().newWatchService();

            directoryPath.register(watchService,
                    StandardWatchEventKinds.ENTRY_CREATE);

            System.out.println("Watching directory: " + directoryPath);

            while (true) {
                WatchKey key = watchService.take();
                    for (WatchEvent<?> event : key.pollEvents())
                    {
                        // Handle the specific event
                        if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE)
                        {
                            System.out.println("File created: " + event.context());
                        }
                        else if (event.kind() == StandardWatchEventKinds.ENTRY_DELETE)
                        {
                            System.out.println("File deleted: " + event.context());
                        }
                        else if (event.kind() == StandardWatchEventKinds.ENTRY_MODIFY)
                        {
                            System.out.println("File modified: " + event.context());
                        }
                    }
                key.reset();
            }
        } catch (IOException | InterruptedException e) {
            e.printStackTrace();
        }
    }


    public void onAddNew(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select file to add to Patient's account");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Select Media Files: ", "*.mp4*")
        );

        fileChooser.setInitialDirectory(new File("C:\\dev"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            videos.getItems().add(new File(selectedFile.getName()));
        }
    }
}


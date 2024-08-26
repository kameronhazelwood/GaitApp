package com.example.gaitlabapp.controllers.Details;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

import javafx.scene.control.Button;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.*;
import java.util.ResourceBundle;

import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.WatchEvent;

import static javafx.scene.image.Image.*;
import java.io.IOException;
import java.nio.file.*;

public class PatientPhotosController {
    public Button addNewButton;
    public Pane pane;
    public ImageView imageview1;
    @FXML
    public ListView<Image> photoListView;

    private static final Path IMAGES_FOLDER = Paths.get(
            System.getProperty("user.home"), "Images"
    );

    @FXML
    public void initialize() throws IOException{
        if (! Files.exists(IMAGES_FOLDER)) {
            try {
                Files.createDirectory(IMAGES_FOLDER);
                System.out.println(IMAGES_FOLDER);
                System.out.println(Files.createDirectory(IMAGES_FOLDER));

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        Thread watchFilesThread = new Thread(this::onWatchListener);
        watchFilesThread.setDaemon(true);
        watchFilesThread.start();

        photoListView.getSelectionModel().selectedItemProperty();
        photoListView.setCellFactory( p -> new ListCell<>() {
            @Override
            protected void updateItem(Image image, boolean empty) {
                super.updateItem(image, empty);
                if (empty || image == null) {
                    setText(null);
                    setGraphic(null);
                } else {
                    // TODO: make this prettier
                    imageview1.setImage(image);
                    setGraphic(imageview1);
                    //setText(image.getUrl());
                }
            }
        });

    }

    public void onAddNew(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select file to add to Patient's account");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*jpg")
        );

        fileChooser.setInitialDirectory(new File("C:\\dev"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            Image newImage = new Image(selectedFile.toURI().toString());
            imageview1.setImage(newImage);
            imageview1.setFitWidth(250);
            imageview1.setFitHeight(250);
        }
    }

    public void onWatchListener() {
//        try {
//            Path directoryPath = Paths.get("C:\\Users\\sh0184\\images");
//
//            WatchService watchService = FileSystems.getDefault().newWatchService();
//
//            directoryPath.register(watchService,
//                    StandardWatchEventKinds.ENTRY_CREATE);
//
//            System.out.println("Watching directory: " + directoryPath);
//
//            while (true) {
//              //  ListView<String> events = new ListView<>();
//                WatchKey key = watchService.take();
//
//                for (WatchEvent<?> event : key.pollEvents()) {
//                    if (event.kind() == StandardWatchEventKinds.ENTRY_CREATE) {
//                        System.out.println("File created: " + event.context());
//
//
//                    }
//                }
//                key.reset();
//            }
//        } catch (IOException | InterruptedException e) {
//            e.printStackTrace();
//        }

        try {
            WatchService watchService = FileSystems.getDefault().newWatchService();
            IMAGES_FOLDER.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
            boolean done = false;
            while (! done) {
                WatchKey key = watchService.take();
                System.out.println("key");
                for (WatchEvent<?> event : key.pollEvents()) {
                    System.out.println("Event");
                    if (event.kind().type() == Path.class) {
                        Path path = ((WatchEvent<Path>)event).context();
                        Platform.runLater(() -> addImage(IMAGES_FOLDER.resolve(path)));
                    }
                    done = ! key.reset();
                }
            }
        } catch (Exception exc) {
            exc.printStackTrace();
        }

    }

    private void addImage(Path imagePath) {
        Image image = new Image(imagePath.toUri().toString());
//        image.exceptionProperty().get(e -> {
//            if (e != null) {
//                System.out.println("");
//            }
//        });
        photoListView.getItems().add(image);
        photoListView.getSelectionModel().select(image);
    }
}


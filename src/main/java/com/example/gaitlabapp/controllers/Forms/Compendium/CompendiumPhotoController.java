//package com.example.gaitlabapp.controllers.Forms.Compendium;
//
//
//import com.example.gaitlabapp.controllers.NewPatientModuleController;
//import com.example.gaitlabapp.controllers.Visits.VisitDetailsGaitController;
//import javafx.application.Platform;
//import javafx.fxml.FXML;
//import javafx.fxml.Initializable;
//import javafx.scene.control.CheckBox;
//import javafx.scene.control.ListCell;
//import javafx.scene.control.ListView;
//import javafx.scene.image.Image;
//import javafx.scene.image.ImageView;
//import javafx.scene.input.*;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.Pane;
//import lombok.RequiredArgsConstructor;
//import org.springframework.beans.factory.config.ConfigurableBeanFactory;
//import org.springframework.context.annotation.Scope;
//import org.springframework.stereotype.Component;
//
//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.IOException;
//import java.net.URL;
//import java.nio.file.*;
//import java.util.ResourceBundle;
//@Component
//@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
//@RequiredArgsConstructor
//public class CompendiumPhotoController implements Initializable {
//    public ImageView photoImageView;
//    public ImageView photoImageView1;
//    public ImageView photoImageView2;
//    public ImageView photoImageView4;
//    public ImageView photoImageView5;
//    public AnchorPane anchorPane;
//    public ImageView photoImageView6;
//    public ImageView imageview1;
//    public ImageView imageview2;
//
//    @FXML
//    public ListView<Image> photoListView;
////
////    @FXML
////    private ListView<Image> photoListView1;
////
////    @FXML
////    private ListView<Image> photoListView2;
////
////    @FXML
////    private ListView<Image> photoListView3;
////
////    @FXML
////    private ListView<Image> photoListView4;
////
////    @FXML
////    private ListView<Image> photoListView5;
//  //  Path PATIENTS_PHOTOS = Paths.get("C:\\dev\\GaitApp\\PatientDocuments");
//    private static final Path PATIENTS_PHOTOS = Paths.get(
//            System.getProperty("user.home"), "test"
//    );
//
//
////    Image bodyPosterior = new Image(String.valueOf(getClass().getResource("/Rowan/GPPosterior.jpg")));
////    Image bodyAnterior = new Image(String.valueOf(getClass().getResource("/Rowan/GPAnterior.jpg")));
////    Image feetPosterior = new Image(String.valueOf(getClass().getResource("/Rowan/GPFeetPosterior.jpg")));
////    Image feetPosterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/GPFeetPosterior2.jpg")));
////    Image bodyAnterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/GPBodyAnterior2.jpg")));
////    Image bodyPosterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/GPBodyPosterior2.jpg")));
////
////    VisitDetailsGaitController visitDetailsGaitController;
//
//    @Override
//    public void initialize(URL url, ResourceBundle resourceBundle) {
//
////        ImageView imageView1 = new ImageView(bodyPosterior);
////        imageView1.setFitWidth(180);
////        imageView1.setFitHeight(180);
////
////        imageView1.setX(210);
////        imageView1.setY(95);
////
////        ImageView imageView2 = new ImageView(bodyAnterior);
////        imageView2.setFitWidth(180);
////        imageView2.setFitHeight(180);
////
////        imageView2.setY(95);
////        imageView2.setX(13);
////
////        ImageView imageView3 = new ImageView(feetPosterior);
////        imageView3.setFitWidth(180);
////        imageView3.setFitHeight(180);
////
////        imageView3.setY(95);
////        imageView3.setX(420);
////
////        ImageView imageView4 = new ImageView(feetPosterior2);
////        imageView4.setFitWidth(180);
////        imageView4.setFitHeight(180);
////
////        imageView4.setY(400);
////        imageView4.setX(13);
////
////        ImageView imageView5 = new ImageView(bodyAnterior2);
////        imageView5.setFitWidth(180);
////        imageView5.setFitHeight(180);
////
////        imageView5.setY(400);
////        imageView5.setX(210);
////
////        ImageView imageView6 = new ImageView(bodyPosterior2);
////        imageView6.setFitWidth(180);
////        imageView6.setFitHeight(180);
////
////        imageView6.setY(400);
////        imageView6.setX(410);
////
////        anchorPane.getChildren().add(imageView1);
////        anchorPane.getChildren().add(imageView2);
////        anchorPane.getChildren().add(imageView3);
////        anchorPane.getChildren().add(imageView4);
////        anchorPane.getChildren().add(imageView5);
////        anchorPane.getChildren().add(imageView6);
//
//        if (!Files.exists(PATIENTS_PHOTOS)) {
//            try {
//                Files.createDirectory(PATIENTS_PHOTOS);
//                System.out.println(PATIENTS_PHOTOS);
//                System.out.println(Files.createDirectory(PATIENTS_PHOTOS));
//
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
//        }
//
//        Thread watchFilesThread = new Thread(this::onWatchListener);
//        watchFilesThread.setDaemon(true);
//        watchFilesThread.start();
//
//        photoListView.getSelectionModel().selectedItemProperty();
//        photoListView.setCellFactory(p -> new ListCell<Image>() {
//            protected void updateItem(Image image, boolean empty) {
//                super.updateItem(image, empty);
//                if (empty || image == null) {
//                    setText(null);
//                    setGraphic(null);
//                } else {
//                    imageview1.setImage(image);
//                    setGraphic(imageview1);
//                    //setText(image.getUrl());
//                }
//            }
//        });
//
//    }
//
//    public void onWatchListener() {
//        try {
//            WatchService watchService = FileSystems.getDefault().newWatchService();
//            PATIENTS_PHOTOS.register(watchService, StandardWatchEventKinds.ENTRY_CREATE);
//            boolean done = false;
//            while (!done) {
//                WatchKey key = watchService.take();
//                System.out.println("key");
//                for (WatchEvent<?> event : key.pollEvents()) {
//                    System.out.println("Event");
//                    if (event.kind().type() == Path.class) {
//                        Path path = ((WatchEvent<Path>) event).context();
//                        Platform.runLater(() -> addImage(PATIENTS_PHOTOS.resolve(path)));
//                    }
//                    done = !key.reset();
//                }
//            }
//        } catch (Exception exc) {
//            exc.printStackTrace();
//        }
//    }
//
//    private void addImage(Path imagePath) {
//        Image image = new Image(imagePath.toUri().toString());
//        photoListView.getItems().add(image);
//        photoListView.getSelectionModel().select(image);
//    }
//
////    public void setPhotoImages(){
////        ImageView imageView1 = new ImageView(bodyPosterior);
////        imageView1.setFitWidth(180);
////        imageView1.setFitHeight(180);
////
////        imageView1.setX(210);
////        imageView1.setY(95);
////
////        anchorPane.getChildren().add(imageView1);
////    }
//    @FXML
//    void imageViewDragDropped(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            photoImageView.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDropped1(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            try {
//                photoImageView1.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDropped2(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            try {
//                photoImageView2.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDropped4(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            try {
//                photoImageView4.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDropped5(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            photoImageView5.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDropped6(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            try {
//                photoImageView6.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
//            } catch (FileNotFoundException e) {
//                throw new RuntimeException(e);
//            }
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragOver(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
//        }
//
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragOver1(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
//        }
//
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragOver2(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
//        }
//
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragOver4(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
//        }
//
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragOver5(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
//        }
//
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragOver6(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDetected(MouseEvent event) {
//        Dragboard dragboard = photoImageView.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent content = new ClipboardContent();
//        content.putImage(photoImageView.getImage());
//        dragboard.setContent(content);
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDetected1(MouseEvent event) {
//        Dragboard dragboard = photoImageView1.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent content = new ClipboardContent();
//        content.putImage(photoImageView1.getImage());
//        dragboard.setContent(content);
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDetected2(MouseEvent event) {
//        Dragboard dragboard = photoImageView2.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent content = new ClipboardContent();
//        content.putImage(photoImageView2.getImage());
//        dragboard.setContent(content);
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDetected5(MouseEvent event) {
//        Dragboard dragboard = photoImageView5.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent content = new ClipboardContent();
//        content.putImage(photoImageView5.getImage());
//        dragboard.setContent(content);
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDetected6(MouseEvent event) {
//        Dragboard dragboard = photoImageView6.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent content = new ClipboardContent();
//        content.putImage(photoImageView6.getImage());
//        dragboard.setContent(content);
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDragDetected4(MouseEvent event) {
//        Dragboard dragboard = photoImageView4.startDragAndDrop(TransferMode.ANY);
//        ClipboardContent content = new ClipboardContent();
//        content.putImage(photoImageView4.getImage());
//        dragboard.setContent(content);
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDraggedOn(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage()) {
//            photoImageView.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDraggedOn1(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage()) {
//            photoImageView1.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDraggedOn2(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage()) {
//            photoImageView2.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDraggedOn5(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage()) {
//            photoImageView5.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDraggedOn4(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage()) {
//            photoImageView4.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//    @FXML
//    void imageViewDraggedOn6(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage()) {
//            photoImageView6.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }
//
//}

package com.example.gaitlabapp.controllers.Forms.Compendium;


import com.example.gaitlabapp.controllers.NewPatientModuleController;
import com.example.gaitlabapp.controllers.Visits.VisitDetailsGaitController;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.URL;
import java.nio.file.*;
import java.util.ResourceBundle;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class CompendiumPhotoController implements Initializable {
    public ImageView photoImageView;
    public ImageView photoImageView1;
    public ImageView photoImageView2;
    public ImageView photoImageView4;
    public ImageView photoImageView5;
    public AnchorPane anchorPane;
    public ImageView photoImageView6;
    public ImageView imageview1;
    public ImageView imageview2;

    @FXML
    public ListView<Image> photoListView;
//
//    @FXML
//    private ListView<Image> photoListView1;
//
//    @FXML
//    private ListView<Image> photoListView2;
//
//    @FXML
//    private ListView<Image> photoListView3;
//
//    @FXML
//    private ListView<Image> photoListView4;
//
//    @FXML
//    private ListView<Image> photoListView5;
  //  Path PATIENTS_PHOTOS = Paths.get("C:\\dev\\GaitApp\\PatientDocuments");
//    private static final Path PATIENTS_PHOTOS = Paths.get(
//            System.getProperty("user.home"), "test"
//    );


    public ListView photoListView1;
    public ListView photoListView2;
    public ListView photoListView3;
    public ListView photoListView4;
    public ListView photoListView5;
    public ImageView photoImageView7;
    public ImageView photoImageView8;
    public ImageView photoImageView9;
    public ImageView photoImageView10;
    public ImageView photoImageView11;
    public ImageView photoImageView12;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image bodyPosterior = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_body posterior.jpg")));
        Image bodyAnterior = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_body anterior.jpg")));
        Image feetPosterior = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_feet both posterior.jpg")));
        Image feetPosterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_foot left posterior.jpg")));
        Image bodyAnterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_foot_right_posterior.jpg")));
        Image bodyPosterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_feet both leftside.jpg")));

        Image bodyPosterior3 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_feet both anterior60.jpg")));
        Image bodyAnterior3 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_feet both anterior0.jpg")));
        Image feetPosterior3 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_face.jpg")));
        Image feetPosterior4 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_body right_2.jpg")));
        Image bodyAnterior4 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_body right.jpg")));
        Image bodyPosterior4 = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_body left.jpg")));
        Image name = new Image(String.valueOf(getClass().getResource("/Rowan/photos/32581055_111122_name.jpg")));

        //Image newbodyAnterior = new Image(String.valueOf(getClass().getResource("/Rowan/1/17/2025/32581055_011725_AnkleJointAngles.png")));


        ImageView imageView1 = new ImageView(name);
        imageView1.setFitWidth(600);
        imageView1.setFitHeight(285);

        imageView1.setX(5);
        imageView1.setY(35);

        ImageView imageView2 = new ImageView(bodyAnterior);
        imageView2.setFitWidth(534);
        imageView2.setFitHeight(559);

        imageView2.setY(336);
        imageView2.setX(5);

        ImageView imageView3 = new ImageView(feetPosterior3);
        imageView3.setFitWidth(534);
        imageView3.setFitHeight(559);

        imageView3.setY(909);
        imageView3.setX(5);

        ImageView imageView4 = new ImageView(feetPosterior2);
        imageView4.setFitWidth(534);
        imageView4.setFitHeight(559);

        imageView4.setY(1451);
        imageView4.setX(5);

        ImageView imageView5 = new ImageView(bodyAnterior2);
        imageView5.setFitWidth(534);
        imageView5.setFitHeight(559);

        imageView5.setY(1979);
        imageView5.setX(5);

        ImageView imageView6 = new ImageView(bodyPosterior2);
        imageView6.setFitWidth(534);
        imageView6.setFitHeight(559);

        imageView6.setY(2538);
        imageView6.setX(5);

        ImageView imageView7 = new ImageView(bodyPosterior3);
        imageView7.setFitWidth(534);
        imageView7.setFitHeight(559);

        imageView7.setY(3097);
        imageView7.setX(5);

        ImageView imageView8 = new ImageView(bodyAnterior3);
        imageView8.setFitWidth(534);
        imageView8.setFitHeight(559);

        imageView8.setY(3656);
        imageView8.setX(5);

        ImageView imageView9 = new ImageView(feetPosterior);
        imageView9.setFitWidth(534);
        imageView9.setFitHeight(559);

        imageView9.setY(4215);
        imageView9.setX(5);

        ImageView imageView10 = new ImageView(bodyAnterior4);
        imageView10.setFitWidth(534);
        imageView10.setFitHeight(559);

        imageView10.setY(4774);
        imageView10.setX(5);
//
//        ImageView imageView11 = new ImageView(bodyPosterior4);
//        imageView11.setFitWidth(180);
//        imageView11.setFitHeight(180);
//
//        imageView11.setY(918);
//        imageView11.setX(918);
//
//        ImageView imageView12 = new ImageView(feetPosterior4);
//        imageView12.setFitWidth(180);
//        imageView12.setFitHeight(180);
//
//        imageView12.setY(918);
//        imageView12.setX(229);



        anchorPane.getChildren().add(imageView1);
        anchorPane.getChildren().add(imageView2);
        anchorPane.getChildren().add(imageView3);
        anchorPane.getChildren().add(imageView4);
        anchorPane.getChildren().add(imageView5);
        anchorPane.getChildren().add(imageView6);
        anchorPane.getChildren().add(imageView7);
        anchorPane.getChildren().add(imageView8);
        anchorPane.getChildren().add(imageView9);
        anchorPane.getChildren().add(imageView10);
//        anchorPane.getChildren().add(imageView11);
//        anchorPane.getChildren().add(imageView12);



    }

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

//    private void addImage(Path imagePath) {
//        Image image = new Image(imagePath.toUri().toString());
//        photoListView.getItems().add(image);
//        photoListView.getSelectionModel().select(image);
//    }

//    public void setPhotoImages(){
//        ImageView imageView1 = new ImageView(bodyPosterior);
//        imageView1.setFitWidth(180);
//        imageView1.setFitHeight(180);
//
//        imageView1.setX(210);
//        imageView1.setY(95);
//
//        anchorPane.getChildren().add(imageView1);
//    }
//    @FXML
//    void imageViewDragDropped(DragEvent event) {
//        Dragboard dragboard = event.getDragboard();
//        if (dragboard.hasImage() || dragboard.hasFiles()) {
//            photoImageView.setImage(dragboard.getImage());
//        }
//        event.consume();
//    }

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

    @FXML
    void imageViewDragDropped4(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            try {
                photoImageView4.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        event.consume();
    }

    @FXML
    void imageViewDragDropped5(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            photoImageView5.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDragDropped6(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            try {
                photoImageView6.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        event.consume();
    }

    @FXML
    void imageViewDragOver(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        event.consume();
    }

    @FXML
    void imageViewDragOver1(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        event.consume();
    }

    @FXML
    void imageViewDragOver2(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        event.consume();
    }

    @FXML
    void imageViewDragOver4(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        event.consume();
    }

    @FXML
    void imageViewDragOver5(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }

        event.consume();
    }

    @FXML
    void imageViewDragOver6(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
        }
        event.consume();
    }

    @FXML
    void imageViewDragDetected(MouseEvent event) {
        Dragboard dragboard = photoImageView.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putImage(photoImageView.getImage());
        dragboard.setContent(content);
        event.consume();
    }

    @FXML
    void imageViewDragDetected1(MouseEvent event) {
        Dragboard dragboard = photoImageView1.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putImage(photoImageView1.getImage());
        dragboard.setContent(content);
        event.consume();
    }

    @FXML
    void imageViewDragDetected2(MouseEvent event) {
        Dragboard dragboard = photoImageView2.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putImage(photoImageView2.getImage());
        dragboard.setContent(content);
        event.consume();
    }

    @FXML
    void imageViewDragDetected5(MouseEvent event) {
        Dragboard dragboard = photoImageView5.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putImage(photoImageView5.getImage());
        dragboard.setContent(content);
        event.consume();
    }

    @FXML
    void imageViewDragDetected6(MouseEvent event) {
        Dragboard dragboard = photoImageView6.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putImage(photoImageView6.getImage());
        dragboard.setContent(content);
        event.consume();
    }

    @FXML
    void imageViewDragDetected4(MouseEvent event) {
        Dragboard dragboard = photoImageView4.startDragAndDrop(TransferMode.ANY);
        ClipboardContent content = new ClipboardContent();
        content.putImage(photoImageView4.getImage());
        dragboard.setContent(content);
        event.consume();
    }

    @FXML
    void imageViewDraggedOn(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()) {
            photoImageView.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDraggedOn1(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()) {
            photoImageView1.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDraggedOn2(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()) {
            photoImageView2.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDraggedOn5(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()) {
            photoImageView5.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDraggedOn4(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()) {
            photoImageView4.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDraggedOn6(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()) {
            photoImageView6.setImage(dragboard.getImage());
        }
        event.consume();
    }

}

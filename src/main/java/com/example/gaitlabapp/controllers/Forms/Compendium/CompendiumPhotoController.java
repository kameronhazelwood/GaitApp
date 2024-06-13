package com.example.gaitlabapp.controllers.Forms.Compendium;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.*;
import javafx.scene.layout.AnchorPane;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.net.URL;
import java.util.ResourceBundle;

public class CompendiumPhotoController implements Initializable {
    public ImageView photoImageView;
    public ImageView photoImageView1;
    public ImageView photoImageView2;
    public ImageView photoImageView4;
    public ImageView photoImageView5;
    public AnchorPane anchorPane;
    public ImageView photoImageView6;
    public ImageView imageView1;
    public ImageView imageView2;
    public ImageView imageView3;



    Image bodyPosterior = new Image(String.valueOf(getClass().getResource("/TestPhotos/99999999_081823_body posterior.jpg")));
    Image bodyAnterior = new Image(String.valueOf(getClass().getResource("/TestPhotos/99999999_081823_body anterior.jpg")));
    Image feetPosterior = new Image(String.valueOf(getClass().getResource("/TestPhotos/99999999_081823_feet both posterior.jpg")));


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        ImageView imageView1 = new ImageView(bodyPosterior);
        imageView1.setFitWidth(180);
        imageView1.setFitHeight(180);

        imageView1.setX(210);
        imageView1.setY(95);

        ImageView imageView2 = new ImageView(bodyAnterior);
        imageView2.setFitWidth(180);
        imageView2.setFitHeight(180);

        imageView2.setY(95);
        imageView2.setX(13);

        ImageView imageView3 = new ImageView(feetPosterior);
        imageView3.setFitWidth(180);
        imageView3.setFitHeight(180);

        imageView3.setY(95);
        imageView3.setX(420);

        anchorPane.getChildren().add(imageView1);
        anchorPane.getChildren().add(imageView2);
        anchorPane.getChildren().add(imageView3);

    }

    @FXML
    void imageViewDragDropped(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            photoImageView.setImage(dragboard.getImage());
        }
        event.consume();
    }
    @FXML
    void imageViewDragDropped1(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            try {
                photoImageView1.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        event.consume();
    }
    @FXML
    void imageViewDragDropped2(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage() || dragboard.hasFiles()) {
            try {
                photoImageView2.setImage(new Image(new FileInputStream(dragboard.getFiles().get(0))));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
        event.consume();
    }
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
    void imageViewDragDetected(MouseEvent event)  {
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
        if(dragboard.hasImage()){
            photoImageView.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDraggedOn1(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()){
            photoImageView1.setImage(dragboard.getImage());
        }
        event.consume();
    }
    @FXML
    void imageViewDraggedOn2(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()){
            photoImageView2.setImage(dragboard.getImage());
        }
        event.consume();
    }
    @FXML
    void imageViewDraggedOn5(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()){
            photoImageView5.setImage(dragboard.getImage());
        }
        event.consume();
    }

    @FXML
    void imageViewDraggedOn4(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()){
            photoImageView4.setImage(dragboard.getImage());
        }
        event.consume();
    }
    @FXML
    void imageViewDraggedOn6(DragEvent event) {
        Dragboard dragboard = event.getDragboard();
        if (dragboard.hasImage()){
            photoImageView6.setImage(dragboard.getImage());
        }
        event.consume();
    }

}

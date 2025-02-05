package com.example.gaitlabapp.controllers.Forms.Compendium.test;

import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CompendiumPhotos2Controller implements Initializable {
    public ImageView photoImageView;
    public ImageView photoImageView1;
    public ImageView photoImageView2;
    public ImageView photoImageView4;
    public ImageView photoImageView5;
    public AnchorPane anchorPane;
    public ImageView photoImageView6;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image bodyPosterior = new Image(String.valueOf(getClass().getResource("/Rowan/bodyPosterior.jpg")));
        Image bodyAnterior = new Image(String.valueOf(getClass().getResource("/Rowan/bodyAnterior.jpg")));
        Image feetPosterior = new Image(String.valueOf(getClass().getResource("/Rowan/feetPosterior.jpg")));
        Image feetPosterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/feetPosterior2.jpg")));
        Image bodyAnterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/bodyAnterior2.jpg")));
        Image bodyPosterior2 = new Image(String.valueOf(getClass().getResource("/Rowan/bodyPosterior2.jpg")));


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

        ImageView imageView4 = new ImageView(feetPosterior2);
        imageView4.setFitWidth(180);
        imageView4.setFitHeight(180);

        imageView4.setY(400);
        imageView4.setX(13);

        ImageView imageView5 = new ImageView(bodyAnterior2);
        imageView5.setFitWidth(180);
        imageView5.setFitHeight(180);

        imageView5.setY(400);
        imageView5.setX(210);

        ImageView imageView6 = new ImageView(bodyPosterior2);
        imageView6.setFitWidth(180);
        imageView6.setFitHeight(180);

        imageView6.setY(400);
        imageView6.setX(410);

        anchorPane.getChildren().add(imageView1);
        anchorPane.getChildren().add(imageView2);
        anchorPane.getChildren().add(imageView3);
        anchorPane.getChildren().add(imageView4);
        anchorPane.getChildren().add(imageView5);
        anchorPane.getChildren().add(imageView6);
    }
}

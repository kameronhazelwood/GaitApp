package com.example.gaitlabapp.controllers.Forms.Compendium;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CompendiumPngController implements Initializable {
    public AnchorPane anchorPane;

    @FXML
    private ImageView photoImageView;

    @FXML
    private ImageView photoImageView1;

    @FXML
    private ImageView photoImageView10;

    @FXML
    private ImageView photoImageView11;

    @FXML
    private ImageView photoImageView12;

    @FXML
    private ImageView photoImageView2;

    @FXML
    private ImageView photoImageView4;

    @FXML
    private ImageView photoImageView5;

    @FXML
    private ImageView photoImageView6;

    @FXML
    private ImageView photoImageView7;

    @FXML
    private ImageView photoImageView8;

    @FXML
    private ImageView photoImageView9;

    @FXML
    private ListView<?> photoListView;

    @FXML
    private ListView<?> photoListView1;

    @FXML
    private ListView<?> photoListView2;

    @FXML
    private ListView<?> photoListView3;

    @FXML
    private ListView<?> photoListView31;

    @FXML
    private ListView<?> photoListView311;

    @FXML
    private ListView<?> photoListView4;

    @FXML
    private ListView<?> photoListView41;

    @FXML
    private ListView<?> photoListView411;

    @FXML
    private ListView<?> photoListView5;

    @FXML
    private ListView<?> photoListView51;

    @FXML
    private ListView<?> photoListView511;

    Image ankleAngles = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_GroundReactionForces.png")));
    Image ankleMovements = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_Hallux.png")));
    Image arch = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_HindFoot.png")));
    Image armAngles = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_HipJointAngles.png")));
    Image emgWave = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_HipJointMoments.png")));
    Image footOrientation = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_KneeJointAngles.png")));
    Image forefoot = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_ForeFoot.png")));
    Image groundForces = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_KneeJointMoments.png")));
    Image hallux = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_LateralForeFoot.png")));
    Image medialFoot = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_MedialForeFoot.png")));
    Image multibalance = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_MultiBalancePage1.png")));
    Image multipiolt = new Image(String.valueOf(getClass().getResource("/PNG/32581055_111122_MultiBalancePage1.png")));


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView imageView1 = new ImageView(ankleAngles);
        imageView1.setFitWidth(600);
        imageView1.setFitHeight(500);
        imageView1.setX(0);
        imageView1.setY(0);

        ImageView imageView2 = new ImageView(ankleMovements);
        imageView2.setFitWidth(600);
        imageView2.setFitHeight(500);
        imageView2.setX(0);
        imageView2.setY(510);

        ImageView imageView3 = new ImageView(arch);
        imageView3.setFitHeight(500);
        imageView3.setFitWidth(600);
        imageView3.setX(0);
        imageView3.setY(1020);

        ImageView imageView4 = new ImageView(armAngles);
        imageView4.setFitHeight(500);
        imageView4.setFitWidth(600);
        imageView4.setX(0);
        imageView4.setY(1530);

        ImageView imageView5 = new ImageView(emgWave);
        imageView5.setFitHeight(500);
        imageView5.setFitWidth(600);
        imageView5.setX(0);
        imageView5.setY(2040);

        ImageView imageView6 = new ImageView(footOrientation);
        imageView6.setFitHeight(500);
        imageView6.setFitWidth(600);
        imageView6.setX(0);
        imageView6.setY(2550);

        ImageView imageView7 = new ImageView(forefoot);
        imageView7.setFitHeight(500);
        imageView7.setFitWidth(600);
        imageView7.setX(0);
        imageView7.setY(3060);

        ImageView imageView8 = new ImageView(groundForces);
        imageView8.setFitHeight(500);
        imageView8.setFitWidth(600);
        imageView8.setX(0);
        imageView8.setY(3570);

        ImageView imageView9 = new ImageView(hallux);
        imageView9.setFitHeight(500);
        imageView9.setFitWidth(600);
        imageView9.setX(0);
        imageView9.setY(4080);

        anchorPane.getChildren().add(imageView1);
        anchorPane.getChildren().add(imageView2);
        anchorPane.getChildren().add(imageView3);
        anchorPane.getChildren().add(imageView4);
        anchorPane.getChildren().add(imageView5);
        anchorPane.getChildren().add(imageView6);
        anchorPane.getChildren().add(imageView7);
        anchorPane.getChildren().add(imageView8);
        anchorPane.getChildren().add(imageView9);


    }
}

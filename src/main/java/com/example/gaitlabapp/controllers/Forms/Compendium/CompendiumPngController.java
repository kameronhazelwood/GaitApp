package com.example.gaitlabapp.controllers.Forms.Compendium;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class CompendiumPngController implements Initializable {
    public AnchorPane anchorPane;
    @FXML
    private ImageView iv0;

    @FXML
    private ImageView iv1;

    @FXML
    private ImageView iv2;

    @FXML
    private ImageView iv3;

    @FXML
    private ImageView iv4;

    @FXML
    private ImageView iv5;
    @FXML
    private ImageView iv6;
    @FXML
    private ImageView iv7;
    @FXML
    private ImageView iv8;

    Image ankleAngles = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_AnkleJointAngles.png")));
    Image ankleMovements = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_AnkleJointMoments.png")));
    Image arch = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_Arch.png")));
    Image armAngles = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_ArmJointAngles.png")));
    Image emgWave = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_EmgWaveforms.png")));
    Image footOrientation = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_FootOrientation.png")));
    Image forefoot = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_ForeFoot.png")));
    Image groundForces = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_GroundReactionForces.png")));
    Image hallux = new Image(String.valueOf(getClass().getResource("/TestPhotos/comp/99999999_052223_Hallux.png")));


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        ImageView iv0 = new ImageView(ankleAngles);
        iv0.setFitWidth(600);
        iv0.setFitHeight(500);
        iv0.setX(0);
        iv0.setY(0);

        ImageView iv1 = new ImageView(ankleMovements);
        iv1.setFitWidth(600);
        iv1.setFitHeight(500);
        iv1.setX(0);
        iv1.setY(510);

        ImageView iv2 = new ImageView(arch);
        iv2.setFitHeight(500);
        iv2.setFitWidth(600);
        iv2.setX(0);
        iv2.setY(1020);

        ImageView iv3 = new ImageView(armAngles);
        iv3.setFitHeight(500);
        iv3.setFitWidth(600);
        iv3.setX(0);
        iv3.setY(1530);

        ImageView iv4 = new ImageView(emgWave);
        iv4.setFitHeight(500);
        iv4.setFitWidth(600);
        iv4.setX(0);
        iv4.setY(2040);

        ImageView iv5 = new ImageView(footOrientation);
        iv5.setFitHeight(500);
        iv5.setFitWidth(600);
        iv5.setX(0);
        iv5.setY(2550);

        ImageView iv6 = new ImageView(forefoot);
        iv6.setFitHeight(500);
        iv6.setFitWidth(600);
        iv6.setX(0);
        iv6.setY(3060);

        ImageView iv7 = new ImageView(groundForces);
        iv7.setFitHeight(500);
        iv7.setFitWidth(600);
        iv7.setX(0);
        iv7.setY(3570);

        ImageView iv8 = new ImageView(hallux);
        iv8.setFitHeight(500);
        iv8.setFitWidth(600);
        iv8.setX(0);
        iv8.setY(4080);

        anchorPane.getChildren().add(iv0);
        anchorPane.getChildren().add(iv1);
        anchorPane.getChildren().add(iv2);
        anchorPane.getChildren().add(iv3);
        anchorPane.getChildren().add(iv4);
        anchorPane.getChildren().add(iv5);
        anchorPane.getChildren().add(iv6);
        anchorPane.getChildren().add(iv7);
        anchorPane.getChildren().add(iv8);


    }
}

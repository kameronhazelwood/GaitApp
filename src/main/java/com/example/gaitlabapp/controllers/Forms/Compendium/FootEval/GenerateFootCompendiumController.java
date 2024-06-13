package com.example.gaitlabapp.controllers.Forms.Compendium.FootEval;

import com.example.gaitlabapp.GaitApp;
import com.example.gaitlabapp.GaitLabAppApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class GenerateFootCompendiumController {
    public AnchorPane ap;
    public BorderPane bp;

    public void videos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Details/Videos.fxml")));
        bp.setCenter(root);
    }

    public void infoPage(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumInfoPage.fxml")));
        bp.setCenter(root);
    }

    public void ptHistory(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumPtHistory.fxml")));
        bp.setCenter(root);
    }

    public void questionnaire(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumQuestionnaire.fxml")));
        bp.setCenter(root);
    }

    public void pediatricHealth(MouseEvent mouseEvent) {
    }

    public void tone(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/UE/CompendiumUETone.fxml")));
        bp.setCenter(root);
    }

    public void lowerExam(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumLower.fxml")));
        bp.setCenter(root);
    }

    public void png(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumPng.fxml")));
        bp.setCenter(root);
    }

    public void photos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumPhotos.fxml")));
        bp.setCenter(root);
    }
}

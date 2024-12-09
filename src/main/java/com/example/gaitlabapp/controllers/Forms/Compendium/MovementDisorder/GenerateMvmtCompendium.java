package com.example.gaitlabapp.controllers.Forms.Compendium.MovementDisorder;

import com.example.gaitlabapp.Launcher;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class GenerateMvmtCompendium {

    @FXML
    private BorderPane bp;

    public void videos(MouseEvent mouseEvent) throws IOException {
        //TODO
//        Parent root = null;
//        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Details/Videos.fxml")));
//        bp.setCenter(root);
    }

    public void movementdisorder(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Details/Videos.fxml")));
        bp.setCenter(root);
    }

    public void questionnaire(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Compendium/MovementDisorder/CpQuestionnaire.fxml")));
        bp.setCenter(root);
    }

    public void hipscores(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Compendium/MovementDisorder/HipScores.fxml")));
        bp.setCenter(root);
    }

    public void png(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Compendium/GAIT/CompendiumPng.fxml")));
        bp.setCenter(root);
    }

    public void photos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Compendium/GAIT/CompendiumPhotos.fxml")));
        bp.setCenter(root);
    }
}

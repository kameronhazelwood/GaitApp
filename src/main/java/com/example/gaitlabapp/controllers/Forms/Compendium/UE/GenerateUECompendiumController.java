package com.example.gaitlabapp.controllers.Forms.Compendium.UE;

import com.example.gaitlabapp.GaitApp;
import com.example.gaitlabapp.GaitLabAppApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class GenerateUECompendiumController {
    public BorderPane bp;
    @FXML
    private ToggleButton adolescentParent;

    @FXML
    private ToggleButton adolescentSelf;

    @FXML
    private AnchorPane ap;

    @FXML
    private ToggleButton dailyLiving;

    @FXML
    private ToggleButton infoPage;

    @FXML
    private ToggleButton photos;

    @FXML
    private ToggleButton png;

    @FXML
    private ToggleButton ptHistory;

    @FXML
    private ToggleButton questionnaire;

    @FXML
    private ToggleButton shuee;

    @FXML
    private ToggleButton tone;

    @FXML
    private ToggleButton uePhyExam;

    @FXML
    private ToggleButton videos;

    @FXML
    void adolescentParent(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumAdolescentParent.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void adolescentSelf(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumAdolescentSelf.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void dailyLiving(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/UE/CompendiumDaily.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void infoPage(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumInfoPage.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void photos(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumPhotos.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void png(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumPng.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void ptHistory(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumPtHistory.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void questionnaire(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/GAIT/CompendiumQuestionnaire.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void shuee(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/UE/CompendiumSHUEE.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void tone(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/UE/CompendiumUETone.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void uePhyExam(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Compendium/UE/CompendiumUEPhy.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void videos(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Details/Videos.fxml")));
        bp.setCenter(root);
    }
}

package com.example.gaitlabapp.controllers.Forms.Compendium;



import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.model.patients.IPatientModel;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.util.Objects;
@Component
@RequiredArgsConstructor
public class GenerateCompendiumSide {
    @Autowired
    ConfigurableApplicationContext applicationContext;

    public ToggleButton videos;
    @FXML
    private ToggleButton adolescentParent;

    @FXML
    private ToggleButton adolescentSelf;

    @FXML
    private AnchorPane ap;

    @FXML
    private BorderPane bp;

    @FXML
    private ToggleButton infoPage;

    @FXML
    private ToggleButton lowerExam;

    @FXML
    private ToggleButton photos;

    @FXML
    private ToggleButton pngFiles;

    @FXML
    private ToggleButton ptHistory;

    @FXML
    private ToggleButton questionnaire;

    IPatientModel patientModel;
    public void setInfo(IPatientModel patientModel){
        this.patientModel = patientModel;


    }

    @FXML
    void adolescentParent(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumAdolescentParent.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void adolescentSelf(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumAdolescentSelf.fxml")));
        bp.setCenter(root);
    }
    private Boolean saved;
    public boolean isSaved() {
        return saved;
    }

    @FXML
    void infoPage(MouseEvent event) throws IOException {
        showPatientInfo(patientModel);
    }

    private IPatientModel showPatientInfo(IPatientModel patientModel) throws IOException{
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumInfoPage.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent root = fxmlLoader.load();
        CompendiumInfoPageController compendiumInfoPageController = fxmlLoader.getController();
        compendiumInfoPageController.setInfoPage(patientModel);

        bp.setCenter(root);

        return compendiumInfoPageController.isSaved() ? patientModel : null;
    }




    @FXML
    void lowerExam(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumLower.fxml")));
        bp.setCenter(root);
    }

    @FXML
    public void ptHistory(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumPtHistory.fxml")));
        bp.setCenter(root);
    }

    public void questionnaire(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumQuestionnaire.fxml")));
        bp.setCenter(root);
    }

    public void png(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumPng.fxml")));
        bp.setCenter(root);
    }

    public void photos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Details/PatientPhotos.fxml")));
        bp.setCenter(root);
    }

    public void videos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Details/Videos.fxml")));
        bp.setCenter(root);
    }
}

package com.example.gaitlabapp.controllers.Forms.Questionnaires.History;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PhysicalTherapy implements Initializable {
    public Button previousButton;
    public Button nextButton;
    public ComboBox<String> phyHospital;
    public ComboBox<String> phyClinic;
    public ComboBox<String> phySchool;
    public ComboBox<String> phyHome;
    public ComboBox<String> occHospital;
    public ComboBox<String> occClinic;
    public ComboBox<String> occSchool;
    public ComboBox<String> occHome;

    private Stage getMyStageNext() { return (Stage) nextButton.getScene().getWindow(); }

    public void onPrevious(ActionEvent event) {
    }

    public void onNext(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/FollowupDate.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();

        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Questionnaire   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 950, 680));
        stage1.showAndWait();
        getMyStageNext().close();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        phyHospital.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
        phyClinic.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
        phySchool.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
        phyHome.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
        occHospital.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
        occClinic.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
        occSchool.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
        occHome.getItems().addAll(
                "None",
                "About once per month",
                "Two or three times per month",
                "One or more times per week"
        );
    }
}

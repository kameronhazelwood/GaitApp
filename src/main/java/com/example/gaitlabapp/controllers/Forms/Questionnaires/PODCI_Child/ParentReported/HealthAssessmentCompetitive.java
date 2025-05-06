package com.example.gaitlabapp.controllers.Forms.Questionnaires.PODCI_Child.ParentReported;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HealthAssessmentCompetitive {
    public Button start;
    public CheckBox yesSports;
    public CheckBox littleSports;
    public CheckBox hardSports;
    public CheckBox noSports;

    private Stage getMyStageStart() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentFriends.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();

        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Questionnaire   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 950, 680));
        stage1.showAndWait();
        getMyStageStart().close();
    }

    public void onyesSports(ActionEvent event) {
        if(yesSports.isSelected()){
            littleSports.setSelected(false);
            hardSports.setSelected(false);
            noSports.setSelected(false);
        }
    }

    public void onlittleSports(ActionEvent event) {
        if(littleSports.isSelected()){
            yesSports.setSelected(false);
            hardSports.setSelected(false);
            noSports.setSelected(false);
        }
    }

    public void onhardSports(ActionEvent event) {
        if(hardSports.isSelected()){
            littleSports.setSelected(false);
            yesSports.setSelected(false);
            noSports.setSelected(false);
        }
    }

    public void onnoSports(ActionEvent event) {
        if(noSports.isSelected()){
            littleSports.setSelected(false);
            hardSports.setSelected(false);
            yesSports.setSelected(false);
        }
    }
}

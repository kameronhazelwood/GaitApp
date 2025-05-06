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

public class HealthAssessmentOutdoor {
    public Button start;
    public CheckBox yesOutdoor;
    public CheckBox sometimesOutdoor;
    public CheckBox hardOutdoor;
    public CheckBox noOutdoor;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }

    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentSports.fxml"));
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

    public void onyesOutdoor(ActionEvent event) {
        if(yesOutdoor.isSelected()){
            sometimesOutdoor.setSelected(false);
            hardOutdoor.setSelected(false);
            noOutdoor.setSelected(false);
        }
    }

    public void onsometimesOutdoor(ActionEvent event) {
        if(sometimesOutdoor.isSelected()){
            yesOutdoor.setSelected(false);
            hardOutdoor.setSelected(false);
            noOutdoor.setSelected(false);
        }
    }

    public void onhardOutdoor(ActionEvent event) {
        if(hardOutdoor.isSelected()){
            yesOutdoor.setSelected(false);
            sometimesOutdoor.setSelected(false);
            noOutdoor.setSelected(false);
        }
    }

    public void onnoOutdoor(ActionEvent event) {
        if(noOutdoor.isSelected()){
            yesOutdoor.setSelected(false);
            sometimesOutdoor.setSelected(false);
            hardOutdoor.setSelected(false);
        }
    }
}

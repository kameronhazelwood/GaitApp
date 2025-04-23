package com.example.gaitlabapp.controllers.Forms.Questionnaires.PODCI_Child.ParentReported;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HealthAssessmentMissSchool {
    public Button start;
    public RadioButton rarely;
    public RadioButton onceAMonth;
    public RadioButton twoMonth;
    public RadioButton onceAWeek;
    public RadioButton MoreOnceWeek;
    public RadioButton NotAttend;


    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentHappy.fxml"));
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

    public void onRarely(ActionEvent event) {
        if(rarely.isSelected()){
            onceAMonth.setSelected(false);
            onceAWeek.setSelected(false);
            twoMonth.setSelected(false);
            MoreOnceWeek.setSelected(false);
            NotAttend.setSelected(false);
        }
    }

    public void onOnceAMonth(ActionEvent event) {
        if(onceAMonth.isSelected()){
            rarely.setSelected(false);
            onceAWeek.setSelected(false);
            twoMonth.setSelected(false);
            MoreOnceWeek.setSelected(false);
            NotAttend.setSelected(false);
        }
    }

    public void onTwoMonth(ActionEvent event) {
        if(twoMonth.isSelected()){
            rarely.setSelected(false);
            onceAWeek.setSelected(false);
            onceAMonth.setSelected(false);
            MoreOnceWeek.setSelected(false);
            NotAttend.setSelected(false);
        }
    }

    public void onOnceWeek(ActionEvent event) {
        if(onceAWeek.isSelected()){
            rarely.setSelected(false);
            onceAMonth.setSelected(false);
            twoMonth.setSelected(false);
            MoreOnceWeek.setSelected(false);
            NotAttend.setSelected(false);
        }
    }

    public void onMoreThanWeek(ActionEvent event) {
        if(MoreOnceWeek.isSelected()){
            rarely.setSelected(false);
            onceAMonth.setSelected(false);
            twoMonth.setSelected(false);
            onceAWeek.setSelected(false);
            NotAttend.setSelected(false);
        }
    }

    public void onDoesNotAttend(ActionEvent event) {
        if(NotAttend.isSelected()){
            rarely.setSelected(false);
            onceAMonth.setSelected(false);
            twoMonth.setSelected(false);
            onceAWeek.setSelected(false);
            MoreOnceWeek.setSelected(false);
        }
    }
}

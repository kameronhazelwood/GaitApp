package com.example.gaitlabapp.controllers.Forms.Questionnaires.Spanish.ParentReported;

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

public class SpanishHealthAssessmentCompetitive {
    public Button start;
    public CheckBox yesEasily;
    public CheckBox littleHard;
    public CheckBox veryHard;
    public CheckBox no;

    private Stage getMyStageStart() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Spanish/ParentReported/SpanishHealthAssessmentFriends.fxml"));
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

    public void onyesEasily(ActionEvent event) {
        if(yesEasily.isSelected()){
            littleHard.setSelected(false);
            veryHard.setSelected(false);
            no.setSelected(false);
        }
    }

    public void onlittleHard(ActionEvent event) {
        if(littleHard.isSelected()){
            yesEasily.setSelected(false);
            veryHard.setSelected(false);
            no.setSelected(false);
        }
    }

    public void onveryHard(ActionEvent event) {
        if(veryHard.isSelected()){
            yesEasily.setSelected(false);
            littleHard.setSelected(false);
            no.setSelected(false);
        }
    }

    public void onno(ActionEvent event) {
        if(no.isSelected()){
            yesEasily.setSelected(false);
            littleHard.setSelected(false);
            veryHard.setSelected(false);
        }
    }
}

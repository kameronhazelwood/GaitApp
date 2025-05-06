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

public class SpanishHealthAssessmentFriends {
    public Button start;
    public CheckBox yesFriends;
    public CheckBox sometimesFriends;
    public CheckBox neverFriends;

    private Stage getMyStageStart() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Spanish/ParentReported/SpanishHealthAssessmentTogether.fxml"));
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
    public void onyesFriends(ActionEvent event) {
        if(yesFriends.isSelected()){
            sometimesFriends.setSelected(false);
            neverFriends.setSelected(false);
        }
    }

    public void onsometimesFriends(ActionEvent event) {
        if(sometimesFriends.isSelected()){
            yesFriends.setSelected(false);
            neverFriends.setSelected(false);
        }
    }

    public void onneverFriends(ActionEvent event) {
        if(neverFriends.isSelected()){
            sometimesFriends.setSelected(false);
            yesFriends.setSelected(false);
        }
    }
}

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

public class SpanishHealthAssessmentGym {
    public Button start;
    public CheckBox oftenGym;
    public CheckBox sometimesGym;
    public CheckBox neverGym;
    public CheckBox noGym;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Spanish/ParentReported/SpanishHealthAssessmentGymCont.fxml"));
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
    public void onoftenGym(ActionEvent event) {
        if(oftenGym.isSelected()){
            sometimesGym.setSelected(false);
            neverGym.setSelected(false);
            noGym.setSelected(false);
        }

    }

    public void onsometimesGym(ActionEvent event) {
        if(sometimesGym.isSelected()){
            oftenGym.setSelected(false);
            neverGym.setSelected(false);
            noGym.setSelected(false);
        }
    }

    public void onneverGym(ActionEvent event) {
        if(neverGym.isSelected()){
            oftenGym.setSelected(false);
            sometimesGym.setSelected(false);
            noGym.setSelected(false);
        }
    }

    public void onnoGym(ActionEvent event) {
        if(noGym.isSelected()){
            oftenGym.setSelected(false);
            sometimesGym.setSelected(false);
            neverGym.setSelected(false);
        }
    }
}

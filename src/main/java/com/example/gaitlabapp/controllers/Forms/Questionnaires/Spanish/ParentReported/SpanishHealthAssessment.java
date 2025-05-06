package com.example.gaitlabapp.controllers.Forms.Questionnaires.Spanish.ParentReported;

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

public class SpanishHealthAssessment {
    public Button start;
    public RadioButton excellent;
    public RadioButton veryGood;
    public RadioButton good;
    public RadioButton fair;
    public RadioButton poor;
    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Spanish/ParentReported/SpanishHealthAssessmentCompared.fxml"));
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
    public void onexcellent(ActionEvent event) {
        if(excellent.isSelected()){
            veryGood.setSelected(false);
            good.setSelected(false);
            fair.setSelected(false);
            poor.setSelected(false);
        }
    }

    public void onveryGood(ActionEvent event) {
        if(veryGood.isSelected()){
            excellent.setSelected(false);
            good.setSelected(false);
            fair.setSelected(false);
            poor.setSelected(false);
        }
    }

    public void ongood(ActionEvent event) {
        if(good.isSelected()){
            excellent.setSelected(false);
            veryGood.setSelected(false);
            fair.setSelected(false);
            poor.setSelected(false);
        }
    }

    public void onfair(ActionEvent event) {
        if(fair.isSelected()){
            excellent.setSelected(false);
            veryGood.setSelected(false);
            good.setSelected(false);
            poor.setSelected(false);
        }
    }

    public void onpoor(ActionEvent event) {
        if(poor.isSelected()){
            excellent.setSelected(false);
            veryGood.setSelected(false);
            good.setSelected(false);
            fair.setSelected(false);
        }
    }
}

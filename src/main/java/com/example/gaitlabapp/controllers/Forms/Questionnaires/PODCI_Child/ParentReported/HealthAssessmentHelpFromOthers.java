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

public class HealthAssessmentHelpFromOthers {
    public Button start;
    public CheckBox neverHelp;
    public CheckBox sometimesHelp;
    public CheckBox sometimesHalf;
    public CheckBox oftenHelp;
    public CheckBox allHelp;
    public CheckBox neverDevice;
    public CheckBox sometimesDevice;
    public CheckBox halfDevice;
    public CheckBox oftenDevice;
    public CheckBox allDevice;
    public CheckBox halfHelp;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }


    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentOutdoor.fxml"));
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

    public void onneverHelp(ActionEvent event) {
        if(neverHelp.isSelected()){
            allHelp.setSelected(false);
            oftenHelp.setSelected(false);
            sometimesHelp.setSelected(false);
            halfHelp.setSelected(false);
        }
    }

    public void onsometimesHelp(ActionEvent event) {
        if(sometimesHelp.isSelected()){
            allHelp.setSelected(false);
            oftenHelp.setSelected(false);
            halfHelp.setSelected(false);
            neverHelp.setSelected(false);
        }
    }


    public void onoftenHelp(ActionEvent event) {
        if(oftenHelp.isSelected()){
            allHelp.setSelected(false);
            halfHelp.setSelected(false);
            sometimesHelp.setSelected(false);
            neverHelp.setSelected(false);
        }
    }

    public void onallHelp(ActionEvent event) {
        if(allHelp.isSelected()){
            oftenHelp.setSelected(false);
            halfHelp.setSelected(false);
            sometimesHelp.setSelected(false);
            neverHelp.setSelected(false);
        }
    }

    public void onneverDevice(ActionEvent event) {
        if(neverDevice.isSelected()){
            allDevice.setSelected(false);
            halfDevice.setSelected(false);
            oftenDevice.setSelected(false);
            sometimesDevice.setSelected(false);
        }
    }

    public void onsometimesDevice(ActionEvent event) {
        if(sometimesDevice.isSelected()){
            allDevice.setSelected(false);
            halfDevice.setSelected(false);
            oftenDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onhalfDevice(ActionEvent event) {
        if(halfDevice.isSelected()){
            allDevice.setSelected(false);
            sometimesDevice.setSelected(false);
            oftenDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onoftenDevice(ActionEvent event) {
        if(oftenDevice.isSelected()){
            allDevice.setSelected(false);
            sometimesDevice.setSelected(false);
            halfDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onallDevice(ActionEvent event) {
        if(allDevice.isSelected()){
            oftenDevice.setSelected(false);
            sometimesDevice.setSelected(false);
            halfDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onhalfHelp(ActionEvent event) {
        if(halfHelp.isSelected()){
            allHelp.setSelected(false);
            oftenHelp.setSelected(false);
            sometimesHelp.setSelected(false);
            neverHelp.setSelected(false);
        }

    }
}

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

public class SpanishHealthAssessmentHelp {
    public Button start;
    public CheckBox helpNever;
    public CheckBox helpSometimes;
    public CheckBox helpHalf;
    public CheckBox helpOften;
    public CheckBox allHelp;
    public CheckBox neverDevice;
    public CheckBox sometimesDevice;
    public CheckBox halfDevice;
    public CheckBox oftenDevice;
    public CheckBox allDevice;

    private Stage getMyStageStart() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Spanish/ParentReported/SpanishHealthAssessmentStand.fxml"));
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
    public void onhelpNever(ActionEvent event) {
        if(helpNever.isSelected()){
            helpSometimes.setSelected(false);
            helpHalf.setSelected(false);
            helpOften.setSelected(false);
            allHelp.setSelected(false);
        }
    }

    public void onhelpSometimes(ActionEvent event) {
        if(helpSometimes.isSelected()){
            helpNever.setSelected(false);
            helpHalf.setSelected(false);
            helpOften.setSelected(false);
            allHelp.setSelected(false);
        }
    }

    public void onhelpHalf(ActionEvent event) {
        if(helpHalf.isSelected()){
            helpNever.setSelected(false);
            helpSometimes.setSelected(false);
            helpOften.setSelected(false);
            allHelp.setSelected(false);
        }
    }

    public void onhelpOften(ActionEvent event) {
        if(helpOften.isSelected()){
            helpNever.setSelected(false);
            helpSometimes.setSelected(false);
            helpHalf.setSelected(false);
            allHelp.setSelected(false);
        }
    }

    public void onallHelp(ActionEvent event) {
        if(allHelp.isSelected()){
            helpNever.setSelected(false);
            helpSometimes.setSelected(false);
            helpHalf.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onneverDevice(ActionEvent event) {
        if (neverDevice.isSelected()){
            allDevice.setSelected(false);
            halfDevice.setSelected(false);
            oftenDevice.setSelected(false);
            sometimesDevice.setSelected(false);
        }
    }

    public void onsometimesDevice(ActionEvent event) {
        if (sometimesDevice.isSelected()){
            allDevice.setSelected(false);
            halfDevice.setSelected(false);
            oftenDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onhalfDevice(ActionEvent event) {
        if (halfDevice.isSelected()){
            allDevice.setSelected(false);
            sometimesDevice.setSelected(false);
            oftenDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onoftenDevice(ActionEvent event) {
        if (oftenDevice.isSelected()){
            allDevice.setSelected(false);
            sometimesDevice.setSelected(false);
            halfDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }

    public void onallDevice(ActionEvent event) {
        if (allDevice.isSelected()){
            oftenDevice.setSelected(false);
            sometimesDevice.setSelected(false);
            halfDevice.setSelected(false);
            neverDevice.setSelected(false);
        }
    }
}

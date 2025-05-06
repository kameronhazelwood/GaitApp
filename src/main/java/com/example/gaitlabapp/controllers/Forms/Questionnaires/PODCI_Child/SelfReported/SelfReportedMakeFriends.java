package com.example.gaitlabapp.controllers.Forms.Questionnaires.PODCI_Child.SelfReported;

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

public class SelfReportedMakeFriends {
    public Button start;
    public CheckBox usuallyEasy;
    public CheckBox sometimesEasy;
    public CheckBox sometimesHard;
    public CheckBox usuallyHard;
    private Stage getMyStageStart() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/SelfReported/SelfReportedPain.fxml"));
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
    public void onusuallyEasy(ActionEvent event) {
        if(usuallyEasy.isSelected()){
            sometimesEasy.setSelected(false);
            sometimesHard.setSelected(false);
            usuallyHard.setSelected(false);
        }
    }

    public void onsometimesEasy(ActionEvent event) {
        if(sometimesEasy.isSelected()){
            usuallyEasy.setSelected(false);
            sometimesHard.setSelected(false);
            usuallyHard.setSelected(false);
        }
    }

    public void onsometimesHard(ActionEvent event) {
        if(sometimesHard.isSelected()){
            usuallyEasy.setSelected(false);
            sometimesEasy.setSelected(false);
            usuallyHard.setSelected(false);
        }
    }

    public void onusuallyHard(ActionEvent event) {
        if(usuallyHard.isSelected()){
            usuallyEasy.setSelected(false);
            sometimesEasy.setSelected(false);
            sometimesHard.setSelected(false);
        }
    }
}

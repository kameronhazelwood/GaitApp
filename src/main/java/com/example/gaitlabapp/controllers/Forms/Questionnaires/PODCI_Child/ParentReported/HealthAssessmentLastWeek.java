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

public class HealthAssessmentLastWeek {
    public Button start;
    public RadioButton mostSick;
    public RadioButton mostEnergy;
    public RadioButton mostPain;
    public RadioButton someEnergy;
    public RadioButton someSick;
    public RadioButton littleSick;
    public RadioButton somePain;
    public RadioButton littleEnergy;
    public RadioButton littlePain;
    public RadioButton noneSick;
    public RadioButton noneEnergy;
    public RadioButton nonePain;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentLastWeekCont.fxml"));
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

    public void onmostSick(ActionEvent event) {
        if(mostSick.isSelected()){
            someSick.setSelected(false);
            littleSick.setSelected(false);
            noneSick.setSelected(false);
        }
    }

    public void onmostEnergy(ActionEvent event) {
        if (mostEnergy.isSelected()){
            someEnergy.setSelected(false);
            littleEnergy.setSelected(false);
            noneEnergy.setSelected(false);
        }
    }

    public void onmostPain(ActionEvent event) {
        if(mostPain.isSelected()){
            somePain.setSelected(false);
            littlePain.setSelected(false);
            nonePain.setSelected(false);
        }
    }

    public void onsomeSick(ActionEvent event) {
        if(someSick.isSelected()){
            mostSick.setSelected(false);
            littleSick.setSelected(false);
            noneSick.setSelected(false);
        }
    }

    public void onsomeEnergy(ActionEvent event) {
        if(someEnergy.isSelected()){
            littleEnergy.setSelected(false);
            noneEnergy.setSelected(false);
            mostEnergy.setSelected(false);
        }
    }

    public void onsomePain(ActionEvent event) {
        if(somePain.isSelected()){
            mostPain.setSelected(false);
            littlePain.setSelected(false);
            nonePain.setSelected(false);
        }
    }

    public void onlittleSick(ActionEvent event) {
        if(littleSick.isSelected()){
            noneSick.setSelected(false);
            someSick.setSelected(false);
            mostSick.setSelected(false);
        }
    }

    public void onlittleEnergy(ActionEvent event) {
        if(littleEnergy.isSelected()){
            someEnergy.setSelected(false);
            mostEnergy.setSelected(false);
            noneEnergy.setSelected(false);
        }
    }

    public void onlittlePain(ActionEvent event) {
        if(littlePain.isSelected()){
            nonePain.setSelected(false);
            somePain.setSelected(false);
            mostPain.setSelected(false);
        }
    }

    public void onnoneSick(ActionEvent event) {
        if(noneSick.isSelected()){
            littleSick.setSelected(false);
            someSick.setSelected(false);
            mostSick.setSelected(false);
        }
    }

    public void onnoneEnergy(ActionEvent event) {
        if(noneEnergy.isSelected()){
            littleEnergy.setSelected(false);
            someEnergy.setSelected(false);
            mostEnergy.setSelected(false);
        }
    }

    public void onnonePain(ActionEvent event) {
        if(nonePain.isSelected()){
            littlePain.setSelected(false);
            somePain.setSelected(false);
            mostPain.setSelected(false);
        }
    }
}

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

public class HealthAssessmentHappy {
    public Button start;
    public RadioButton veryHappyLift;
    public RadioButton veryhappyPour;
    public RadioButton veryHappyJar;
    public RadioButton veryHappyFork;
    public RadioButton veryHappyComb;
    public RadioButton veryHappyButtons;
    public RadioButton someHappyLift;
    public RadioButton someHappyPour;
    public RadioButton someHappyJar;
    public RadioButton someHappyFork;
    public RadioButton somehappyComb;
    public RadioButton someHappyButton;
    public RadioButton sureLift;
    public RadioButton surePour;
    public RadioButton sureJar;
    public RadioButton sureFork;
    public RadioButton sureComb;
    public RadioButton notButton;
    public RadioButton someUnhappyLift;
    public RadioButton someUnhappyPour;
    public RadioButton someUnhappyJar;
    public RadioButton someUnhappyFork;
    public RadioButton someunhappyComb;
    public RadioButton someUnhappyButton;
    public RadioButton veryUnhappyLift;
    public RadioButton veryUnhappyPour;
    public RadioButton veryUnhappyJar;
    public RadioButton veryUnHappyFork;
    public RadioButton veryUnhappyComb;
    public RadioButton veryUnhappyButton;
    public RadioButton youngLift;
    public RadioButton youngPour;
    public RadioButton youngJar;
    public RadioButton youngFork;
    public RadioButton youngComb;
    public RadioButton youngButtons;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }

    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentLastWeek.fxml"));
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

    public void onveryHappyLift(ActionEvent event) {
        if(veryHappyLift.isSelected()){
            someHappyLift.setSelected(false);
            sureLift.setSelected(false);
            someUnhappyLift.setSelected(false);
            veryUnhappyLift.setSelected(false);
            youngLift.setSelected(false);
        }

    }

    public void onveryhappyPour(ActionEvent event) {
        if(veryUnhappyPour.isSelected()){
            someHappyPour.setSelected(false);
            surePour.setSelected(false);
            someUnhappyPour.setSelected(false);
            veryUnhappyPour.setSelected(false);
            youngPour.setSelected(false);
        }
    }

    public void onveryHappyJar(ActionEvent event) {
        if(veryHappyJar.isSelected()){
            someHappyJar.setSelected(false);
            sureJar.setSelected(false);
            someUnhappyJar.setSelected(false);
            veryUnhappyJar.setSelected(false);
            youngJar.setSelected(false);
        }
    }

    public void onveryHappyFork(ActionEvent event) {
        if(veryHappyFork.isSelected()){
            someHappyFork.setSelected(false);
            sureFork.setSelected(false);
            someUnhappyFork.setSelected(false);
            veryUnHappyFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void onveryHappyComb(ActionEvent event) {
        if(veryHappyComb.isSelected()){
            somehappyComb.setSelected(false);
            sureComb.setSelected(false);
            someunhappyComb.setSelected(false);
            veryUnhappyComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }

    public void onveryHappyButtons(ActionEvent event) {
        if(veryHappyButtons.isSelected()){
            someHappyButton.setSelected(false);
            notButton.setSelected(false);
            someUnhappyButton.setSelected(false);
            veryUnhappyButton.setSelected(false);
            youngButtons.setSelected(false);
        }
    }

    public void onsomeHappyLift(ActionEvent event) {
        if(someHappyLift.isSelected()){
            veryHappyLift.setSelected(false);
            sureLift.setSelected(false);
            someUnhappyLift.setSelected(false);
            veryUnhappyLift.setSelected(false);
            youngLift.setSelected(false);
        }
    }

    public void onsomeHappyPour(ActionEvent event) {
        if(someHappyPour.isSelected()){
            veryhappyPour.setSelected(false);
            surePour.setSelected(false);
            someUnhappyPour.setSelected(false);
            veryUnhappyPour.setSelected(false);
            youngPour.setSelected(false);
        }

    }

    public void onsomeHappyJar(ActionEvent event) {
        if(someHappyJar.isSelected()){
            veryHappyJar.setSelected(false);
            sureJar.setSelected(false);
            someUnhappyJar.setSelected(false);
            veryUnhappyJar.setSelected(false);
            youngJar.setSelected(false);
        }
    }

    public void onsomeHappyFork(ActionEvent event) {
        if(someHappyFork.isSelected()){
            veryHappyFork.setSelected(false);
            sureFork.setSelected(false);
            someUnhappyFork.setSelected(false);
            veryUnHappyFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void onsomehappyComb(ActionEvent event) {
        if(somehappyComb.isSelected()){
            veryHappyComb.setSelected(false);
            sureComb.setSelected(false);
            someunhappyComb.setSelected(false);
            veryUnhappyComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }

    public void onsomeHappyButton(ActionEvent event) {
        if(someHappyButton.isSelected()){
            veryHappyButtons.setSelected(false);
            notButton.setSelected(false);
            someUnhappyButton.setSelected(false);
            veryUnhappyButton.setSelected(false);
            youngButtons.setSelected(false);
        }
    }

    public void onsureLift(ActionEvent event) {
        if(sureLift.isSelected()){
            someHappyLift.setSelected(false);
            veryHappyLift.setSelected(false);
            someUnhappyLift.setSelected(false);
            veryUnhappyLift.setSelected(false);
            youngLift.setSelected(false);
        }
    }

    public void onsurePour(ActionEvent event) {
        if(surePour.isSelected()){
            someHappyPour.setSelected(false);
            veryhappyPour.setSelected(false);
            someUnhappyPour.setSelected(false);
            veryUnhappyPour.setSelected(false);
            youngPour.setSelected(false);
        }
    }

    public void onsureJar(ActionEvent event) {
        if(sureJar.isSelected()){
            someHappyJar.setSelected(false);
            veryHappyJar.setSelected(false);
            someUnhappyJar.setSelected(false);
            veryUnhappyJar.setSelected(false);
            youngJar.setSelected(false);
        }
    }

    public void onsureFork(ActionEvent event) {
        if(sureFork.isSelected()){
            someHappyFork.setSelected(false);
            veryHappyFork.setSelected(false);
            someUnhappyFork.setSelected(false);
            veryUnHappyFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void onsureComb(ActionEvent event) {
        if(sureComb.isSelected()){
            somehappyComb.setSelected(false);
            veryHappyComb.setSelected(false);
            someunhappyComb.setSelected(false);
            veryUnhappyComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }

    public void onnotButton(ActionEvent event) {
        if(notButton.isSelected()){
            someHappyButton.setSelected(false);
            veryHappyButtons.setSelected(false);
            someUnhappyButton.setSelected(false);
            veryUnhappyButton.setSelected(false);
            youngButtons.setSelected(false);
        }
    }

    public void onsomeUnhappyLift(ActionEvent event) {
        if(someUnhappyLift.isSelected()){
            sureLift.setSelected(false);
            someHappyLift.setSelected(false);
            veryHappyLift.setSelected(false);
            veryUnhappyLift.setSelected(false);
            youngLift.setSelected(false);
        }
    }

    public void onsomeUnhappyPour(ActionEvent event) {
        if(someUnhappyPour.isSelected()){
            surePour.setSelected(false);
            someHappyPour.setSelected(false);
            veryhappyPour.setSelected(false);
            veryUnhappyPour.setSelected(false);
            youngPour.setSelected(false);
        }
    }

    public void onsomeUnhappyJar(ActionEvent event) {
        if(someUnhappyJar.isSelected()){
            sureJar.setSelected(false);
            someHappyJar.setSelected(false);
            veryHappyJar.setSelected(false);
            veryUnhappyJar.setSelected(false);
            youngJar.setSelected(false);
        }
    }

    public void onsomeUnhappyFork(ActionEvent event) {
        if(someUnhappyFork.isSelected()){
            sureFork.setSelected(false);
            someHappyFork.setSelected(false);
            veryHappyFork.setSelected(false);
            veryUnHappyFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void onsomeunhappyComb(ActionEvent event) {
        if(someunhappyComb.isSelected()){
            sureComb.setSelected(false);
            somehappyComb.setSelected(false);
            veryHappyComb.setSelected(false);
            veryUnhappyComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }

    public void onveryUnhappyLift(ActionEvent event) {
        if(veryUnhappyLift.isSelected()){
            youngLift.setSelected(false);
            someUnhappyLift.setSelected(false);
            sureLift.setSelected(false);
            someHappyLift.setSelected(false);
            veryHappyLift.setSelected(false);
        }
    }

    public void onsomeUnhappyButton(ActionEvent event) {
        if(someUnhappyButton.isSelected()){
            notButton.setSelected(false);
            someHappyButton.setSelected(false);
            veryHappyButtons.setSelected(false);
            veryUnhappyButton.setSelected(false);
            youngButtons.setSelected(false);
        }

    }

    public void onveryUnhappyPour(ActionEvent event) {
        if(veryUnhappyPour.isSelected()){
            someUnhappyPour.setSelected(false);
            youngPour.setSelected(false);
            surePour.setSelected(false);
            someHappyPour.setSelected(false);
            veryhappyPour.setSelected(false);
        }
    }

    public void onveryUnhappyJar(ActionEvent event) {
        if(veryUnhappyJar.isSelected()){
            youngJar.setSelected(false);
            someUnhappyJar.setSelected(false);
            sureJar.setSelected(false);
            someHappyJar.setSelected(false);
            veryHappyJar.setSelected(false);
        }
    }

    public void onveryUnHappyFork(ActionEvent event) {
        if(veryUnHappyFork.isSelected()){
            someUnhappyFork.setSelected(false);
            sureFork.setSelected(false);
            someHappyFork.setSelected(false);
            veryHappyFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void onveryUnhappyComb(ActionEvent event) {
        if(veryUnhappyComb.isSelected()){
            youngComb.setSelected(false);
            someunhappyComb.setSelected(false);
            sureComb.setSelected(false);
            somehappyComb.setSelected(false);
            veryHappyComb.setSelected(false);
        }
    }

    public void onveryUnhappyButton(ActionEvent event) {
        if(veryHappyButtons.isSelected()){
            youngButtons.setSelected(false);
            someUnhappyButton.setSelected(false);
            notButton.setSelected(false);
            someHappyButton.setSelected(false);
            veryHappyButtons.setSelected(false);
        }
    }

    public void onyoungLift(ActionEvent event) {
        if(youngLift.isSelected()){
            veryUnhappyLift.setSelected(false);
            someUnhappyLift.setSelected(false);
            sureLift.setSelected(false);
            someHappyLift.setSelected(false);
            veryHappyLift.setSelected(false);
        }
    }

    public void onyoungPour(ActionEvent event) {
        if(youngPour.isSelected()){
            veryUnhappyPour.setSelected(false);
            someUnhappyPour.setSelected(false);
            surePour.setSelected(false);
            someHappyPour.setSelected(false);
            veryhappyPour.setSelected(false);
        }
    }

    public void onyoungJar(ActionEvent event) {
        if(youngJar.isSelected()){
            veryUnhappyJar.setSelected(false);
            someUnhappyJar.setSelected(false);
            sureJar.setSelected(false);
            someHappyJar.setSelected(false);
            veryHappyJar.setSelected(false);
        }
    }

    public void onyoungFork(ActionEvent event) {
        if(youngFork.isSelected()){
            veryUnHappyFork.setSelected(false);
            someUnhappyFork.setSelected(false);
            sureFork.setSelected(false);
            someHappyFork.setSelected(false);
            veryHappyFork.setSelected(false);
        }
    }

    public void onyoungComb(ActionEvent event) {
        if(youngComb.isSelected()){
            veryUnhappyComb.setSelected(false);
            someunhappyComb.setSelected(false);
            sureComb.setSelected(false);
            somehappyComb.setSelected(false);
            veryHappyComb.setSelected(false);
        }
    }

    public void onyoungButtons(ActionEvent event) {
        if(youngButtons.isSelected()){
            veryUnhappyButton.setSelected(false);
            someUnhappyButton.setSelected(false);
            notButton.setSelected(false);
            someHappyButton.setSelected(false);
            veryHappyButtons.setSelected(false);
        }
    }
}

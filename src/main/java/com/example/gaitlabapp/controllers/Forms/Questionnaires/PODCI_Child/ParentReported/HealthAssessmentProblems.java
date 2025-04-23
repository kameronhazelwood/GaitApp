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

public class HealthAssessmentProblems {
    public Button start;
    public RadioButton easyHeavy;
    public RadioButton easyPour;
    public RadioButton easyOpen;
    public RadioButton easyFork;
    public RadioButton easyComb;
    public RadioButton easyButton;
    public RadioButton easyCoat;
    public RadioButton easyWrite;
    public RadioButton littleHeavy;
    public RadioButton littlePour;
    public RadioButton littleOpen;
    public RadioButton littleFork;
    public RadioButton littleComb;
    public RadioButton littleButtom;
    public RadioButton littleCoat;
    public RadioButton littleWrite;
    public RadioButton hardHeavy;
    public RadioButton hardPour;
    public RadioButton hardOpen;
    public RadioButton hardFork;
    public RadioButton hardComb;
    public RadioButton hardButtons;
    public RadioButton hardCoat;
    public RadioButton hardWrite;
    public RadioButton cantHeavy;
    public RadioButton cantPour;
    public RadioButton cantOpen;
    public RadioButton cantFork;
    public RadioButton cantComb;
    public RadioButton cantButton;
    public RadioButton cantCoat;
    public RadioButton cantWrite;
    public RadioButton youngHeavy;
    public RadioButton youngPour;
    public RadioButton youngJar;
    public RadioButton youngFork;
    public RadioButton youngComb;
    public RadioButton youngButton;
    public RadioButton youngCoat;
    public RadioButton youngWrite;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }

    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentMissSchool.fxml"));
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

    public void oneasyHeavy(ActionEvent event) {
        if(easyHeavy.isSelected()){
            littleHeavy.setSelected(false);
            hardHeavy.setSelected(false);
            cantHeavy.setSelected(false);
            youngHeavy.setSelected(false);
        }
    }

    public void oneasyPour(ActionEvent event) {
        if (easyPour.isSelected()){
            littlePour.setSelected(false);
            hardPour.setSelected(false);
            cantPour.setSelected(false);
            youngPour.setSelected(false);
        }
    }

    public void oneasyOpen(ActionEvent event) {
        if(easyOpen.isSelected()){
            littleOpen.setSelected(false);
            hardOpen.setSelected(false);
            cantOpen.setSelected(false);
            youngJar.setSelected(false);
        }
    }

    public void oneasyFork(ActionEvent event) {
        if(easyFork.isSelected()){
            littleFork.setSelected(false);
            hardFork.setSelected(false);
            cantFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void oneasyComb(ActionEvent event) {
        if(easyComb.isSelected()){
            littleComb.setSelected(false);
            hardComb.setSelected(false);
            cantComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }

    public void oneasyButton(ActionEvent event) {
        if(easyButton.isSelected()){
            littleButtom.setSelected(false);
            hardButtons.setSelected(false);
            cantButton.setSelected(false);
            youngButton.setSelected(false);
        }
    }

    public void oneasyCoat(ActionEvent event) {
        if(easyCoat.isSelected()){
            littleCoat.setSelected(false);
            hardCoat.setSelected(false);
            cantCoat.setSelected(false);
            youngCoat.setSelected(false);
        }
    }

    public void oneasyWrite(ActionEvent event) {
        if(easyWrite.isSelected()){
            littleWrite.setSelected(false);
            hardWrite.setSelected(false);
            cantWrite.setSelected(false);
            youngWrite.setSelected(false);
        }
    }

    public void onlittleHeavy(ActionEvent event) {
        if(littleHeavy.isSelected()){
            easyHeavy.setSelected(false);
            hardHeavy.setSelected(false);
            cantHeavy.setSelected(false);
            youngHeavy.setSelected(false);
        }
    }

    public void onlittlePour(ActionEvent event) {
        if(littlePour.isSelected()){
            easyPour.setSelected(false);
            hardPour.setSelected(false);
            cantPour.setSelected(false);
            youngPour.setSelected(false);
        }
    }

    public void onlittleOpen(ActionEvent event) {
        if(littleOpen.isSelected()){
            easyOpen.setSelected(false);
            hardOpen.setSelected(false);
            cantOpen.setSelected(false);
            youngJar.setSelected(false);
        }
    }

    public void onlittleFork(ActionEvent event) {
        if(littleFork.isSelected()){
            easyFork.setSelected(false);
            hardFork.setSelected(false);
            cantFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void littleComb(ActionEvent event) {
        if(littleComb.isSelected()){
            easyComb.setSelected(false);
            hardComb.setSelected(false);
            cantComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }

    public void onlittleButtom(ActionEvent event) {
        if(littleButtom.isSelected()){
            easyButton.setSelected(false);
            hardButtons.setSelected(false);
            cantButton.setSelected(false);
            youngButton.setSelected(false);
        }
    }

    public void onlittleCoat(ActionEvent event) {
        if(littleCoat.isSelected()){
            easyCoat.setSelected(false);
            hardCoat.setSelected(false);
            cantCoat.setSelected(false);
            youngCoat.setSelected(false);
        }
    }

    public void onlittleWrite(ActionEvent event) {
        if(littleWrite.isSelected()){
            easyWrite.setSelected(false);
            hardWrite.setSelected(false);
            cantWrite.setSelected(false);
            youngWrite.setSelected(false);
        }

    }

    public void onhardHeavy(ActionEvent event) {
        if(hardHeavy.isSelected()){
            littleHeavy.setSelected(false);
            easyHeavy.setSelected(false);
            cantHeavy.setSelected(false);
            youngHeavy.setSelected(false);
        }
    }

    public void onhardPour(ActionEvent event) {
        if(hardPour.isSelected()){
            littlePour.setSelected(false);
            easyPour.setSelected(false);
            cantPour.setSelected(false);
            youngPour.setSelected(false);
        }
    }

    public void onhardOpen(ActionEvent event) {
        if(hardOpen.isSelected()){
            littleOpen.setSelected(false);
            easyOpen.setSelected(false);
            cantOpen.setSelected(false);
            youngJar.setSelected(false);
        }
    }

    public void onhardFork(ActionEvent event) {
        if(hardFork.isSelected()){
            littleFork.setSelected(false);
            easyFork.setSelected(false);
            cantFork.setSelected(false);
            youngFork.setSelected(false);
        }
    }

    public void onhardComb(ActionEvent event) {
        if(hardComb.isSelected()){
            littleComb.setSelected(false);
            easyComb.setSelected(false);
            cantComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }

    public void onhardButtons(ActionEvent event) {
        if(hardButtons.isSelected()){
            littleButtom.setSelected(false);
            easyButton.setSelected(false);
            cantButton.setSelected(false);
            youngButton.setSelected(false);
        }
    }

    public void onhardWrite(ActionEvent event) {
        if(hardWrite.isSelected()){
            littleWrite.setSelected(false);
            easyWrite.setSelected(false);
            cantWrite.setSelected(false);
            youngWrite.setSelected(false);
        }

    }

    public void onhardCoat(ActionEvent event) {
        if(hardCoat.isSelected()){
            littleCoat.setSelected(false);
            easyCoat.setSelected(false);
            cantCoat.setSelected(false);
            youngCoat.setSelected(false);
        }
    }

    public void oncantHeavy(ActionEvent event) {
        if(cantHeavy.isSelected()){
            hardHeavy.setSelected(false);
            littleHeavy.setSelected(false);
            easyHeavy.setSelected(false);
            youngHeavy.setSelected(false);
        }
    }

    public void oncantPour(ActionEvent event) {
        if(cantPour.isSelected()){
            youngPour.setSelected(false);
            hardPour.setSelected(false);
            littlePour.setSelected(false);
            easyPour.setSelected(false);
        }
    }

    public void oncantFork(ActionEvent event) {
        if(cantFork.isSelected()){
            youngFork.setSelected(false);
            hardFork.setSelected(false);
            littleFork.setSelected(false);
            easyFork.setSelected(false);
        }
    }

    public void ocantOpen(ActionEvent event) {
        if(cantOpen.isSelected()){
            youngJar.setSelected(false);
            hardOpen.setSelected(false);
            littleOpen.setSelected(false);
            easyOpen.setSelected(false);
        }
    }

    public void oncantComb(ActionEvent event) {
        if(cantComb.isSelected()){
            hardComb.setSelected(false);
            littleComb.setSelected(false);
            easyComb.setSelected(false);
            youngComb.setSelected(false);
        }
    }


    public void oncantButton(ActionEvent event) {
        if(cantButton.isSelected()){
            youngButton.setSelected(false);
            hardButtons.setSelected(false);
            littleButtom.setSelected(false);
            easyButton.setSelected(false);
        }
    }

    public void oncantCoat(ActionEvent event) {
        if(cantCoat.isSelected()){
            youngCoat.setSelected(false);
            hardCoat.setSelected(false);
            littleCoat.setSelected(false);
            easyCoat.setSelected(false);
        }
    }

    public void oncantWrite(ActionEvent event) {
        if(cantWrite.isSelected()){
            youngWrite.setSelected(false);
            hardWrite.setSelected(false);
            littleWrite.setSelected(false);
            easyWrite.setSelected(false);
        }
    }

    public void onyoungHeavy(ActionEvent event) {
        if(youngHeavy.isSelected()){
            cantHeavy.setSelected(false);
            hardHeavy.setSelected(false);
            littleHeavy.setSelected(false);
            easyHeavy.setSelected(false);
        }
    }

    public void onyoungPour(ActionEvent event) {
        if(youngPour.isSelected()){
            cantPour.setSelected(false);
            hardPour.setSelected(false);
            littlePour.setSelected(false);
            easyPour.setSelected(false);
        }
    }

    public void onyoungJar(ActionEvent event) {
        if(youngJar.isSelected()){
            cantOpen.setSelected(false);
            hardOpen.setSelected(false);
            littleOpen.setSelected(false);
            easyOpen.setSelected(false);
        }
    }

    public void onyoungFork(ActionEvent event) {
        if(youngFork.isSelected()){
            cantFork.setSelected(false);
            hardFork.setSelected(false);
            littleFork.setSelected(false);
            easyFork.setSelected(false);
        }
    }

    public void onyoungComb(ActionEvent event) {
        if(youngComb.isSelected()){
            cantComb.setSelected(false);
            hardComb.setSelected(false);
            littleComb.setSelected(false);
            easyComb.setSelected(false);
        }
    }

    public void onyoungButton(ActionEvent event) {
        if(youngButton.isSelected()){
            cantButton.setSelected(false);
            hardButtons.setSelected(false);
            littleButtom.setSelected(false);
            easyButton.setSelected(false);
        }
    }

    public void onyoungCoat(ActionEvent event) {
        if(youngCoat.isSelected()){
            cantCoat.setSelected(false);
            hardCoat.setSelected(false);
            littleCoat.setSelected(false);
            easyCoat.setSelected(false);
        }
    }

    public void onyoungWrite(ActionEvent event) {
        if(youngWrite.isSelected()){
            cantWrite.setSelected(false);
            hardWrite.setSelected(false);
            littleWrite.setSelected(false);
            easyWrite.setSelected(false);
        }
    }
}

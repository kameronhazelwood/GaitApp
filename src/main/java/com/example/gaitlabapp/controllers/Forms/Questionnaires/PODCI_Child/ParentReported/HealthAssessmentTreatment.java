package com.example.gaitlabapp.controllers.Forms.Questionnaires.PODCI_Child.ParentReported;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HealthAssessmentTreatment {
    public RadioButton cantSchool;
    @FXML
    private RadioButton cantBetter;

    @FXML
    private RadioButton cantFeelBetter;

    @FXML
    private RadioButton cantFree;

    @FXML
    private RadioButton cantHome;

    @FXML
    private RadioButton cantPain;

    @FXML
    private RadioButton cantPlay;

    @FXML
    private RadioButton cantSleep;

    @FXML
    private RadioButton cantSports;

    @FXML
    private RadioButton easyBetter;

    @FXML
    private RadioButton easyFeelBetter;

    @FXML
    private RadioButton easyFree;

    @FXML
    private RadioButton easyHome;

    @FXML
    private RadioButton easyPain;

    @FXML
    private RadioButton easyPlay;

    @FXML
    private RadioButton easySchool;

    @FXML
    private RadioButton easySports;

    @FXML
    private RadioButton hardBetter;

    @FXML
    private RadioButton hardFeelBetter;

    @FXML
    private RadioButton hardFree;

    @FXML
    private RadioButton hardHome;

    @FXML
    private RadioButton hardPain;

    @FXML
    private RadioButton hardPlay;

    @FXML
    private RadioButton hardSchool;

    @FXML
    private RadioButton hardSleep;

    @FXML
    private RadioButton hardSports;

    @FXML
    private RadioButton littleBetter;

    @FXML
    private RadioButton littleFeelBetter;

    @FXML
    private RadioButton littleFree;

    @FXML
    private RadioButton littleHome;

    @FXML
    private RadioButton littlePain;

    @FXML
    private RadioButton littlePlay;

    @FXML
    private RadioButton littleSchool;

    @FXML
    private RadioButton littleSleep;

    @FXML
    private RadioButton littleSports;

    @FXML
    private RadioButton sleepEasy;

    @FXML
    private Button start;

    @FXML
    private RadioButton youngBetter;

    @FXML
    private RadioButton youngFeelBetter;

    @FXML
    private RadioButton youngFree;

    @FXML
    private RadioButton youngHome;

    @FXML
    private RadioButton youngPain;

    @FXML
    private RadioButton youngPlay;

    @FXML
    private RadioButton youngSchool;

    @FXML
    private RadioButton youngSleep;

    @FXML
    private RadioButton youngSports;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentLife.fxml"));
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
    @FXML
    void oncantBetter(ActionEvent event) {
        if(cantBetter.isSelected()){
            youngBetter.setSelected(false);
            hardBetter.setSelected(false);
            littleBetter.setSelected(false);
            easyBetter.setSelected(false);
        }

    }

    @FXML
    void oncantFeelBetter(ActionEvent event) {
        if(cantFeelBetter.isSelected()){
            youngFeelBetter.setSelected(false);
            hardFeelBetter.setSelected(false);
            littleFeelBetter.setSelected(false);
            easyFeelBetter.setSelected(false);
        }
    }

    @FXML
    void oncantFree(ActionEvent event) {
        if(cantFree.isSelected()){
            youngFree.setSelected(false);
            hardFree.setSelected(false);
            littleFree.setSelected(false);
            easyFree.setSelected(false);
        }
    }

    @FXML
    void oncantHome(ActionEvent event) {
        if(cantHome.isSelected()){
            youngHome.setSelected(false);
            hardHome.setSelected(false);
            littleHome.setSelected(false);
            easyHome.setSelected(false);
        }
    }

    @FXML
    void oncantPain(ActionEvent event) {
        if(cantPain.isSelected()){
            youngPain.setSelected(false);
            hardPain.setSelected(false);
            littlePain.setSelected(false);
            easyPain.setSelected(false);
        }
    }

    @FXML
    void oncantPlay(ActionEvent event) {
        if(cantPlay.isSelected()){
            youngPlay.setSelected(false);
            hardPlay.setSelected(false);
            littlePlay.setSelected(false);
            easyPlay.setSelected(false);
        }
    }

    @FXML
    void oncantSleep(ActionEvent event) {
        if(cantSleep.isSelected()){
            youngSleep.setSelected(false);
            hardSleep.setSelected(false);
            littleSleep.setSelected(false);
            sleepEasy.setSelected(false);
        }
    }

    @FXML
    void oncantSports(ActionEvent event) {
        if(cantSports.isSelected()){
            youngSports.setSelected(false);
            hardSports.setSelected(false);
            littleSports.setSelected(false);
            easySports.setSelected(false);
        }
    }

    @FXML
    void oneasyBetter(ActionEvent event) {
        if(easyBetter.isSelected()){
            youngBetter.setSelected(false);
            hardBetter.setSelected(false);
            littleBetter.setSelected(false);
            cantBetter.setSelected(false);
        }
    }

    @FXML
    void oneasyFeelBetter(ActionEvent event) {
        if(easyFeelBetter.isSelected()){
            youngFeelBetter.setSelected(false);
            hardFeelBetter.setSelected(false);
            littleFeelBetter.setSelected(false);
            cantFeelBetter.setSelected(false);
        }
    }

    @FXML
    void oneasyFree(ActionEvent event) {
        if(easyFree.isSelected()){
            youngFree.setSelected(false);
            hardFree.setSelected(false);
            littleFree.setSelected(false);
            cantFree.setSelected(false);
        }
    }

    @FXML
    void oneasyHome(ActionEvent event) {
        if(easyHome.isSelected()){
            youngHome.setSelected(false);
            hardHome.setSelected(false);
            littleHome.setSelected(false);
            cantHome.setSelected(false);
        }
    }

    @FXML
    void oneasyPain(ActionEvent event) {
        if(easyHome.isSelected()){
            youngHome.setSelected(false);
            hardHome.setSelected(false);
            littleHome.setSelected(false);
            cantHome.setSelected(false);
        }
    }

    @FXML
    void oneasyPlay(ActionEvent event) {
        if(easyPlay.isSelected()){
            youngPlay.setSelected(false);
            hardPlay.setSelected(false);
            littlePlay.setSelected(false);
            cantPlay.setSelected(false);
        }
    }

    @FXML
    void oneasySchool(ActionEvent event) {
        if(easySchool.isSelected()){
            youngSchool.setSelected(false);
            hardSchool.setSelected(false);
            littleSchool.setSelected(false);
            cantSchool.setSelected(false);
        }
    }

    @FXML
    void oneasySports(ActionEvent event) {
        if(easySports.isSelected()){
            youngSports.setSelected(false);
            hardSports.setSelected(false);
            littleSports.setSelected(false);
            cantSports.setSelected(false);
        }
    }

    @FXML
    void onhardBetter(ActionEvent event) {
        if(hardBetter.isSelected()){
            youngBetter.setSelected(false);
            easyBetter.setSelected(false);
            littleBetter.setSelected(false);
            cantBetter.setSelected(false);
        }
    }

    @FXML
    void onhardFeelBetter(ActionEvent event) {
        if(hardFeelBetter.isSelected()){
            youngFeelBetter.setSelected(false);
            easyFeelBetter.setSelected(false);
            littleFeelBetter.setSelected(false);
            cantFeelBetter.setSelected(false);
        }
    }

    @FXML
    void onhardFree(ActionEvent event) {
        if(hardFree.isSelected()){
            youngFree.setSelected(false);
            easyFree.setSelected(false);
            littleFree.setSelected(false);
            cantFree.setSelected(false);
        }
    }

    @FXML
    void onhardHome(ActionEvent event) {
        if(hardHome.isSelected()){
            youngHome.setSelected(false);
            easyHome.setSelected(false);
            littleHome.setSelected(false);
            cantHome.setSelected(false);
        }
    }

    @FXML
    void onhardPain(ActionEvent event) {
        if(hardPain.isSelected()){
            youngPain.setSelected(false);
            easyPain.setSelected(false);
            littlePain.setSelected(false);
            cantPain.setSelected(false);
        }
    }

    @FXML
    void onhardPlay(ActionEvent event) {
        if(hardPlay.isSelected()){
            youngPlay.setSelected(false);
            easyPlay.setSelected(false);
            littlePlay.setSelected(false);
            cantPlay.setSelected(false);
        }
    }

    @FXML
    void onhardSchool(ActionEvent event) {
        if(hardSchool.isSelected()){
            youngSchool.setSelected(false);
            easySchool.setSelected(false);
            littleSchool.setSelected(false);
            cantSchool.setSelected(false);
        }
    }

    @FXML
    void onhardSleep(ActionEvent event) {
        if(hardSleep.isSelected()){
            youngSleep.setSelected(false);
            sleepEasy.setSelected(false);
            littleSleep.setSelected(false);
            cantSleep.setSelected(false);
        }
    }

    @FXML
    void onhardSports(ActionEvent event) {
        if(hardSports.isSelected()){
            youngSports.setSelected(false);
            easySports.setSelected(false);
            littleSports.setSelected(false);
            cantSports.setSelected(false);
        }
    }

    @FXML
    void onlittleBetter(ActionEvent event) {
        if(littleBetter.isSelected()){
            youngBetter.setSelected(false);
            easyBetter.setSelected(false);
            hardBetter.setSelected(false);
            cantBetter.setSelected(false);
        }
    }

    @FXML
    void onlittleFeelBetter(ActionEvent event) {
        if(littleFeelBetter.isSelected()){
            youngFeelBetter.setSelected(false);
            easyFeelBetter.setSelected(false);
            hardBetter.setSelected(false);
            cantFeelBetter.setSelected(false);
        }
    }

    @FXML
    void onlittleFree(ActionEvent event) {
        if(littleBetter.isSelected()){
            youngFeelBetter.setSelected(false);
            easyFeelBetter.setSelected(false);
            hardBetter.setSelected(false);
            cantFeelBetter.setSelected(false);
        }
    }

    @FXML
    void onlittleHome(ActionEvent event) {
        if(littleHome.isSelected()){
            youngHome.setSelected(false);
            easyHome.setSelected(false);
            hardHome.setSelected(false);
            cantHome.setSelected(false);
        }
    }

    @FXML
    void onlittlePain(ActionEvent event) {
        if(littlePain.isSelected()){
            youngPain.setSelected(false);
            easyPain.setSelected(false);
            hardPain.setSelected(false);
            cantPain.setSelected(false);
        }
    }

    @FXML
    void onlittlePlay(ActionEvent event) {
        if(littlePlay.isSelected()){
            youngPlay.setSelected(false);
            easyPlay.setSelected(false);
            hardPlay.setSelected(false);
            cantPlay.setSelected(false);
        }
    }

    @FXML
    void onlittleSchool(ActionEvent event) {
        if(littleSchool.isSelected()){
            youngSchool.setSelected(false);
            easySchool.setSelected(false);
            hardSchool.setSelected(false);
            cantSchool.setSelected(false);
        }
    }

    @FXML
    void onlittleSleep(ActionEvent event) {
        if(littleSleep.isSelected()){
            youngSleep.setSelected(false);
            sleepEasy.setSelected(false);
            hardSleep.setSelected(false);
            cantSleep.setSelected(false);
        }
    }

    @FXML
    void onlittleSports(ActionEvent event) {
        if(littleSports.isSelected()){
            youngSports.setSelected(false);
            easySports.setSelected(false);
            hardSports.setSelected(false);
            cantSports.setSelected(false);
        }
    }

    @FXML
    void onsleepEasy(ActionEvent event) {
        if(sleepEasy.isSelected()){
            youngSleep.setSelected(false);
            littleSleep.setSelected(false);
            hardSleep.setSelected(false);
            cantSleep.setSelected(false);
        }
    }

    @FXML
    void onyoungBetter(ActionEvent event) {
        if(youngBetter.isSelected()){
            easyBetter.setSelected(false);
            littleBetter.setSelected(false);
            hardBetter.setSelected(false);
            cantSleep.setSelected(false);
        }
    }

    @FXML
    void onyoungFeelBetter(ActionEvent event) {
        if(youngFeelBetter.isSelected()){
            easyFeelBetter.setSelected(false);
            littleFeelBetter.setSelected(false);
            hardFeelBetter.setSelected(false);
            cantFeelBetter.setSelected(false);
        }
    }

    @FXML
    void onyoungFree(ActionEvent event) {
        if(youngFree.isSelected()){
            easyFree.setSelected(false);
            littleFree.setSelected(false);
            hardFree.setSelected(false);
            cantFree.setSelected(false);
        }
    }

    @FXML
    void onyoungHome(ActionEvent event) {
        if(youngHome.isSelected()){
            easyHome.setSelected(false);
            littleHome.setSelected(false);
            hardHome.setSelected(false);
            cantHome.setSelected(false);
        }
    }

    @FXML
    void onyoungPain(ActionEvent event) {
        if(youngPain.isSelected()){
            easyPain.setSelected(false);
            littlePain.setSelected(false);
            hardPain.setSelected(false);
            cantPain.setSelected(false);
        }
    }

    @FXML
    void onyoungPlay(ActionEvent event) {
        if(youngPlay.isSelected()){
            easyPlay.setSelected(false);
            littlePlay.setSelected(false);
            hardPlay.setSelected(false);
            cantPlay.setSelected(false);
        }
    }

    @FXML
    void onyoungSchool(ActionEvent event) {
        if(youngSchool.isSelected()){
            easySchool.setSelected(false);
            littleSchool.setSelected(false);
            hardSchool.setSelected(false);
            cantSchool.setSelected(false);
        }
    }

    @FXML
    void onyoungSleep(ActionEvent event) {
        if(youngSleep.isSelected()){
            sleepEasy.setSelected(false);
            littleSleep.setSelected(false);
            hardSleep.setSelected(false);
            cantSleep.setSelected(false);
        }
    }

    @FXML
    void onyoungSports(ActionEvent event) {
        if(youngSports.isSelected()){
            easySports.setSelected(false);
            littleSports.setSelected(false);
            hardSports.setSelected(false);
            cantSports.setSelected(false);
        }
    }

    public void oncantSchool(ActionEvent event) {
        if(cantSports.isSelected()){
            easySports.setSelected(false);
            littleSports.setSelected(false);
            hardSports.setSelected(false);
            youngSports.setSelected(false);
        }
    }
}

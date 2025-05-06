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

public class HealthAssessmentStand {
    public Button start;
    @FXML
    private RadioButton cantBed;

    @FXML
    private RadioButton cantChair;

    @FXML
    private RadioButton cantDoor;

    @FXML
    private RadioButton cantSit;

    @FXML
    private RadioButton cantStanding;

    @FXML
    private RadioButton cantWash;

    @FXML
    private RadioButton easyBed;

    @FXML
    private RadioButton easyChair;

    @FXML
    private RadioButton easyDoor;

    @FXML
    private RadioButton easySit;

    @FXML
    private RadioButton easyStanding;

    @FXML
    private RadioButton easyWashing;

    @FXML
    private RadioButton hardBed;

    @FXML
    private RadioButton hardChair;

    @FXML
    private RadioButton hardDoor;

    @FXML
    private RadioButton hardSit;

    @FXML
    private RadioButton hardStanding;

    @FXML
    private RadioButton hardWashing;

    @FXML
    private RadioButton littleBed;

    @FXML
    private RadioButton littleChair;

    @FXML
    private RadioButton littleDoor;

    @FXML
    private RadioButton littleSit;

    @FXML
    private RadioButton littleStanding;

    @FXML
    private RadioButton littleWashing;

    @FXML
    private RadioButton youngBed;

    @FXML
    private RadioButton youngChair;

    @FXML
    private RadioButton youngDoor;

    @FXML
    private RadioButton youngSit;

    @FXML
    private RadioButton youngStanding;

    @FXML
    private RadioButton youngWashing;


    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentHelpFromOthers.fxml"));
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
    void oncantBed(ActionEvent event) {
        if(cantBed.isSelected()){
            hardBed.setSelected(false);
            littleBed.setSelected(false);
            easyBed.setSelected(false);
            youngBed.setSelected(false);
        }
    }

    @FXML
    void oncantChair(ActionEvent event) {
        if(cantChair.isSelected()){
            hardChair.setSelected(false);
            littleChair.setSelected(false);
            easyChair.setSelected(false);
            youngChair.setSelected(false);
        }
    }

    @FXML
    void oncantDoor(ActionEvent event) {
        if(cantDoor.isSelected()){
            hardDoor.setSelected(false);
            littleDoor.setSelected(false);
            easyDoor.setSelected(false);
            youngDoor.setSelected(false);
        }
    }

    @FXML
    void oncantSit(ActionEvent event) {
        if(cantSit.isSelected()){
            hardSit.setSelected(false);
            littleSit.setSelected(false);
            easySit.setSelected(false);
            youngSit.setSelected(false);
        }
    }

    @FXML
    void oncantStanding(ActionEvent event) {
        if(cantStanding.isSelected()){
            hardStanding.setSelected(false);
            littleStanding.setSelected(false);
            easyStanding.setSelected(false);
            youngStanding.setSelected(false);
        }
    }

    @FXML
    void oncantWash(ActionEvent event) {
        if(cantWash.isSelected()){
            hardWashing.setSelected(false);
            littleWashing.setSelected(false);
            easyWashing.setSelected(false);
            youngWashing.setSelected(false);
        }
    }

    @FXML
    void oneasyBed(ActionEvent event) {
        if(easyBed.isSelected()){
            hardBed.setSelected(false);
            littleBed.setSelected(false);
            cantBed.setSelected(false);
            youngBed.setSelected(false);
        }
    }
    @FXML
    void oneasyChair(ActionEvent event) {
        if(easyChair.isSelected()){
            hardChair.setSelected(false);
            littleChair.setSelected(false);
            cantChair.setSelected(false);
            youngChair.setSelected(false);
        }
    }

    @FXML
    void oneasyDoor(ActionEvent event) {
        if(easyDoor.isSelected()){
            hardDoor.setSelected(false);
            littleDoor.setSelected(false);
            cantDoor.setSelected(false);
            youngDoor.setSelected(false);
        }
    }

    @FXML
    void oneasySit(ActionEvent event) {
        if(easySit.isSelected()){
            hardSit.setSelected(false);
            littleSit.setSelected(false);
            cantSit.setSelected(false);
            youngSit.setSelected(false);
        }
    }

    @FXML
    void oneasyStanding(ActionEvent event) {
        if(easyStanding.isSelected()){
            hardStanding.setSelected(false);
            littleStanding.setSelected(false);
            cantStanding.setSelected(false);
            youngSit.setSelected(false);
        }
    }

    @FXML
    void oneasyWashing(ActionEvent event) {
        if(easyWashing.isSelected()){
            hardWashing.setSelected(false);
            littleWashing.setSelected(false);
            cantWash.setSelected(false);
            youngWashing.setSelected(false);
        }
    }

    @FXML
    void onhardBed(ActionEvent event) {
        if(hardBed.isSelected()){
            easyBed.setSelected(false);
            littleBed.setSelected(false);
            cantBed.setSelected(false);
            youngBed.setSelected(false);
        }
    }

    @FXML
    void onhardChair(ActionEvent event) {
        if(hardChair.isSelected()){
            easyChair.setSelected(false);
            littleChair.setSelected(false);
            cantChair.setSelected(false);
            youngChair.setSelected(false);
        }
    }

    @FXML
    void onhardDoor(ActionEvent event) {
        if(hardDoor.isSelected()){
            easyDoor.setSelected(false);
            littleDoor.setSelected(false);
            cantDoor.setSelected(false);
            youngDoor.setSelected(false);
        }
    }

    @FXML
    void onhardSit(ActionEvent event) {
        if(hardSit.isSelected()){
            easySit.setSelected(false);
            littleSit.setSelected(false);
            cantSit.setSelected(false);
            youngSit.setSelected(false);
        }
    }

    @FXML
    void onhardStanding(ActionEvent event) {
        if(hardStanding.isSelected()){
            easyStanding.setSelected(false);
            littleStanding.setSelected(false);
            cantStanding.setSelected(false);
            youngStanding.setSelected(false);
        }
    }

    @FXML
    void onhardWashing(ActionEvent event) {
        if(hardWashing.isSelected()){
            easyWashing.setSelected(false);
            littleWashing.setSelected(false);
            cantWash.setSelected(false);
            youngWashing.setSelected(false);
        }
    }

    @FXML
    void onlittleBed(ActionEvent event) {
        if(littleBed.isSelected()){
            easyBed.setSelected(false);
            hardBed.setSelected(false);
            cantBed.setSelected(false);
            youngBed.setSelected(false);
        }
    }

    @FXML
    void onlittleChair(ActionEvent event) {
        if(littleChair.isSelected()){
            easyChair.setSelected(false);
            hardChair.setSelected(false);
            cantChair.setSelected(false);
            youngChair.setSelected(false);
        }
    }

    @FXML
    void onlittleDoor(ActionEvent event) {
        if(littleDoor.isSelected()){
            easyDoor.setSelected(false);
            hardDoor.setSelected(false);
            cantDoor.setSelected(false);
            youngDoor.setSelected(false);
        }
    }

    @FXML
    void onlittleSit(ActionEvent event) {
        if(littleSit.isSelected()){
            easySit.setSelected(false);
            hardSit.setSelected(false);
            cantSit.setSelected(false);
            youngSit.setSelected(false);
        }
    }

    @FXML
    void onlittleStanding(ActionEvent event) {
        if(littleStanding.isSelected()){
            easyStanding.setSelected(false);
            hardStanding.setSelected(false);
            cantStanding.setSelected(false);
            youngStanding.setSelected(false);
        }
    }

    @FXML
    void onlittleWashing(ActionEvent event) {
        if(littleWashing.isSelected()){
            easyWashing.setSelected(false);
            hardWashing.setSelected(false);
            cantWash.setSelected(false);
            youngWashing.setSelected(false);
        }
    }

    @FXML
    void onyoungBed(ActionEvent event) {
        if(youngBed.isSelected()){
            easyWashing.setSelected(false);
            hardWashing.setSelected(false);
            cantWash.setSelected(false);
            youngWashing.setSelected(false);
        }
    }

    @FXML
    void onyoungChair(ActionEvent event) {
        if(youngChair.isSelected()){
            easyChair.setSelected(false);
            hardChair.setSelected(false);
            cantChair.setSelected(false);
            youngChair.setSelected(false);
        }
    }

    @FXML
    void onyoungDoor(ActionEvent event) {
        if(youngDoor.isSelected()){
            easyDoor.setSelected(false);
            hardDoor.setSelected(false);
            cantDoor.setSelected(false);
            youngDoor.setSelected(false);
        }
    }

    @FXML
    void onyoungSit(ActionEvent event) {
        if(youngSit.isSelected()){
            easySit.setSelected(false);
            hardSit.setSelected(false);
            cantSit.setSelected(false);
            youngSit.setSelected(false);
        }
    }

    @FXML
    void onyoungStanding(ActionEvent event) {
        if(youngStanding.isSelected()){
            easyStanding.setSelected(false);
            hardStanding.setSelected(false);
            cantStanding.setSelected(false);
            youngStanding.setSelected(false);
        }
    }

    @FXML
    void onyoungWashing(ActionEvent event) {
        if(youngWashing.isSelected()){
            easyWashing.setSelected(false);
            hardWashing.setSelected(false);
            cantWash.setSelected(false);
            youngWashing.setSelected(false);
        }
    }
}

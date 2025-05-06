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

public class HealthAssessmentLastWeekCont {
    public Button start;
    public RadioButton easyBike;
    public RadioButton easyClimb;
    public RadioButton easyStairs;
    public RadioButton easyMile;
    public RadioButton easyThree;
    public RadioButton easyOne;
    public RadioButton easyBus;
    public RadioButton littleRun;
    public RadioButton littleBike;
    public RadioButton littleClimb;
    public RadioButton littleStairs;
    public RadioButton littleMile;
    public RadioButton littleThree;
    public RadioButton littleOne;
    public RadioButton littleBus;
    public RadioButton hardRun;
    public RadioButton hardBike;
    public RadioButton easyRun;
    public RadioButton hardClimb;
    public RadioButton hardStairs;
    public RadioButton hardMile;
    public RadioButton hardThree;
    public RadioButton hardOne;
    public RadioButton hardBus;
    public RadioButton cantRun;
    public RadioButton cantBike;
    public RadioButton cantClimb;
    public RadioButton cantStairs;
    public RadioButton cantMile;
    public RadioButton cantThree;
    public RadioButton cantOne;
    public RadioButton cantBus;
    public RadioButton youngRun;
    public RadioButton youngBike;
    public RadioButton youngClimb;
    public RadioButton youngStairs;
    public RadioButton youngMile;
    public RadioButton youngThree;
    public RadioButton youngOne;
    public RadioButton youngBus;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentHelp.fxml"));
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

    public void oneasyBike(ActionEvent event) {
        if(easyBike.isSelected()){
            littleRun.setSelected(false);
            hardRun.setSelected(false);
            cantRun.setSelected(false);
            youngRun.setSelected(false);
        }
    }

    public void oneasyClimb(ActionEvent event) {
        if(easyClimb.isSelected()){
            littleClimb.setSelected(false);
            hardClimb.setSelected(false);
            cantClimb.setSelected(false);
            youngClimb.setSelected(false);
        }
    }

    public void oneasyStairs(ActionEvent event) {
        if(easyStairs.isSelected()){
            littleStairs.setSelected(false);
            hardStairs.setSelected(false);
            cantStairs.setSelected(false);
            youngStairs.setSelected(false);
        }
    }

    public void oneasyMile(ActionEvent event) {
        if(easyMile.isSelected()){
            littleMile.setSelected(false);
            hardMile.setSelected(false);
            cantMile.setSelected(false);
            youngMile.setSelected(false);
        }
    }

    public void oneasyThree(ActionEvent event) {
        if(easyThree.isSelected()){
            littleThree.setSelected(false);
            hardThree.setSelected(false);
            cantThree.setSelected(false);
            youngThree.setSelected(false);
        }
    }

    public void oneasyOne(ActionEvent event) {
        if(easyOne.isSelected()){
            littleOne.setSelected(false);
            hardOne.setSelected(false);
            cantOne.setSelected(false);
            youngOne.setSelected(false);
        }
    }

    public void oneasyBus(ActionEvent event) {
        if(easyBus.isSelected()){
            littleBus.setSelected(false);
            hardBus.setSelected(false);
            cantBus.setSelected(false);
            youngBus.setSelected(false);
        }
    }

    public void onlittleRun(ActionEvent event) {
        if(littleRun.isSelected()){
            easyRun.setSelected(false);
            hardRun.setSelected(false);
            cantRun.setSelected(false);
            youngRun.setSelected(false);
        }
    }

    public void onlittleBike(ActionEvent event) {
        if(littleBike.isSelected()){
            easyBike.setSelected(false);
            hardBike.setSelected(false);
            cantBike.setSelected(false);
            youngBike.setSelected(false);
        }
    }

    public void onLittleClimb(ActionEvent event) {
        if(littleClimb.isSelected()){
            easyClimb.setSelected(false);
            hardClimb.setSelected(false);
            cantClimb.setSelected(false);
            youngClimb.setSelected(false);
        }
    }

    public void onlittleStairs(ActionEvent event) {
        if(littleStairs.isSelected()){
            easyStairs.setSelected(false);
            hardStairs.setSelected(false);
            cantStairs.setSelected(false);
            youngStairs.setSelected(false);
        }
    }

    public void onlittleMile(ActionEvent event) {
        if(littleMile.isSelected()){
            easyMile.setSelected(false);
            hardMile.setSelected(false);
            cantMile.setSelected(false);
            youngMile.setSelected(false);
        }
    }

    public void onlittleThree(ActionEvent event) {
        if(littleThree.isSelected()){
            easyThree.setSelected(false);
            hardThree.setSelected(false);
            cantThree.setSelected(false);
            youngThree.setSelected(false);
        }
    }

    public void onlittleOne(ActionEvent event) {
        if(littleOne.isSelected()){
            easyOne.setSelected(false);
            hardOne.setSelected(false);
            cantOne.setSelected(false);
            youngOne.setSelected(false);
        }
    }

    public void oneasyRun(ActionEvent event) {
        if(easyRun.isSelected()){
            littleRun.setSelected(false);
            hardRun.setSelected(false);
            cantRun.setSelected(false);
            youngRun.setSelected(false);
        }
    }

    public void onlittleBus(ActionEvent event) {
        if(littleBus.isSelected()){
            easyBus.setSelected(false);
            hardBus.setSelected(false);
            cantBus.setSelected(false);
            youngBus.setSelected(false);
        }
    }

    public void onhardRun(ActionEvent event) {
        if(hardRun.isSelected()){
            littleRun.setSelected(false);
            easyRun.setSelected(false);
            cantRun.setSelected(false);
            youngRun.setSelected(false);
        }
    }

    public void onhardBike(ActionEvent event) {
        if(hardBike.isSelected()){
            littleBike.setSelected(false);
            easyBike.setSelected(false);
            cantBike.setSelected(false);
            youngBike.setSelected(false);
        }
    }

    public void onhardClimb(ActionEvent event) {
        if(hardClimb.isSelected()){
            cantClimb.setSelected(false);
            youngClimb.setSelected(false);
            littleClimb.setSelected(false);
            easyClimb.setSelected(false);
        }
    }

    public void onhardStairs(ActionEvent event) {
        if(hardStairs.isSelected()){
            littleStairs.setSelected(false);
            easyStairs.setSelected(false);
            cantStairs.setSelected(false);
            youngStairs.setSelected(false);
        }
    }

    public void onhardMile(ActionEvent event) {
        if(hardMile.isSelected()){
            littleMile.setSelected(false);
            easyMile.setSelected(false);
            cantMile.setSelected(false);
            youngMile.setSelected(false);
        }
    }

    public void onhardThree(ActionEvent event) {
        if(hardThree.isSelected()){
            cantThree.setSelected(false);
            youngThree.setSelected(false);
            littleThree.setSelected(false);
            easyThree.setSelected(false);
        }
    }

    public void onhardOne(ActionEvent event) {
        if(hardOne.isSelected()){
            cantOne.setSelected(false);
            youngOne.setSelected(false);
            littleOne.setSelected(false);
            easyOne.setSelected(false);
        }
    }

    public void onhardBus(ActionEvent event) {
        if(hardBus.isSelected()){
            cantBus.setSelected(false);
            youngBus.setSelected(false);
            littleBus.setSelected(false);
            easyBus.setSelected(false);
        }
    }

    public void oncantRun(ActionEvent event) {
        if(cantRun.isSelected()){
            youngRun.setSelected(false);
            hardRun.setSelected(false);
            littleRun.setSelected(false);
            easyRun.setSelected(false);
        }
    }

    public void oncantBike(ActionEvent event) {
        if(cantBike.isSelected()){
            youngBike.setSelected(false);
            hardBike.setSelected(false);
            littleBike.setSelected(false);
            easyBike.setSelected(false);
        }
    }

    public void oncantClimb(ActionEvent event) {
        if(cantClimb.isSelected()){
            youngClimb.setSelected(false);
            hardClimb.setSelected(false);
            littleClimb.setSelected(false);
            easyClimb.setSelected(false);
        }
    }

    public void oncantStairs(ActionEvent event) {
        if(cantStairs.isSelected()){
            youngStairs.setSelected(false);
            hardStairs.setSelected(false);
            littleStairs.setSelected(false);
            easyStairs.setSelected(false);
        }
    }

    public void oncantMile(ActionEvent event) {
        if(cantMile.isSelected()){
            youngMile.setSelected(false);
            hardMile.setSelected(false);
            littleMile.setSelected(false);
            easyMile.setSelected(false);
        }
    }

    public void oncantThree(ActionEvent event) {
        if(cantThree.isSelected()){
            youngThree.setSelected(false);
            hardThree.setSelected(false);
            littleThree.setSelected(false);
            easyThree.setSelected(false);
        }
    }

    public void oncantOne(ActionEvent event) {
        if(cantOne.isSelected()){
            youngOne.setSelected(false);
            hardOne.setSelected(false);
            littleOne.setSelected(false);
            easyOne.setSelected(false);
        }
    }

    public void oncantBus(ActionEvent event) {
        if(cantBus.isSelected()){
            youngBus.setSelected(false);
            hardBus.setSelected(false);
            littleBus.setSelected(false);
            easyBus.setSelected(false);
        }
    }

    public void onyoungRun(ActionEvent event) {
        if(youngRun.isSelected()){
            cantRun.setSelected(false);
            hardRun.setSelected(false);
            littleRun.setSelected(false);
            easyRun.setSelected(false);
        }
    }

    public void onyoungBike(ActionEvent event) {
        if(youngBike.isSelected()){
            cantBike.setSelected(false);
            hardBike.setSelected(false);
            littleBike.setSelected(false);
            easyBike.setSelected(false);
        }
    }

    public void onyoungClimb(ActionEvent event) {
        if(youngClimb.isSelected()){
            cantClimb.setSelected(false);
            hardClimb.setSelected(false);
            littleClimb.setSelected(false);
            easyClimb.setSelected(false);
        }
    }

    public void onyoungStairs(ActionEvent event) {
        if(youngStairs.isSelected()){
            cantStairs.setSelected(false);
            hardStairs.setSelected(false);
            littleStairs.setSelected(false);
            easyStairs.setSelected(false);
        }
    }

    public void onyoungMile(ActionEvent event) {
        if(youngMile.isSelected()){
            cantMile.setSelected(false);
            hardMile.setSelected(false);
            littleMile.setSelected(false);
            easyMile.setSelected(false);
        }
    }

    public void onyoungThree(ActionEvent event) {
        if(youngThree.isSelected()){
            cantThree.setSelected(false);
            hardThree.setSelected(false);
            littleThree.setSelected(false);
            easyThree.setSelected(false);
        }
    }

    public void onyoungOne(ActionEvent event) {
        if(youngOne.isSelected()){
            cantOne.setSelected(false);
            hardOne.setSelected(false);
            littleOne.setSelected(false);
            easyOne.setSelected(false);
        }
    }

    public void onyoungBus(ActionEvent event) {
        if(youngBus.isSelected()){
            cantBus.setSelected(false);
            hardBus.setSelected(false);
            littleBus.setSelected(false);
            easyBus.setSelected(false);
        }
    }
}

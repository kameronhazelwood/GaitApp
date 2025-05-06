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

public class SpanishHealthAssessmentConditions {
    public Button start;
    public RadioButton JAOneHadItYes;
    public RadioButton JAOneHadItNo;
    public RadioButton JAtreatmentYes;
    public RadioButton JAtreatmentNo;
    public RadioButton JAlimitedYes;
    public RadioButton JAlimitedNo;
    public RadioButton JAManyEverYes;
    public RadioButton JAManyEverNo;
    public RadioButton JAManyTreatmentYes;
    public RadioButton JAManyTreatmentNo;
    public RadioButton JAManyLimitedYes;
    public RadioButton JAManyLimitedNo;
    public RadioButton anorexiaEverYes;
    public RadioButton anorexiaEverNo;
    public RadioButton anorexiaTreatmentYes;
    public RadioButton anorexiaTreatmentNo;
    public RadioButton anorexiaLimitedYes;
    public RadioButton anorexiaLimitedNo;
    public RadioButton asthmaEverYes;
    public RadioButton asthmaEverNo;
    public RadioButton asthmaTreatmentYes;
    public RadioButton asthmaTreatmentNo;
    public RadioButton asthmaLimitedYes;
    public RadioButton asthmaLimitedNo;
    public RadioButton attentionEverYes;
    public RadioButton attentionEverNo;
    public RadioButton attentionTreatmentYes;
    public RadioButton attentionTreatmentNo;
    public RadioButton attentionLimitedYes;
    public RadioButton attentionLimitedNo;
    public RadioButton allergiesEverYes;
    public RadioButton allergiesEverNo;
    public RadioButton allergytreatmentNo;
    public RadioButton allergytreatmentYes;
    public RadioButton allergyLimitedYes;
    public RadioButton allergyLimitedNo;
    public RadioButton delayEverYes;
    public RadioButton delayEverNo;
    public RadioButton delayTreatmentYes;
    public RadioButton delayTreatmentNo;
    public RadioButton delayLimitedYes;
    public RadioButton delayLimitedNo;
    public RadioButton cognitiveEverYes;
    public RadioButton cognitiveEverNo;
    public RadioButton cognitiveTreatmentYes;
    public RadioButton cognitiveTreatmentNo;
    public RadioButton cognitiveLimitedYes;
    public RadioButton cognitiveLimitedNo;
    public RadioButton diabetesEverYes;
    public RadioButton diabetesEverNo;
    public RadioButton diabetesTreatmentYes;
    public RadioButton diabetesTreatmentNo;
    public RadioButton diabetesLimitedYes;
    public RadioButton diabetesLimitedNo;
    public RadioButton seizureEverYes;
    public RadioButton seizureEverNo;
    public RadioButton seizureTreatmentNo;
    public RadioButton seizureTreatmentYes;
    public RadioButton seizureLimitedYes;
    public RadioButton seizureLimitedNo;
    public RadioButton hearingEverYes;
    public RadioButton hearingEverNo;
    public RadioButton hearingTreatmentyes;
    public RadioButton hearingTreatmentNo;
    public RadioButton hearingLimitedYes;
    public RadioButton hearingLimitedNo;
    public RadioButton heartEverYes;
    public RadioButton heartEverNo;
    public RadioButton learningEverYes;
    public RadioButton learningEverNo;
    public RadioButton sleepEverYes;
    public RadioButton sleepEverNo;
    public RadioButton speechEverYes;
    public RadioButton speechEverNo;
    public RadioButton visionEverYes;
    public RadioButton visionEverNo;
    public RadioButton heartTreatmentYes;
    public RadioButton learningTreatmentyes;
    public RadioButton learningTreatmentNo;
    public RadioButton sleepTreatmentYes;
    public RadioButton sleepTreatmentNo;
    public RadioButton heartTreatmentNo;
    public RadioButton speechTreatmentYes;
    public RadioButton speechTreatmentNo;
    public RadioButton visionTreatmentYes;
    public RadioButton visionTreatmentNo;
    public RadioButton heartLimitedYes;
    public RadioButton heartLimitedNo;
    public RadioButton earningLimitedNo;
    public RadioButton learningLimitedYes;
    public RadioButton sleepLimitedYes;
    public RadioButton sleepLimitedNo;
    public RadioButton speechLimitedYes;
    public RadioButton speechLimitedNo;
    public RadioButton visionLimitedYes;
    public RadioButton visionLimitedNo;
    private Stage getMyStageStart() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Spanish/ParentReported/SpanishLimitFunction.fxml"));
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
    public void onJAOneHadItYes(ActionEvent event) {
        if(JAOneHadItYes.isSelected()){
            JAOneHadItNo.setSelected(false);
            JAtreatmentYes.setSelected(false);
            JAtreatmentNo.setSelected(false);
            JAlimitedNo.setSelected(false);
            JAlimitedYes.setSelected(false);
            //disable
            JAOneHadItNo.setSelected(false);
            JAOneHadItNo.setDisable(false);
            JAtreatmentYes.setDisable(false);
            JAtreatmentYes.setSelected(false);
            JAtreatmentNo.setDisable(false);
            JAtreatmentNo.setSelected(false);
            JAlimitedYes.setDisable(false);
            JAlimitedYes.setSelected(false);
            JAlimitedNo.setDisable(false);
            JAlimitedNo.setSelected(false);
        }
    }

    public void onJAOneHadItNo(ActionEvent event) {
        if(JAOneHadItNo.isSelected()){
            JAOneHadItYes.setSelected(false);
            JAtreatmentYes.setSelected(false);
            JAtreatmentNo.setSelected(false);
            JAlimitedYes.setSelected(false);
            JAlimitedNo.setSelected(false);


            JAtreatmentYes.setDisable(JAOneHadItNo.isSelected());
            JAtreatmentNo.setDisable(JAOneHadItNo.isSelected());
            JAlimitedYes.setDisable(JAOneHadItNo.isSelected());
            JAlimitedNo.setDisable(JAOneHadItNo.isSelected());
        }
        else {
            JAtreatmentNo.setDisable(false);
            JAtreatmentYes.setDisable(false);
            JAlimitedYes.setDisable(false);
            JAlimitedNo.setDisable(false);
        }
    }

    public void onJAtreatmentYes(ActionEvent event) {
        if(JAtreatmentYes.isSelected()){
            JAOneHadItYes.setSelected(false);
            JAOneHadItNo.setSelected(false);
            JAtreatmentNo.setSelected(false);
            JAlimitedYes.setSelected(false);
            JAlimitedNo.setSelected(false);
        }
    }

    public void onJAtreatmentNo(ActionEvent event) {
        if(JAManyTreatmentNo.isSelected()){
            JAOneHadItYes.setSelected(false);
            JAOneHadItNo.setSelected(false);
            JAtreatmentYes.setSelected(false);
            JAlimitedYes.setSelected(false);
            JAlimitedNo.setSelected(false);
        }
    }

    public void onJAlimitedYes(ActionEvent event) {
        if(JAlimitedYes.isSelected()){
            JAlimitedNo.setSelected(false);
            JAtreatmentNo.setSelected(false);
            JAtreatmentYes.setSelected(false);
            JAOneHadItNo.setSelected(false);
            JAOneHadItYes.setSelected(false);
        }
    }

    public void onJAlimitedNo(ActionEvent event) {
        if(JAlimitedNo.isSelected()){
            JAOneHadItYes.setSelected(false);
            JAOneHadItNo.setSelected(false);
            JAtreatmentYes.setSelected(false);
            JAtreatmentNo.setSelected(false);
            JAlimitedYes.setSelected(false);
        }
    }

    public void onJAManyEverYes(ActionEvent event) {
        if(JAManyEverYes.isSelected()){
            JAManyEverNo.setSelected(false);
            JAManyTreatmentYes.setSelected(false);
            JAManyTreatmentNo.setSelected(false);
            JAManyLimitedYes.setSelected(false);
            JAManyLimitedNo.setSelected(false);
            //disable
            JAManyTreatmentYes.setDisable(false);
            JAManyTreatmentNo.setDisable(false);
            JAManyLimitedYes.setDisable(false);
            JAManyLimitedNo.setDisable(false);
        }
    }

    public void onJAManyEverNo(ActionEvent event) {
        if (JAManyEverNo.isSelected()) {
            JAManyEverYes.setSelected(false);
            JAManyTreatmentYes.setSelected(false);
            JAManyTreatmentNo.setSelected(false);
            JAManyLimitedYes.setSelected(false);
            JAManyLimitedNo.setSelected(false);
            JAManyTreatmentYes.setDisable(JAManyEverNo.isSelected());
            JAManyTreatmentNo.setDisable(JAManyEverNo.isSelected());
            JAManyLimitedYes.setDisable(JAManyEverNo.isSelected());
            JAManyLimitedNo.setDisable(JAManyEverNo.isSelected());
            JAManyEverYes.setSelected(false);
        } else {
            JAManyTreatmentYes.setDisable(false);
            JAManyTreatmentNo.setDisable(false);
            JAManyLimitedYes.setDisable(false);
            JAManyLimitedNo.setDisable(false);
        }
    }

//        if(JAManyEverNo.isSelected()){
//            JAManyEverYes.setSelected(false);
//            JAManyTreatmentYes.setDisable(true);
//            JAManyTreatmentNo.setDisable(true);
//            JAManyLimitedYes.setDisable(true);
//            JAManyLimitedNo.setDisable(true);
//        }
//        else if (!JAManyEverNo.isSelected()){
//            JAManyTreatmentYes.setDisable(false);
//            JAManyTreatmentNo.setDisable(false);
//            JAManyLimitedYes.setDisable(false);
//            JAManyLimitedNo.setDisable(false);
//        }


    public void onJAManyTreatmentYes(ActionEvent event) {
        if(JAManyTreatmentYes.isSelected()){
            JAManyEverYes.setSelected(false);
            JAManyEverNo.setSelected(false);
            JAManyTreatmentNo.setSelected(false);
            JAManyLimitedYes.setSelected(false);
            JAManyLimitedNo.setSelected(false);
        }
    }

    public void onJAManyTreatmentNo(ActionEvent event) {
        if(JAManyTreatmentNo.isSelected()){
            JAManyEverYes.setSelected(false);
            JAManyTreatmentYes.setSelected(false);
            JAManyEverNo.setSelected(false);
            JAManyLimitedYes.setSelected(false);
            JAManyLimitedNo.setSelected(false);
        }
    }

    public void onJAManyLimitedYes(ActionEvent event) {
        if(JAManyLimitedYes.isSelected()){
            JAManyLimitedNo.setSelected(false);
            JAManyEverYes.setSelected(false);
            JAManyTreatmentYes.setSelected(false);
            JAManyTreatmentNo.setSelected(false);
            JAManyEverNo.setSelected(false);
        }
    }

    public void onJAManyLimitedNo(ActionEvent event) {
        if(JAManyLimitedNo.isSelected()){
            JAManyLimitedYes.setSelected(false);
            JAManyTreatmentNo.setSelected(false);
            JAManyTreatmentYes.setSelected(false);
            JAManyEverNo.setSelected(false);
            JAManyEverYes.setSelected(false);
        }
    }

    public void onanorexiaEverYes(ActionEvent event) {
        if(anorexiaEverYes.isSelected()){
            anorexiaEverNo.setSelected(false);
            anorexiaTreatmentYes.setSelected(false);
            anorexiaTreatmentNo.setSelected(false);
            anorexiaLimitedYes.setSelected(false);
            anorexiaLimitedNo.setSelected(false);
            //disable
            anorexiaTreatmentYes.setDisable(false);
            anorexiaTreatmentNo.setDisable(false);
            anorexiaLimitedYes.setDisable(false);
            anorexiaLimitedNo.setDisable(false);
        }
    }

    public void onanorexiaEverNo(ActionEvent event) {
        if(anorexiaEverNo.isSelected()){
            anorexiaEverYes.setSelected(false);
            anorexiaTreatmentYes.setSelected(false);
            anorexiaTreatmentNo.setSelected(false);
            anorexiaLimitedYes.setSelected(false);
            anorexiaLimitedNo.setSelected(false);
            anorexiaTreatmentYes.setDisable(anorexiaEverNo.isSelected());
            anorexiaTreatmentNo.setDisable(anorexiaEverNo.isSelected());
            anorexiaLimitedYes.setDisable(anorexiaEverNo.isSelected());
            anorexiaLimitedNo.setDisable(anorexiaEverNo.isSelected());
        }
        else {
            anorexiaTreatmentYes.setDisable(false);
            anorexiaTreatmentNo.setDisable(false);
            anorexiaLimitedYes.setDisable(false);
            anorexiaLimitedNo.setDisable(false);
        }



    }

    public void onanorexiaTreatmentYes(ActionEvent event) {
        if(anorexiaTreatmentYes.isSelected()){
            anorexiaEverNo.setSelected(false);
            anorexiaEverYes.setSelected(false);
            anorexiaTreatmentNo.setSelected(false);
            anorexiaLimitedYes.setSelected(false);
            anorexiaLimitedNo.setSelected(false);
        }
    }

    public void onanorexiaTreatmentNo(ActionEvent event) {
    }

    public void onanorexiaLimitedYes(ActionEvent event) {
    }

    public void onanorexiaLimitedNo(ActionEvent event) {
    }

    public void onasthmaEverYes(ActionEvent event) {
        if(asthmaEverYes.isSelected()){
            asthmaEverNo.setSelected(false);
            asthmaEverNo.setSelected(false);
            asthmaTreatmentNo.setSelected(false);
            asthmaLimitedYes.setSelected(false);
            asthmaLimitedNo.setSelected(false);
            //disable
            asthmaTreatmentYes.setDisable(false);
            asthmaTreatmentNo.setDisable(false);
            asthmaLimitedYes.setDisable(false);
            asthmaLimitedNo.setDisable(false);
        }
    }

    public void onasthmaEverNo(ActionEvent event) {
        if(asthmaEverNo.isSelected()){
            asthmaEverYes.setSelected(false);
            asthmaTreatmentYes.setSelected(false);
            asthmaTreatmentNo.setSelected(false);
            asthmaLimitedYes.setSelected(false);
            asthmaLimitedNo.setSelected(false);
            asthmaTreatmentYes.setDisable(asthmaEverNo.isSelected());
            asthmaTreatmentNo.setDisable(asthmaEverNo.isSelected());
            asthmaLimitedYes.setDisable(asthmaEverNo.isSelected());
            asthmaLimitedNo.setDisable(asthmaEverNo.isSelected());
        }
        else {
            asthmaTreatmentYes.setDisable(false);
            asthmaTreatmentNo.setDisable(false);
            asthmaLimitedYes.setDisable(false);
            asthmaLimitedNo.setDisable(false);
        }
    }

    public void onasthmaTreatmentYes(ActionEvent event) {
        if(asthmaTreatmentYes.isSelected()){
            asthmaEverNo.setSelected(false);
            asthmaEverYes.setSelected(false);
            asthmaTreatmentNo.setSelected(false);
            asthmaLimitedYes.setSelected(false);
            asthmaLimitedNo.setSelected(false);
        }
    }

    public void onasthmaTreatmentNo(ActionEvent event) {
        if(asthmaTreatmentNo.isSelected()){
            asthmaTreatmentYes.setSelected(false);
            asthmaEverNo.setSelected(false);
            asthmaEverYes.setSelected(false);
            asthmaLimitedYes.setSelected(false);
            asthmaLimitedNo.setSelected(false);
        }
    }

    public void onasthmaLimitedYes(ActionEvent event) {
        if(asthmaLimitedYes.isSelected()){
            asthmaTreatmentNo.setSelected(false);
            asthmaTreatmentYes.setSelected(false);
            asthmaEverNo.setSelected(false);
            asthmaEverYes.setSelected(false);
            asthmaLimitedNo.setSelected(false);
        }
    }

    public void onasthmaLimitedNo(ActionEvent event) {
        if(asthmaLimitedNo.isSelected()){
            asthmaLimitedYes.setSelected(false);
            asthmaTreatmentNo.setSelected(false);
            asthmaTreatmentYes.setSelected(false);
            asthmaEverNo.setSelected(false);
            asthmaEverYes.setSelected(false);
        }
    }

    public void onattentionEverYes(ActionEvent event) {
        if(attentionEverYes.isSelected()){
            attentionEverNo.setSelected(false);
            attentionTreatmentYes.setSelected(false);
            attentionTreatmentNo.setSelected(false);
            attentionLimitedYes.setSelected(false);
            attentionLimitedNo.setSelected(false);
            // disable
            attentionTreatmentYes.setDisable(false);
            attentionTreatmentNo.setDisable(false);
            attentionLimitedYes.setDisable(false);
            attentionLimitedNo.setDisable(false);
        }
    }

    public void onattentionEverNo(ActionEvent event) {
        if(attentionEverNo.isSelected()){
            attentionEverYes.setSelected(false);
            attentionTreatmentYes.setSelected(false);
            attentionTreatmentNo.setSelected(false);
            attentionLimitedYes.setSelected(false);
            attentionLimitedNo.setSelected(false);
            attentionTreatmentYes.setDisable(attentionEverNo.isSelected());
            attentionTreatmentNo.setDisable(attentionEverNo.isSelected());
            attentionLimitedYes.setDisable(attentionEverNo.isSelected());
            attentionLimitedNo.setDisable(attentionEverNo.isSelected());
        }
        else {
            attentionTreatmentYes.setDisable(false);
            attentionTreatmentNo.setDisable(false);
            attentionLimitedYes.setDisable(false);
            attentionLimitedNo.setDisable(false);
        }
    }

    public void onattentionTreatmentYes(ActionEvent event) {
        if(attentionTreatmentYes.isSelected()){
            attentionEverNo.setSelected(false);
            attentionEverYes.setSelected(false);
            attentionTreatmentNo.setSelected(false);
            attentionLimitedYes.setSelected(false);
            attentionLimitedNo.setSelected(false);
        }
    }

    public void onattentionTreatmentNo(ActionEvent event) {
        if(attentionTreatmentNo.isSelected()){
            attentionTreatmentYes.setSelected(false);
            attentionEverNo.setSelected(false);
            attentionEverYes.setSelected(false);
            attentionLimitedYes.setSelected(false);
            attentionLimitedNo.setSelected(false);
        }
    }

    public void onattentionLimitedYes(ActionEvent event) {
        if(attentionLimitedYes.isSelected()){
            attentionLimitedNo.setSelected(false);
            attentionTreatmentNo.setSelected(false);
            attentionTreatmentYes.setSelected(false);
            attentionEverNo.setSelected(false);
            attentionEverYes.setSelected(false);
        }
    }

    public void onattentionLimitedNo(ActionEvent event) {
        if (attentionLimitedNo.isSelected()){
            attentionLimitedYes.setSelected(false);
            attentionTreatmentNo.setSelected(false);
            attentionTreatmentYes.setSelected(false);
            attentionEverNo.setSelected(false);
            attentionEverYes.setSelected(false);
        }
    }

    public void onallergiesEverYes(ActionEvent event) {
        if(allergiesEverYes.isSelected()){
            allergiesEverNo.setSelected(false);
            allergytreatmentYes.setSelected(false);
            allergytreatmentNo.setSelected(false);
            allergyLimitedYes.setSelected(false);
            allergyLimitedNo.setSelected(false);
            //disable
            allergytreatmentYes.setDisable(false);
            allergytreatmentNo.setDisable(false);
            allergyLimitedYes.setDisable(false);
            allergyLimitedNo.setDisable(false);
        }
    }

    public void onallergiesEverNo(ActionEvent event) {
        if(allergiesEverNo.isSelected()){
            allergiesEverYes.setSelected(false);
            allergytreatmentYes.setSelected(false);
            allergytreatmentNo.setSelected(false);
            allergyLimitedYes.setSelected(false);
            allergyLimitedNo.setSelected(false);
            allergytreatmentYes.setDisable(allergiesEverNo.isSelected());
            allergytreatmentNo.setDisable(allergiesEverNo.isSelected());
            allergyLimitedYes.setDisable(allergiesEverNo.isSelected());
            allergyLimitedNo.setDisable(allergiesEverNo.isSelected());
        }
        else {
            allergytreatmentYes.setDisable(false);
            allergytreatmentNo.setDisable(false);
            allergyLimitedYes.setDisable(false);
            allergyLimitedNo.setDisable(false);
        }
    }

    public void onallergytreatmentYes(ActionEvent event) {
        if(allergytreatmentYes.isSelected()){
            allergiesEverNo.setSelected(false);
            allergiesEverYes.setSelected(false);
            allergytreatmentNo.setSelected(false);
            allergyLimitedYes.setSelected(false);
            allergyLimitedNo.setSelected(false);
        }
    }

    public void onallergytreatmentNo(ActionEvent event) {
        if(allergytreatmentNo.isSelected()){
            allergytreatmentYes.setSelected(false);
            allergiesEverNo.setSelected(false);
            allergiesEverYes.setSelected(false);
            allergyLimitedYes.setSelected(false);
            allergyLimitedNo.setSelected(false);
        }
    }

    public void onallergyLimitedYes(ActionEvent event) {
        if(allergyLimitedYes.isSelected()){
            allergyLimitedNo.setSelected(false);
            allergytreatmentNo.setSelected(false);
            allergytreatmentYes.setSelected(false);
            allergiesEverNo.setSelected(false);
            allergiesEverYes.setSelected(false);
        }
    }

    public void onallergyLimitedNo(ActionEvent event) {
        if(allergyLimitedNo.isSelected()){
            allergyLimitedYes.setSelected(false);
            allergytreatmentNo.setSelected(false);
            allergytreatmentYes.setSelected(false);
            allergiesEverNo.setSelected(false);
            allergiesEverYes.setSelected(false);
        }
    }

    public void ondelayEverYes(ActionEvent event) {
        if(delayEverYes.isSelected()){
            delayEverNo.setSelected(false);
            delayTreatmentYes.setSelected(false);
            delayTreatmentNo.setSelected(false);
            delayLimitedYes.setSelected(false);
            delayLimitedNo.setSelected(false);
            //disable
            delayTreatmentYes.setDisable(false);
            delayTreatmentNo.setDisable(false);
            delayLimitedYes.setDisable(false);
            delayLimitedNo.setDisable(false);
        }
    }

    public void ondelayEverNo(ActionEvent event) {
        if(delayEverNo.isSelected()){
            delayEverYes.setSelected(false);
            delayTreatmentYes.setSelected(false);
            delayTreatmentNo.setSelected(false);
            delayLimitedYes.setSelected(false);
            delayLimitedNo.setSelected(false);
            delayTreatmentYes.setDisable(delayEverNo.isSelected());
            delayTreatmentNo.setDisable(delayEverNo.isSelected());
            delayLimitedYes.setDisable(delayEverNo.isSelected());
            delayLimitedNo.setDisable(delayEverNo.isSelected());
        }
        else {
            delayTreatmentYes.setDisable(false);
            delayTreatmentNo.setDisable(false);
            delayLimitedYes.setDisable(false);
            delayLimitedNo.setDisable(false);
        }
    }

    public void ondelayTreatmentYes(ActionEvent event) {
        if(delayTreatmentYes.isSelected()){
            delayTreatmentNo.setSelected(false);
            delayLimitedYes.setSelected(false);
            delayLimitedNo.setSelected(false);
            delayEverNo.setSelected(false);
            delayEverYes.setSelected(false);
        }
    }

    public void ondelayTreatmentNo(ActionEvent event) {
        if(delayTreatmentNo.isSelected()){
            delayTreatmentYes.setSelected(false);
            delayEverNo.setSelected(false);
            delayEverYes.setSelected(false);
            delayLimitedYes.setSelected(false);
            delayLimitedNo.setSelected(false);
        }
    }

    public void ondelayLimitedYes(ActionEvent event) {
        if(delayLimitedYes.isSelected()){
            delayLimitedNo.setSelected(false);
            delayTreatmentNo.setSelected(false);
            delayTreatmentYes.setSelected(false);
            delayEverNo.setSelected(false);
            delayEverYes.setSelected(false);
        }
    }

    public void ondelayLimitedNo(ActionEvent event) {
        if(delayLimitedNo.isSelected()){
            delayLimitedYes.setSelected(false);
            delayTreatmentNo.setSelected(false);
            delayTreatmentYes.setSelected(false);
            delayEverNo.setSelected(false);
            delayEverYes.setSelected(false);
        }
    }

    public void oncognitiveEverYes(ActionEvent event) {
        if(cognitiveEverYes.isSelected()){
            cognitiveEverNo.setSelected(false);
            cognitiveTreatmentYes.setSelected(false);
            cognitiveTreatmentNo.setSelected(false);
            cognitiveLimitedYes.setSelected(false);
            cognitiveLimitedNo.setSelected(false);
            //disable
            cognitiveTreatmentYes.setDisable(false);
            cognitiveTreatmentNo.setDisable(false);
            cognitiveLimitedYes.setDisable(false);
            cognitiveLimitedNo.setDisable(false);
        }
    }

    public void oncognitiveEverNo(ActionEvent event) {
        if(cognitiveEverNo.isSelected()){
            cognitiveEverYes.setSelected(false);
            cognitiveTreatmentYes.setSelected(false);
            cognitiveTreatmentNo.setSelected(false);
            cognitiveLimitedYes.setSelected(false);
            cognitiveLimitedNo.setSelected(false);
            cognitiveTreatmentYes.setDisable(cognitiveEverNo.isSelected());
            cognitiveTreatmentNo.setDisable(cognitiveEverNo.isSelected());
            cognitiveLimitedYes.setDisable(cognitiveEverNo.isSelected());
            cognitiveLimitedNo.setDisable(cognitiveEverNo.isSelected());
        }
        else {
            cognitiveTreatmentYes.setDisable(false);
            cognitiveTreatmentNo.setDisable(false);
            cognitiveLimitedYes.setDisable(false);
            cognitiveLimitedNo.setDisable(false);
        }
    }

    public void oncognitiveTreatmentYes(ActionEvent event) {
        if(cognitiveTreatmentYes.isSelected()){
            cognitiveTreatmentNo.setSelected(false);
            cognitiveLimitedYes.setSelected(false);
            cognitiveLimitedNo.setSelected(false);
            cognitiveEverNo.setSelected(false);
            cognitiveEverYes.setSelected(false);
        }
    }

    public void oncognitiveTreatmentNo(ActionEvent event) {
        if(cognitiveTreatmentNo.isSelected()){
            cognitiveTreatmentYes.setSelected(false);
            cognitiveEverNo.setSelected(false);
            cognitiveEverYes.setSelected(false);
            cognitiveLimitedYes.setSelected(false);
            cognitiveLimitedNo.setSelected(false);
        }
    }

    public void oncognitiveLimitedYes(ActionEvent event) {
        if(cognitiveLimitedYes.isSelected()){
            cognitiveLimitedNo.setSelected(false);
            cognitiveTreatmentNo.setSelected(false);
            cognitiveTreatmentYes.setSelected(false);
            cognitiveEverNo.setSelected(false);
            cognitiveEverYes.setSelected(false);
        }
    }

    public void oncognitiveLimitedNo(ActionEvent event) {
        if(cognitiveLimitedNo.isSelected()){
            cognitiveLimitedYes.setSelected(false);
            cognitiveTreatmentNo.setSelected(false);
            cognitiveTreatmentYes.setSelected(false);
            cognitiveEverNo.setSelected(false);
            cognitiveEverYes.setSelected(false);
        }
    }

    public void ondiabetesEverYes(ActionEvent event) {
        if(diabetesEverYes.isSelected()){
            diabetesEverNo.setSelected(false);
            diabetesTreatmentYes.setSelected(false);
            diabetesTreatmentNo.setSelected(false);
            diabetesLimitedYes.setSelected(false);
            diabetesLimitedNo.setSelected(false);
            //disable
            diabetesTreatmentYes.setDisable(false);
            diabetesTreatmentNo.setDisable(false);
            diabetesLimitedYes.setDisable(false);
            diabetesLimitedNo.setDisable(false);
        }
    }

    public void ondiabetesEverNo(ActionEvent event) {
        if(diabetesEverNo.isSelected()){
            diabetesEverYes.setSelected(false);
            diabetesTreatmentYes.setSelected(false);
            diabetesTreatmentNo.setSelected(false);
            diabetesLimitedYes.setSelected(false);
            diabetesLimitedNo.setSelected(false);
            diabetesTreatmentYes.setDisable(diabetesEverNo.isSelected());
            diabetesTreatmentNo.setDisable(diabetesEverNo.isSelected());
            diabetesLimitedYes.setDisable(diabetesEverNo.isSelected());
            diabetesLimitedNo.setDisable(diabetesEverNo.isSelected());
        }
        else {
            diabetesTreatmentYes.setDisable(false);
            diabetesTreatmentNo.setDisable(false);
            diabetesLimitedYes.setDisable(false);
            diabetesLimitedNo.setDisable(false);
        }
    }

    public void ondiabetesTreatmentYes(ActionEvent event) {
        if(diabetesTreatmentYes.isSelected()){
            diabetesTreatmentNo.setSelected(false);
            diabetesLimitedYes.setSelected(false);
            diabetesLimitedNo.setSelected(false);
            diabetesEverNo.setSelected(false);
            diabetesEverYes.setSelected(false);
        }
    }

    public void ondiabetesTreatmentNo(ActionEvent event) {
        if(diabetesTreatmentNo.isSelected()){
            diabetesTreatmentYes.setSelected(false);
            diabetesEverNo.setSelected(false);
            diabetesEverYes.setSelected(false);
            diabetesLimitedYes.setSelected(false);
            diabetesLimitedNo.setSelected(false);
        }
    }

    public void ondiabetesLimitedYes(ActionEvent event) {
        if(diabetesLimitedYes.isSelected()){
            diabetesLimitedNo.setSelected(false);
            diabetesTreatmentNo.setSelected(false);
            diabetesTreatmentYes.setSelected(false);
            diabetesEverNo.setSelected(false);
            diabetesEverYes.setSelected(false);
        }
    }

    public void ondiabetesLimitedNo(ActionEvent event) {
        if(diabetesLimitedNo.isSelected()){
            diabetesLimitedYes.setSelected(false);
            diabetesTreatmentNo.setSelected(false);
            diabetesTreatmentYes.setSelected(false);
            diabetesEverNo.setSelected(false);
            diabetesEverYes.setSelected(false);
        }
    }

    public void onseizureEverYes(ActionEvent event) {
        if(seizureEverYes.isSelected()){
            seizureEverNo.setSelected(false);
            seizureTreatmentYes.setSelected(false);
            seizureTreatmentNo.setSelected(false);
            seizureLimitedYes.setSelected(false);
            seizureLimitedNo.setSelected(false);
            //disable
            seizureTreatmentYes.setDisable(false);
            seizureTreatmentNo.setDisable(false);
            seizureLimitedYes.setDisable(false);
            seizureLimitedNo.setDisable(false);
        }
    }

    public void onseizureEverNo(ActionEvent event) {
        if(seizureEverNo.isSelected()){
            seizureEverYes.setSelected(false);
            seizureTreatmentYes.setSelected(false);
            seizureTreatmentNo.setSelected(false);
            seizureLimitedYes.setSelected(false);
            seizureLimitedNo.setSelected(false);
            seizureTreatmentYes.setDisable(seizureEverNo.isSelected());
            seizureTreatmentNo.setDisable(seizureEverNo.isSelected());
            seizureLimitedYes.setDisable(seizureEverNo.isSelected());
            seizureLimitedNo.setDisable(seizureEverNo.isSelected());
        }
        else {
            seizureTreatmentYes.setDisable(false);
            seizureTreatmentNo.setDisable(false);
            seizureLimitedYes.setDisable(false);
            seizureLimitedNo.setDisable(false);
        }
    }

    public void onseizureTreatmentYes(ActionEvent event) {
        if(seizureTreatmentYes.isSelected()){
            seizureEverNo.setSelected(false);
            seizureEverYes.setSelected(false);
            seizureTreatmentNo.setSelected(false);
            seizureLimitedYes.setSelected(false);
            seizureLimitedNo.setSelected(false);
        }
    }

    public void onseizureTreatmentNo(ActionEvent event) {
        if(seizureTreatmentNo.isSelected()){
            seizureTreatmentYes.setSelected(false);
            seizureEverNo.setSelected(false);
            seizureEverYes.setSelected(false);
            seizureLimitedYes.setSelected(false);
            seizureLimitedNo.setSelected(false);
        }
    }

    public void onseizureLimitedYes(ActionEvent event) {
        if(seizureLimitedYes.isSelected()){
            seizureLimitedNo.setSelected(false);
            seizureTreatmentNo.setSelected(false);
            seizureTreatmentYes.setSelected(false);
            seizureEverNo.setSelected(false);
            seizureEverYes.setSelected(false);
        }
    }

    public void onseizureLimitedNo(ActionEvent event) {
        if(seizureLimitedNo.isSelected()){
            seizureLimitedYes.setSelected(false);
            seizureTreatmentNo.setSelected(false);
            seizureTreatmentYes.setSelected(false);
            seizureEverNo.setSelected(false);
            seizureEverYes.setSelected(false);
        }
    }

    public void onhearingEverYes(ActionEvent event) {
        if(hearingEverYes.isSelected()){
            hearingEverNo.setSelected(false);
            hearingTreatmentyes.setSelected(false);
            hearingTreatmentNo.setSelected(false);
            hearingLimitedYes.setSelected(false);
            hearingLimitedNo.setSelected(false);
            //disable
            hearingTreatmentyes.setDisable(false);
            hearingTreatmentNo.setDisable(false);
            hearingLimitedYes.setDisable(false);
            hearingLimitedNo.setDisable(false);
        }
    }

    public void onhearingEverNo(ActionEvent event) {
        if(hearingEverNo.isSelected()){
            hearingEverYes.setSelected(false);
            hearingTreatmentyes.setSelected(false);
            hearingTreatmentNo.setSelected(false);
            hearingLimitedYes.setSelected(false);
            hearingLimitedNo.setSelected(false);
            hearingTreatmentyes.setDisable(hearingEverNo.isSelected());
            hearingTreatmentNo.setDisable(hearingEverNo.isSelected());
            hearingLimitedYes.setDisable(hearingEverNo.isSelected());
            hearingLimitedNo.setDisable(hearingEverNo.isSelected());
        }
        else {
            hearingTreatmentyes.setDisable(false);
            hearingTreatmentNo.setDisable(false);
            hearingLimitedYes.setDisable(false);
            hearingLimitedNo.setDisable(false);
        }
    }

    public void onhearingTreatmentyes(ActionEvent event) {
        if(hearingTreatmentyes.isSelected()){
            hearingEverNo.setSelected(false);
            hearingEverYes.setSelected(false);
            hearingTreatmentNo.setSelected(false);
            hearingLimitedYes.setSelected(false);
            hearingLimitedNo.setSelected(false);
        }
    }

    public void onhearingTreatmentNo(ActionEvent event) {
        if(hearingTreatmentNo.isSelected()){
            hearingTreatmentyes.setSelected(false);
            hearingEverNo.setSelected(false);
            hearingEverYes.setSelected(false);
            hearingLimitedYes.setSelected(false);
            hearingLimitedNo.setSelected(false);
        }
    }

    public void onhearingLimitedYes(ActionEvent event) {
        if(hearingLimitedYes.isSelected()){
            hearingLimitedNo.setSelected(false);
            hearingTreatmentNo.setSelected(false);
            hearingTreatmentyes.setSelected(false);
            hearingEverNo.setSelected(false);
            hearingEverYes.setSelected(false);
        }
    }

    public void onhearingLimitedNo(ActionEvent event) {
        if(hearingLimitedNo.isSelected()){
            hearingLimitedYes.setSelected(false);
            hearingTreatmentNo.setSelected(false);
            hearingTreatmentyes.setSelected(false);
            hearingEverNo.setSelected(false);
            hearingEverYes.setSelected(false);
        }
    }

    public void onheartEverYes(ActionEvent event) {
        if(heartEverYes.isSelected()){
            heartEverNo.setSelected(false);
            heartTreatmentYes.setDisable(heartEverYes.isSelected());
            heartTreatmentNo.setSelected(false);
            heartLimitedYes.setSelected(false);
            heartLimitedNo.setSelected(false);
            //disable
            heartTreatmentYes.setDisable(false);
            heartTreatmentNo.setDisable(false);
            heartLimitedYes.setDisable(false);
            heartLimitedNo.setDisable(false);
        }
    }

    public void onheartEverNo(ActionEvent event) {
        if(heartEverNo.isSelected()){
            heartEverYes.setSelected(false);
            heartTreatmentYes.setSelected(false);
            heartTreatmentNo.setSelected(false);
            heartLimitedYes.setSelected(false);
            heartLimitedNo.setSelected(false);
            heartTreatmentYes.setDisable(heartEverNo.isSelected());
            heartTreatmentNo.setDisable(heartEverNo.isSelected());
            heartLimitedYes.setDisable(heartEverNo.isSelected());
            heartLimitedNo.setDisable(heartEverNo.isSelected());
        }
        else {
            heartTreatmentYes.setDisable(false);
            heartTreatmentNo.setDisable(false);
            heartLimitedYes.setDisable(false);
            heartLimitedNo.setDisable(false);
        }
    }

    public void onlearningEverYes(ActionEvent event) {
        if(learningEverYes.isSelected()){
            learningEverNo.setSelected(false);
            learningTreatmentyes.setSelected(false);
            learningTreatmentNo.setSelected(false);
            learningLimitedYes.setSelected(false);
            earningLimitedNo.setSelected(false);
            //disable
            learningTreatmentNo.setDisable(false);
            learningTreatmentyes.setDisable(false);
            learningLimitedYes.setDisable(false);
            earningLimitedNo.setDisable(false);
        }
    }

    public void onlearningEverNo(ActionEvent event) {
        if(learningEverNo.isSelected()){
            learningEverYes.setSelected(false);
            learningTreatmentyes.setSelected(false);
            learningTreatmentNo.setSelected(false);
            learningLimitedYes.setSelected(false);
            earningLimitedNo.setSelected(false);
            learningTreatmentyes.setDisable(learningEverNo.isSelected());
            learningTreatmentNo.setDisable(learningEverNo.isSelected());
            learningLimitedYes.setDisable(learningEverNo.isSelected());
            earningLimitedNo.setDisable(learningEverNo.isSelected());
        }
        else {
            learningTreatmentyes.setDisable(false);
            learningTreatmentNo.setDisable(false);
            learningLimitedYes.setDisable(false);
            earningLimitedNo.setDisable(false);
        }
    }

    public void onsleepEverYes(ActionEvent event) {
        if(sleepEverYes.isSelected()){
            sleepEverNo.setSelected(false);
            sleepTreatmentYes.setSelected(false);
            sleepTreatmentNo.setSelected(false);
            sleepLimitedYes.setSelected(false);
            sleepLimitedNo.setSelected(false);
            //disable
            sleepTreatmentYes.setDisable(false);
            sleepTreatmentNo.setDisable(false);
            sleepLimitedYes.setDisable(false);
            sleepLimitedNo.setDisable(false);
        }
    }

    public void onsleepEverNo(ActionEvent event) {
        if(sleepEverNo.isSelected()){
            sleepEverYes.setSelected(false);
            sleepTreatmentYes.setSelected(false);
            sleepTreatmentNo.setSelected(false);
            sleepLimitedYes.setSelected(false);
            sleepLimitedNo.setSelected(false);
            sleepTreatmentYes.setDisable(sleepEverNo.isSelected());
            sleepTreatmentNo.setDisable(sleepEverNo.isSelected());
            sleepLimitedYes.setDisable(sleepEverNo.isSelected());
            sleepLimitedNo.setDisable(sleepEverNo.isSelected());
        }
        else {
            sleepTreatmentYes.setDisable(false);
            sleepTreatmentNo.setDisable(false);
            sleepLimitedYes.setDisable(false);
            sleepLimitedNo.setDisable(false);
        }
    }

    public void onspeechEverYes(ActionEvent event) {
        if(speechEverYes.isSelected()){
            speechEverNo.setSelected(false);
            speechTreatmentYes.setSelected(false);
            speechTreatmentNo.setSelected(false);
            speechLimitedYes.setSelected(false);
            speechLimitedNo.setSelected(false);
            //disable
            speechTreatmentYes.setDisable(false);
            speechTreatmentNo.setDisable(false);
            speechLimitedYes.setDisable(false);
            speechLimitedNo.setDisable(false);
        }
    }

    public void onspeechEverNo(ActionEvent event) {
        if(speechEverNo.isSelected()){
            speechEverYes.setSelected(false);
            speechTreatmentYes.setSelected(false);
            speechTreatmentNo.setSelected(false);
            speechLimitedYes.setSelected(false);
            speechLimitedNo.setSelected(false);
            speechTreatmentYes.setDisable(speechEverNo.isSelected());
            speechTreatmentNo.setDisable(speechEverNo.isSelected());
            speechLimitedYes.setDisable(speechEverNo.isSelected());
            speechLimitedNo.setDisable(speechEverNo.isSelected());
        }
        else {
            speechTreatmentYes.setDisable(false);
            speechTreatmentNo.setDisable(false);
            speechLimitedYes.setDisable(false);
            speechLimitedNo.setDisable(false);
        }
    }

    public void onvisionEverYes(ActionEvent event) {
        if(visionEverYes.isSelected()){
            visionEverNo.setSelected(false);
            visionTreatmentYes.setSelected(false);
            visionTreatmentNo.setSelected(false);
            visionLimitedYes.setSelected(false);
            visionLimitedNo.setSelected(false);
            //disable
            visionTreatmentYes.setDisable(false);
            visionTreatmentNo.setDisable(false);
            visionLimitedNo.setDisable(false);
            visionLimitedYes.setDisable(false);
        }
    }

    public void onvisionEverNo(ActionEvent event) {
        if(visionEverNo.isSelected()){
            visionEverYes.setSelected(false);
            visionTreatmentYes.setSelected(false);
            visionTreatmentNo.setSelected(false);
            visionLimitedYes.setSelected(false);
            visionLimitedNo.setSelected(false);
            visionTreatmentYes.setDisable(visionEverNo.isSelected());
            visionTreatmentNo.setDisable(visionEverNo.isSelected());
            visionLimitedYes.setDisable(visionEverNo.isSelected());
            visionLimitedNo.setDisable(visionEverNo.isSelected());
        }
        else {
            visionTreatmentYes.setDisable(false);
            visionTreatmentNo.setDisable(false);
            visionLimitedYes.setDisable(false);
            visionLimitedNo.setDisable(false);
        }
    }

    public void onheartTreatmentYes(ActionEvent event) {
        if(hearingTreatmentyes.isSelected()){
            heartEverNo.setSelected(false);
            heartEverYes.setSelected(false);
            heartTreatmentNo.setSelected(false);
            heartLimitedYes.setSelected(false);
            heartLimitedNo.setSelected(false);
        }
    }

    public void onlearningTreatmentyes(ActionEvent event) {
        if(learningTreatmentyes.isSelected()){
            learningEverNo.setSelected(false);
            learningEverYes.setSelected(false);
            learningTreatmentNo.setSelected(false);
            learningLimitedYes.setSelected(false);
            earningLimitedNo.setSelected(false);
        }
    }

    public void onlearningTreatmentNo(ActionEvent event) {
        if(learningTreatmentNo.isSelected()){
            learningTreatmentyes.setSelected(false);
            learningEverNo.setSelected(false);
            learningEverYes.setSelected(false);
            learningLimitedYes.setSelected(false);
            earningLimitedNo.setSelected(false);
        }
    }

    public void onsleepTreatmentYes(ActionEvent event) {
        if(sleepTreatmentYes.isSelected()){
            sleepTreatmentNo.setSelected(false);
            sleepLimitedYes.setSelected(false);
            sleepLimitedNo.setSelected(false);
            sleepEverNo.setSelected(false);
            sleepEverYes.setSelected(false);
        }
    }

    public void onsleepTreatmentNo(ActionEvent event) {
        if(sleepTreatmentNo.isSelected()){
            sleepTreatmentYes.setSelected(false);
            sleepEverNo.setSelected(false);
            sleepEverYes.setSelected(false);
            sleepLimitedYes.setSelected(false);
            sleepLimitedNo.setSelected(false);
        }
    }

    public void onheartTreatmentNo(ActionEvent event) {
        if(heartTreatmentNo.isSelected()){
            heartTreatmentYes.setSelected(false);
            heartEverNo.setSelected(false);
            heartEverYes.setSelected(false);
            heartLimitedYes.setSelected(false);
            heartLimitedNo.setSelected(false);
        }
    }

    public void onspeechTreatmentYes(ActionEvent event) {
        if(speechTreatmentYes.isSelected()){
            speechTreatmentNo.setSelected(false);
            speechEverNo.setSelected(false);
            speechEverYes.setSelected(false);
            speechEverYes.setSelected(false);
            speechLimitedNo.setSelected(false);
            speechLimitedYes.setSelected(false);
        }
    }

    public void onspeechTreatmentNo(ActionEvent event) {
        if(speechTreatmentNo.isSelected()){
            speechTreatmentYes.setSelected(false);
            speechEverNo.setSelected(false);
            speechEverYes.setSelected(false);
            speechLimitedYes.setSelected(false);
            speechLimitedNo.setSelected(false);
        }
    }

    public void onvisionTreatmentYes(ActionEvent event) {
        if(visionTreatmentYes.isSelected()){
            visionEverNo.setSelected(false);
            visionEverYes.setSelected(false);
            visionTreatmentNo.setSelected(false);
            visionLimitedYes.setSelected(false);
            visionLimitedNo.setSelected(false);
        }
    }

    public void onvisionTreatmentNo(ActionEvent event) {
        if(visionTreatmentNo.isSelected()){
            visionLimitedYes.setSelected(false);
            visionLimitedNo.setSelected(false);
            visionTreatmentYes.setSelected(false);
            visionEverNo.setSelected(false);
            visionEverYes.setSelected(false);
        }
    }

    public void onheartLimitedYes(ActionEvent event) {
        if(hearingLimitedYes.isSelected()){
            heartLimitedNo.setSelected(false);
            heartTreatmentNo.setSelected(false);
            heartTreatmentYes.setSelected(false);
            heartEverNo.setSelected(false);
            heartEverYes.setSelected(false);
        }
    }

    public void onheartLimitedNo(ActionEvent event) {
        if(heartLimitedNo.isSelected()){
            heartLimitedYes.setSelected(false);
            heartTreatmentNo.setSelected(false);
            heartTreatmentYes.setSelected(false);
            heartEverNo.setSelected(false);
            heartEverYes.setSelected(false);
        }
    }

    public void onlearningLimitedYes(ActionEvent event) {
        if(learningLimitedYes.isSelected()){
            earningLimitedNo.setSelected(false);
            learningTreatmentNo.setSelected(false);
            learningTreatmentyes.setSelected(false);
            learningEverNo.setSelected(false);
            learningEverYes.setSelected(false);
        }
    }

    public void onlearningLimitedNo(ActionEvent event) {
        if(earningLimitedNo.isSelected()){
            learningLimitedYes.setSelected(false);
            learningTreatmentNo.setSelected(false);
            learningTreatmentyes.setSelected(false);
            learningEverNo.setSelected(false);
            learningEverYes.setSelected(false);
        }
    }

    public void onsleepLimitedYes(ActionEvent event) {
        if(sleepLimitedYes.isSelected()){
            sleepLimitedNo.setSelected(false);
            sleepTreatmentNo.setSelected(false);
            sleepTreatmentYes.setSelected(false);
            sleepEverNo.setSelected(false);
            sleepEverYes.setSelected(false);
        }
    }

    public void onsleepLimitedNo(ActionEvent event) {
        if(sleepLimitedNo.isSelected()){
            sleepLimitedYes.setSelected(false);
            sleepTreatmentNo.setSelected(false);
            sleepTreatmentYes.setSelected(false);
            sleepEverNo.setSelected(false);
            sleepEverYes.setSelected(false);
        }
    }

    public void onspeechLimitedYes(ActionEvent event) {
        if(speechLimitedYes.isSelected()){
            speechLimitedNo.setSelected(false);
            speechTreatmentNo.setSelected(false);
            speechTreatmentYes.setSelected(false);
            speechEverNo.setSelected(false);
            speechEverYes.setSelected(false);
        }
    }

    public void onspeechLimitedNo(ActionEvent event) {
        if(speechLimitedNo.isSelected()){
            speechLimitedYes.setSelected(false);
            speechTreatmentNo.setSelected(false);
            speechTreatmentYes.setSelected(false);
            speechEverNo.setSelected(false);
            speechEverYes.setSelected(false);
        }
    }

    public void onvisionLimitedYes(ActionEvent event) {
        if(visionLimitedYes.isSelected()){
            visionLimitedNo.setSelected(false);
            visionTreatmentNo.setSelected(false);
            visionTreatmentYes.setSelected(false);
            visionEverNo.setSelected(false);
            visionEverYes.setSelected(false);
        }
    }

    public void onvisionLimitedNo(ActionEvent event) {
        if(visionLimitedNo.isSelected()){
            visionLimitedYes.setSelected(false);
            visionTreatmentNo.setSelected(false);
            visionTreatmentYes.setSelected(false);
            visionEverNo.setSelected(false);
            visionEverYes.setSelected(false);
        }
    }
}

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

public class HealthAssessmentConditions {
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


    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/LimitFunction.fxml"));
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

    public void onJAOneHadItYes(ActionEvent event) {
    }

    public void onJAOneHadItNo(ActionEvent event) {
    }

    public void onJAtreatmentYes(ActionEvent event) {
    }

    public void onJAtreatmentNo(ActionEvent event) {
    }

    public void onJAlimitedYes(ActionEvent event) {
    }

    public void onJAlimitedNo(ActionEvent event) {
    }

    public void onJAManyEverYes(ActionEvent event) {
    }

    public void onJAManyEverNo(ActionEvent event) {
    }

    public void onJAManyTreatmentYes(ActionEvent event) {
    }

    public void onJAManyTreatmentNo(ActionEvent event) {
    }

    public void onJAManyLimitedYes(ActionEvent event) {
    }

    public void onJAManyLimitedNo(ActionEvent event) {
    }

    public void onanorexiaEverYes(ActionEvent event) {
    }

    public void onanorexiaEverNo(ActionEvent event) {
    }

    public void onanorexiaTreatmentYes(ActionEvent event) {
    }

    public void onanorexiaTreatmentNo(ActionEvent event) {
    }

    public void onanorexiaLimitedYes(ActionEvent event) {
    }

    public void onanorexiaLimitedNo(ActionEvent event) {
    }

    public void onasthmaEverYes(ActionEvent event) {
    }

    public void onasthmaEverNo(ActionEvent event) {
    }

    public void onasthmaTreatmentYes(ActionEvent event) {
    }

    public void onasthmaTreatmentNo(ActionEvent event) {
    }

    public void onasthmaLimitedYes(ActionEvent event) {
    }

    public void onasthmaLimitedNo(ActionEvent event) {
    }

    public void onattentionEverYes(ActionEvent event) {
    }

    public void onattentionEverNo(ActionEvent event) {
    }

    public void onattentionTreatmentYes(ActionEvent event) {
    }

    public void onattentionTreatmentNo(ActionEvent event) {
    }

    public void onattentionLimitedYes(ActionEvent event) {
    }

    public void onattentionLimitedNo(ActionEvent event) {
    }

    public void onallergiesEverYes(ActionEvent event) {
    }

    public void onallergiesEverNo(ActionEvent event) {
    }

    public void onallergytreatmentYes(ActionEvent event) {
    }

    public void onallergytreatmentNo(ActionEvent event) {
    }

    public void onallergyLimitedYes(ActionEvent event) {
    }

    public void onallergyLimitedNo(ActionEvent event) {
    }

    public void ondelayEverYes(ActionEvent event) {
    }

    public void ondelayEverNo(ActionEvent event) {
    }

    public void ondelayTreatmentYes(ActionEvent event) {
    }

    public void ondelayTreatmentNo(ActionEvent event) {
    }

    public void ondelayLimitedYes(ActionEvent event) {
    }

    public void ondelayLimitedNo(ActionEvent event) {
    }

    public void oncognitiveEverYes(ActionEvent event) {
    }

    public void oncognitiveEverNo(ActionEvent event) {
    }

    public void oncognitiveTreatmentYes(ActionEvent event) {
    }

    public void oncognitiveTreatmentNo(ActionEvent event) {
    }

    public void oncognitiveLimitedYes(ActionEvent event) {
    }

    public void oncognitiveLimitedNo(ActionEvent event) {
    }

    public void ondiabetesEverYes(ActionEvent event) {
    }

    public void ondiabetesEverNo(ActionEvent event) {
    }

    public void ondiabetesTreatmentYes(ActionEvent event) {
    }

    public void ondiabetesTreatmentNo(ActionEvent event) {
    }

    public void ondiabetesLimitedYes(ActionEvent event) {
    }

    public void ondiabetesLimitedNo(ActionEvent event) {
    }

    public void onseizureEverYes(ActionEvent event) {
    }

    public void onseizureEverNo(ActionEvent event) {
    }

    public void onseizureTreatmentYes(ActionEvent event) {
    }

    public void onseizureTreatmentNo(ActionEvent event) {
    }

    public void onseizureLimitedYes(ActionEvent event) {
    }

    public void onseizureLimitedNo(ActionEvent event) {
    }

    public void onhearingEverYes(ActionEvent event) {
    }

    public void onhearingEverNo(ActionEvent event) {
    }

    public void onhearingTreatmentyes(ActionEvent event) {
    }

    public void onhearingTreatmentNo(ActionEvent event) {
    }

    public void onhearingLimitedYes(ActionEvent event) {
    }

    public void onhearingLimitedNo(ActionEvent event) {
    }

    public void onheartEverYes(ActionEvent event) {
    }

    public void onheartEverNo(ActionEvent event) {
    }

    public void onlearningEverYes(ActionEvent event) {
    }

    public void onlearningEverNo(ActionEvent event) {
    }

    public void onsleepEverYes(ActionEvent event) {
    }

    public void onsleepEverNo(ActionEvent event) {
    }

    public void onspeechEverYes(ActionEvent event) {
    }

    public void onspeechEverNo(ActionEvent event) {
    }

    public void onvisionEverYes(ActionEvent event) {
    }

    public void onvisionEverNo(ActionEvent event) {
    }

    public void onheartTreatmentYes(ActionEvent event) {
    }

    public void onlearningTreatmentyes(ActionEvent event) {
    }

    public void onlearningTreatmentNo(ActionEvent event) {
    }

    public void onsleepTreatmentYes(ActionEvent event) {
    }

    public void onsleepTreatmentNo(ActionEvent event) {
    }

    public void onheartTreatmentNo(ActionEvent event) {
    }

    public void onspeechTreatmentYes(ActionEvent event) {
    }

    public void onspeechTreatmentNo(ActionEvent event) {
    }

    public void onvisionTreatmentYes(ActionEvent event) {
    }

    public void onvisionTreatmentNo(ActionEvent event) {
    }

    public void onheartLimitedYes(ActionEvent event) {
    }

    public void onheartLimitedNo(ActionEvent event) {
    }

    public void onlearningLimitedYes(ActionEvent event) {
    }

    public void onlearningLimitedNo(ActionEvent event) {
    }

    public void onsleepLimitedYes(ActionEvent event) {
    }

    public void onsleepLimitedNo(ActionEvent event) {
    }

    public void onspeechLimitedYes(ActionEvent event) {
    }

    public void onspeechLimitedNo(ActionEvent event) {
    }

    public void onvisionLimitedYes(ActionEvent event) {
    }

    public void onvisionLimitedNo(ActionEvent event) {
    }
}

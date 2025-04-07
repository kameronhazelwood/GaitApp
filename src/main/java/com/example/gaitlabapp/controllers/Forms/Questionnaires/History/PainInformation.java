package com.example.gaitlabapp.controllers.Forms.Questionnaires.History;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class PainInformation {

    public Button previousButton;
    public Button nextQuestion;
    public RadioButton backUpper;
    public RadioButton backLower;
    public RadioButton backNone;
    public RadioButton wristNone;
    public RadioButton wristBoth;
    public RadioButton wristRight;
    public RadioButton wristLeft;
    public RadioButton thumbNone;
    public RadioButton thumbBoth;
    public RadioButton thumbRight;
    public RadioButton thumbLeft;
    public RadioButton shoulderNone;
    public RadioButton shoulderBoth;
    public RadioButton shouldersRight;
    public RadioButton shouldersLeft;
    public RadioButton hipNone;
    public RadioButton hipBoth;
    public RadioButton hipRight;
    public RadioButton hipLeft;
    public RadioButton fingersNone;
    public RadioButton fingersBoth;
    public RadioButton fingersRight;
    public RadioButton fingersLeft;
    public RadioButton calfNone;
    public RadioButton calfBoth;
    public RadioButton calfRight;
    public RadioButton calfLeft;


    private Stage getMyStageNext() { return (Stage) nextQuestion.getScene().getWindow(); }

    public void onPrevious(ActionEvent event) {
    }

    public void onNext(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/PhysicalTherapy.fxml"));
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


    public void onbackUpper(ActionEvent event) {
        if(backUpper.isSelected()){
            backLower.setSelected(false);
            backNone.setSelected(false);
        }
    }

    public void onbackLower(ActionEvent event) {
        if(backLower.isSelected()){
            backUpper.setSelected(false);
            backNone.setSelected(false);
        }
    }

    public void onbackNone(ActionEvent event) {
        if(backNone.isSelected()){
            backUpper.setSelected(false);
            backLower.setSelected(false);
        }
    }

    public void oncalfLeft(ActionEvent event) {
        if(calfLeft.isSelected()){
            calfBoth.setSelected(false);
            calfRight.setSelected(false);
            calfNone.setSelected(false);
        }
    }

    public void oncalfRight(ActionEvent event) {
        if(calfRight.isSelected()){
            calfNone.setSelected(false);
            calfLeft.setSelected(false);
            calfBoth.setSelected(false);
        }
    }

    public void oncalfBoth(ActionEvent event) {
        if(calfBoth.isSelected()){
            calfLeft.setSelected(false);
            calfRight.setSelected(false);
            calfNone.setSelected(false);
        }
    }

    public void oncalfNone(ActionEvent event) {
        if(calfNone.isSelected()){
            calfRight.setSelected(false);
            calfLeft.setSelected(false);
            calfBoth.setSelected(false);
        }
    }

    public void onfingersLeft(ActionEvent event) {
        if(fingersLeft.isSelected()){
            fingersBoth.setSelected(false);
            fingersNone.setSelected(false);
            fingersRight.setSelected(false);
        }
    }

    public void onfingersRight(ActionEvent event) {
        if(fingersRight.isSelected()){
            fingersNone.setSelected(false);
            fingersBoth.setSelected(false);
            fingersLeft.setSelected(false);
        }
    }

    public void onfingersBoth(ActionEvent event) {
        if(fingersBoth.isSelected()){
            fingersLeft.setSelected(false);
            fingersNone.setSelected(false);
            fingersRight.setSelected(false);
        }
    }

    public void onfingersNone(ActionEvent event) {
        if(fingersNone.isSelected()){
            fingersRight.setSelected(false);
            fingersLeft.setSelected(false);
            fingersBoth.setSelected(false);
        }
    }

    public void onhipLeft(ActionEvent event) {
        if(hipLeft.isSelected()){
            hipBoth.setSelected(false);
            hipNone.setSelected(false);
            hipRight.setSelected(false);
        }
    }

    public void onhipRight(ActionEvent event) {
        if(hipRight.isSelected()){
            hipBoth.setSelected(false);
            hipLeft.setSelected(false);
            hipNone.setSelected(false);
        }
    }

    public void onhipBoth(ActionEvent event) {
        if(hipBoth.isSelected()){
            hipRight.setSelected(false);
            hipLeft.setSelected(false);
            hipNone.setSelected(false);
        }
    }

    public void onhipNone(ActionEvent event) {
        if(hipNone.isSelected()){
            hipRight.setSelected(false);
            hipLeft.setSelected(false);
            hipBoth.setSelected(false);
        }
    }

    public void onshouldersLeft(ActionEvent event) {
        if(shouldersLeft.isSelected()){
            shoulderBoth.setSelected(false);
            shoulderNone.setSelected(false);
            shouldersRight.setSelected(false);
        }
    }

    public void onshouldersRight(ActionEvent event) {
        if(shouldersRight.isSelected()){
            shoulderBoth.setSelected(false);
            shoulderNone.setSelected(false);
            shouldersLeft.setSelected(false);
        }
    }

    public void onshouldersBoth(ActionEvent event) {
        if(shoulderBoth.isSelected()){
            shouldersRight.setSelected(false);
            shoulderNone.setSelected(false);
            shouldersLeft.setSelected(false);
        }
    }

    public void onshoulderNone(ActionEvent event) {
        if(shoulderNone.isSelected()){
            shouldersRight.setSelected(false);
            shoulderBoth.setSelected(false);
            shouldersLeft.setSelected(false);
        }
    }

    public void onthumbLeft(ActionEvent event) {
        if(thumbLeft.isSelected()){
            thumbBoth.setSelected(false);
            thumbNone.setSelected(false);
            thumbRight.setSelected(false);
        }
    }

    public void onthumbRight(ActionEvent event) {
        if(thumbRight.isSelected()){
            thumbBoth.setSelected(false);
            thumbNone.setSelected(false);
            thumbLeft.setSelected(false);
        }
    }

    public void onthumbBoth(ActionEvent event) {
        if(thumbBoth.isSelected()){
            thumbRight.setSelected(false);
            thumbNone.setSelected(false);
            thumbLeft.setSelected(false);
        }
    }

    public void onthumbNone(ActionEvent event) {
        if(thumbNone.isSelected()){
            thumbRight.setSelected(false);
            thumbBoth.setSelected(false);
            thumbLeft.setSelected(false);
        }
    }

    public void onwristLeft(ActionEvent event) {
        if(wristLeft.isSelected()){
            wristBoth.setSelected(false);
            wristRight.setSelected(false);
            wristNone.setSelected(false);
        }
    }

    public void onwristRight(ActionEvent event) {
        if(wristRight.isSelected()){
            wristBoth.setSelected(false);
            wristLeft.setSelected(false);
            wristNone.setSelected(false);
        }
    }

    public void onwristBoth(ActionEvent event) {
        if(wristBoth.isSelected()){
            wristRight.setSelected(false);
            wristLeft.setSelected(false);
            wristNone.setSelected(false);
        }
    }

    public void onwristNone(ActionEvent event) {
        if(wristNone.isSelected()){
            wristRight.setSelected(false);
            wristLeft.setSelected(false);
            wristBoth.setSelected(false);
        }
    }
}

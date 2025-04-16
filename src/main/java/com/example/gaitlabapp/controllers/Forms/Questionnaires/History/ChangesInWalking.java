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

public class ChangesInWalking implements Initializable {
    public Button previousButton;
    public Button nextButton;
    public RadioButton muchWorse;
    public RadioButton littleWorse;
    public RadioButton littleBetter;
    public RadioButton muchBetter;
    public RadioButton noChange;

    private Stage getMyStageNext() { return (Stage) nextButton.getScene().getWindow(); }

    public void onPrevious(ActionEvent event) {
    }

    public void onNext(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/CurrentGaitConcerns.fxml"));
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

    public void onnoChange(ActionEvent event) {
        if(noChange.isSelected()){
            muchBetter.setSelected(false);
            littleBetter.setSelected(false);
            littleWorse.setSelected(false);
            muchWorse.setSelected(false);
        }
    }

    public void onmuchBetter(ActionEvent event) {
        if(muchBetter.isSelected()){
            noChange.setSelected(false);
            littleBetter.setSelected(false);
            littleWorse.setSelected(false);
            muchWorse.setSelected(false);
        }
    }

    public void onlittleBetter(ActionEvent event) {
        if(littleBetter.isSelected()){
            noChange.setSelected(false);
            muchBetter.setSelected(false);
            littleWorse.setSelected(false);
            muchWorse.setSelected(false);
        }
    }

    public void onlittleWorse(ActionEvent event) {
        if(littleWorse.isSelected()){
            noChange.setSelected(false);
            muchBetter.setSelected(false);
            littleBetter.setSelected(false);
            muchWorse.setSelected(false);
        }
    }

    public void onmuchWorse(ActionEvent event) {
        if(muchWorse.isSelected()){
            noChange.setSelected(false);
            muchBetter.setSelected(false);
            littleBetter.setSelected(false);
            littleWorse.setSelected(false);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        noChange.setSelected(true);
    }
}

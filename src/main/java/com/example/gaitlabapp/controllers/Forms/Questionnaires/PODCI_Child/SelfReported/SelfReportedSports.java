package com.example.gaitlabapp.controllers.Forms.Questionnaires.PODCI_Child.SelfReported;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class SelfReportedSports {
    public Button start;
    public CheckBox yesGames;
    public CheckBox littleGames;
    public CheckBox hardGames;
    public CheckBox noGames;

    private Stage getMyStageStart() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader;
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/SelfReported/SelfReportedPickup.fxml"));
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
    public void onyesGames(ActionEvent event) {
        if(yesGames.isSelected()){
            littleGames.setSelected(false);
            hardGames.setSelected(false);
            noGames.setSelected(false);
        }
    }

    public void onlittleGames(ActionEvent event) {
        if(littleGames.isSelected()){
            yesGames.setSelected(false);
            hardGames.setSelected(false);
            noGames.setSelected(false);
        }
    }

    public void onhardGames(ActionEvent event) {
        if(hardGames.isSelected()){
            yesGames.setSelected(false);
            littleGames.setSelected(false);
            noGames.setSelected(false);
        }
    }

    public void onnoGames(ActionEvent event) {
        if(noGames.isSelected()){
            yesGames.setSelected(false);
            hardGames.setSelected(false);
            littleGames.setSelected(false);
        }
    }
}

package com.example.gaitlabapp.controllers.Forms.Questionnaires.PODCI_Child.ParentReported;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class HealthAssessmentLife {

    @FXML
    private CheckBox neutral;

    @FXML
    private CheckBox somewhatDis;

    @FXML
    private CheckBox somewhatSat;

    @FXML
    private Button start;

    @FXML
    private CheckBox veryDis;

    @FXML
    private CheckBox verySatisified;


    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentThankYou.fxml"));
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
    void onneutral(ActionEvent event) {
        if(neutral.isSelected()){
            somewhatDis.setSelected(false);
            somewhatSat.setSelected(false);
            veryDis.setSelected(false);
            verySatisified.setSelected(false);
        }
    }

    @FXML
    void onsomewhatDis(ActionEvent event) {
        if(somewhatDis.isSelected()){
            neutral.setSelected(false);
            somewhatSat.setSelected(false);
            veryDis.setSelected(false);
            verySatisified.setSelected(false);
        }
    }

    @FXML
    void onsomewhatSat(ActionEvent event) {
        if(somewhatSat.isSelected()){
            neutral.setSelected(false);
            somewhatDis.setSelected(false);
            veryDis.setSelected(false);
            verySatisified.setSelected(false);
        }
    }

    @FXML
    void onveryDis(ActionEvent event) {
        if(veryDis.isSelected()){
            neutral.setSelected(false);
            somewhatDis.setSelected(false);
            somewhatSat.setSelected(false);
            verySatisified.setSelected(false);
        }
    }

    @FXML
    void onverySatisified(ActionEvent event) {
        if(verySatisified.isSelected()){
            neutral.setSelected(false);
            somewhatDis.setSelected(false);
            somewhatSat.setSelected(false);
            veryDis.setSelected(false);
        }
    }

}

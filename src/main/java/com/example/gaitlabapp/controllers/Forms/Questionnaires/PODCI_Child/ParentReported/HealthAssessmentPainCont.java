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

public class HealthAssessmentPainCont {
    public Button start;
    @FXML
    private CheckBox extremely;

    @FXML
    private CheckBox little;

    @FXML
    private CheckBox moderate;

    @FXML
    private CheckBox not;

    @FXML
    private CheckBox quite;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentTreatment.fxml"));
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
    void onextremely(ActionEvent event) {
        if(extremely.isSelected()){
            little.setSelected(false);
            moderate.setSelected(false);
            not.setSelected(false);
            quite.setSelected(false);
        }
    }

    @FXML
    void onlittle(ActionEvent event) {
        if(little.isSelected()){
            extremely.setSelected(false);
            moderate.setSelected(false);
            not.setSelected(false);
            quite.setSelected(false);
        }
    }

    @FXML
    void onmoderate(ActionEvent event) {
        if(moderate.isSelected()){
            extremely.setSelected(false);
            little.setSelected(false);
            not.setSelected(false);
            quite.setSelected(false);
        }
    }

    @FXML
    void onnot(ActionEvent event) {
        if(not.isSelected()){
            extremely.setSelected(false);
            little.setSelected(false);
            moderate.setSelected(false);
            quite.setSelected(false);
        }
    }

    @FXML
    void onquite(ActionEvent event) {
        if(quite.isSelected()){
            extremely.setSelected(false);
            little.setSelected(false);
            moderate.setSelected(false);
            not.setSelected(false);
        }
    }
}

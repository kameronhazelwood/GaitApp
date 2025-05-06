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

public class HealthAssessmentPain {
    @FXML
    private CheckBox mild;

    @FXML
    private CheckBox moderate;

    @FXML
    private CheckBox none;

    @FXML
    private CheckBox severe;

    @FXML
    private Button start;

    @FXML
    private CheckBox veryMild;

    @FXML
    private CheckBox verySevere;

    private Stage getMyStageNext() { return (Stage) start.getScene().getWindow(); }
    public void onStart(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/HealthAssessmentPainCont.fxml"));
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
    void onMild(ActionEvent event) {
        if(mild.isSelected()){
            moderate.setSelected(false);
            none.setSelected(false);
            severe.setSelected(false);
            veryMild.setSelected(false);
            verySevere.setSelected(false);
        }
    }
    @FXML
    void onmoderate(ActionEvent event) {
        if(moderate.isSelected()){
            mild.setSelected(false);
            none.setSelected(false);
            severe.setSelected(false);
            veryMild.setSelected(false);
            verySevere.setSelected(false);
        }
    }

    @FXML
    void onnone(ActionEvent event) {
        if(none.isSelected()){
            mild.setSelected(false);
            moderate.setSelected(false);
            severe.setSelected(false);
            veryMild.setSelected(false);
            verySevere.setSelected(false);
        }
    }

    @FXML
    void onsevere(ActionEvent event) {
        if(severe.isSelected()){
            mild.setSelected(false);
            moderate.setSelected(false);
            none.setSelected(false);
            veryMild.setSelected(false);
            verySevere.setSelected(false);
        }
    }

    @FXML
    void onveryMild(ActionEvent event) {
        if(veryMild.isSelected()){
            mild.setSelected(false);
            moderate.setSelected(false);
            none.setSelected(false);
            severe.setSelected(false);
            verySevere.setSelected(false);
        }
    }

    @FXML
    void onverySevere(ActionEvent event) {
        if(verySevere.isSelected()){
            mild.setSelected(false);
            moderate.setSelected(false);
            none.setSelected(false);
            severe.setSelected(false);
            veryMild.setSelected(false);
        }
    }
}

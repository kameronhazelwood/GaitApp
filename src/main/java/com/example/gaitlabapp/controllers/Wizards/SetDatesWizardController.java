package com.example.gaitlabapp.controllers.Wizards;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;


public class SetDatesWizardController implements Initializable {


    @FXML
    public RadioButton gaitPTApt1;
    @FXML
    public RadioButton gaitApt;
    public RadioButton anyGait2;
    public RadioButton anyGait1;
    public Button setDate;
    private Stage getMyStage() { return (Stage) setDate.getScene().getWindow(); }

    Image apt1 = new Image(String.valueOf(getClass().getResource("/Rowan/IMG_20241203_132313.jpg")));

    public void onGaitPTApt1(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }

    public void OnSetDate(ActionEvent event) {
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.APPLICATION_MODAL);
        // alert.setTitle("Set Dates have been Saved");
        alert.setContentText("Set Dates have been selected.");
        alert.setHeight(400);
        alert.setWidth(400);
        alert.showAndWait();

        getMyStage().close();
    }
}

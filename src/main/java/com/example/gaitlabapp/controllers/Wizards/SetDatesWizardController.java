package com.example.gaitlabapp.controllers.Wizards;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;

import java.net.URL;
import java.util.ResourceBundle;


public class SetDatesWizardController implements Initializable {


    @FXML
    public RadioButton gaitPTApt1;
    @FXML
    public RadioButton gaitApt;
    public RadioButton anyGait2;
    public RadioButton anyGait1;

    Image apt1 = new Image(String.valueOf(getClass().getResource("/Rowan/IMG_20241203_132313.jpg")));

    public void onGaitPTApt1(ActionEvent event) {

    }


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        gaitPTApt1.setSelected(true);
        gaitApt.setSelected(true);
        anyGait2.setSelected(true);
        anyGait1.setSelected(true);
    }
}

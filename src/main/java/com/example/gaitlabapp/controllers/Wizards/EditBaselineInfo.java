package com.example.gaitlabapp.controllers.Wizards;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import org.controlsfx.control.CheckComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class EditBaselineInfo implements Initializable {
    @FXML
    private TextField dateReported;

    @FXML
    private ComboBox<String> firstTalked;

    @FXML
    private ComboBox<String> firstWalked;

    @FXML
    private ComboBox<String> hospital;

    @FXML
    private ComboBox<String> learn;

    @FXML
    private TextField personReporting;

    @FXML
    private ComboBox<String> premature;

    @FXML
    private ComboBox<String> relationshipToPatient;

    @FXML
    private Button saveButton;

    @FXML
    void onsaveButton(ActionEvent event) {

    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        dateReported.setText("03/07/2025");
        premature.setValue("Not Premature");
        personReporting.setText("Kameron Hazelwood");
        relationshipToPatient.setValue("Birth Parent");
        hospital.setValue("None");
        firstTalked.setValue("18 months");
        firstWalked.setValue("18 months");
        learn.setValue("Slow, needs special class");
    }
}

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
        relationshipToPatient.getItems().addAll(
                "Birth Mother",
                "Birth Father",
                "Birth Parent",
                "Adoptive Father",
                "Adoptive Mother",
                "Caretaker",
                "Family Friend",
                "Foster Parent",
                "Grandfather",
                "Grandmother",
                "Guardian",
                "Other Parent",
                "Patient",
                "Step-Father",
                "Step-Mother"
        );
        premature.getItems().addAll(
                "--",
                "Not Premature",
                "Less than two weeks",
                "2-4 weeks",
                "4-6 weeks",
                "6-8 weeks",
                "2 months",
                "3 months",
                "More than 3 months",
                "Not sure"
        );
        hospital.getItems().addAll(
                "--",
                "None",
                "1 week",
                "2-4 weeks",
                "1-2 months",
                "More than 2 months",
                "Not sure"
        );
        firstWalked.getItems().addAll(
              "--",
                "Not Sure",
                "Never",
                "9 months",
                "10 months",
                "11 months",
                "12 months",
                "13 months",
                "14 months",
                "15 months",
                "16 months",
                "17 months",
                "18 months",
                "2 years",
                "3 years",
                "4 years",
                "5 years",
                "6 years",
                "7 years",
                "8 years",
                "9 years",
                "10 years",
                "11 years",
                "12 years",
                "13 years",
                "14 years",
                "15 years",
                "16 years",
                "17 years",
                "18 years"
        );
        firstTalked.getItems().addAll(
                "--",
                "Not Sure",
                "Never",
                "9 months",
                "10 months",
                "11 months",
                "12 months",
                "13 months",
                "14 months",
                "15 months",
                "16 months",
                "17 months",
                "18 months",
                "2 years",
                "3 years",
                "4 years",
                "5 years",
                "6 years",
                "7 years",
                "8 years",
                "9 years",
                "10 years",
                "11 years",
                "12 years",
                "13 years",
                "14 years",
                "15 years",
                "16 years",
                "17 years",
                "18 years"
        );
        learn.getItems().addAll(
                "--",
                "Average or better",
                "Slow learner, needs special class",
                "Limited ability to learn, unable to read"
        );
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

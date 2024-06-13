package com.example.gaitlabapp.controllers.Wizards;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class BotoxDetailsController implements Initializable {

    public Button saveButton;
    public Button cancelButton;
    public AnchorPane botoxDetails;
    @FXML
    private TextField botoxDate;

    @FXML
    private TextField botoxFacility;

    @FXML
    private TextField botoxLocation;

    @FXML
    private TextField botoxProvider;

    @FXML
    private TextField botoxSide;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        botoxDate.setText("10/20/2023");
        botoxLocation.setText("Arm");
        botoxSide.setText("L");
        botoxProvider.setText("Dr. Smith");
        botoxFacility.setText("Nemours");
    }

    public void onCancel(){
        this.botoxDetails.getScene().getWindow().hide();
    }
}

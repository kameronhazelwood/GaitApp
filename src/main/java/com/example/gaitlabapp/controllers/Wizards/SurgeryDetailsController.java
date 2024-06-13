package com.example.gaitlabapp.controllers.Wizards;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import org.controlsfx.control.CheckComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class SurgeryDetailsController implements Initializable {

    public AnchorPane surgeryDetails;
    @FXML
    private Button cancelButton;

    @FXML
    private TextArea comments;

    @FXML
    private TextField date;

    @FXML
    private TextField facility;

    @FXML
    private CheckComboBox<?> procedure;

    @FXML
    private Button saveButton;

    @FXML
    private TextField side;

    @FXML
    private TextField surgeon;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        surgeon.setText("Dr. Smith");
        side.setText("L");
        facility.setText("Nemours Children's Hospital");
        date.setText("10/20/2023");
        comments.setText("These are test comments. ");
    }

    public void onCancel(){
        this.surgeryDetails.getScene().getWindow().hide();
    }


}

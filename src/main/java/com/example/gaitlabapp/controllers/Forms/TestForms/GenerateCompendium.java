package com.example.gaitlabapp.controllers.Forms.TestForms;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;

import java.net.URL;
import java.util.ResourceBundle;

public class GenerateCompendium  implements Initializable {


    public AnchorPane compPane;
    public Label bioMechLabel;
    public Label bioMech;
    @FXML
    public Label patientBioComments;
    public Label PatientLabel;
    public Label patientName;
    public Label genDiagnosisLabel;
    public Label genDiagnosis;
    public Label mrnHstLabel;
    public Label mrnHst;
    public Label dobHstLabel;
    public Label dobHst;
    public Label genderHstLabel;
    public Label genderHst;
    @FXML
    private Label dateOfEval;

    @FXML
    private Label dateOfEvallLabel;

    @FXML
    private Label dob;

    @FXML
    private Label dobLabel;

    @FXML
    private Label fName;

    @FXML
    private Label nameLabel;

    @FXML
    private Label referringPhys;

    @FXML
    private Label referringPhysLabel;
    @FXML
    private Label examiningTher;

    @FXML
    private Label examiningTherLabel;
    @FXML
    private Label gender;

    @FXML
    private Label genderLabel;
    @FXML
    private Label mrn;

    @FXML
    private Label mrnLabel;

    @FXML
    private Label visitDiag;

    @FXML
    private Label visitDiagLabel;
    @FXML
    private Label age;

    @FXML
    private Label ageLabel;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        nameLabel.setText("Name: ");
        dobLabel.setText("DOB: ");
        dateOfEvallLabel.setText("Date of Evaluation: ");
        bioMechLabel.setText("Biomechanist: ");
        referringPhysLabel.setText("Referring Physician: ");
        mrnLabel.setText("MRN: ");
        ageLabel.setText("Age: ");
        visitDiagLabel.setText("Visiting Diagnosis: ");
        genderLabel.setText("Gender: ");
        examiningTherLabel.setText("Examining Therapist: ");


        fName.setText("Test Test");
        dob.setText("1/1/2000");
        dateOfEval.setText("10/31/2023");
        bioMech.setText("Biomech Test");
        referringPhys.setText("Dr. Test Smith");
        mrn.setText("123");
        age.setText("24");
        visitDiag.setText("Cerebral Palsy");
        examiningTher.setText("Dr. Test Smithna");
        gender.setText("Female");
        patientBioComments.setText("These are some example comments about this test patient. ");


        /*
        patient history report
         */
        PatientLabel.setText("Patient Name: ");
        patientName.setText("Test Test");
        genDiagnosisLabel.setText("General Diagnosis: ");
        genDiagnosis.setText("Cerebral Palsy");
        mrnHstLabel.setText("MRN: ");
        mrnHst.setText("123");
        dobHstLabel.setText("DOB: ");
        dobHst.setText("1/1/2024");
        genderHstLabel.setText("Gender: ");
        genderHst.setText("Female");


    }


}

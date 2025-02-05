package com.example.gaitlabapp.controllers.Forms.Compendium;

import com.example.gaitlabapp.controllers.PatientModuleController;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.services.PatientService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
@RequiredArgsConstructor
public class CompendiumInfoPageController implements Initializable {

    @Autowired
    ConfigurableApplicationContext applicationContext;
    @FXML
    private Label age;

    @FXML
    private Label ageLabel;

    @FXML
    private Label bioMech;

    @FXML
    private Label bioMechLabel;

    @FXML
    private Label dateOfEval;

    @FXML
    private Label dateOfEvallLabel;

    @FXML
    private Label dob;

    @FXML
    private Label dobLabel;

    @FXML
    private Label examiningTher;

    @FXML
    private Label examiningTherLabel;

    @FXML
    private Label fName;

    @FXML
    private Label gender;

    @FXML
    private Label genderLabel;

    @FXML
    private Label mrn;

    @FXML
    private Label mrnLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label patientBioComments;

    @FXML
    private Label referringPhys;

    @FXML
    private Label referringPhysLabel;

    @FXML
    private Label visitDiag;

    @FXML
    private Label visitDiagLabel;

    IPatientModel patientModel;
    @Autowired
    PatientService patientService;
    PatientModuleController patientModuleController;
    private final ObservableList<IPatientModel> listviewPatients = FXCollections.observableArrayList();

    @FXML
    private boolean saved;

    public boolean isSaved() {
        return saved;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
//        fName.setText(patientModel.getFirstName());
//        dob.setText(patientModel.getDob());
//        mrn.setText(patientModel.getMrn());
//        gender.setText(patientModel.getGender());
//        visitDiag.setText(patientModel.getGenDiagnosis());
//        patientBioComments.setText(patientModel.getComments());
//        listviewPatients.addAll(FXCollections.observableArrayList(patientService.findAll()));
//        System.out.println("Patient" + listviewPatients);
//        IPatientModel patient = patientService.findByFirstName(fName.getText());
//        System.out.println("Patient" + patient);
//        patient.setFirstName(fName.getText());
//        System.out.println("Patient" + patient);
        // fName.setText(patient.getFirstName());


    }

    public void setInfoPage(IPatientModel patientModel) {
        this.patientModel = patientModel;

        System.out.println(fName);
        fName.setText(patientModel.getFirstName());
        dob.setText(patientModel.getDob());
        mrn.setText(patientModel.getMrn());
        gender.setText(patientModel.getGender());
        visitDiag.setText(patientModel.getGenDiagnosis());
        patientBioComments.setText(patientModel.getComments());


    }

}

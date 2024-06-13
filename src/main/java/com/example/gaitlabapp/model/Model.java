package com.example.gaitlabapp.model;

import com.example.gaitlabapp.model.patients.ISurgeryModel;
import com.example.gaitlabapp.model.patients.IPatientModel;
import javafx.beans.Observable;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;

public class Model {

//    private final ObservableList<ISurgeryModel> surgeries = FXCollections.observableArrayList(surgery ->
//            new Observable[] {
//                    surgery.getSurgeryDate(),
//                    surgery.surgeryProcedureProperty(),
//                    surgery.surgerySideProperty(),
//                    surgery.surgeonProperty(),
//                    surgery.facilityProperty(),
//                    surgery.commentProperty()
//            });
//    public final ObservableList<IPatientModel> patients = FXCollections.observableArrayList(patient ->
//            new Observable[]{
//                    patient.addressProperty(),
//                    patient.commentsProperty(),
//                    patient.dobProperty(),
//                    patient.fnameProperty(),
//                    patient.lnameProperty(),
//                    patient.formerLastNameProperty(),
//                    patient.genderProperty(),
//                    patient.mrnProperty(),
//                    patient.preferredNameProperty()
//            });
    //    public final ObservableList<IDiagnosisModel> diagnosisCodes = FXCollections.observableArrayList(diagnosisCode ->
//            new Observable[]{
//                    diagnosisCode.codeProperty(),
//                    diagnosisCode.shortDiagnosisProperty(),
//            });
    public Model(){
        initTestData();
    }

    private void initTestData(){
//        surgeries.setAll(
//                new ISurgeryModel("", "10/20/2023", "Other", "L", "surgeon",
//                        "facility", "comments")
//        );
//        patients.setAll(
//                new IPatientModel(1, "Test", "Test", "123", "Test1",
//                        "FormerLastName", "123 Testing Way", "Female", "1/1/2000", "Test Comments", "", "")
//                new IPatientModel("Test First Name", "Test Last Name", "456", "Preferred Name",
//                        "Former", "123 Test Dr", "Male", "1/1/2010",  "These are test comments")
        //);
//        diagnosisCodes.setAll(
//                new IDiagnosisModel("E71520", "Childhood cerebral X-linked adrenoleukodystrophy")
//        );
    }

//    public ObservableList<ISurgeryModel> getSurgeries(){
//        return surgeries;
//    }
//    public ObservableList<IPatientModel> getPatients(){
//        return patients;
//    }
    // public ObservableList<IDiagnosisModel> getDiagnosisCodes(){return diagnosisCodes; }

}

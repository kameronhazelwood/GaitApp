package com.example.gaitlabapp.model.patients;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Entity
@Getter
@Setter
@NoArgsConstructor(force = true)
@Data
@Table(name = "Patients")
public class IPatientModel {

    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY, generator = "IdOrGenerated")
    @Column(name = "patientID", nullable = false)
    private final Integer patientID;

    @Column(name = "firstName")
    private final String firstName;
    @Column(name = "lastName")
    private final String lastName;
    @Column(name = "prefferedFirstName")
    private final String preferredFirstName;
    @Column(name = "mrn")
    private final String mrn;
    @Column(name = "formerLastName")
    private final String formerLastName;
    @Column(name = "address")
    private final String address;
    @Column(name = "gender")
    private final String gender;
    @Column(name = "dob")
    private final String dob;
    @Column(name = "comments")
    private final String comments;
    @Column(name = "state")
    private final String state;
    @Column(name = "genDiagnosis")
    private final String genDiagnosis;

    public IPatientModel(Integer patientID, String firstName, String lastName, String preferredFirstName, String mrn, String formerLastName, String address, String gender, String dob, String comments, String state, String genDiagnosis) {
        this.patientID = patientID;
        this.firstName = firstName;
        this.lastName = lastName;
        this.preferredFirstName = preferredFirstName;
        this.mrn = mrn;
        this.formerLastName = formerLastName;
        this.address = address;
        this.gender = gender;
        this.dob = dob;
        this.comments = comments;
        this.state = state;
        this.genDiagnosis = genDiagnosis;
    }
}

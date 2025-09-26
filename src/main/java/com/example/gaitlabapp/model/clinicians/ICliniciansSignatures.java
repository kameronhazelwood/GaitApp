package com.example.gaitlabapp.model.clinicians;

import com.example.gaitlabapp.model.patients.IDiagnosisModel;
import com.example.gaitlabapp.model.patients.IPatientModel;
import jakarta.persistence.*;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Data
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Clinician_Signatures" )
public class ICliniciansSignatures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clin_Sig_Id")
    private Integer clinSigId;
    @Column(name = "comment")
    private String  comment;
    @Column(name = "user_Id")
    private String userId;
    @Column(name = "signed_Time")
    private String signedTime;
    @Column(name = "visit_Id")
    private Integer visitId;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

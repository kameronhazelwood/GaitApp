package com.example.gaitlabapp.model.clinicians;

import com.example.gaitlabapp.model.patients.IDiagnosisModel;
import com.example.gaitlabapp.model.patients.IPatientModel;
import jakarta.persistence.*;
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
@Table(name = "Clinicians")
public class ICliniciansModel {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinician_Id")
    private Integer clinicianId;
    @Column(name = "clincianFName")
    private String clinicianFName;
    @Column(name = "clinicianLName")
    private String clinicianLName;
    @Column(name = "clin_type")
    private String clinType;
    @Column(name = "clin_speciality")
    private String clinSpeciality;
    @Column(name = "clin_phone")
    private String clinPhone;
    @Column(name = "clin_address1")
    private String clinAddress1;
    @Column(name = "clin_address2")
    private String clinAddress2;
    @Column(name = "clin_address3")
    private String clinAddress3;
    @Column(name = "clin_city")
    private String clinCity;
    @Column(name = "clin_state")
    private String clinState;
    @Column(name = "clin_zip")
    private String clinZip;
    @Column(name = "clin_email")
    private String clinEmail;
    @Column(name = "clin_bill_code")
    private String clinBillCode;
    @Column(name = "active")
    private Integer active;
    @Column(name = "clin_gender")
    private String clinGender;
    @Column(name = "patientId")
    private Integer patientid;

    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

    public ICliniciansModel(Integer patientid) {
        this.patientid = patientid;
    }
}

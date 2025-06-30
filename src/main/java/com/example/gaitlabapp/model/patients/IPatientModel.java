package com.example.gaitlabapp.model.patients;

import com.example.gaitlabapp.model.forms.IGenMarkInfoModel;
import jakarta.persistence.*;
import lombok.*;


import java.io.Serializable;
import java.util.List;
import java.util.Set;


@Entity
@Getter
@NoArgsConstructor(force = true)
@Data
@Table(name = "patients")
public class IPatientModel implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "patient_id", nullable = false)
    private  Integer patientID;
    @Column(name = "first_name")
    @Setter
    private String firstName;
    @Column(name = "last_name")
    @Setter
    private String lastName;
    @Column(name = "preffered_first_name")
    @Setter
    private String preferredFirstName;
    @Column(name = "mrn")
    @Setter
    private String mrn;
    @Column(name = "former_last_name")
    @Setter
    private String formerLastName;
    @Column(name = "address")
    @Setter
    private String address;
    @Column(name = "gender")
    @Setter
    private String gender;
    @Column(name = "dob")
    @Setter
    private String dob;
    @Column(name = "comments")
    @Setter
    private String comments;
    @Column(name = "state")
    @Setter
    private String state;
    @Column(name = "gen_diagnosis")
    @Setter
    private String genDiagnosis;

    @ManyToMany
    @JoinTable(name = "diagnosis_code", joinColumns = @JoinColumn(referencedColumnName = "gen_diagnosis"),
    inverseJoinColumns = @JoinColumn(name = "code"))
     Set<IDiagnosisModel> gen_diagnosis;



    @OneToMany(mappedBy= "patientModel")
    private Set<ISurgeryModel> surgeryModels;


    public IPatientModel(String s, String s1, String s2) {
        this.setFirstName(s);
        this.firstName = s;
        this.lastName = s1;
        this.mrn = s2;
    }

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

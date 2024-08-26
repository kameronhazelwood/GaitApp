package com.example.gaitlabapp.model.forms.videoAssessment;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.*;


import jakarta.persistence.*;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "Foot_Conditions")
public class IFootConditionsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "foot_Condition_Id")
    private Integer footConditionId;
    @Column(name = "other")
    private String other;
    @Column(name = "shoes_Only")
    private String shoesOnly;
    @Column(name = "solidAFO")
    private String solidAFO;
    @Column(name = "articulatedAFO")
    private String articulatedAFO;
    @Column(name = "smo")
    private String smo;
    @Column(name = "kafo")
    private String kafo;
    @Column(name = "hkafo")
    private String hkafo;
    @Column(name = "grafo")
    private String grafo;
    @Column(name = "barefoot")
    private String barefoot;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IFootConditionsModel(Integer footConditionId, String other, String shoesOnly, String solidAFO, String articulatedAFO, String smo, String kafo, String hkafo, String grafo, String barefoot) {
//        this.footConditionId = footConditionId;
//        this.other = other;
//        this.shoesOnly = shoesOnly;
//        this.solidAFO = solidAFO;
//        this.articulatedAFO = articulatedAFO;
//        this.smo = smo;
//        this.kafo = kafo;
//        this.hkafo = hkafo;
//        this.grafo = grafo;
//        this.barefoot = barefoot;
//    }

}

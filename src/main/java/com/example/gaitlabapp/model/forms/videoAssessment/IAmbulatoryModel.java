package com.example.gaitlabapp.model.forms.videoAssessment;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "ambulatory")
public class IAmbulatoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ambulatory_Id")
    private Integer ambulatoryId;
    @Column(name = "crutches")
    private String crutches;
    @Column(name = "canes")
    private String canes;
    @Column(name = "anterior_Walker")
    private String anteriorWalker;
    @Column(name = "posterior_Walker")
    private String posteriorWalker;
    @Column(name = "handheld")
    private String handheld;
    @Column(name = "no_Aids")
    private String noAids;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

    public IAmbulatoryModel(Integer ambulatoryId, String crutches, String canes, String anteriorWalker, String posteriorWalker, String handheld, String noAids) {
        this.ambulatoryId = ambulatoryId;
        this.crutches = crutches;
        this.canes = canes;
        this.anteriorWalker = anteriorWalker;
        this.posteriorWalker = posteriorWalker;
        this.handheld = handheld;
        this.noAids = noAids;
    }

}

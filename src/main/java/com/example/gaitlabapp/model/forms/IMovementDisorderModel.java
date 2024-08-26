package com.example.gaitlabapp.model.forms;

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
@Table(name = "Movement_Disorder")
public class IMovementDisorderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movement_Disorder_Id")
    private Integer movementDisorderId;
    @Column(name = "amb_Scale")
    private String ambScale;
    @Column(name = "gmfcs")
    private String gmfcs;
    @Column(name = "fms5")
    private String fms5;
    @Column(name = "fms50")
    private String fms50;
    @Column(name = "fms500")
    private String fms500;
    @Column(name = "macs")
    private String macs;
    @Column(name = "cfcs")
    private String cfcs;
    @Column(name = "comments")
    private String comments;
    @Column(name = "orthoses")
    private String orthoses;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

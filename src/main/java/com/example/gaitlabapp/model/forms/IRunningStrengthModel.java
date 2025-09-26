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
@Entity
@NoArgsConstructor
@Table(name = "running_strength")
public class IRunningStrengthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "running_strength_id")
    private Integer runningStrengthId;
    @Column(name = "hip_ext")
    private String hipExt;
    @Column(name = "hip_ext_interp")
    private String hipExtInterp;
    @Column(name = "hip_ext_rot")
    private String hipExtRot;
    @Column(name = "hip_ext_rot_interp")
    private String hipExtRotInterp;
    @Column(name = "hip_Abd")
    private String hipAbd;
    @Column(name = "hip_Abd_Interp")
    private String hipAbdInterp;
    @Column(name = "knee_Ext")
    private String kneeExt;
    @Column(name = "knee_Ext_Interp")
    private String kneeExtInterp;
    @Column(name = "hip_Ext2")
    private String hipExt2;
    @Column(name = "hip_Ext3")
    private String hipExt3;
    @Column(name = "hip_Ext_Rot2")
    private String hipExtRot2;
    @Column(name = "hip_Ext_Rot3")
    private String hipExtRot3;
    @Column(name = "hip_Abd2")
    private String hipAbd2;
    @Column(name = "hip_Abd3")
    private String hipAbd3;
    @Column(name = "knee_Ext2")
    private String kneeExt2;
    @Column(name = "knee_Ext3")
    private String kneeExt3;
    @Column(name = "knee_Flex2")
    private String kneeFlex2;
    @Column(name = "knee_Flex3")
    private String kneeFlex3;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;
}

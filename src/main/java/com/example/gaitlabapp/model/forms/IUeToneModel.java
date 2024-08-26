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
@Table(name = "ue_tone")
public class IUeToneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ue_Tone_Id")
    private Integer ueToneId;
    @Column(name = "shoulder_ExtR")
    private Integer shoulderExtR;
    @Column(name = "shoulderextRInterp")
    private String shoulderextRInterp;
    @Column(name = "shoulder_ExtL")
    private Integer shoulderExtL;
    @Column(name = "shoulder_ExtLInterp")
    private String shoulderExtLInterp;
    @Column(name = "elbow_ExtR")
    private Integer elbowExtR;
    @Column(name = "elbow_ExtRInterp")
    private String elbowExtRInterp;
    @Column(name = "elbow_ExtL")
    private Integer elbowExtL;
    @Column(name = "elbow_ExtLInterp")
    private String elbowExtLInterp;
    @Column(name = "elbow_FlexR")
    private Integer elbowFlexR;
    @Column(name = "elbow_FlexRInterp")
    private String elbowFlexRInterp;
    @Column(name = "elbow_FlexL")
    private Integer elbowFlexL;
    @Column(name = "elbow_FlexLInterp")
    private String elbowFlexLInterp;
    @Column(name = "wrist_ExtL")
    private Integer wristExtL;
    @Column(name = "wrist_ExtLInterp")
    private String wristExtLInterp;
    @Column(name = "wrist_ExtR")
    private Integer wristExtR;
    @Column(name = "wrist_ExtRInterp")
    private String wristExtRInterp;
    @Column(name = "wrist_FlexR")
    private Integer wristFlexR;
    @Column(name = "wrist_FlexRInterp")
    private String wristFlexRInterp;
    @Column(name = "wrist_FlexL")
    private Integer wristFlexL;
    @Column(name = "wrist_FlexLInterp")
    private String wristFlexLInterp;
    @Column(name = "ue_Proximal_Muscle_ToneR")
    private String ueProximalMuscleToneR;
    @Column(name = "ue_Proximal_Muscle_ToneRInterp")
    private String ueProximalMuscleToneRInterp;
    @Column(name = "ue_Proximal_Muscle_ToneL")
    private String ueProximalMuscleToneL;
    @Column(name = "ue_Proximal_Muscle_ToneLInterp")
    private String ueProximalMuscleToneLInterp;
    @Column(name = "ue_Distal_Muscle_ToneR")
    private String ueDistalMuscleToneR;
    @Column(name = "ue_Distal_Muscle_ToneL")
    private String ueDistalMuscleToneL;
    @Column(name = "ue_Distal_Muscle_ToneRInterp")
    private String ueDistalMuscleToneRInterp;
    @Column(name = "ue_Distal_Muscle_ToneLInterp")
    private String ueDistalMuscleToneLInterp;
    @Column(name = "shoulder_FlexR")
    private String shoulderFlexR;
    @Column(name = "shoulder_FlexRInterp")
    private String shoulderFlexRInterp;
    @Column(name = "shoulder_FlexLInterp")
    private String shoulderFlexLInterp;
    @Column(name = "shoulder_FlexL")
    private String shoulderFlexL;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

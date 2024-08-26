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
@Table(name = "arom")
public class IAROMModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "arom_id")
    private Integer aromId;
    @Column(name = "shoulder_abductionR_act")
    private String shoulderAbductionR_act;
    @Column(name = "shoulder_abductionR_pass")
    private String shoulderAbductionR_pass;
    @Column(name = "shoulder_abductionL_pass")
    private String shoulderAbductionL_pass;
    @Column(name = "shoulder_abductionL_act")
    private String shoulderAbductionL_act;
    @Column(name = "shoulder_flexR_act")
    private String shoulderFlexR_act;
    @Column(name = "shoulder_flexR_pass")
    private String shoulderFlexR_pass;
    @Column(name = "shoulder_flexL_act")
    private String shoulderFlexL_act;
    @Column(name = "shoulder_flexL_pass")
    private String shoulderFlexL_pass;
    @Column(name = "shoulder_intern_rotr_act")
    private String shoulderInternRotR_act;
    @Column(name = "shoulder_intern_rotL_act")
    private String shoulderInternRotL_act;
    @Column(name = "shoulder_intern_rotL_pass")
    private String shoulderInternRotL_pass;
    @Column(name = "shoulder_intern_rotR_pass")
    private String shoulderInternRotR_pass;
    @Column(name = "shoulder_ext_rotR_pass")
    private String shoulderExtRotR_pass;
    @Column(name = "shoulder_ext_rotR_act")
    private String shoulderExtRotR_act;
    @Column(name = "shoulder_ext_rotL_pass")
    private String shoulderExtRotL_pass;
    @Column(name = "shoulder_ext_rotL_act")
    private String shoulderExtRotL_act;
    @Column(name = "elbow_flexR_act")
    private String elbowFlexR_act;
    @Column(name = "elbow_flexR_pass")
    private String elbowFlexR_pass;
    @Column(name = "elbow_flexL_act")
    private String elbowFlexL_act;
    @Column(name = "elbow_flexL_pass")
    private String elbowFlexL_pass;
    @Column(name = "elbow_extR_act")
    private String elbowExtR_act;
    @Column(name = "elbow_extR_pass")
    private String elbowExtR_pass;
    @Column(name = "elbow_extL_act")
    private String elbowExtL_act;
    @Column(name = "elbow_extL_pass")
    private String elbowExtL_pass;
    @Column(name = "forearm_supR_act")
    private String forearmSupR_act;
    @Column(name = "forearm_supR_pass")
    private String forearmSupR_pass;
    @Column(name = "forearm_supL_pass")
    private String forearmSupL_pass;
    @Column(name = "forearm_supL_act")
    private String forearmSupL_act;
    @Column(name = "forearm_proL_pass")
    private String forearmProL_pass;
    @Column(name = "forearm_proR_pass")
    private String forearmProR_pass;
    @Column(name = "forearm_proR_act")
    private String forearmProR_act;
    @Column(name = "wrist_flexR_act")
    private String wristFlexR_act;
    @Column(name = "wrist_flexR_pass")
    private String wristFlexR_pass;
    @Column(name = "wrist_flexL_act")
    private String wristFlexL_act;
    @Column(name = "wrist_flexL_pass")
    private String wristFlexL_pass;
    @Column(name = "wrist_extL_pass")
    private String wristExtL_pass;
    @Column(name = "wrist_extL_act")
    private String wristExtL_act;
    @Column(name = "wrist_extR_pass")
    private String wristExtR_pass;
    @Column(name = "wrist_extR_act")
    private String wristExtR_act;
    @Column(name = "wrist_ulnar_devR_pass")
    private String wristUlnarDevR_pass;
    @Column(name = "wrist_ulnar_devR_act")
    private String wristUlnarDevR_act;
    @Column(name = "wrist_ulnar_devL_pass")
    private String wristUlnarDevL_pass;
    @Column(name = "wrist_ulnar_devL_act")
    private String wristUlnarDevL_act;
    @Column(name = "wrist_radial_devR_act")
    private String wristRadialDevR_act;
    @Column(name = "wrist_radial_devR_pass")
    private String wristRadialDevR_pass;
    @Column(name = "wrist_radial_devL_act")
    private String wristRadialDevL_act;
    @Column(name = "wrist_radial_devL_pass")
    private String wristRadialDevL_pass;
    @Column(name = "finger_flexR_act")
    private String fingerFlexR_act;
    @Column(name = "finger_flexR_pass")
    private String fingerFlexR_pass;
    @Column(name = "finger_flexL_act")
    private String fingerFlexL_act;
    @Column(name = "finger_flexL_pass")
    private String fingerFlexL_pass;
    @Column(name = "finger_extR_pass")
    private String fingerExtR_pass;
    @Column(name = "finger_extR_act")
    private String fingerExtR_act;
    @Column(name = "finger_extL_act")
    private String fingerExtL_act;
    @Column(name = "finger_extL_pass")
    private String fingerExtL_pass;
    @Column(name = "thumb_palmerR_pass")
    private String thumbPalmerR_pass;
    @Column(name = "thumb_palmerR_act")
    private String thumbPalmerR_act;
    @Column(name = "thumb_palmerL_act")
    private String thumbPalmerL_act;
    @Column(name = "thumb_palmerL_pass")
    private String thumbPalmerL_pass;
    @Column(name = "thumb_mcpR_pass")
    private String thumbMcpR_pass;
    @Column(name = "thumb_mcpR_act")
    private String thumbMcpR_act;
    @Column(name = "thumb_mcpL_act")
    private String thumbMcpL_act;
    @Column(name = "thumb_mcpL_pass")
    private String thumbMcpL_pass;
    @Column(name = "thumb_oppR_pass")
    private String thumbOppR_pass;
    @Column(name = "thumb_oppR_act")
    private String thumbOppR_act;
    @Column(name = "thumb_oppL_act")
    private String thumbOppL_act;
    @Column(name = "thumb_oppL_pass")
    private String thumbOppL_pass;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IAROMModel(Integer aromId, String shoulderAbductionR_act, String shoulderAbductionR_pass, String shoulderAbductionL_pass, String shoulderAbductionL_act, String shoulderFlexR_act, String shoulderFlexR_pass, String shoulderFlexL_act, String shoulderFlexL_pass, String shoulderInternRotR_act, String shoulderInternRotL_act, String shoulderInternRotL_pass, String shoulderInternRotR_pass, String shoulderExtRotR_pass, String shoulderExtRotR_act, String shoulderExtRotL_pass, String shoulderExtRotL_act, String elbowFlexR_act, String elbowFlexR_pass, String elbowFlexL_act, String elbowFlexL_pass, String elbowExtR_act, String elbowExtR_pass, String elbowExtL_act, String elbowExtL_pass, String forearmSupR_act, String forearmSupR_pass, String forearmSupL_pass, String forearmSupL_act, String forearmProL_pass, String forearmProR_pass, String forearmProR_act, String wristFlexR_act, String wristFlexR_pass, String wristFlexL_act, String wristFlexL_pass, String wristExtL_pass, String wristExtL_act, String wristExtR_pass, String wristExtR_act, String wristUlnarDevR_pass, String wristUlnarDevR_act, String wristUlnarDevL_pass, String wristUlnarDevL_act, String wristRadialDevR_act, String wristRadialDevR_pass, String wristRadialDevL_act, String wristRadialDevL_pass, String fingerFlexR_act, String fingerFlexR_pass, String fingerFlexL_act, String fingerFlexL_pass, String fingerExtR_pass, String fingerExtR_act, String fingerExtL_act, String fingerExtL_pass, String thumbPalmerR_pass, String thumbPalmerR_act, String thumbPalmerL_act, String thumbPalmerL_pass, String thumbMcpR_pass, String thumbMcpR_act, String thumbMcpL_act, String thumbMcpL_pass, String thumbOppR_pass, String thumbOppR_act, String thumbOppL_act, String thumbOppL_pass) {
//        this.aromId = aromId;
//        this.shoulderAbductionR_act = shoulderAbductionR_act;
//        this.shoulderAbductionR_pass = shoulderAbductionR_pass;
//        this.shoulderAbductionL_pass = shoulderAbductionL_pass;
//        this.shoulderAbductionL_act = shoulderAbductionL_act;
//        this.shoulderFlexR_act = shoulderFlexR_act;
//        this.shoulderFlexR_pass = shoulderFlexR_pass;
//        this.shoulderFlexL_act = shoulderFlexL_act;
//        this.shoulderFlexL_pass = shoulderFlexL_pass;
//        this.shoulderInternRotR_act = shoulderInternRotR_act;
//        this.shoulderInternRotL_act = shoulderInternRotL_act;
//        this.shoulderInternRotL_pass = shoulderInternRotL_pass;
//        this.shoulderInternRotR_pass = shoulderInternRotR_pass;
//        this.shoulderExtRotR_pass = shoulderExtRotR_pass;
//        this.shoulderExtRotR_act = shoulderExtRotR_act;
//        this.shoulderExtRotL_pass = shoulderExtRotL_pass;
//        this.shoulderExtRotL_act = shoulderExtRotL_act;
//        this.elbowFlexR_act = elbowFlexR_act;
//        this.elbowFlexR_pass = elbowFlexR_pass;
//        this.elbowFlexL_act = elbowFlexL_act;
//        this.elbowFlexL_pass = elbowFlexL_pass;
//        this.elbowExtR_act = elbowExtR_act;
//        this.elbowExtR_pass = elbowExtR_pass;
//        this.elbowExtL_act = elbowExtL_act;
//        this.elbowExtL_pass = elbowExtL_pass;
//        this.forearmSupR_act = forearmSupR_act;
//        this.forearmSupR_pass = forearmSupR_pass;
//        this.forearmSupL_pass = forearmSupL_pass;
//        this.forearmSupL_act = forearmSupL_act;
//        this.forearmProL_pass = forearmProL_pass;
//        this.forearmProR_pass = forearmProR_pass;
//        this.forearmProR_act = forearmProR_act;
//        this.wristFlexR_act = wristFlexR_act;
//        this.wristFlexR_pass = wristFlexR_pass;
//        this.wristFlexL_act = wristFlexL_act;
//        this.wristFlexL_pass = wristFlexL_pass;
//        this.wristExtL_pass = wristExtL_pass;
//        this.wristExtL_act = wristExtL_act;
//        this.wristExtR_pass = wristExtR_pass;
//        this.wristExtR_act = wristExtR_act;
//        this.wristUlnarDevR_pass = wristUlnarDevR_pass;
//        this.wristUlnarDevR_act = wristUlnarDevR_act;
//        this.wristUlnarDevL_pass = wristUlnarDevL_pass;
//        this.wristUlnarDevL_act = wristUlnarDevL_act;
//        this.wristRadialDevR_act = wristRadialDevR_act;
//        this.wristRadialDevR_pass = wristRadialDevR_pass;
//        this.wristRadialDevL_act = wristRadialDevL_act;
//        this.wristRadialDevL_pass = wristRadialDevL_pass;
//        this.fingerFlexR_act = fingerFlexR_act;
//        this.fingerFlexR_pass = fingerFlexR_pass;
//        this.fingerFlexL_act = fingerFlexL_act;
//        this.fingerFlexL_pass = fingerFlexL_pass;
//        this.fingerExtR_pass = fingerExtR_pass;
//        this.fingerExtR_act = fingerExtR_act;
//        this.fingerExtL_act = fingerExtL_act;
//        this.fingerExtL_pass = fingerExtL_pass;
//        this.thumbPalmerR_pass = thumbPalmerR_pass;
//        this.thumbPalmerR_act = thumbPalmerR_act;
//        this.thumbPalmerL_act = thumbPalmerL_act;
//        this.thumbPalmerL_pass = thumbPalmerL_pass;
//        this.thumbMcpR_pass = thumbMcpR_pass;
//        this.thumbMcpR_act = thumbMcpR_act;
//        this.thumbMcpL_act = thumbMcpL_act;
//        this.thumbMcpL_pass = thumbMcpL_pass;
//        this.thumbOppR_pass = thumbOppR_pass;
//        this.thumbOppR_act = thumbOppR_act;
//        this.thumbOppL_act = thumbOppL_act;
//        this.thumbOppL_pass = thumbOppL_pass;
//    }

}

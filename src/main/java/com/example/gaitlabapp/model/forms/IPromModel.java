package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@Data
@Entity
@NoArgsConstructor
@Setter
@Table(name = "prom")
public class IPromModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "prom_id")
    private Integer promId;
    @Column(name = "hip_abdr")
    private Integer hipAbdR;
    @Column(name = "hip_abdrinterp")
    private String hipAbdRInterp;
    @Column(name = "hip_abdl")
    private Integer hipAbdL;
    @Column(name = "hip_abdlinterp")
    private String hipAbdLInterp;
    @Column(name = "hip_abdsr")
    private String hipAbdSR;
    @Column(name = "hip_abdsrinterp")
    private String hipAbdSRInterp;
    @Column(name = "hip_abdsl")
    private String hipAbdSL;
    @Column(name = "hip_abd_slinterp")
    private String hipAbdSLInterp;
    @Column(name = "hip_extr")
    private Integer hipExtr;
//    @Column(name = "hipExtrInterp")
    private String hipExtrInterp;
    @Column(name = "hip_extl")
    private Integer hipExtL;
    @Column(name = "hip_extlinterp")
    private String hipExtLInterp;
    @Column(name = "hip_extsr")
    private String hipExtSR;
    @Column(name = "hip_extsrinterp")
    private String hipExtSRInterp;
    @Column(name = "popRLow")
    private Integer popRLow;
    @Column(name = "popRHigh")
    private Integer popRHigh;
    @Column(name = "popRInterp")
    private String popRInterp;
    @Column(name = "popLLow")
    private Integer popLLow;
    @Column(name = "popLHigh")
    private Integer popLHigh;
    @Column(name = "popLInterp")
    private String popLInterp;
    @Column(name = "dorsiFR")
    private Integer dorsiFR;
    @Column(name = "dorsiFRInterp")
    private String dorsiFRInterp;
    @Column(name = "dorsiFL")
    private Integer dorsiFL;
    @Column(name = "dorsiFLInterp")
    private String dorsiFLInterp;
    @Column(name = "dorsiER")
    private Integer dorsiER;
    @Column(name = "dorsiERInterp")
    private String dorsiERInterp;
    @Column(name = "dorsiEL")
    private Integer dorsiEL;
    @Column(name = "dorsiELInterp")
    private String dorsiELInterp;
    @Column(name = "dorsiFSR")
    private String dorsiFSR;
    @Column(name = "dorsiFSRInterp")
    private String dorsiFSRInterp;
    @Column(name = "dorsiFSL")
    private String dorsiFSL;
    @Column(name = "dorsiFSLInterp")
    private String dorsiFSLInterp;
    @Column(name = "shoulder_abductionl")
    private Integer shoulderAbductionl;
    @Column(name = "shoulder_abdubctionr")
    private Integer shoulderAbdubctionr;
    @Column(name = "shoulder_abductionrinterp")
    private String shoulderAbductionRInterp;
    @Column(name = "shoulder_abductionlinterp")
    private String shoulderAbductionLInterp;
    @Column(name = "shoulder_abductionsl")
    private String shoulderAbductionSL;
    @Column(name = "shoulder_abdubctionsr")
    private String shoulderAbdubctionSR;
    @Column(name = "shoulder_abductionslinterp")
    private String shoulderAbductionSLInterp;
    @Column(name = "shoulder_abductionsrinterp")
    private String shoulderAbductionSRInterp;
    @Column(name = "elbow_extl")
    private Integer elbowExtL;
    @Column(name = "elbow_extr")
    private Integer elbowExtR;
    @Column(name = "elbow_extslinterp")
    private String elbowExtLInterp;
    @Column(name = "elbow_extrinterp")
    private String elbowExtRInterp;
    @Column(name = "elbow_extsl")
    private String elbowExtSL;
    @Column(name = "elbow_extsr")
    private String elbowExtSR;
    @Column(name = "elbow_extsrinterp")
    private String elbowExtSRInterp;
    @Column(name = "wrist_extl")
    private Integer wristExtL;
    @Column(name = "wrist_extr")
    private Integer wristExtR;
    @Column(name = "wrist_extlinterp")
    private String wristExtLInterp;
    @Column(name = "wrist_extrinterp")
    private String wristExtRInterp;
    @Column(name = "wrist_extsr")
    private String wristExtSR;
    @Column(name = "wrist_extsl")
    private String wristExtSL;
    @Column(name = "wrist_extslinterp")
    private String wristExtSLInterp;
    @Column(name = "wrist_extsrinterp")
    private String wristExtSRInterp;
    @Column(name = "tfaL")
    private String tfaL;
    @Column(name = "tfaR")
    private String tfaR;
    @Column(name = "tfaRInterp")
    private String tfaRInterp;
    @Column(name = "tfaLInterp")
    private String tfaLInterp;
    @Column(name = "calcaneal_inv")
    private String calcanealInv;
    @Column(name = "calcaneal_ever")
    private String calcanealEver;
    @Column(name = "knee_vargus")
    private String kneeVargus;
    @Column(name = "ely_test")
    private String elyTest;
    @Column(name = "elyL")
    private Integer elyL;
    @Column(name = "elyR")
    private Integer elyR;
    @Column(name = "elyRInterp")
    private String elyRInterp;
    @Column(name = "elyLInterp")
    private String elyLInterp;
    @Column(name = "plantar")
    private String plantar;
    @Column(name = "plantarR")
    private Integer plantarR;
    @Column(name = "plantarL")
    private Integer plantarL;
    @Column(name = "plantarLInterp")
    private String plantarLInterp;
    @Column(name = "plantarRInterp")
    private String plantarRInterp;
    @Column(name = "hip_flexr")
    private String hipFlexR;
    @Column(name = "hip_flexrinterp")
    private String hipFlexRInterp;
    @Column(name = "hip_flexl")
    private String hipFlexL;
    @Column(name = "hip_flexlinterp")
    private String hipFlexLInterp;
//    @Column(name = "hipExtRInterp")
//    private String hipExtRInterp;
    @Column(name = "hip_int_rotl")
    private String hipIntRotL;
    @Column(name = "hip_int_rotr")
    private String hipIntRotR;
    @Column(name = "hip_int_rotrinterp")
    private String hipIntRotRInterp;
    @Column(name = "hip_int_rotlinterp")
    private String hipIntRotLInterp;
    @Column(name = "knee_int_rotl")
    private String kneeIntRotL;
    @Column(name = "knee_int_rotrinterp")
    private String kneeIntRotRInterp;
    @Column(name = "knee_int_rotlinterp")
    private String kneeIntRotLInterp;
    @Column(name = "knee_int_rotr")
    private String kneeIntRotR;
    @Column(name = "knee_extr")
    private String kneeExtR;
    @Column(name = "knee_extl")
    private String kneeExtL;
    @Column(name = "knee_extrinterp")
    private String kneeExtRInterp;
    @Column(name = "knee_extlinterp")
    private String kneeExtLInterp;
    @Column(name = "knee_flexr")
    private String kneeFlexR;
    @Column(name = "knee_flexl")
    private String kneeFlexL;
    @Column(name = "knee_flexrinterp")
    private String kneeFlexRInterp;
    @Column(name = "knee_flexlinterp")
    private String kneeFlexLInterp;
    @Column(name = "ankle_everr")
    private String ankleEverR;
    @Column(name = "ankle_everl")
    private String ankleEverL;
    @Column(name = "ankle_everrinterp")
    private String ankleEverRInterp;
    @Column(name = "ankle_everlinterp")
    private String ankleEverLInterp;
    @Column(name = "ankle_invl")
    private String ankleInvL;
    @Column(name = "ankle_invr")
    private String ankleInvR;
    @Column(name = "ankle_invlinterp")
    private String ankleInvLInterp;
    @Column(name = "ankle_invrinterp")
    private String ankleInvRInterp;
    @Column(name = "ff_abaddlinterp")
    private String ffAbaddLInterp;
    @Column(name = "ff_abaddrinterp")
    private String ffAbaddRInterp;
    @Column(name = "ff_abaddl")
    private String ffAbaddL;
    @Column(name = "ff_abaddr")
    private String ffAbaddR;
    @Column(name = "leg_lengthr")
    private String legLengthR;
    @Column(name = "leg_lengthl")
    private String legLengthL;
    @Column(name = "q_angler")
    private String qAngleR;
    @Column(name = "q_anklel")
    private String qAnkleL;
    @Column(name = "bilateral_popr")
    private String bilateralPopR;
    @Column(name = "bilateral_popl")
    private String bilateralPopL;
    @Column(name = "bilateral_poprinterp")
    private String bilateralPopRInterp;
    @Column(name = "bilater_poplinterp")
    private String bilaterPopLInterp;
    @Column(name = "hip_flex_strenr")
    private String hipFlexStrenR;
    @Column(name = "hip_flex_strenl")
    private String hipFlexStrenL;
    @Column(name = "hip_ext_strenr")
    private String hipExtStrenR;
    @Column(name = "hip_ext_strenl")
    private String hipExtStrenL;
    @Column(name = "hip_abd_strenr")
    private String hipAbdStrenR;
    @Column(name = "hip_abd_strenl")
    private String hipAbdStrenL;
    @Column(name = "hip_int_rot_strenl")
    private String hipIntRotStrenL;
    @Column(name = "hip_int_rot_strenr")
    private String hipIntRotStrenR;
    @Column(name = "hip_ext_rot_strenl")
    private String hipExtRotStrenL;
    @Column(name = "hip_ext_rot_strenr")
    private String hipExtRotStrenR;
    @Column(name = "ryder_testr")
    private String ryderTestR;
    @Column(name = "ryder_testl")
    private String ryderTestL;
    @Column(name = "knee_flex_strenr")
    private String kneeFlextStrenR;
    @Column(name = "knee_flex_strenl")
    private String kneeFlextStrenL;
    @Column(name = "ext_lag_strenr")
    private String ExtLagStrenR;
    @Column(name = "ext_lag_strenl")
    private String ExtLagStrenL;
    @Column(name = "pop_ang_strenr")
    private String PopAngStrenR;
    @Column(name = "pop_ang_strenl")
    private String PopAngStrenL;
    @Column(name = "plantar_strenr")
    private String PlantarStrenR;
    @Column(name = "plantar_strenl")
    private String PlantarStrenL;
    @Column(name = "ank_inv_strenr")
    private String AnkInvStrenR;
    @Column(name = "ank_inv_strenl")
    private String AnkInvStrenL;
    @Column(name = "ryder_test_strenl")
    private String ryderTestStrenL;
    @Column(name = "ryder_test_strenr")
    private String ryderTestStrenR;
    @Column(name = "ext_lagr")
    private String extLagR;
    @Column(name = "ext_lagl")
    private String extLagL;
    @Column(name = "pop_angr")
    private String popAngR;
    @Column(name = "pop_angl")
    private String popAngL;
    @Column(name = "ankle_ev_strengr")
    private String ankleEvStrengR;
    @Column(name = "ankle_ev_strengl")
    private String ankleEvStrengL;

    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "tone")
public class IToneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "tone_id")
    private Integer toneId;
    @Column(name = "iliopsoasR")
    private String iliopsoasR;
    @Column(name = "iliopsoasL")
    private String iliopsoasL;
    @Column(name = "iliopsoasRInterp")
    private String iliopsoasRInterp;
    @Column(name = "iliopsoasLInterp")
    private String iliopsoasLInterp;
    @Column(name = "glute_MaxR")
    private String gluteMaxR;
    @Column(name = "glute_MaxL")
    private String gluteMaxL;
    @Column(name = "glute_MaxRInterp")
    private String gluteMaxRInterp;
    @Column(name = "glute_MaxLInterp")
    private String gluteMaxLInterp;
    @Column(name = "adductorR")
    private String adductorR;
    @Column(name = "adductorL")
    private String adductorL;
    @Column(name = "adductorRInterp")
    private String adductorRInterp;
    @Column(name = "adductorLInterp")
    private String adductorLInterp;
    @Column(name = "rectus_FemorisR")
    private String rectusFemorisR;
    @Column(name = "rectus_FemorisL")
    private String rectusFemorisL;
    @Column(name = "rectus_FemorisLInterp")
    private String rectusFemorisLInterp;
    @Column(name = "rectus_FemorisRInterp")
    private String rectusFemorisRInterp;
    @Column(name = "vastus_MedialisR")
    private String vastusMedialisR;
    @Column(name = "vastus_MedialisL")
    private String vastusMedialisL;
    @Column(name = "vastus_MedialisRInterp")
    private String vastusMedialisRInterp;
    @Column(name = "vastus_MedialisLInterp")
    private String vastusMedialisLInterp;
    @Column(name = "hamstringR")
    private String hamstringR;
    @Column(name = "hamstringL")
    private String hamstringL;
    @Column(name = "hamstringLInterp")
    private String hamstringLInterp;
    @Column(name = "hamstringRInterp")
    private String hamstringRInterp;
    @Column(name = "post_TibR")
    private String postTibR;
    @Column(name = "post_TibL")
    private String postTibL;
    @Column(name = "post_TibRInterp")
    private String postTibRInterp;
    @Column(name = "post_TibLInterp")
    private String postTibLInterp;
    @Column(name = "ant_TibR")
    private String antTibR;
    @Column(name = "ant_TibL")
    private String antTibL;
    @Column(name = "ant_TibRInterp")
    private String antTibRInterp;
    @Column(name = "ant_TibLInterp")
    private String antTibLInterp;
    @Column(name = "gastrocL")
    private String gastrocL;
    @Column(name = "gastrocR")
    private String gastrocR;
    @Column(name = "gastrocLInterp")
    private String gastrocLInterp;
    @Column(name = "gastrocRInterp")
    private String gastrocRInterp;
    @Column(name = "colnusL")
    private String colnusL;
    @Column(name = "colnusR")
    private String colnusR;
    @Column(name = "colnusRInterp")
    private String colnusRInterp;
    @Column(name = "colnusLInterp")
    private String colnusLInterp;
    @Column(name = "knee_JerkL")
    private String kneeJerkL;
    @Column(name = "knee_JerkR")
    private String kneeJerkR;
    @Column(name = "knee_JerkRInterp")
    private String kneeJerkRInterp;
    @Column(name = "knee_JerkLInterp")
    private String kneeJerkLInterp;
    @Column(name = "ankle_JerkL")
    private String ankleJerkL;
    @Column(name = "ankle_JerkR")
    private String ankleJerkR;
    @Column(name = "ankle_JerkLInterp")
    private String ankleJerkLInterp;
    @Column(name = "ankle_JerkRInterp")
    private String ankleJerkRInterp;
    @Column(name = "babinskiR")
    private String babinskiR;
    @Column(name = "babinskiL")
    private String babinskiL;
    @Column(name = "babinskiRInterp")
    private String babinskiRInterp;
    @Column(name = "babinskiLInterp")
    private String babinskiLInterp;
    @Column(name = "proximal_Muscle_ToneR")
    private String proximalMuscleToneR;
    @Column(name = "proximal_Muscle_ToneL")
    private String proximalMuscleToneL;
    @Column(name = "proximal_Muscle_ToneRInterp")
    private String proximalMuscleToneRInterp;
    @Column(name = "proximal_Muscle_ToneLInterp")
    private String proximalMuscleToneLInterp;
    @Column(name = "distal_Muscle_ToneR")
    private String distalMuscleToneR;
    @Column(name = "distal_Muscle_ToneL")
    private String distalMuscleToneL;
    @Column(name = "distal_Muscle_ToneRInterp")
    private String distalMuscleToneRInterp;
    @Column(name = "distal_Muscle_ToneLInterp")
    private String distalMuscleToneLInterp;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

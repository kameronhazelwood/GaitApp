package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
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
@Table(name = "motor_control")
public class IMotorControlModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motor_control_id")
    private Integer motorControlId;
    @Column(name = "iliopsoasR")
    private String iliopsoasR;
    @Column(name = "iliopsoasL")
    private String iliopsoasL;
    @Column(name = "iliopsoasRInterp")
    private String iliopsoasRInterp;
    @Column(name = "iliopsoasLInterp")
    private String iliopsoasLInterp;
    @Column(name = "glute_medR")
    private String gluteMedR;
    @Column(name = "glute_medL")
    private String gluteMedL;
    @Column(name = "glute_medRInterp")
    private String gluteMedRInterp;
    @Column(name = "glute_medLInterp")
    private String gluteMedLInterp;
    @Column(name = "hip_abductorR")
    private String hipAbductorR;
    @Column(name = "hip_abductorL")
    private String hipAbductorL;
    @Column(name = "hip_abductorRInterp")
    private String hipAbductorRInterp;
    @Column(name = "hip_abductorLInterp")
    private String hipAbductorLInterp;
    @Column(name = "quadsR")
    private String quadsR;
    @Column(name = "quardsL")
    private String quardsL;
    @Column(name = "quadsRInterp")
    private String quadsRInterp;
    @Column(name = "quadsLInterp")
    private String quadsLInterp;
    @Column(name = "hamstringR")
    private String hamstringR;
    @Column(name = "hamstringL")
    private String hamstringL;
    @Column(name = "hamstringRInterp")
    private String hamstringRInterp;
    @Column(name = "hamstringLInterp")
    private String hamstringLInterp;
    @Column(name = "ant_tibialisL")
    private String antTibialisL;
    @Column(name = "ant_tibialisR")
    private String antTibialisR;
    @Column(name = "ant_tibialisLInterp")
    private String antTibialisLInterp;
    @Column(name = "ant_tibialisRInterp")
    private String antTibialisRInterp;
    @Column(name = "gastrocnemiusR")
    private String gastrocnemiusR;
    @Column(name = "gastrocnemiusL")
    private String gastrocnemiusL;
    @Column(name = "gastrocnemiusRInterp")
    private String gastrocnemiusRInterp;
    @Column(name = "gastrocnemiusLInterp")
    private String gastrocnemiusLInterp;
    @Column(name = "post_tibialisR")
    private String postTibialisR;
    @Column(name = "post_tibialisRInterp")
    private String postTibialisRInterp;
    @Column(name = "post_tibialisL")
    private String postTibialisL;
    @Column(name = "post_tibialisLInterp")
    private String postTibialisLInterp;
    @Column(name = "soleusR")
    private String soleusR;
    @Column(name = "soleusRInterp")
    private String soleusRInterp;
    @Column(name = "soleursL")
    private String soleursL;
    @Column(name = "soleursLInterp")
    private String soleursLInterp;
    @Column(name = "peronealsR")
    private String peronealsR;
    @Column(name = "personealsL")
    private String personealsL;
    @Column(name = "personealsLInterp")
    private String personealsLInterp;
    @Column(name = "peronealsRInterp")
    private String peronealsRInterp;
    @Column(name = "proximal_muscle_controlL")
    private String proximalMuscleControlL;
    @Column(name = "proximal_muscle_controlR")
    private String proximalMuscleControlR;
    @Column(name = "proximal_muscle_controlLInterp")
    private String proximalMuscleControlLInterp;
    @Column(name = "proximal_muscle_controlRInterp")
    private String proximalMuscleControlRInterp;
    @Column(name = "distal_muscle_controlR")
    private String distalMuscleControlR;
    @Column(name = "distal_muscle_controlL")
    private String distalMuscleControlL;
    @Column(name = "distal_muscle_controlRInterp")
    private String distalMuscleControlRInterp;
    @Column(name = "distal_muscle_controlLInterp")
    private String distalMuscleControlLInterp;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;
}

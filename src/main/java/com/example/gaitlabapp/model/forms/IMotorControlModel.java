package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;
@Data
@Entity
@NoArgsConstructor
@Getter
@Setter
@Table(name = "MotorControl")
public class IMotorControlModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "motorControlId")
    private Integer motorControlId;
    @Column(name = "iliopsoasR")
    private String iliopsoasR;
    @Column(name = "iliopsoasL")
    private String iliopsoasL;
    @Column(name = "iliopsoasRInterp")
    private String iliopsoasRInterp;
    @Column(name = "iliopsoasLInterp")
    private String iliopsoasLInterp;
    @Column(name = "gluteMedR")
    private String gluteMedR;
    @Column(name = "gluteMedL")
    private String gluteMedL;
    @Column(name = "gluteMedRInterp")
    private String gluteMedRInterp;
    @Column(name = "gluteMedLInterp")
    private String gluteMedLInterp;
    @Column(name = "hipAbductorR")
    private String hipAbductorR;
    @Column(name = "hipAbductorL")
    private String hipAbductorL;
    @Column(name = "hipAbductorRInterp")
    private String hipAbductorRInterp;
    @Column(name = "hipAbductorLInterp")
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
    @Column(name = "antTibialisL")
    private String antTibialisL;
    @Column(name = "antTibialisR")
    private String antTibialisR;
    @Column(name = "antTibialisLInterp")
    private String antTibialisLInterp;
    @Column(name = "antTibialisRInterp")
    private String antTibialisRInterp;
    @Column(name = "gastrocnemiusR")
    private String gastrocnemiusR;
    @Column(name = "gastrocnemiusL")
    private String gastrocnemiusL;
    @Column(name = "gastrocnemiusRInterp")
    private String gastrocnemiusRInterp;
    @Column(name = "gastrocnemiusLInterp")
    private String gastrocnemiusLInterp;
    @Column(name = "postTibialisR")
    private String postTibialisR;
    @Column(name = "postTibialisRInterp")
    private String postTibialisRInterp;
    @Column(name = "postTibialisL")
    private String postTibialisL;
    @Column(name = "postTibialisLInterp")
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
    @Column(name = "proximalMuscleControlL")
    private String proximalMuscleControlL;
    @Column(name = "proximalMuscleControlR")
    private String proximalMuscleControlR;
    @Column(name = "proximalMuscleControlLInterp")
    private String proximalMuscleControlLInterp;
    @Column(name = "proximalMuscleControlRInterp")
    private String proximalMuscleControlRInterp;
    @Column(name = "distalMuscleControlR")
    private String distalMuscleControlR;
    @Column(name = "distalMuscleControlL")
    private String distalMuscleControlL;
    @Column(name = "distalMuscleControlRInterp")
    private String distalMuscleControlRInterp;
    @Column(name = "distalMuscleControlLInterp")
    private String distalMuscleControlLInterp;
}

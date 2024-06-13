package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Getter
@Setter
@Data
@NoArgsConstructor
@Entity
@Table(name = "Tone")
public class IToneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "toneId")
    private Integer toneId;
    @Column(name = "iliopsoasR")
    private String iliopsoasR;
    @Column(name = "iliopsoasL")
    private String iliopsoasL;
    @Column(name = "iliopsoasRInterp")
    private String iliopsoasRInterp;
    @Column(name = "iliopsoasLInterp")
    private String iliopsoasLInterp;
    @Column(name = "gluteMaxR")
    private String gluteMaxR;
    @Column(name = "gluteMaxL")
    private String gluteMaxL;
    @Column(name = "gluteMaxRInterp")
    private String gluteMaxRInterp;
    @Column(name = "gluteMaxLInterp")
    private String gluteMaxLInterp;
    @Column(name = "adductorR")
    private String adductorR;
    @Column(name = "adductorL")
    private String adductorL;
    @Column(name = "adductorRInterp")
    private String adductorRInterp;
    @Column(name = "adductorLInterp")
    private String adductorLInterp;
    @Column(name = "rectusFemorisR")
    private String rectusFemorisR;
    @Column(name = "rectusFemorisL")
    private String rectusFemorisL;
    @Column(name = "rectusFemorisLInterp")
    private String rectusFemorisLInterp;
    @Column(name = "rectusFemorisRInterp")
    private String rectusFemorisRInterp;
    @Column(name = "vastusMedialisR")
    private String vastusMedialisR;
    @Column(name = "vastusMedialisL")
    private String vastusMedialisL;
    @Column(name = "vastusMedialisRInterp")
    private String vastusMedialisRInterp;
    @Column(name = "vastusMedialisLInterp")
    private String vastusMedialisLInterp;
    @Column(name = "hamstringR")
    private String hamstringR;
    @Column(name = "hamstringL")
    private String hamstringL;
    @Column(name = "hamstringLInterp")
    private String hamstringLInterp;
    @Column(name = "hamstringRInterp")
    private String hamstringRInterp;
    @Column(name = "postTibR")
    private String postTibR;
    @Column(name = "postTibL")
    private String postTibL;
    @Column(name = "postTibRInterp")
    private String postTibRInterp;
    @Column(name = "postTibLInterp")
    private String postTibLInterp;
    @Column(name = "antTibR")
    private String antTibR;
    @Column(name = "antTibL")
    private String antTibL;
    @Column(name = "antTibRInterp")
    private String antTibRInterp;
    @Column(name = "antTibLInterp")
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
    @Column(name = "kneeJerkL")
    private String kneeJerkL;
    @Column(name = "kneeJerkR")
    private String kneeJerkR;
    @Column(name = "kneeJerkRInterp")
    private String kneeJerkRInterp;
    @Column(name = "kneeJerkLInterp")
    private String kneeJerkLInterp;
    @Column(name = "ankleJerkL")
    private String ankleJerkL;
    @Column(name = "ankleJerkR")
    private String ankleJerkR;
    @Column(name = "ankleJerkLInterp")
    private String ankleJerkLInterp;
    @Column(name = "ankleJerkRInterp")
    private String ankleJerkRInterp;
    @Column(name = "babinskiR")
    private String babinskiR;
    @Column(name = "babinskiL")
    private String babinskiL;
    @Column(name = "babinskiRInterp")
    private String babinskiRInterp;
    @Column(name = "babinskiLInterp")
    private String babinskiLInterp;
    @Column(name = "proximalMuscleToneR")
    private String proximalMuscleToneR;
    @Column(name = "proximalMuscleToneL")
    private String proximalMuscleToneL;
    @Column(name = "proximalMuscleToneRInterp")
    private String proximalMuscleToneRInterp;
    @Column(name = "proximalMuscleToneLInterp")
    private String proximalMuscleToneLInterp;
    @Column(name = "distalMuscleToneR")
    private String distalMuscleToneR;
    @Column(name = "distalMuscleToneL")
    private String distalMuscleToneL;
    @Column(name = "distalMuscleToneRInterp")
    private String distalMuscleToneRInterp;
    @Column(name = "distalMuscleToneLInterp")
    private String distalMuscleToneLInterp;

}

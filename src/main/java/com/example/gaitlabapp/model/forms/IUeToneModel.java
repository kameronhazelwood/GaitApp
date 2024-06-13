package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "UeTone")
public class IUeToneModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ueToneId")
    private Integer ueToneId;
    @Column(name = "shoulderExtR")
    private Integer shoulderExtR;
    @Column(name = "shoulderextRInterp")
    private String shoulderextRInterp;
    @Column(name = "shoulderExtL")
    private Integer shoulderExtL;
    @Column(name = "shoulderExtLInterp")
    private String shoulderExtLInterp;
    @Column(name = "elbowExtR")
    private Integer elbowExtR;
    @Column(name = "elbowExtRInterp")
    private String elbowExtRInterp;
    @Column(name = "elbowExtL")
    private Integer elbowExtL;
    @Column(name = "elbowExtLInterp")
    private String elbowExtLInterp;
    @Column(name = "elbowFlexR")
    private Integer elbowFlexR;
    @Column(name = "elbowFlexRInterp")
    private String elbowFlexRInterp;
    @Column(name = "elbowFlexL")
    private Integer elbowFlexL;
    @Column(name = "elbowFlexLInterp")
    private String elbowFlexLInterp;
    @Column(name = "wristExtL")
    private Integer wristExtL;
    @Column(name = "wristExtLInterp")
    private String wristExtLInterp;
    @Column(name = "wristExtR")
    private Integer wristExtR;
    @Column(name = "wristExtRInterp")
    private String wristExtRInterp;
    @Column(name = "wristFlexR")
    private Integer wristFlexR;
    @Column(name = "wristFlexRInterp")
    private String wristFlexRInterp;
    @Column(name = "wristFlexL")
    private Integer wristFlexL;
    @Column(name = "wristFlexLInterp")
    private String wristFlexLInterp;
    @Column(name = "ueProximalMuscleToneR")
    private String ueProximalMuscleToneR;
    @Column(name = "ueProximalMuscleToneRInterp")
    private String ueProximalMuscleToneRInterp;
    @Column(name = "ueProximalMuscleToneL")
    private String ueProximalMuscleToneL;
    @Column(name = "ueProximalMuscleToneLInterp")
    private String ueProximalMuscleToneLInterp;
    @Column(name = "ueDistalMuscleToneR")
    private String ueDistalMuscleToneR;
    @Column(name = "ueDistalMuscleToneL")
    private String ueDistalMuscleToneL;
    @Column(name = "ueDistalMuscleToneRInterp")
    private String ueDistalMuscleToneRInterp;
    @Column(name = "ueDistalMuscleToneLInterp")
    private String ueDistalMuscleToneLInterp;
    @Column(name = "shoulderFlexR")
    private String shoulderFlexR;
    @Column(name = "shoulderFlexRInterp")
    private String shoulderFlexRInterp;
    @Column(name = "shoulderFlexLInterp")
    private String shoulderFlexLInterp;
    @Column(name = "shoulderFlexL")
    private String shoulderFlexL;


}

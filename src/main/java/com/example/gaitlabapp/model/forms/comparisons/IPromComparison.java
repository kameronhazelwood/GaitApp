package com.example.gaitlabapp.model.forms.comparisons;

import lombok.Data;
import lombok.Getter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "PROMComparison")
public class IPromComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "promCompId")
    private Integer promCompId;
    @Column(name = "hipAbdR")
    private Integer hipAbdR;
    @Column(name = "hipAbdRSd")
    private String hipAbdRSd;
    @Column(name = "hipAbdL")
    private Integer hipAbdL;
    @Column(name = "hipAbdLSd")
    private String hipAbdLSd;
    @Column(name = "hipAbdSR")
    private String hipAbdSR;
    @Column(name = "hipAbdSRSd")
    private String hipAbdSRSd;
    @Column(name = "hipAbdSL")
    private String hipAbdSL;
    @Column(name = "hipAbdSLSd")
    private String hipAbdSLSd;
    @Column(name = "hipExtr")
    private Integer hipExtr;
    @Column(name = "hipExtrSd")
    private String hipExtrSd;
    @Column(name = "hipExtL")
    private Integer hipExtL;
    @Column(name = "hipExtLSd")
    private String hipExtLSd;
    @Column(name = "hipExtSR")
    private String hipExtSR;
    @Column(name = "hipExtSRSd")
    private String hipExtSRSd;
    @Column(name = "popRLow")
    private Integer popRLow;
    @Column(name = "popRHigh")
    private Integer popRHigh;
    @Column(name = "popRSd")
    private String popRSd;
    @Column(name = "popLLow")
    private Integer popLLow;
    @Column(name = "popLHigh")
    private Integer popLHigh;
    @Column(name = "popLSd")
    private String popLSd;
    @Column(name = "dorsiFR")
    private Integer dorsiFR;
    @Column(name = "dorsiFRSd")
    private String dorsiFRSd;
    @Column(name = "dorsiFL")
    private Integer dorsiFL;
    @Column(name = "dorsiFLSd")
    private String dorsiFLSd;
    @Column(name = "dorsiER")
    private Integer dorsiER;
    @Column(name = "dorsiERSd")
    private String dorsiERSd;
    @Column(name = "dorsiEL")
    private Integer dorsiEL;
    @Column(name = "dorsiELSd")
    private String dorsiELSd;
    @Column(name = "dorsiFSR")
    private String dorsiFSR;
    @Column(name = "dorsiFSRSd")
    private String dorsiFSRSd;
    @Column(name = "dorsiFSL")
    private String dorsiFSL;
    @Column(name = "dorsiFSL")
    private String dorsiFSLSd;
    @Column(name = "shoulderAbductionl")
    private Integer shoulderAbductionl;
    @Column(name = "shoulderAbductionr")
    private Integer shoulderAbdubctionr;
    @Column(name = "shoulderAbductionRSd")
    private String shoulderAbductionRSd;
    @Column(name = "shoulderAbductionLSd")
    private String shoulderAbductionLSd;
    @Column(name = "shoulderAbductionSL")
    private String shoulderAbductionSL;
    @Column(name = "shoulderAbdubctionSR")
    private String shoulderAbdubctionSR;
    @Column(name = "shoulderAbductionSLSd")
    private String shoulderAbductionSLSd;
    @Column(name = "shoulderAbductionSRSd")
    private String shoulderAbductionSRSd;
    @Column(name = "elbowExtL")
    private Integer elbowExtL;
    @Column(name = "elbowExtR")
    private Integer elbowExtR;
    @Column(name = "elbowExtLSd")
    private String elbowExtLSd;
    @Column(name = "elbowExtRSd")
    private String elbowExtRSd;
    @Column(name = "elbowExtSL")
    private String elbowExtSL;
    @Column(name = "elbowExtSR")
    private String elbowExtSR;
    @Column(name = "elbowExtSLSd")
    private String elbowExtSLSd;
    @Column(name = "elbowExtSRSd")
    private String elbowExtSRSd;
    @Column(name = "wristExtL")
    private Integer wristExtL;
    @Column(name = "wristExtR")
    private Integer wristExtR;
    @Column(name = "wristExtLSd")
    private String wristExtLSd;
    @Column(name = "wristExtRSd")
    private String wristExtRSd;
    @Column(name = "wristExtSR")
    private String wristExtSR;
    @Column(name = "wristExtSL")
    private String wristExtSL;
    @Column(name = "wristExtSLSd")
    private String wristExtSLSd;
    @Column(name = "wristExtSRSd")
    private String wristExtSRSd;
    @Column(name = "tma")
    private String tma;
    @Column(name = "tfa")
    private String tfa;
    @Column(name = "tfaL")
    private String tfaL;
    @Column(name = "tfaR")
    private String tfaR;
    @Column(name = "tfaRSd")
    private String tfaRSd;
    @Column(name = "tfaLSd")
    private String tfaLSd;
    @Column(name = "calcanealInv")
    private String calcanealInv;
    @Column(name = "calcanealEver")
    private String calcanealEver;
    @Column(name = "kneeVargus")
    private String kneeVargus;
    @Column(name = "ryderTest")
    private String ryderTest;
    @Column(name = "elyTest")
    private String elyTest;
    @Column(name = "elyL")
    private Integer elyL;
    @Column(name = "elyR")
    private Integer elyR;
    @Column(name = "elyRSd")
    private String elyRSd;
    @Column(name = "elyLSd")
    private String elyLSd;
    @Column(name = "plantar")
    private String plantar;
    @Column(name = "plantarR")
    private Integer plantarR;
    @Column(name = "plantarL")
    private Integer plantarL;
    @Column(name = "plantarLSd")
    private String plantarLSd;
    @Column(name = "plantarRSd")
    private String plantarRSd;
    @Column(name = "hipFlexR")
    private String hipFlexR;
    @Column(name = "hipFlexRSd")
    private String hipFlexRSd;
    @Column(name = "hipFlexL")
    private String hipFlexL;
    @Column(name = "hipFlexLSd")
    private String hipFlexLSd;
    @Column(name = "hipExtR")
    private String hipExtR;
    @Column(name = "hipExtRSd")
    private String hipExtRSd;
    @Column(name = "hipIntRotL")
    private String hipIntRotL;
    @Column(name = "hipIntRotR")
    private String hipIntRotR;
    @Column(name = "hipIntRotRSd")
    private String hipIntRotRSd;
    @Column(name = "hipIntRotLSd")
    private String hipIntRotLSd;
    @Column(name = "kneeIntRotL")
    private String kneeIntRotL;
    @Column(name = "kneeIntRotRSd")
    private String kneeIntRotRSd;
    @Column(name = "kneeIntRotLSd")
    private String kneeIntRotLSd;
    @Column(name = "kneeIntRotR")
    private String kneeIntRotR;
    @Column(name = "kneeExtR")
    private String kneeExtR;
    @Column(name = "kneeExtL")
    private String kneeExtL;
    @Column(name = "kneeExtRSd")
    private String kneeExtRSd;
    @Column(name = "kneeExtLSd")
    private String kneeExtLSd;
    @Column(name = "kneeFlexR")
    private String kneeFlexR;
    @Column(name = "kneeFlexL")
    private String kneeFlexL;
    @Column(name = "kneeFlexRSd")
    private String kneeFlexRSd;
    @Column(name = "kneeFlexLSd")
    private String kneeFlexLSd;
    @Column(name = "ankleEverR")
    private String ankleEverR;
    @Column(name = "ankleEverL")
    private String ankleEverL;
    @Column(name = "ankleEverRSd")
    private String ankleEverRSd;
    @Column(name = "ankleEverLSd")
    private String ankleEverLSd;
    @Column(name = "ankleInvL")
    private String ankleInvL;
    @Column(name = "ankleInvR")
    private String ankleInvR;
    @Column(name = "ankleInvLSd")
    private String ankleInvLSd;
    @Column(name = "ankleInvRSD")
    private String ankleInvRSD;
    @Column(name = "ffAbaddLSd")
    private String ffAbaddLSd;
    @Column(name = "ffAbaddRSd")
    private String ffAbaddRSd;
    @Column(name = "ffAbaddL")
    private String ffAbaddL;
    @Column(name = "ffAbaddR")
    private String ffAbaddR;
    @Column(name = "legLengthR")
    private String legLengthR;
    @Column(name = "legLengthL")
    private String legLengthL;
    @Column(name = "qAngleR")
    private String qAngleR;
    @Column(name = "qAnkleL")
    private String qAnkleL;
    @Column(name = "bilateralPopR")
    private String bilateralPopR;
    @Column(name = "bilateralPopL")
    private String bilateralPopL;
    @Column(name = "bilateralPopRSd")
    private String bilateralPopRSd;
    @Column(name = "bilaterPopLSd")
    private String bilaterPopLSd;

    public IPromComparison(Integer promCompId, Integer hipAbdR, String hipAbdRSd, Integer hipAbdL, String hipAbdLSd, String hipAbdSR, String hipAbdSRSd, String hipAbdSL, String hipAbdSLSd, Integer hipExtr, String hipExtrSd, Integer hipExtL, String hipExtLSd, String hipExtSR, String hipExtSRSd, Integer popRLow, Integer popRHigh, String popRSd, Integer popLLow, Integer popLHigh, String popLSd, Integer dorsiFR, String dorsiFRSd, Integer dorsiFL, String dorsiFLSd, Integer dorsiER, String dorsiERSd, Integer dorsiEL, String dorsiELSd, String dorsiFSR, String dorsiFSRSd, String dorsiFSL, String dorsiFSLSd, Integer shoulderAbductionl, Integer shoulderAbdubctionr, String shoulderAbductionRSd, String shoulderAbductionLSd, String shoulderAbductionSL, String shoulderAbdubctionSR, String shoulderAbductionSLSd, String shoulderAbductionSRSd, Integer elbowExtL, Integer elbowExtR, String elbowExtLSd, String elbowExtRSd, String elbowExtSL, String elbowExtSR, String elbowExtSLSd, String elbowExtSRSd, Integer wristExtL, Integer wristExtR, String wristExtLSd, String wristExtRSd, String wristExtSR, String wristExtSL, String wristExtSLSd, String wristExtSRSd, String tma, String tfa, String tfaL, String tfaR, String tfaRSd, String tfaLSd, String calcanealInv, String calcanealEver, String kneeVargus, String ryderTest, String elyTest, Integer elyL, Integer elyR, String elyRSd, String elyLSd, String plantar, Integer plantarR, Integer plantarL, String plantarLSd, String plantarRSd, String hipFlexR, String hipFlexRSd, String hipFlexL, String hipFlexLSd, String hipExtR, String hipExtRSd, String hipIntRotL, String hipIntRotR, String hipIntRotRSd, String hipIntRotLSd, String kneeIntRotL, String kneeIntRotRSd, String kneeIntRotLSd, String kneeIntRotR, String kneeExtR, String kneeExtL, String kneeExtRSd, String kneeExtLSd, String kneeFlexR, String kneeFlexL, String kneeFlexRSd, String kneeFlexLSd, String ankleEverR, String ankleEverL, String ankleEverRSd, String ankleEverLSd, String ankleInvL, String ankleInvR, String ankleInvLSd, String ankleInvRSD, String ffAbaddLSd, String ffAbaddRSd, String ffAbaddL, String ffAbaddR, String legLengthR, String legLengthL, String qAngleR, String qAnkleL, String bilateralPopR, String bilateralPopL, String bilateralPopRSd, String bilaterPopLSd) {
        this.promCompId = promCompId;
        this.hipAbdR = hipAbdR;
        this.hipAbdRSd = hipAbdRSd;
        this.hipAbdL = hipAbdL;
        this.hipAbdLSd = hipAbdLSd;
        this.hipAbdSR = hipAbdSR;
        this.hipAbdSRSd = hipAbdSRSd;
        this.hipAbdSL = hipAbdSL;
        this.hipAbdSLSd = hipAbdSLSd;
        this.hipExtr = hipExtr;
        this.hipExtrSd = hipExtrSd;
        this.hipExtL = hipExtL;
        this.hipExtLSd = hipExtLSd;
        this.hipExtSR = hipExtSR;
        this.hipExtSRSd = hipExtSRSd;
        this.popRLow = popRLow;
        this.popRHigh = popRHigh;
        this.popRSd = popRSd;
        this.popLLow = popLLow;
        this.popLHigh = popLHigh;
        this.popLSd = popLSd;
        this.dorsiFR = dorsiFR;
        this.dorsiFRSd = dorsiFRSd;
        this.dorsiFL = dorsiFL;
        this.dorsiFLSd = dorsiFLSd;
        this.dorsiER = dorsiER;
        this.dorsiERSd = dorsiERSd;
        this.dorsiEL = dorsiEL;
        this.dorsiELSd = dorsiELSd;
        this.dorsiFSR = dorsiFSR;
        this.dorsiFSRSd = dorsiFSRSd;
        this.dorsiFSL = dorsiFSL;
        this.dorsiFSLSd = dorsiFSLSd;
        this.shoulderAbductionl = shoulderAbductionl;
        this.shoulderAbdubctionr = shoulderAbdubctionr;
        this.shoulderAbductionRSd = shoulderAbductionRSd;
        this.shoulderAbductionLSd = shoulderAbductionLSd;
        this.shoulderAbductionSL = shoulderAbductionSL;
        this.shoulderAbdubctionSR = shoulderAbdubctionSR;
        this.shoulderAbductionSLSd = shoulderAbductionSLSd;
        this.shoulderAbductionSRSd = shoulderAbductionSRSd;
        this.elbowExtL = elbowExtL;
        this.elbowExtR = elbowExtR;
        this.elbowExtLSd = elbowExtLSd;
        this.elbowExtRSd = elbowExtRSd;
        this.elbowExtSL = elbowExtSL;
        this.elbowExtSR = elbowExtSR;
        this.elbowExtSLSd = elbowExtSLSd;
        this.elbowExtSRSd = elbowExtSRSd;
        this.wristExtL = wristExtL;
        this.wristExtR = wristExtR;
        this.wristExtLSd = wristExtLSd;
        this.wristExtRSd = wristExtRSd;
        this.wristExtSR = wristExtSR;
        this.wristExtSL = wristExtSL;
        this.wristExtSLSd = wristExtSLSd;
        this.wristExtSRSd = wristExtSRSd;
        this.tma = tma;
        this.tfa = tfa;
        this.tfaL = tfaL;
        this.tfaR = tfaR;
        this.tfaRSd = tfaRSd;
        this.tfaLSd = tfaLSd;
        this.calcanealInv = calcanealInv;
        this.calcanealEver = calcanealEver;
        this.kneeVargus = kneeVargus;
        this.ryderTest = ryderTest;
        this.elyTest = elyTest;
        this.elyL = elyL;
        this.elyR = elyR;
        this.elyRSd = elyRSd;
        this.elyLSd = elyLSd;
        this.plantar = plantar;
        this.plantarR = plantarR;
        this.plantarL = plantarL;
        this.plantarLSd = plantarLSd;
        this.plantarRSd = plantarRSd;
        this.hipFlexR = hipFlexR;
        this.hipFlexRSd = hipFlexRSd;
        this.hipFlexL = hipFlexL;
        this.hipFlexLSd = hipFlexLSd;
        this.hipExtR = hipExtR;
        this.hipExtRSd = hipExtRSd;
        this.hipIntRotL = hipIntRotL;
        this.hipIntRotR = hipIntRotR;
        this.hipIntRotRSd = hipIntRotRSd;
        this.hipIntRotLSd = hipIntRotLSd;
        this.kneeIntRotL = kneeIntRotL;
        this.kneeIntRotRSd = kneeIntRotRSd;
        this.kneeIntRotLSd = kneeIntRotLSd;
        this.kneeIntRotR = kneeIntRotR;
        this.kneeExtR = kneeExtR;
        this.kneeExtL = kneeExtL;
        this.kneeExtRSd = kneeExtRSd;
        this.kneeExtLSd = kneeExtLSd;
        this.kneeFlexR = kneeFlexR;
        this.kneeFlexL = kneeFlexL;
        this.kneeFlexRSd = kneeFlexRSd;
        this.kneeFlexLSd = kneeFlexLSd;
        this.ankleEverR = ankleEverR;
        this.ankleEverL = ankleEverL;
        this.ankleEverRSd = ankleEverRSd;
        this.ankleEverLSd = ankleEverLSd;
        this.ankleInvL = ankleInvL;
        this.ankleInvR = ankleInvR;
        this.ankleInvLSd = ankleInvLSd;
        this.ankleInvRSD = ankleInvRSD;
        this.ffAbaddLSd = ffAbaddLSd;
        this.ffAbaddRSd = ffAbaddRSd;
        this.ffAbaddL = ffAbaddL;
        this.ffAbaddR = ffAbaddR;
        this.legLengthR = legLengthR;
        this.legLengthL = legLengthL;
        this.qAngleR = qAngleR;
        this.qAnkleL = qAnkleL;
        this.bilateralPopR = bilateralPopR;
        this.bilateralPopL = bilateralPopL;
        this.bilateralPopRSd = bilateralPopRSd;
        this.bilaterPopLSd = bilaterPopLSd;
    }

    public void setPromCompId(Integer promCompId) {
        this.promCompId = promCompId;
    }

    public void setHipAbdR(Integer hipAbdR) {
        this.hipAbdR = hipAbdR;
    }

    public void setHipAbdRSd(String hipAbdRSd) {
        this.hipAbdRSd = hipAbdRSd;
    }

    public void setHipAbdL(Integer hipAbdL) {
        this.hipAbdL = hipAbdL;
    }

    public void setHipAbdLSd(String hipAbdLSd) {
        this.hipAbdLSd = hipAbdLSd;
    }

    public void setHipAbdSR(String hipAbdSR) {
        this.hipAbdSR = hipAbdSR;
    }

    public void setHipAbdSRSd(String hipAbdSRSd) {
        this.hipAbdSRSd = hipAbdSRSd;
    }

    public void setHipAbdSL(String hipAbdSL) {
        this.hipAbdSL = hipAbdSL;
    }

    public void setHipAbdSLSd(String hipAbdSLSd) {
        this.hipAbdSLSd = hipAbdSLSd;
    }

    public void setHipExtr(Integer hipExtr) {
        this.hipExtr = hipExtr;
    }

    public void setHipExtrSd(String hipExtrSd) {
        this.hipExtrSd = hipExtrSd;
    }

    public void setHipExtL(Integer hipExtL) {
        this.hipExtL = hipExtL;
    }

    public void setHipExtLSd(String hipExtLSd) {
        this.hipExtLSd = hipExtLSd;
    }

    public void setHipExtSR(String hipExtSR) {
        this.hipExtSR = hipExtSR;
    }

    public void setHipExtSRSd(String hipExtSRSd) {
        this.hipExtSRSd = hipExtSRSd;
    }

    public void setPopRLow(Integer popRLow) {
        this.popRLow = popRLow;
    }

    public void setPopRHigh(Integer popRHigh) {
        this.popRHigh = popRHigh;
    }

    public void setPopRSd(String popRSd) {
        this.popRSd = popRSd;
    }

    public void setPopLLow(Integer popLLow) {
        this.popLLow = popLLow;
    }

    public void setPopLHigh(Integer popLHigh) {
        this.popLHigh = popLHigh;
    }

    public void setPopLSd(String popLSd) {
        this.popLSd = popLSd;
    }

    public void setDorsiFR(Integer dorsiFR) {
        this.dorsiFR = dorsiFR;
    }

    public void setDorsiFRSd(String dorsiFRSd) {
        this.dorsiFRSd = dorsiFRSd;
    }

    public void setDorsiFL(Integer dorsiFL) {
        this.dorsiFL = dorsiFL;
    }

    public void setDorsiFLSd(String dorsiFLSd) {
        this.dorsiFLSd = dorsiFLSd;
    }

    public void setDorsiER(Integer dorsiER) {
        this.dorsiER = dorsiER;
    }

    public void setDorsiERSd(String dorsiERSd) {
        this.dorsiERSd = dorsiERSd;
    }

    public void setDorsiEL(Integer dorsiEL) {
        this.dorsiEL = dorsiEL;
    }

    public void setDorsiELSd(String dorsiELSd) {
        this.dorsiELSd = dorsiELSd;
    }

    public void setDorsiFSR(String dorsiFSR) {
        this.dorsiFSR = dorsiFSR;
    }

    public void setDorsiFSRSd(String dorsiFSRSd) {
        this.dorsiFSRSd = dorsiFSRSd;
    }

    public void setDorsiFSL(String dorsiFSL) {
        this.dorsiFSL = dorsiFSL;
    }

    public void setDorsiFSLSd(String dorsiFSLSd) {
        this.dorsiFSLSd = dorsiFSLSd;
    }

    public void setShoulderAbductionl(Integer shoulderAbductionl) {
        this.shoulderAbductionl = shoulderAbductionl;
    }

    public void setShoulderAbdubctionr(Integer shoulderAbdubctionr) {
        this.shoulderAbdubctionr = shoulderAbdubctionr;
    }

    public void setShoulderAbductionRSd(String shoulderAbductionRSd) {
        this.shoulderAbductionRSd = shoulderAbductionRSd;
    }

    public void setShoulderAbductionLSd(String shoulderAbductionLSd) {
        this.shoulderAbductionLSd = shoulderAbductionLSd;
    }

    public void setShoulderAbductionSL(String shoulderAbductionSL) {
        this.shoulderAbductionSL = shoulderAbductionSL;
    }

    public void setShoulderAbdubctionSR(String shoulderAbdubctionSR) {
        this.shoulderAbdubctionSR = shoulderAbdubctionSR;
    }

    public void setShoulderAbductionSLSd(String shoulderAbductionSLSd) {
        this.shoulderAbductionSLSd = shoulderAbductionSLSd;
    }

    public void setShoulderAbductionSRSd(String shoulderAbductionSRSd) {
        this.shoulderAbductionSRSd = shoulderAbductionSRSd;
    }

    public void setElbowExtL(Integer elbowExtL) {
        this.elbowExtL = elbowExtL;
    }

    public void setElbowExtR(Integer elbowExtR) {
        this.elbowExtR = elbowExtR;
    }

    public void setElbowExtLSd(String elbowExtLSd) {
        this.elbowExtLSd = elbowExtLSd;
    }

    public void setElbowExtRSd(String elbowExtRSd) {
        this.elbowExtRSd = elbowExtRSd;
    }

    public void setElbowExtSL(String elbowExtSL) {
        this.elbowExtSL = elbowExtSL;
    }

    public void setElbowExtSR(String elbowExtSR) {
        this.elbowExtSR = elbowExtSR;
    }

    public void setElbowExtSLSd(String elbowExtSLSd) {
        this.elbowExtSLSd = elbowExtSLSd;
    }

    public void setElbowExtSRSd(String elbowExtSRSd) {
        this.elbowExtSRSd = elbowExtSRSd;
    }

    public void setWristExtL(Integer wristExtL) {
        this.wristExtL = wristExtL;
    }

    public void setWristExtR(Integer wristExtR) {
        this.wristExtR = wristExtR;
    }

    public void setWristExtLSd(String wristExtLSd) {
        this.wristExtLSd = wristExtLSd;
    }

    public void setWristExtRSd(String wristExtRSd) {
        this.wristExtRSd = wristExtRSd;
    }

    public void setWristExtSR(String wristExtSR) {
        this.wristExtSR = wristExtSR;
    }

    public void setWristExtSL(String wristExtSL) {
        this.wristExtSL = wristExtSL;
    }

    public void setWristExtSLSd(String wristExtSLSd) {
        this.wristExtSLSd = wristExtSLSd;
    }

    public void setWristExtSRSd(String wristExtSRSd) {
        this.wristExtSRSd = wristExtSRSd;
    }

    public void setTma(String tma) {
        this.tma = tma;
    }

    public void setTfa(String tfa) {
        this.tfa = tfa;
    }

    public void setTfaL(String tfaL) {
        this.tfaL = tfaL;
    }

    public void setTfaR(String tfaR) {
        this.tfaR = tfaR;
    }

    public void setTfaRSd(String tfaRSd) {
        this.tfaRSd = tfaRSd;
    }

    public void setTfaLSd(String tfaLSd) {
        this.tfaLSd = tfaLSd;
    }

    public void setCalcanealInv(String calcanealInv) {
        this.calcanealInv = calcanealInv;
    }

    public void setCalcanealEver(String calcanealEver) {
        this.calcanealEver = calcanealEver;
    }

    public void setKneeVargus(String kneeVargus) {
        this.kneeVargus = kneeVargus;
    }

    public void setRyderTest(String ryderTest) {
        this.ryderTest = ryderTest;
    }

    public void setElyTest(String elyTest) {
        this.elyTest = elyTest;
    }

    public void setElyL(Integer elyL) {
        this.elyL = elyL;
    }

    public void setElyR(Integer elyR) {
        this.elyR = elyR;
    }

    public void setElyRSd(String elyRSd) {
        this.elyRSd = elyRSd;
    }

    public void setElyLSd(String elyLSd) {
        this.elyLSd = elyLSd;
    }

    public void setPlantar(String plantar) {
        this.plantar = plantar;
    }

    public void setPlantarR(Integer plantarR) {
        this.plantarR = plantarR;
    }

    public void setPlantarL(Integer plantarL) {
        this.plantarL = plantarL;
    }

    public void setPlantarLSd(String plantarLSd) {
        this.plantarLSd = plantarLSd;
    }

    public void setPlantarRSd(String plantarRSd) {
        this.plantarRSd = plantarRSd;
    }

    public void setHipFlexR(String hipFlexR) {
        this.hipFlexR = hipFlexR;
    }

    public void setHipFlexRSd(String hipFlexRSd) {
        this.hipFlexRSd = hipFlexRSd;
    }

    public void setHipFlexL(String hipFlexL) {
        this.hipFlexL = hipFlexL;
    }

    public void setHipFlexLSd(String hipFlexLSd) {
        this.hipFlexLSd = hipFlexLSd;
    }

    public void setHipExtR(String hipExtR) {
        this.hipExtR = hipExtR;
    }

    public void setHipExtRSd(String hipExtRSd) {
        this.hipExtRSd = hipExtRSd;
    }

    public void setHipIntRotL(String hipIntRotL) {
        this.hipIntRotL = hipIntRotL;
    }

    public void setHipIntRotR(String hipIntRotR) {
        this.hipIntRotR = hipIntRotR;
    }

    public void setHipIntRotRSd(String hipIntRotRSd) {
        this.hipIntRotRSd = hipIntRotRSd;
    }

    public void setHipIntRotLSd(String hipIntRotLSd) {
        this.hipIntRotLSd = hipIntRotLSd;
    }

    public void setKneeIntRotL(String kneeIntRotL) {
        this.kneeIntRotL = kneeIntRotL;
    }

    public void setKneeIntRotRSd(String kneeIntRotRSd) {
        this.kneeIntRotRSd = kneeIntRotRSd;
    }

    public void setKneeIntRotLSd(String kneeIntRotLSd) {
        this.kneeIntRotLSd = kneeIntRotLSd;
    }

    public void setKneeIntRotR(String kneeIntRotR) {
        this.kneeIntRotR = kneeIntRotR;
    }

    public void setKneeExtR(String kneeExtR) {
        this.kneeExtR = kneeExtR;
    }

    public void setKneeExtL(String kneeExtL) {
        this.kneeExtL = kneeExtL;
    }

    public void setKneeExtRSd(String kneeExtRSd) {
        this.kneeExtRSd = kneeExtRSd;
    }

    public void setKneeExtLSd(String kneeExtLSd) {
        this.kneeExtLSd = kneeExtLSd;
    }

    public void setKneeFlexR(String kneeFlexR) {
        this.kneeFlexR = kneeFlexR;
    }

    public void setKneeFlexL(String kneeFlexL) {
        this.kneeFlexL = kneeFlexL;
    }

    public void setKneeFlexRSd(String kneeFlexRSd) {
        this.kneeFlexRSd = kneeFlexRSd;
    }

    public void setKneeFlexLSd(String kneeFlexLSd) {
        this.kneeFlexLSd = kneeFlexLSd;
    }

    public void setAnkleEverR(String ankleEverR) {
        this.ankleEverR = ankleEverR;
    }

    public void setAnkleEverL(String ankleEverL) {
        this.ankleEverL = ankleEverL;
    }

    public void setAnkleEverRSd(String ankleEverRSd) {
        this.ankleEverRSd = ankleEverRSd;
    }

    public void setAnkleEverLSd(String ankleEverLSd) {
        this.ankleEverLSd = ankleEverLSd;
    }

    public void setAnkleInvL(String ankleInvL) {
        this.ankleInvL = ankleInvL;
    }

    public void setAnkleInvR(String ankleInvR) {
        this.ankleInvR = ankleInvR;
    }

    public void setAnkleInvLSd(String ankleInvLSd) {
        this.ankleInvLSd = ankleInvLSd;
    }

    public void setAnkleInvRSD(String ankleInvRSD) {
        this.ankleInvRSD = ankleInvRSD;
    }

    public void setFfAbaddLSd(String ffAbaddLSd) {
        this.ffAbaddLSd = ffAbaddLSd;
    }

    public void setFfAbaddRSd(String ffAbaddRSd) {
        ffAbaddRSd = ffAbaddRSd;
    }

    public void setFfAbaddL(String ffAbaddL) {
        this.ffAbaddL = ffAbaddL;
    }

    public void setFfAbaddR(String ffAbaddR) {
        this.ffAbaddR = ffAbaddR;
    }

    public void setLegLengthR(String legLengthR) {
        this.legLengthR = legLengthR;
    }

    public void setLegLengthL(String legLengthL) {
        this.legLengthL = legLengthL;
    }

    public void setqAngleR(String qAngleR) {
        this.qAngleR = qAngleR;
    }

    public void setqAnkleL(String qAnkleL) {
        this.qAnkleL = qAnkleL;
    }

    public void setBilateralPopR(String bilateralPopR) {
        this.bilateralPopR = bilateralPopR;
    }

    public void setBilateralPopL(String bilateralPopL) {
        this.bilateralPopL = bilateralPopL;
    }

    public void setBilateralPopRSd(String bilateralPopRSd) {
        this.bilateralPopRSd = bilateralPopRSd;
    }

    public void setBilaterPopLSd(String bilaterPopLSd) {
        this.bilaterPopLSd = bilaterPopLSd;
    }
}

package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "temporal")
public class ITemporalModel {
    @Id
    @GeneratedValue
    @Column(name = "temp_Id")
    private Integer tempId;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Double value;
    @Column(name = "normal")
    private String normal;
    @Column(name = "interp")
    private String interp;

    public enum interptationValues{
        HIGH, LOW
    }
//    @Column(name = "tempStepLengthR")
//    private String tempStepLengthR;
//    @Column(name = "tempStepLengthL")
//    private String tempStepLengthL;
//    @Column(name = "tempStrideLengthR")
//    private String tempStrideLengthR;
//    @Column(name = "tempStrideLengthL")
//    private String tempStrideLengthL;
//    @Column(name = "tempForwVelR")
//    private String tempForwVelR;
//    @Column(name = "tempForwVelL")
//    private String tempForwVelL;
//    @Column(name = "tempCadence")
//    private String tempCadence;
//    @Column(name = "tempTotSupportTimeR")
//    private String tempTotSupportTimeR;
//    @Column(name = "tempTptSupportTimeL")
//    private String tempTptSupportTimeL;
//    @Column(name = "tempStepWidthR")
//    private String tempStepWidthR;
//    @Column(name = "tempStepWithL")
//    private String tempStepWithL;
//    @Column(name = "tempVelocity")
//    private String tempVelocity;
//    @Column(name = "tempStepLengthHeightR")
//    private String tempStepLengthHeightR;
//    @Column(name = "tempStepLengthHeightL")
//    private String tempStepLengthHeightL;
//    @Column(name = "gaitDevIndexR")
//    private String gaitDevIndexRl;
//    @Column(name = "gaitDevIndexL")
//    private String gaitDevIndexL;
//    @Column(name = "gaitProfScore")
//    private String gaitProfScore;
//    @Column(name = "tempStepLengthR_interp")
//    private String tempStepLengthR_interp;
//    @Column(name = "tempStepLengthL_interp")
//    private String tempStepLengthL_interp;
//    @Column(name = "tempStrideLengthR_interp")
//    private String tempStrideLengthR_interp;
//    @Column(name = "tempStrideLengthL_interp")
//    private String tempStrideLengthL_interp;
//    @Column(name = "tempForwVelR_interp")
//    private String tempForwVelR_interp;
//    @Column(name = "tempForwVelL_interp")
//    private String tempForwVelL_interp;
//    @Column(name = "tempCadence_interp")
//    private String tempCadence_interp;
//    @Column(name = "tempTotSupportTimeR_interp")
//    private String tempTotSupportTimeR_interp;
//    @Column(name = "tempTptSupportTimeL_interp")
//    private String tempTptSupportTimeL_interp;
//    @Column(name = "tempStepWidthR_interp")
//    private String tempStepWidthR_interp;
//    @Column(name = "tempStepWithL_interp")
//    private String tempStepWithL_interp;
//    @Column(name = "tempVelocity_interp")
//    private String tempVelocity_interp;
//    @Column(name = "tempStepLengthHeightR_interp")
//    private String tempStepLengthHeightR_interp;
//    @Column(name = "tempStepLengthHeightL_interp")
//    private String tempStepLengthHeightL_interp;

}

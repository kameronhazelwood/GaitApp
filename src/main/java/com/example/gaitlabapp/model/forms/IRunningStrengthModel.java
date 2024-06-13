package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@Entity
@NoArgsConstructor
@Table(name = "RunningStrength")
public class IRunningStrengthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "runningStrengthId")
    private Integer runningStrengthId;
    @Column(name = "hipExt")
    private String hipExt;
    @Column(name = "hipExtInterp")
    private String hipExtInterp;
    @Column(name = "hipExtRot")
    private String hipExtRot;
    @Column(name = "hipExtRotInterp")
    private String hipExtRotInterp;
    @Column(name = "hipAbd")
    private String hipAbd;
    @Column(name = "hipAbdInterp")
    private String hipAbdInterp;
    @Column(name = "kneeExt")
    private String kneeExt;
    @Column(name = "kneeExtInterp")
    private String kneeExtInterp;
    @Column(name = "hipExt2")
    private String hipExt2;
    @Column(name = "hipExt3")
    private String hipExt3;
    @Column(name = "hipExtRot2")
    private String hipExtRot2;
    @Column(name = "hipExtRot3")
    private String hipExtRot3;
    @Column(name = "hipAbd2")
    private String hipAbd2;
    @Column(name = "hipAbd3")
    private String hipAbd3;
    @Column(name = "kneeExt2")
    private String kneeExt2;
    @Column(name = "kneeExt3")
    private String kneeExt3;
    @Column(name = "kneeFlex2")
    private String kneeFlex2;
    @Column(name = "kneeFlex3")
    private String kneeFlex3;
}

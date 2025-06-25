package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
@Entity
@Table(name = "pelvisOrientation")
public class IPelvisOrientationModel {
    @Id
    @GeneratedValue
    @Column(name = "pelvisOreinId")
    private String pelvisOreinId;
    @Column(name = "pelvicOblMaxR")
    private String pelvicOblMaxR;
    @Column(name = "pelvicOblMaxL")
    private String pelvicOblMaxL;
    @Column(name = "antPelvicTiltMaxR")
    private String antPelvicTiltMaxR;
    @Column(name = "antPelvicTiltMaxL")
    private String antPelvicTiltMaxL;
    @Column(name = "pelvicRotFCR")
    private String pelvicRotFCR;
    @Column(name = "pelvicRotFCL")
    private String pelvicRotFCL;
    @Column(name = "pelvicRotMaxR")
    private String pelvicRotMaxR;
    @Column(name = "pelvicRotMaxL")
    private String pelvicRotMaxL;
    @Column(name = "pelvicRotMinR")
    private String pelvicRotMinR;
    @Column(name = "pelvicRotMinL")
    private String pelvicRotMinL;
    @Column(name = "pelvicOblMaxR_interp")
    private String pelvicOblMaxR_interp;
    @Column(name = "pelvicOblMaxL_interp")
    private String pelvicOblMaxL_interp;
    @Column(name = "antPelvicTiltMaxR_interp")
    private String antPelvicTiltMaxR_interp;
    @Column(name = "antPelvicTiltMaxL_interp")
    private String antPelvicTiltMaxL_interp;
    @Column(name = "pelvicRotFCR_interp")
    private String pelvicRotFCR_interp;
    @Column(name = "pelvicRotFCL_interp")
    private String pelvicRotFCL_interp;
    @Column(name = "pelvicRotMaxR_interp")
    private String pelvicRotMaxR_interp;
    @Column(name = "pelvicRotMaxL_interp")
    private String pelvicRotMaxL_interp;
    @Column(name = "pelvicRotMinR_interp")
    private String pelvicRotMinR_interp;
    @Column(name = "pelvicRotMinL_interp")
    private String pelvicRotMinL_interp;



















}

package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessorOrder;

@Getter
@Setter
@Data
@Entity
@Table(name = "kneeJointAngles")
public class IKneeJointAnglesModel {
    @Id
    @GeneratedValue
    @Column(name = "kneeJointid")
    private Integer kneeJointid;
    @Column(name = "tibTorsionMaxR")
    private String tibTorsionMaxR;
    @Column(name = "tibTorsionMaxL")
    private String tibTorsionMaxL;
    @Column(name = "kneeVarValgusR")
    private String kneeVarValgusR;
    @Column(name = "kneeVarValgusL")
    private String kneeVarValgusL;
    @Column(name = "kneeFlexFCR")
    private String kneeFlexFCR;
    @Column(name ="kneeFlexFCL")
    private String kneeFlexFCL;
    @Column(name = "kneeFlexMaxR")
    private String kneeFlexMaxR;
    @Column(name = "kneeFlexMaxL")
    private String kneeFlexMaxL;
    @Column(name = "kneeMaxExtR")
    private String kneeMaxExtR;
    @Column(name = "kneeMaxExtL")
    private String kneeMaxExtL;
    @Column(name = "kneeFlexMaxSwingR")
    private String kneeFlexMaxSwingR;
    @Column(name = "kneeFlexMaxSwingL")
    private String kneeFlexMaxSwingL;
    @Column(name = "kneeFlexMaxSwingTimeR")
    private String kneeFlexMaxSwingTimeR;
    @Column(name = "kneeFlexMaxSwingTimeL")
    private String kneeFlexMaxSwingTimeL;
    @Column(name = "tibTorsionMaxR_interp")
    private String tibTorsionMaxR_interp;
    @Column(name = "tibTorsionMaxL_interp")
    private String tibTorsionMaxL_interp;
    @Column(name = "kneeVarValgusR_interp")
    private String kneeVarValgusR_interp;
    @Column(name = "kneeVarValgusL_interp")
    private String kneeVarValgusL_interp;
    @Column(name = "kneeFlexFCR_interp")
    private String kneeFlexFCR_interp;
    @Column(name = "kneeFlexFCL_interp")
    private String kneeFlexFCL_interp;
    @Column(name = "kneeFlexMaxR_interp")
    private String kneeFlexMaxR_interp;
    @Column(name ="kneeFlexMaxL_interp")
    private String kneeFlexMaxL_interp;
    @Column(name = "kneeMaxExtR_interp")
    private String kneeMaxExtR_interp;
    @Column(name = "kneeMaxExtL_interp")
    private String kneeMaxExtL_interp;
    @Column(name = "kneeFlexMaxSwingR_interp")
    private String kneeFlexMaxSwingR_interp;
    @Column(name = "kneeFlexMaxSwingL_interp")
    private String kneeFlexMaxSwingL_interp;
    @Column(name = "kneeFlexMaxSwingTimeR_interp")
    private String kneeFlexMaxSwingTimeR_interp;
    @Column(name ="kneeFlexMaxSwingTimeL_interp")
    private String kneeFlexMaxSwingTimeL_interp;





}

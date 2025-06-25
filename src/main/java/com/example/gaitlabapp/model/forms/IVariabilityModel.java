package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
@Table(name = "variability")
public class IVariabilityModel {
    @Id
    @GeneratedValue
    @Column(name = "varId")
    private Integer varId;
    @Column(name = "meanDisCM")
    private String meanDisCM;
    @Column(name = "meanVarAPR")
    private String meanVarAPR;
    @Column(name = "meanVarAPL")
    private String meanVarAPL;
    @Column(name = "meanVarMLR")
    private String meanVarMLR;
    @Column(name = "meanVarMLL")
    private String meanVarMLL;
    @Column(name = "meanVarJointMotion")
    private String meanVarJointMotion;
    @Column(name = "ankleFlexVarR")
    private String ankleFlexVarR;
    @Column(name = "ankleFlexVarL")
    private String ankleFlexVarL;
    @Column(name = "meanDisCM_interp")
    private String meanDisCM_interp;
    @Column(name = "meanVarAPR_interp")
    private String meanVarAPR_interp;
    @Column(name = "meanVarAPL_interp")
    private String meanVarAPL_interp;
    @Column(name = "meanVarMLR_interp")
    private String meanVarMLR_interp;
    @Column(name = "meanVarMLL_interp")
    private String meanVarMLL_interp;
    @Column(name = "meanVarJointMotion_interp")
    private String meanVarJointMotion_interp;
    @Column(name = "ankleFlexVarR_interp")
    private String ankleFlexVarR_interp;
    @Column(name = "ankleFlexVarL_interp")
    private String ankleFlexVarL_interp;


}

package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "arm_joint_angles")
public class IArmJointAnglesModel {
    @Id
    @GeneratedValue
    @Column(name = "arm_Joint_Id")
    private Integer armJointId;
    @Column(name = "value")
    @Setter
    private Double value;
    @Column(name = "interp")
    @Setter
    private String interp;
    @Column(name = "normal")
    @Setter
    private String normal;
    @Column(name = "name")
    @Setter
    private String name;


    public IArmJointAnglesModel(Integer armJointId, Double value, String interp, String normal, String name) {
        this.armJointId = armJointId;
        this.value = value;
        this.interp = interp;
        this.normal = normal;
        this.name = name;
    }

    public IArmJointAnglesModel(String s, Double s1, String s2) {
        this.setName(s);
        this.name = s;
        this.value = s1;
        this.interp = s2;
    }


//    @Column(name = "elbowFlexFCR")
//    private String elbowFlexFCR;
//    @Column(name = "elbowFlexFCL")
//    private String elbowFlexFCL;
//    @Column(name = "elbowFlexMaxR")
//    private String elbowFlexMaxR;
//    @Column(name = "elbowFlexMaxL")
//    private String elbowFlexMaxL;
//    @Column(name = "shoulderADDFCR")
//    private String shoulderADDFCR;
//    @Column(name = "shoulderADDFCL")
//    private String shoulderADDFCL;
//    @Column(name = "shoulderFlexFCR")
//    private String shoulderFlexFCR;
//    @Column(name = "shoulderFlexFCL")
//    private String shoulderFlexFCL;
//    @Column(name = "elbowFlexFCR_interp")
//    private String elbowFlexFCR_interp;
//    @Column(name = "elbowFlexFCL_interp")
//    private String elbowFlexFCL_interp;
//    @Column(name = "elbowFlexMaxR_interp")
//    private String elbowFlexMaxR_interp;
//    @Column(name = "elbowFlexMaxL_interp")
//    private String elbowFlexMaxL_interp;
//    @Column(name = "shoulderADDFCR_interp")
//    private String shoulderADDFCR_interp;
//    @Column(name = "shoulderADDFCL_interp")
//    private String shoulderADDFCL_interp;
//    @Column(name = "shoulderFlexFCR_interp")
//    private String shoulderFlexFCR_interp;
//    @Column(name = "shoulderFlexFCL_interp")
//    private String shoulderFlexFCL_interp;
}

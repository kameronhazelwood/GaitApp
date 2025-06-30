package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Data
@Table(name = "hip_Joint")
public class IHipJointModel {
    @Id
    @GeneratedValue
    @Column(name = "hip_Joint_Id")
    private Integer hipJointId;
    @Column(name = "name")
    private String name;
    @Column(name = "interp")
    private String interp;
    @Column(name = "value")
    private Double values;
    @Column(name = "normals")
    private String normals;
//    @Column(name = "hipRotFootContactR")
//    private String hipRotFootContactR;
//    @Column(name = "hipRotFootContactL")
//    private String hipRotFootContactL;
//    @Column(name = "hipRotTOR")
//    private String hipRotTOR;
//    @Column(name = "hipRotTOL")
//    private String hipRotTOL;
//    @Column(name = "hipMaxAngleSupportR")
//    private String hipMaxAngleSupportR;
//    @Column(name = "hipMaxAngleSupportL")
//    private String hipMaxAngleSupportL;
//    @Column(name = "hipFlexFCR")
//    private String hipFlexFCR;
//    @Column(name ="hipFlexFCL")
//    private String hipFlexFCL;
//    @Column(name ="hipFlexMaxStanceR")
//    private String hipFlexMaxStanceR;
//    @Column(name ="hipFlexMaxStanceL")
//    private String hipFlexMaxStanceL;
//    @Column(name = "hipExtMaxR")
//    private String hipExtMaxR;
//    @Column(name = "hipExtMaxL")
//    private String hipExtMaxL;
//    @Column(name = "hipRotFootContactR_interp")
//    private String hipRotFootContactR_interp;
//    @Column(name = "hipRotFootContactL_interp")
//    private String hipRotFootContactL_interp;
//    @Column(name = "hipRotTOR_interp")
//    private String hipRotTOR_interp;
//    @Column(name = "hipRotTOL_interp")
//    private String hipRotTOL_interp;
//    @Column(name = "hipMaxAngleSupportR_interp")
//    private String hipMaxAngleSupportR_interp;
//    @Column(name = "hipMaxAngleSupportL_interp")
//    private String hipMaxAngleSupportL_interp;
//    @Column(name = "hipFlexFCR_interp")
//    private  String hipFlexFCR_interp;
//    @Column(name = "hipFlexFCL_interp")
//    private String hipFlexFCL_interp;
//    @Column(name = "hipFlexMaxStanceR_interp")
//    private String hipFlexMaxStanceR_interp;
//    @Column(name = "hipFlexMaxStanceL_interp")
//    private String hipFlexMaxStanceL_interp;
//    @Column(name ="hipExtMaxR_interp")
//    private String hipExtMaxR_interp;
//    @Column(name ="hipExtMaxL_interp")
//    private String hipExtMaxL_interp;

}

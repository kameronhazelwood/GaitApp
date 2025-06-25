package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "ankleJointAngles")
public class IAnkleJointAnglesModel {
    @Id
    @GeneratedValue
    @Column(name = "ankleJointId")
    private Integer ankleJointId;
    @Column(name = "footTibiaRotR")
    private String footTibiaRotR;
    @Column(name = "footTibiaRotL")
    private String footTibiaRotL;
    @Column(name = "ankleDorsiFCR")
    private String ankleDorsiFCR;
    @Column(name = "ankleDorsiFCL")
    private String ankleDorsiFCL;
    @Column(name ="ankleDorsiMaxR")
    private String ankleDorsiMaxR;
    @Column(name = "ankleDorsiMaxL")
    private String ankleDorsiMaxL;
    @Column(name = "ankleDorsiTimeMaxR")
    private String ankleDorsiTimeMaxR;
    @Column(name = "ankleDorsiTimeMaxL")
    private String ankleDorsiTimeMaxL;
    @Column(name = "footTibiaRotR_interp")
    private String footTibiaRotR_interp;
    @Column(name = "footTibiaRotL_interp")
    private String footTibiaRotL_interp;
    @Column(name = "ankleDorsiFCR_interp")
    private String ankleDorsiFCR_interp;
    @Column(name = "ankleDorsiFCL_interp")
    private String ankleDorsiFCL_interp;
    @Column(name = "ankleDorsiMaxR_interp")
    private String ankleDorsiMaxR_interp;
    @Column(name = "ankleDorsiTimeMaxL_interp")
    private String ankleDorsiTimeMaxL_interp;
    @Column(name = "ankleDorsiTimeMaxR_interp")
    private String ankleDorsiTimeMaxR_interp;
    @Column(name = "ankleDorsiMaxL_interp")
    private String ankleDorsiMaxL_interp;

}

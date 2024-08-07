package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "flexibility")
public class IFlexibilityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flex_Id")
    private Integer flexId;
    @Column(name = "ober")
    private String ober;
    @Column(name = "ober_interp")
    private String oberInterp;
    @Column(name = "thomas")
    private String thomas;
    @Column(name = "thomas_interp")
    private String thomasInterp;
    @Column(name = "popliteal_angle")
    private String poplitealAngle;
    @Column(name = "popliteal_angle_interp")
    private String poplitealAngleInterp;
    @Column(name = "ankle_dorsi_knee_ext")
    private String ankleDorsiKneeExt;
    @Column(name = "ankle_dorsi_knee_ext_interp")
    private String ankleDorsiKneeExtInterp;

}

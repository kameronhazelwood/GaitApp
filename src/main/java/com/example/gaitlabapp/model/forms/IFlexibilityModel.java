package com.example.gaitlabapp.model.forms;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;



@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "Flexibility")
public class IFlexibilityModel {
    @jakarta.persistence.Id
    @GeneratedValue
    @Column(name = "flexId")
    private Integer flexId;
    @Column(name = "ober")
    private String ober;
    @Column(name = "oberInterp")
    private String oberInterp;
    @Column(name = "thomas")
    private String thomas;
    @Column(name = "thomasInterp")
    private String thomasInterp;
    @Column(name = "poplitealAngle")
    private String poplitealAngle;
    @Column(name = "poplitealAngleInterp")
    private String poplitealAngleInterp;
    @Column(name = "ankleDorsiKneeExt")
    private String ankleDorsiKneeExt;
    @Column(name = "ankleDorsiKneeExtInterp")
    private String ankleDorsiKneeExtInterp;

}

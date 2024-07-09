package com.example.gaitlabapp.model.forms.comparisons;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "running_strength_comparison")
public class IRunningStrengthComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "running_strength_comp_id")
    private Integer runningStrengthCompId;
    @Column(name = "hip_ext")
    private String hipExt;
    @Column(name = "hip_ext_sd")
    private String hipExtSd;
    @Column(name = "hip_ext_rot")
    private String hipExtRot;
    @Column(name = "hip_ext_rot_sd")
    private String hipExtRotSd;
    @Column(name = "hip_abd")
    private String hipAbd;
    @Column(name = "hip_abd_sd")
    private String hipAbdSd;
    @Column(name = "knee_ext")
    private String kneeExt;
    @Column(name = "Knee_ext_sd")
    private String kneeExtSd;


    public IRunningStrengthComparison(Integer runningStrengthCompId, String hipExt, String hipExtSd, String hipExtRot, String hipExtRotSd, String hipAbd, String hipAbdSd, String kneeExt, String kneeExtSd) {
        this.runningStrengthCompId = runningStrengthCompId;
        this.hipExt = hipExt;
        this.hipExtSd = hipExtSd;
        this.hipExtRot = hipExtRot;
        this.hipExtRotSd = hipExtRotSd;
        this.hipAbd = hipAbd;
        this.hipAbdSd = hipAbdSd;
        this.kneeExt = kneeExt;
        this.kneeExtSd = kneeExtSd;
    }

}

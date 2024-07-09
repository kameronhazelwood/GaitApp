package com.example.gaitlabapp.model.forms.comparisons;

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
@Table(name = "flexibility_comparison")
public class IFlexibilityComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flex_comp_id")
    private Integer flexCompId;
    @Column(name = "ober")
    private String ober;
    @Column(name = "ober_sd")
    private String oberSd;
    @Column(name = "thomas")
    private String thomas;
    @Column(name = "thomas_sd")
    private String thomasSd;
    @Column(name = "popliteal_angle")
    private String poplitealAngle;
    @Column(name = "popliteal_angle_sd")
    private String poplitealAngleSd;
    @Column(name = "ankle_dorsi_knee_ext")
    private String ankleDorsiKneeExt;
    @Column(name = "ankle_dorsi_knee_ext_sd")
    private String ankleDorsiKneeExtSd;


}

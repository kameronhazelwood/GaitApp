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
@Table(name = "FlexibilityComparison")
public class IFlexibilityComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "flexCompId")
    private Integer flexCompId;
    @Column(name = "ober")
    private String ober;
    @Column(name = "oberSd")
    private String oberSd;
    @Column(name = "thomas")
    private String thomas;
    @Column(name = "thomasSd")
    private String thomasSd;
    @Column(name = "poplitealAngle")
    private String poplitealAngle;
    @Column(name = "poplitealAngleSd")
    private String poplitealAngleSd;
    @Column(name = "ankleDorsiKneeExt")
    private String ankleDorsiKneeExt;
    @Column(name = "ankleDorsiKneeExtSd")
    private String ankleDorsiKneeExtSd;


}

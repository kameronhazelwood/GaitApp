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
@Table(name = "RunningStrengthComparison")
public class IRunningStrengthComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "runningStrengthCompId")
    private Integer runningStrengthCompId;
    @Column(name = "hipExt")
    private String hipExt;
    @Column(name = "hipExtSd")
    private String hipExtSd;
    @Column(name = "hipExtRot")
    private String hipExtRot;
    @Column(name = "hipExtRotSd")
    private String hipExtRotSd;
    @Column(name = "hipAbd")
    private String hipAbd;
    @Column(name = "hipAbdSd")
    private String hipAbdSd;
    @Column(name = "kneeExt")
    private String kneeExt;
    @Column(name = "KneeExtSd")
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

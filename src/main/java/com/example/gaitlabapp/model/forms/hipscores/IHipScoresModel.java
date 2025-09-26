package com.example.gaitlabapp.model.forms.hipscores;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "hip_scores")
public class IHipScoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hip_score_id")
    private Integer hipScoreId;
    @Column(name = "activity_score")
    private String activityScore;
    @Column(name = "pain")
    private String pain;
    @Column(name = "stiffness")
    private String stiffness;
    @Column(name = "physical_function")
    private String physicalFunction;
    @Column(name = "harris_hip_score")
    private String harrisHipScore;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IHipScoresModel(String harrisHipScore, Integer hipScoreId, String activityScore, String pain, String stiffness, String physicalFunction) {
//        this.harrisHipScore = harrisHipScore;
//        this.hipScoreId = hipScoreId;
//        this.activityScore = activityScore;
//        this.pain = pain;
//        this.stiffness = stiffness;
//        this.physicalFunction = physicalFunction;
//    }

}

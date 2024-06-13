package com.example.gaitlabapp.model.forms.hipscores;

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
@Table(name = "HipScores")
public class IHipScoresModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hipScoreId")
    private Integer hipScoreId;
    @Column(name = "activityScore")
    private String activityScore;
    @Column(name = "pain")
    private String pain;
    @Column(name = "stiffness")
    private String stiffness;
    @Column(name = "physicalFunction")
    private String physicalFunction;
    @Column(name = "harrisHipScore")
    private String harrisHipScore;

    public IHipScoresModel(String harrisHipScore, Integer hipScoreId, String activityScore, String pain, String stiffness, String physicalFunction) {
        this.harrisHipScore = harrisHipScore;
        this.hipScoreId = hipScoreId;
        this.activityScore = activityScore;
        this.pain = pain;
        this.stiffness = stiffness;
        this.physicalFunction = physicalFunction;
    }

}

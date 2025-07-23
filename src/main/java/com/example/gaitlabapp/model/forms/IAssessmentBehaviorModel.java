package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@Table(name = "assessment_behavior")
public class IAssessmentBehaviorModel {
    @GeneratedValue
    @Id
    @Column(name = "assessment_behavior_id")
    private Integer assessment_behavior_id;
    @Column(name = "assessment_behavior_normal")
    private Boolean assessment_behavior_normal;
    @Column(name = "assessment_behavior_right")
    private Boolean assessment_behavior_right;
    @Column(name = "assessment_behavior_left")
    private Boolean assessment_behavior_left;
    @Column(name = "assessment_behavior_both")
    private Boolean assessment_behavior_both;
    @Column(name = "assessment_behavior_comments")
    private String assessment_behavior_comments;
    @Column(name = "assessment_behavior_condition")
    private String assessment_behavior_condition;

    public IAssessmentBehaviorModel(Integer assessment_behavior_id, Boolean assessment_behavior_normal, Boolean assessment_behavior_right, Boolean assessment_behavior_left, Boolean assessment_behavior_both, String assessment_behavior_comments, String assessment_behavior_condition) {
        this.assessment_behavior_id = assessment_behavior_id;
        this.assessment_behavior_normal = assessment_behavior_normal;
        this.assessment_behavior_right = assessment_behavior_right;
        this.assessment_behavior_left = assessment_behavior_left;
        this.assessment_behavior_both = assessment_behavior_both;
        this.assessment_behavior_comments = assessment_behavior_comments;
        this.assessment_behavior_condition = assessment_behavior_condition;
    }

    public static enum Values{
        N,
        L,
        R,
        B;
    }

}

package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@Table(name = "assessment_swing")
public class IAssessmentSwingModel {
    @GeneratedValue
    @Id
    @Column(name = "assessment_swing_id")
    private Integer assessment_swing_id;
    @Column(name = "assessment_swing_normal")
    private Boolean assessment_swing_normal;
    @Column(name = "assessment_swing_right")
    private Boolean assessment_swing_right;
    @Column(name = "assessment_swing_left")
    private Boolean assessment_swing_left;
    @Column(name = "assessment_swing_both")
    private Boolean assessment_swing_both;
    @Column(name = "assessment_swing_comments")
    private String assessment_swing_comments;
    @Column(name = "assessment_swing_condition")
    private String assessment_swing_condition;

    public IAssessmentSwingModel(Integer assessment_swing_id, Boolean assessment_swing_normal, Boolean assessment_swing_right, Boolean assessment_swing_left, Boolean assessment_swing_both, String assessment_swing_comments, String assessment_swing_condition) {
        this.assessment_swing_id = assessment_swing_id;
        this.assessment_swing_normal = assessment_swing_normal;
        this.assessment_swing_right = assessment_swing_right;
        this.assessment_swing_left = assessment_swing_left;
        this.assessment_swing_both = assessment_swing_both;
        this.assessment_swing_comments = assessment_swing_comments;
        this.assessment_swing_condition = assessment_swing_condition;
    }

    public static enum Values{
        N,
        L,
        R,
        B;
    }
}

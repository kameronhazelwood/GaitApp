package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@Table(name = "assessment_strength")
public class IAssessmentStrengthModel {
    @GeneratedValue
    @Id
    @Column(name = "assessment_strength_id")
    private Integer assessment_strength_id;
    @Column(name = "assessment_strength_normal")
    private Boolean assessment_strength_normal;
    @Column(name = "assessment_strength_right")
    private Boolean assessment_strength_right;
    @Column(name = "assessment_strength_left")
    private Boolean assessment_strength_left;
    @Column(name = "assessment_strength_both")
    private Boolean assessment_strength_both;
    @Column(name = "assessment_strength_comments")
    private String assessment_strength_comments;
    @Column(name = "assessment_strength_condition")
    private String assessment_strength_condition;

    public IAssessmentStrengthModel(Integer assessment_strength_id, Boolean assessment_strength_normal, Boolean assessment_strength_right, Boolean assessment_strength_left, Boolean assessment_strength_both, String assessment_strength_comments, String assessment_strength_condition) {
        this.assessment_strength_id = assessment_strength_id;
        this.assessment_strength_normal = assessment_strength_normal;
        this.assessment_strength_right = assessment_strength_right;
        this.assessment_strength_left = assessment_strength_left;
        this.assessment_strength_both = assessment_strength_both;
        this.assessment_strength_comments = assessment_strength_comments;
        this.assessment_strength_condition = assessment_strength_condition;
    }

    public static enum Values{
        N,
        L,
        R,
        B;
    }
}

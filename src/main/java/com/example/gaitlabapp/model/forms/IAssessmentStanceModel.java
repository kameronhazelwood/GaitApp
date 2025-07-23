package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@Table(name = "assessment_stance")
public class IAssessmentStanceModel {
    @GeneratedValue
    @Id
    @Column(name = "assessment_stance_id")
    private Integer assessment_stance_id;
    @Column(name = "assessment_stance_normal")
    private Boolean assessment_stance_normal;
    @Column(name = "assessment_stance_right")
    private Boolean assessment_stance_right;
    @Column(name = "assessment_stance_left")
    private Boolean assessment_stance_left;
    @Column(name = "assessment_stance_both")
    private Boolean assessment_stance_both;
    @Column(name = "assessment_stance_condition")
    private String assessment_stance_condition;
    @Column(name = "assessment_stance_comments")
    private String assessment_stance_comments;

    public IAssessmentStanceModel(Integer assessment_stance_id, Boolean assessment_stance_normal, Boolean assessment_stance_right, Boolean assessment_stance_left, Boolean assessment_stance_both, String assessment_stance_condition, String assessment_stance_comments) {
        this.assessment_stance_id = assessment_stance_id;
        this.assessment_stance_normal = assessment_stance_normal;
        this.assessment_stance_right = assessment_stance_right;
        this.assessment_stance_left = assessment_stance_left;
        this.assessment_stance_both = assessment_stance_both;
        this.assessment_stance_condition = assessment_stance_condition;
        this.assessment_stance_comments = assessment_stance_comments;
    }

    public static enum Values{
        N,
        L,
        R,
        B;
    }
}

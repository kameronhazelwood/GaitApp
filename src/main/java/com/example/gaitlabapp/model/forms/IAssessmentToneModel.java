package com.example.gaitlabapp.model.forms;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@Table(name = "assessment_tone")
public class IAssessmentToneModel {
    @GeneratedValue
    @Id
    @Column(name = "assessment_tone_id")
    private Integer assessment_tone_id;
    @Column(name = "assessment_tone_normal")
    private Boolean assessment_tone_normal;
    @Column(name = "assessment_tone_right")
    private Boolean assessment_tone_right;
    @Column(name = "assessment_tone_left")
    private Boolean assessment_tone_left;
    @Column(name = "assessment_tone_both")
    private Boolean assessment_tone_both;
    @Column(name = "assessment_tone_comments")
    private String assessment_tone_comments;
    @Column(name = "assessment_tone_condition")
    private String assessment_tone_condition;

    public IAssessmentToneModel(Integer assessment_tone_id, Boolean assessment_tone_normal, Boolean assessment_tone_right, Boolean assessment_tone_left, Boolean assessment_tone_both, String assessment_tone_comments, String assessment_tone_condition) {
        this.assessment_tone_id = assessment_tone_id;
        this.assessment_tone_normal = assessment_tone_normal;
        this.assessment_tone_right = assessment_tone_right;
        this.assessment_tone_left = assessment_tone_left;
        this.assessment_tone_both = assessment_tone_both;
        this.assessment_tone_comments = assessment_tone_comments;
        this.assessment_tone_condition = assessment_tone_condition;
    }

    public static enum Values{
        N,
        L,
        R,
        B;
    }
}

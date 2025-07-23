package com.example.gaitlabapp.model.forms;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@Table(name = "assessment_movement")
public class IAssessmentMovementModel {
    @Id
    @GeneratedValue
    @Column(name = "assessment_movement_id")
    private Integer assessment_movement_id;
    @Column(name = "assessment_movement_normal")
    private Boolean assessment_movement_normal;
    @Column(name = "assessment_movement_right")
    private Boolean assessment_movement_right;
    @Column(name = "assessment_movement_left")
    private Boolean assessment_movement_left;
    @Column(name = "assessment_movement_both")
    private Boolean assessment_movement_both;
    @Column(name = "assessment_movement_condition")
    private String assessment_movement_condition;
    @Column(name = "assessment_movement_comments")
    private String assessment_movement_comments;

    public IAssessmentMovementModel(Integer assessment_movement_id, Boolean assessment_movement_normal, Boolean assessment_movement_right, Boolean assessment_movement_left, Boolean assessment_movement_both, String assessment_movement_condition, String assessment_movement_comments) {
        this.assessment_movement_id = assessment_movement_id;
        this.assessment_movement_normal = assessment_movement_normal;
        this.assessment_movement_right = assessment_movement_right;
        this.assessment_movement_left = assessment_movement_left;
        this.assessment_movement_both = assessment_movement_both;
        this.assessment_movement_condition = assessment_movement_condition;
        this.assessment_movement_comments = assessment_movement_comments;
    }

    public static enum Values{
        N,
        L,
        R,
        B;
    }
}

package com.example.gaitlabapp.model.forms;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Data
@Getter
@NoArgsConstructor
@Table(name = "assessment_motor")
public class IAssessmentMotorModel {
    @GeneratedValue
    @Id
    @Column(name = "assessment_motor_id")
    private Integer assessment_motor_id;
    @Column(name = "assessment_motor_normal")
    private Boolean assessment_motor_normal;
    @Column(name = "assessment_motor_right")
    private Boolean assessment_motor_right;
    @Column(name = "assessment_motor_left")
    private Boolean assessment_motor_left;
    @Column(name = "assessment_motor_both")
    private Boolean assessment_motor_both;
    @Column(name = "assessment_motor_comments")
    private String assessment_motor_comments;
    @Column(name = "assessment_motor_condition")
    private String assessment_motor_condition;

    public IAssessmentMotorModel(Integer assessment_motor_id, Boolean assessment_motor_normal, Boolean assessment_motor_right, Boolean assessment_motor_left, Boolean assessment_motor_both, String assessment_motor_comments, String assessment_motor_condition) {
        this.assessment_motor_id = assessment_motor_id;
        this.assessment_motor_normal = assessment_motor_normal;
        this.assessment_motor_right = assessment_motor_right;
        this.assessment_motor_left = assessment_motor_left;
        this.assessment_motor_both = assessment_motor_both;
        this.assessment_motor_comments = assessment_motor_comments;
        this.assessment_motor_condition = assessment_motor_condition;
    }

    public static enum Values{
        N,
        L,
        R,
        B;
    }

}

package com.example.gaitlabapp.model.forms.videoAssessment;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "Pelvis")
public class IPelvisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pelvis_Id")
    private Integer pelvisId;
    @Column(name = "left_Rotated_Forward")
    private String leftRotatedForward;
    @Column(name = "right_Rotated_Forward")
    private String rightRotatedForward;
    @Column(name = "left_Side_Down")
    private String leftSideDown;
    @Column(name = "right_Side_Down")
    private String rightSideDown;
    @Column(name = "left_Trendelenburg")
    private String leftTrendelenburg;
    @Column(name = "right_Trendelenburg")
    private String rightTrendelenburg;
    @Column(name = "inc_Anterior_Tilt")
    private String incAnteriorTilt;
    @Column(name = "inc_Posterior_Tilt")
    private String incPosteriorTilt;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IPelvisModel(Integer pelvisId, String leftRotatedForward, String rightRotatedForward, String leftSideDown, String rightSideDown, String leftTrendelenburg, String rightTrendelenburg, String incAnteriorTilt, String incPosteriorTilt) {
//        this.pelvisId = pelvisId;
//        this.leftRotatedForward = leftRotatedForward;
//        this.rightRotatedForward = rightRotatedForward;
//        this.leftSideDown = leftSideDown;
//        this.rightSideDown = rightSideDown;
//        this.leftTrendelenburg = leftTrendelenburg;
//        this.rightTrendelenburg = rightTrendelenburg;
//        this.incAnteriorTilt = incAnteriorTilt;
//        this.incPosteriorTilt = incPosteriorTilt;
//    }

}

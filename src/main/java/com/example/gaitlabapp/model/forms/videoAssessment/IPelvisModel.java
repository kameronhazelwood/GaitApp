package com.example.gaitlabapp.model.forms.videoAssessment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "Pelvis")
public class IPelvisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pelvisId")
    private Integer pelvisId;
    @Column(name = "leftRotatedForward")
    private String leftRotatedForward;
    @Column(name = "rightRotatedForward")
    private String rightRotatedForward;
    @Column(name = "leftSideDown")
    private String leftSideDown;
    @Column(name = "rightSideDown")
    private String rightSideDown;
    @Column(name = "leftTrendelenburg")
    private String leftTrendelenburg;
    @Column(name = "rightTrendelenburg")
    private String rightTrendelenburg;
    @Column(name = "incAnteriorTilt")
    private String incAnteriorTilt;
    @Column(name = "incPosteriorTilt")
    private String incPosteriorTilt;

    public IPelvisModel(Integer pelvisId, String leftRotatedForward, String rightRotatedForward, String leftSideDown, String rightSideDown, String leftTrendelenburg, String rightTrendelenburg, String incAnteriorTilt, String incPosteriorTilt) {
        this.pelvisId = pelvisId;
        this.leftRotatedForward = leftRotatedForward;
        this.rightRotatedForward = rightRotatedForward;
        this.leftSideDown = leftSideDown;
        this.rightSideDown = rightSideDown;
        this.leftTrendelenburg = leftTrendelenburg;
        this.rightTrendelenburg = rightTrendelenburg;
        this.incAnteriorTilt = incAnteriorTilt;
        this.incPosteriorTilt = incPosteriorTilt;
    }

}

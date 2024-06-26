package com.example.gaitlabapp.model.forms.videoAssessment;

import lombok.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Data
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Hip")
public class IHipModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hipId")
    private Integer hipId;
    @Column(name = "internallyRotated")
    private String internallyRotated;
    @Column(name = "extRotated")
    private String extRotated;
    @Column(name = "incFlexion")
    private String incFlexion;
    @Column(name = "decFlexion")
    private String decFlexion;
    @Column(name = "hipAdbucted")
    private String hipAdbucted;
    @Column(name = "hipAdducted")
    private String hipAdducted;
    @Column(name = "decRangeMotion")
    private String decRangeMotion;
    @Column(name = "circumduction")
    private String circumduction;

    public IHipModel(Integer hipId, String internallyRotated, String extRotated, String incFlexion, String decFlexion, String hipAdbucted, String hipAdducted, String decRangeMotion, String circumduction) {
        this.hipId = hipId;
        this.internallyRotated = internallyRotated;
        this.extRotated = extRotated;
        this.incFlexion = incFlexion;
        this.decFlexion = decFlexion;
        this.hipAdbucted = hipAdbucted;
        this.hipAdducted = hipAdducted;
        this.decRangeMotion = decRangeMotion;
        this.circumduction = circumduction;
    }

}

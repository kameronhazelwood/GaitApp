package com.example.gaitlabapp.model.forms.videoAssessment;

import lombok.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Setter
@Getter
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

    public Integer getHipId() {
        return hipId;
    }

    public void setHipId(Integer hipId) {
        this.hipId = hipId;
    }

    public String getInternallyRotated() {
        return internallyRotated;
    }

    public void setInternallyRotated(String internallyRotated) {
        this.internallyRotated = internallyRotated;
    }

    public String getExtRotated() {
        return extRotated;
    }

    public void setExtRotated(String extRotated) {
        this.extRotated = extRotated;
    }

    public String getIncFlexion() {
        return incFlexion;
    }

    public void setIncFlexion(String incFlexion) {
        this.incFlexion = incFlexion;
    }

    public String getDecFlexion() {
        return decFlexion;
    }

    public void setDecFlexion(String decFlexion) {
        this.decFlexion = decFlexion;
    }

    public String getHipAdbucted() {
        return hipAdbucted;
    }

    public void setHipAdbucted(String hipAdbucted) {
        this.hipAdbucted = hipAdbucted;
    }

    public String getHipAdducted() {
        return hipAdducted;
    }

    public void setHipAdducted(String hipAdducted) {
        this.hipAdducted = hipAdducted;
    }

    public String getDecRangeMotion() {
        return decRangeMotion;
    }

    public void setDecRangeMotion(String decRangeMotion) {
        this.decRangeMotion = decRangeMotion;
    }

    public String getCircumduction() {
        return circumduction;
    }

    public void setCircumduction(String circumduction) {
        this.circumduction = circumduction;
    }
}

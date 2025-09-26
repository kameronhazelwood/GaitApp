package com.example.gaitlabapp.model.forms.videoAssessment;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;


@Getter
@Data
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Hip")
public class IHipModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hip_Id")
    private Integer hipId;
    @Column(name = "internally_Rotated")
    private String internallyRotated;
    @Column(name = "ext_Rotated")
    private String extRotated;
    @Column(name = "inc_Flexion")
    private String incFlexion;
    @Column(name = "dec_Flexion")
    private String decFlexion;
    @Column(name = "hip_Adbucted")
    private String hipAdbucted;
    @Column(name = "hip_Adducted")
    private String hipAdducted;
    @Column(name = "dec_Range_Motion")
    private String decRangeMotion;
    @Column(name = "circumduction")
    private String circumduction;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_ID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IHipModel(Integer hipId, String internallyRotated, String extRotated, String incFlexion, String decFlexion, String hipAdbucted, String hipAdducted, String decRangeMotion, String circumduction) {
//        this.hipId = hipId;
//        this.internallyRotated = internallyRotated;
//        this.extRotated = extRotated;
//        this.incFlexion = incFlexion;
//        this.decFlexion = decFlexion;
//        this.hipAdbucted = hipAdbucted;
//        this.hipAdducted = hipAdducted;
//        this.decRangeMotion = decRangeMotion;
//        this.circumduction = circumduction;
//    }

}

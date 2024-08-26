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
@Data
@NoArgsConstructor
@Entity
@Table(name = "Knee")
public class IKneeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "knee_Id")
    private Integer kneeId;
    @Column(name = "knee_Valgus")
    private String kneeValgus;
    @Column(name = "knee_Varus")
    private String kneeVarus;
    @Column(name = "inc_Knee_Flexion_Contact")
    private String incKneeFlexionContact;
    @Column(name = "dec_Knee_Flexion_Contact")
    private String decKneeFlexionContact;
    @Column(name = "back_Kneeing")
    private String backKneeing;
    @Column(name = "dec_Knee_Flex_Swing")
    private String decKneeFlexSwing;
    @Column(name = "internal_Tibial_Torsoin")
    private String internalTibialTorsoin;
    @Column(name = "ext_Tibial_Torsoin")
    private String extTibialTorsoin;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IKneeModel(String kneeValgus, Integer kneeId, String kneeVarus, String incKneeFlexionContact, String decKneeFlexionContact, String backKneeing, String decKneeFlexSwing, String internalTibialTorsoin, String extTibialTorsoin) {
//        this.kneeValgus = kneeValgus;
//        this.kneeId = kneeId;
//        this.kneeVarus = kneeVarus;
//        this.incKneeFlexionContact = incKneeFlexionContact;
//        this.decKneeFlexionContact = decKneeFlexionContact;
//        this.backKneeing = backKneeing;
//        this.decKneeFlexSwing = decKneeFlexSwing;
//        this.internalTibialTorsoin = internalTibialTorsoin;
//        this.extTibialTorsoin = extTibialTorsoin;
//    }

}

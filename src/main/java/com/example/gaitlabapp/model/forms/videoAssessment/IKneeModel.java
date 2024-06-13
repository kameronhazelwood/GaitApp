package com.example.gaitlabapp.model.forms.videoAssessment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "Knee")
public class IKneeModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kneeId")
    private Integer kneeId;
    @Column(name = "kneeValgus")
    private String kneeValgus;
    @Column(name = "kneeVarus")
    private String kneeVarus;
    @Column(name = "incKneeFlexionContact")
    private String incKneeFlexionContact;
    @Column(name = "decKneeFlexionContact")
    private String decKneeFlexionContact;
    @Column(name = "backKneeing")
    private String backKneeing;
    @Column(name = "decKneeFlexSwing")
    private String decKneeFlexSwing;
    @Column(name = "internalTibialTorsoin")
    private String internalTibialTorsoin;
    @Column(name = "extTibialTorsoin")
    private String extTibialTorsoin;

    public IKneeModel(String kneeValgus, Integer kneeId, String kneeVarus, String incKneeFlexionContact, String decKneeFlexionContact, String backKneeing, String decKneeFlexSwing, String internalTibialTorsoin, String extTibialTorsoin) {
        this.kneeValgus = kneeValgus;
        this.kneeId = kneeId;
        this.kneeVarus = kneeVarus;
        this.incKneeFlexionContact = incKneeFlexionContact;
        this.decKneeFlexionContact = decKneeFlexionContact;
        this.backKneeing = backKneeing;
        this.decKneeFlexSwing = decKneeFlexSwing;
        this.internalTibialTorsoin = internalTibialTorsoin;
        this.extTibialTorsoin = extTibialTorsoin;
    }

}

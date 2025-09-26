package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;
@Getter
@Data
@Setter
@NoArgsConstructor
@Entity
@Table(name = "functional_strength")
public class IFunctionalStrengthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "functional_strength_id")
    private Integer functionalStrengthId;
    @Column(name = "pull_to_standR")
    private String pullToStandR;
    @Column(name = "standing_arms_freeR_3sec")
    private String standingArmsFreeR_3sec;
    @Column(name = "standing_arms_freeR_20sec")
    private String standingArmsFreeR_20sec;
    @Column(name = "leg_stand_hand_heldR")
    private String legStandHandHeldR;
    @Column(name = "one_leg_stanceR")
    private String oneLegStanceR;
    @Column(name = "short_sit_to_standR")
    private String shortSitToStandR;
    @Column(name = "high_knee_standR")
    private String highKneeStandR;
    @Column(name = "lowers_to_floorR")
    private String lowersToFloorR;
    @Column(name = "squatsR")
    private String squatsR;
    @Column(name = "pen_from_floorR")
    private String penFromFloorR;
    @Column(name = "pull_to_standL")
    private String pullToStandL;
    @Column(name = "standing_arms_freeL_3sec")
    private String standingArmsFreeL_3sec;
    @Column(name = "standing_arms_freeL_20sec")
    private String standingArmsFreeL_20sec;
    @Column(name = "leg_stand_hand_heldL")
    private String legStandHandHeldL;
    @Column(name = "one_leg_stanceL")
    private String oneLegStanceL;
    @Column(name = "short_sit_to_standL")
    private String shortSitToStandL;
    @Column(name = "high_knee_standL")
    private String highKneeStandL;
    @Column(name = "lowers_to_floorL")
    private String lowersToFloorL;
    @Column(name = "squatsL")
    private String squatsL;
    @Column(name = "pen_from_floorL")
    private String penFromFloorL;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;


}

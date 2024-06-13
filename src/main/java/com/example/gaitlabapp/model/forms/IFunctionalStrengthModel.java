package com.example.gaitlabapp.model.forms;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "FunctionalStrength")
public class IFunctionalStrengthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "functionalStrengthId")
    private Integer functionalStrengthId;
    @Column(name = "pullToStandR")
    private String pullToStandR;
    @Column(name = "standingArmsFreeR_3sec")
    private String standingArmsFreeR_3sec;
    @Column(name = "standingArmsFreeR_20sec")
    private String standingArmsFreeR_20sec;
    @Column(name = "legStandHandHeldR")
    private String legStandHandHeldR;
    @Column(name = "oneLegStanceR")
    private String oneLegStanceR;
    @Column(name = "shortSitToStandR")
    private String shortSitToStandR;
    @Column(name = "highKneeStandR")
    private String highKneeStandR;
    @Column(name = "lowersToFloorR")
    private String lowersToFloorR;
    @Column(name = "squatsR")
    private String squatsR;
    @Column(name = "penFromFloorR")
    private String penFromFloorR;
    @Column(name = "pullToStandL")
    private String pullToStandL;
    @Column(name = "standingArmsFreeL_3sec")
    private String standingArmsFreeL_3sec;
    @Column(name = "standingArmsFreeL_20sec")
    private String standingArmsFreeL_20sec;
    @Column(name = "legStandHandHeldL")
    private String legStandHandHeldL;
    @Column(name = "oneLegStanceL")
    private String oneLegStanceL;
    @Column(name = "shortSitToStandL")
    private String shortSitToStandL;
    @Column(name = "highKneeStandL")
    private String highKneeStandL;
    @Column(name = "lowersToFloorL")
    private String lowersToFloorL;
    @Column(name = "squatsL")
    private String squatsL;
    @Column(name = "penFromFloorL")
    private String penFromFloorL;


}

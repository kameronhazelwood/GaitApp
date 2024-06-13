package com.example.gaitlabapp.model.forms.videoAssessment;

import lombok.*;


import jakarta.persistence.*;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "FootConditions")
public class IFootConditionsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "footConditionId")
    private Integer footConditionId;
    @Column(name = "other")
    private String other;
    @Column(name = "shoesOnly")
    private String shoesOnly;
    @Column(name = "solidAFO")
    private String solidAFO;
    @Column(name = "articulatedAFO")
    private String articulatedAFO;
    @Column(name = "smo")
    private String smo;
    @Column(name = "kafo")
    private String kafo;
    @Column(name = "hkafo")
    private String hkafo;
    @Column(name = "grafo")
    private String grafo;
    @Column(name = "barefoot")
    private String barefoot;

    public IFootConditionsModel(Integer footConditionId, String other, String shoesOnly, String solidAFO, String articulatedAFO, String smo, String kafo, String hkafo, String grafo, String barefoot) {
        this.footConditionId = footConditionId;
        this.other = other;
        this.shoesOnly = shoesOnly;
        this.solidAFO = solidAFO;
        this.articulatedAFO = articulatedAFO;
        this.smo = smo;
        this.kafo = kafo;
        this.hkafo = hkafo;
        this.grafo = grafo;
        this.barefoot = barefoot;
    }

}

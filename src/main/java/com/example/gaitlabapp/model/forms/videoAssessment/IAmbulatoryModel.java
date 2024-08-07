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
@Table(name = "ambulatory")
public class IAmbulatoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ambulatory_Id")
    private Integer ambulatoryId;
    @Column(name = "crutches")
    private String crutches;
    @Column(name = "canes")
    private String canes;
    @Column(name = "anterior_Walker")
    private String anteriorWalker;
    @Column(name = "posterior_Walker")
    private String posteriorWalker;
    @Column(name = "handheld")
    private String handheld;
    @Column(name = "no_Aids")
    private String noAids;

    public IAmbulatoryModel(Integer ambulatoryId, String crutches, String canes, String anteriorWalker, String posteriorWalker, String handheld, String noAids) {
        this.ambulatoryId = ambulatoryId;
        this.crutches = crutches;
        this.canes = canes;
        this.anteriorWalker = anteriorWalker;
        this.posteriorWalker = posteriorWalker;
        this.handheld = handheld;
        this.noAids = noAids;
    }

}

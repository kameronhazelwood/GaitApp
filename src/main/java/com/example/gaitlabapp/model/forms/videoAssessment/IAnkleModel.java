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
@Table(name = "Ankle")
public class IAnkleModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ankleId")
    private Integer ankleId;
    @Column(name = "prematureHeelRise")
    private String prematureHeelRise;
    @Column(name = "ankleEquinus")
    private String ankleEquinus;
    @Column(name = "ankleVarus")
    private String ankleVarus;
    @Column(name = "ankleValgus")
    private String ankleValgus;
    @Column(name = "cavus")
    private String cavus;
    @Column(name = "planus")
    private String planus;
    @Column(name = "planovalgus")
    private String planovalgus;
    @Column(name = "forefootAdduction")
    private String forefootAdduction;
    @Column(name = "forefootAbduction")
    private String forefootAbduction;
    @Column(name = "bunion")
    private String bunion;
    @Column(name = "clawToes")
    private String clawToes;
    @Column(name = "hallusExt")
    private String hallusExt;
    @Column(name = "persistentHighToe")
    private String persistentHighToe;
    @Column(name = "noHeelContact")
    private String noHeelContact;

    public IAnkleModel(String noHeelContact, Integer ankleId, String prematureHeelRise, String ankleEquinus, String ankleVarus, String ankleValgus, String cavus, String planus, String planovalgus, String forefootAdduction, String forefootAbduction, String bunion, String clawToes, String hallusExt, String persistentHighToe) {
        this.noHeelContact = noHeelContact;
        this.ankleId = ankleId;
        this.prematureHeelRise = prematureHeelRise;
        this.ankleEquinus = ankleEquinus;
        this.ankleVarus = ankleVarus;
        this.ankleValgus = ankleValgus;
        this.cavus = cavus;
        this.planus = planus;
        this.planovalgus = planovalgus;
        this.forefootAdduction = forefootAdduction;
        this.forefootAbduction = forefootAbduction;
        this.bunion = bunion;
        this.clawToes = clawToes;
        this.hallusExt = hallusExt;
        this.persistentHighToe = persistentHighToe;
    }

}

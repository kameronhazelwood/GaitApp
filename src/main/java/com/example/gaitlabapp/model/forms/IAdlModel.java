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

@Getter
@Setter
@NoArgsConstructor
@Data
@Entity
@Table(name = "adl")
public class IAdlModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adl_id")
    private Integer adlId;
    @Column(name = "ue_dressing_indep")
    private String ueDressingIndep;
    @Column(name = "le_dressing_indep")
    private String leDressing;
    @Column(name = "ue_dressing_dep")
    private String ueDressingDep;
    @Column(name = "ue_dressing_assist")
    private String ueDressingAssist;
    @Column(name = "ue_dressing_comments")
    private String ueDressingComments;
    @Column(name = "le_dressing_assist")
    private String leDressingAssist;
    @Column(name = "orth_indep")
    private String orthIndep;
    @Column(name = "orth_dep")
    private String orthDep;
    @Column(name = "orth_assist")
    private String orthAssist;
    @Column(name = "orth_comments")
    private String orthComments;
    @Column(name = "orthotic")
    private String orthotic;
    @Column(name = "adl_shoes")
    private String adlShoes;
    @Column(name = "adl_socks")
    private String adlSocks;
    @Column(name = "adl_fasteners")
    private String adlFasteners;
    @Column(name = "adl_hygiene")
    private String adlHygiene;

}

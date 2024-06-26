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
    @Column(name = "adlId")
    private Integer adlId;
    @Column(name = "ueDressingIndep")
    private String ueDressingIndep;
    @Column(name = "leDressingIndep")
    private String leDressing;
    @Column(name = "ueDressingDep")
    private String ueDressingDep;
    @Column(name = "ueDressingAssist")
    private String ueDressingAssist;
    @Column(name = "ueDressingComments")
    private String ueDressingComments;
    @Column(name = "leDressingAssist")
    private String leDressingAssist;
    @Column(name = "orthIndep")
    private String orthIndep;
    @Column(name = "orthDep")
    private String orthDep;
    @Column(name = "orthAssist")
    private String orthAssist;
    @Column(name = "orthComments")
    private String orthComments;
    @Column(name = "orthotic")
    private String orthotic;
    @Column(name = "adlShoes")
    private String adlShoes;
    @Column(name = "adlSocks")
    private String adlSocks;
    @Column(name = "adlFasteners")
    private String adlFasteners;
    @Column(name = "adlHygiene")
    private String adlHygiene;

}

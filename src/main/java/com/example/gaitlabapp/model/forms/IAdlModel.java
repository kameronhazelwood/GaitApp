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
@Table(name = "ADL")
public class IAdlModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "adlId")
    private IntegerProperty adlId;
    @Column(name = "ueDressing")
    private StringProperty ueDressing;
    @Column(name = "leDressing")
    private StringProperty leDressing;
    @Column(name = "orthotic")
    private StringProperty orthotic;
    @Column(name = "adlShoes")
    private StringProperty adlShoes;
    @Column(name = "adlSocks")
    private StringProperty adlSocks;
    @Column(name = "adlFasteners")
    private StringProperty adlFasteners;
    @Column(name = "adlHygiene")
    private StringProperty adlHygiene;

    public IAdlModel(Integer adlId, String ueDressing, String leDressing, String orthotic, String adlShoes, String adlSocks, String adlFasteners, String adlHygiene) {
        this.adlId = new SimpleIntegerProperty(adlId);
        this.ueDressing = new SimpleStringProperty(ueDressing);
        this.leDressing = new SimpleStringProperty(leDressing);
        this.orthotic = new SimpleStringProperty(orthotic);
        this.adlShoes = new SimpleStringProperty(adlShoes);
        this.adlSocks = new SimpleStringProperty(adlSocks);
        this.adlFasteners = new SimpleStringProperty(adlFasteners);
        this.adlHygiene = new SimpleStringProperty(adlHygiene);
    }

}

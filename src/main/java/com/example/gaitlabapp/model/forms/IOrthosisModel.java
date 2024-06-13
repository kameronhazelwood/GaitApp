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
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "Orthosis")
public class IOrthosisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "orthosisId")
    private Integer orthosisId;
    @Column(name = "orthosis")
    private String orthosis;
    @Column(name = "side")
    private String side;

}

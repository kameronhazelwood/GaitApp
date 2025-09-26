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
@Entity
@NoArgsConstructor
@Table(name = "orthosis")
public class IOrthosisModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Setter
    @Column(name = "orthosis_id")
    private Integer orthosisId;
    @Column(name = "orthosis")
    @Setter
    private String orthosis;
    @Column(name = "side")
    @Setter
    private String side;
    @Column(name = "patient_id")
    @Setter
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

    public IOrthosisModel(Integer orthosisId, String orthosis, String side){
        this.orthosis = orthosis;
        this.orthosisId = orthosisId;
        this.side = side;
    }
}

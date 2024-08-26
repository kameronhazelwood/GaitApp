package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "emg")
public class IEMGModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emg_id")
    private Integer emgId;
    @Column(name = "muscle")
    private String muscle;
    @Column(name = "electrode")
    private String electrode;
    @Column(name = "side")
    private String side;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;


    public IEMGModel(Integer emgId, String muscle, String electrode, String side) {
        this.emgId = emgId;
        this.muscle = muscle;
        this.electrode = electrode;
        this.side = side;
    }

}

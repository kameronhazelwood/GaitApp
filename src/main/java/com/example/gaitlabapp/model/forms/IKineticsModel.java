package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;
@Getter
@Data
@Entity
@Setter
@NoArgsConstructor
@Table(name = "kinetics")
public class IKineticsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kin_id")
    private Integer kinId;
    @Column(name = "side")
    private String side;
    @Column(name = "device")
    private String device;
    @Column(name = "orthosis")
    private String orthosis;
    @Column(name = "footwear")
    private String footwear;
    @Column(name = "comment")
    private String comment;
    @Column(name = "speed")
    private String speed;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

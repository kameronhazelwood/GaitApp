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
@Entity
@NoArgsConstructor
@Table(name = "hop")
public class IHopModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hop_id")
    private Integer hopId;
    @Column(name = "unilateral_hop")
    private String unilateralHop;
    @Column(name = "unilater_hop_interp")
    private String unilaterHopInterp;
    @Column(name = "triple_hop")
    private String tripleHop;
    @Column(name = "triple_hop_interp")
    private String tripleHopInterp;
    @Column(name = "unilateral_hop2")
    private String unilateralHop2;
    @Column(name = "unilateral_hope3")
    private String unilateralHope3;
    @Column(name = "triple_hop2")
    private String tripleHop2;
    @Column(name = "triple_hop3")
    private String tripleHop3;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

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
@Table(name = "o2")
public class IO2Model {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "o2_Id")
    private Integer o2Id;
    @Column(name = "time_test")
    private String timeTest;
    @Column(name = "start_Time")
    private String startTime;
    @Column(name = "o2Start")
    private String o2Start;
    @Column(name = "o2_Finish")
    private String o2Finish;
    @Column(name = "sit_Time")
    private String sitTime;
    @Column(name = "patient_Id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;
}

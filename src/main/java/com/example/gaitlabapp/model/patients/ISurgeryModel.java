package com.example.gaitlabapp.model.patients;


import lombok.*;

import jakarta.persistence.*;

import java.util.Set;

@Getter
@Setter
@Data
@Entity
@NoArgsConstructor(force = true)
@Table(name = "surgery")
public class ISurgeryModel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surgery_id")
    private Integer surgeryId;
    @Column(name = "surgery_date")
    private String surgeryDate;
    @Column(name = "surgery_procedure")
    private String surgeryProcedure;
    @Column(name = "surgery_side")
    private String surgerySide;
    @Column(name = "surgeon")
    private String surgeon;
    @Column(name = "facility")
    private String facility;
    @Column(name = "comments")
    private String comments;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

    public ISurgeryModel(Integer surgeryId, String surgeryDate, String surgeryProcedure, String surgerySide, String surgeon, String facility, String comments, Integer patientId){
        this.surgeryId = surgeryId;
        this.surgeryDate = surgeryDate;
        this.surgeryProcedure = surgeryProcedure;
        this.surgerySide = surgerySide;
        this.surgeon = surgeon;
        this.facility = facility;
        this.comments = comments;
        this.patientId = patientId;
    }


    @Override
    public String toString(){
        return "Surgery{ " +
                "Surgery Date= " +
                "Surgery Procedure= " +
                "Surgery Side= " +
                "Surgeon=" +
                "Facility= " +
                "Comments=" +
                "}";
    }

}

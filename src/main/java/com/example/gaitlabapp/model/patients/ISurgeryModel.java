package com.example.gaitlabapp.model.patients;


import lombok.*;

import jakarta.persistence.*;


@Data
@Entity
@Getter
@NoArgsConstructor(force = true)
@Table(name = "surgery")
public class ISurgeryModel  {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "surgery_id")
    @Setter
    private Integer surgeryId;
    @Column(name = "surgery_date")
    @Setter
    private String surgeryDate;
    @Column(name = "surgery_procedure")
    @Setter
    private String surgeryProcedure;
    @Column(name = "surgery_side")
    @Setter
    private String surgerySide;
    @Column(name = "surgeon")
    @Setter
    private String surgeon;
    @Column(name = "facility")
    @Setter
    private String facility;
    @Column(name = "comments")
    @Setter
    private String comments;

    public ISurgeryModel(Integer surgeryId, String surgeryDate, String surgeryProcedure, String surgerySide, String surgeon, String facility, String comments){
        this.surgeryId = surgeryId;
        this.surgeryDate = surgeryDate;
        this.surgeryProcedure = surgeryProcedure;
        this.surgerySide = surgerySide;
        this.surgeon = surgeon;
        this.facility = facility;
        this.comments = comments;
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

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
@Setter
@Entity
@NoArgsConstructor
@Table(name = "gen_mark_info")
public class IGenMarkInfoModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "gen_marker_id")
    private Integer genMarkerId;
    @Column(name = "height")
    private Integer height;
    @Column(name = "weight")
    private Integer weight;
    @Column(name = "right_foot_length")
    private String rightFootLength;
    @Column(name = "left_foot_length")
    private String leftFootLength;
    @Column(name = "right_foot_width")
    private String rightFootWidth;
    @Column(name = "left_foot_width")
    private String leftFootWidth;
    @Column(name = "gmfcs")
    private String gmfcs;
    @Column(name = "fms5m")
    private String fms5m;
    @Column(name = "fms50m")
    private String fms50m;
    @Column(name = "fms500m")
    private String fms500m;
    @Column(name = "comments")
    private String comments;
    @Column(name = "macs")
    private String macs;
    @Column(name = "AS1")
    private String AS1;
    @Column(name = "AS2")
    private String AS2;
    @Column(name = "AS3")
    private String AS3;
    @Column(name = "AS4")
    private String AS4;
    @Column(name = "AS5")
    private String AS5;
    @Column(name = "AS6")
    private String AS6;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

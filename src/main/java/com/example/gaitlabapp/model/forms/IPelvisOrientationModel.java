package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
@Data
@Entity
@Table(name = "pelvis_Orientation")
public class IPelvisOrientationModel {
    @Id
    @GeneratedValue
    @Column(name = "pelvis_Orien_Id")
    private String pelvisOreinId;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Double value;
    @Column(name = "normal")
    private String normal;
    @Column(name = "interp")
    private String interp;



















}

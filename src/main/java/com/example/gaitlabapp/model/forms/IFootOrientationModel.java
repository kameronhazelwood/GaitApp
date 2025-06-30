package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "foot_Orientation")
public class IFootOrientationModel {
    @Id
    @GeneratedValue
    @Column(name = "foot_Orien_Id")
    private String footOreinId;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Double value;
    @Column(name = "interp")
    private String interp;
    @Column(name = "normal")
    private String normal;
}

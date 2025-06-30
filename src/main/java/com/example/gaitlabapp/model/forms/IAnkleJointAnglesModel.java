package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Data
@Entity
@Table(name = "ankle_Joint_Angles")
public class IAnkleJointAnglesModel {
    @Id
    @GeneratedValue
    @Column(name = "ankle_Joint_Id")
    private Integer ankleJointId;
    @Column(name = "value")
    private Double value;
    @Column(name = "interp")
    private String interp;
    @Column(name = "normal")
    private String normal;
    @Column(name = "name")
    private String name;
}

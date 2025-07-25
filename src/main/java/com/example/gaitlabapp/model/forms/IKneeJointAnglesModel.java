package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.xml.bind.annotation.XmlAccessorOrder;

@Getter
@Setter
@Data
@Entity
@Table(name = "knee_Joint_Angles")
public class IKneeJointAnglesModel {
    @Id
    @GeneratedValue
    @Column(name = "knee_Joint_id")
    private Integer kneeJointid;
    @Column(name = "name")
    private String name;
    @Column(name = "interp")
    private String interp;
    @Column(name = "normal")
    private String normal;
    @Column(name = "value")
    private Double value;
}

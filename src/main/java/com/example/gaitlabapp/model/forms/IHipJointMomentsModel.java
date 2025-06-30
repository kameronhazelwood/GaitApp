package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "hip_joint_moments")
public class IHipJointMomentsModel {
    @Id
    @GeneratedValue
    @Column(name = "hip_joint_id")
    private Integer hip_joint_id;
    @Column(name = "name")
    private String name;
    @Column(name = "normals")
    private String normals;
    @Column(name = "value")
    private String value;
    @Column(name = "interp")
    private String interp;

}

package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "ankle_joint_moments")
public class IAnkleJointMomentModel {
    @Id
    @GeneratedValue
    @Column(name = "ankle_moment_id")
    private Integer ankleMomentId;
    @Column(name = "name")
    private String name;
    @Column(name = "normals")
    private String normals;
    @Column(name = "value")
    private String value;
    @Column(name = "interp")
    private String interp;
}

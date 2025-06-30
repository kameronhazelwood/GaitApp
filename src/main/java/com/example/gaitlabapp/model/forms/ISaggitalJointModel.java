package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "saggital_joint_powers")
public class ISaggitalJointModel {
    @Id
    @GeneratedValue
    @Column(name = "saggital_id")
    private Integer saggitalId;
    @Column(name = "name")
    private String name;
    @Column(name = "normals")
    private String normals;
    @Column(name = "value")
    private Double value;
    @Column(name = "interp")
    private String interp;
}

package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Entity
@Getter
@RequiredArgsConstructor
@Data
@Table(name = "knee_joint_moments")
public class IKneeMomentsModel {
    @Id
    @GeneratedValue
    @Column(name = "knee_moment_id")
    private Integer knee_moment_id;
    @Column(name = "name")
    private String name;
    @Column(name = "normal")
    private String normal;
    @Column(name = "value")
    private Double value;
    @Column(name = "interp")
    private String interp;
}

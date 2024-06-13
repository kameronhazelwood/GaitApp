package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "MovementDisorder")
public class IMovementDisorderModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "movementDisorderId")
    private Integer movementDisorderId;
    @Column(name = "ambScale")
    private String ambScale;
    @Column(name = "gmfcs")
    private String gmfcs;
    @Column(name = "fms5")
    private String fms5;
    @Column(name = "fms50")
    private String fms50;
    @Column(name = "fms500")
    private String fms500;
    @Column(name = "macs")
    private String macs;
    @Column(name = "cfcs")
    private String cfcs;
    @Column(name = "comments")
    private String comments;
    @Column(name = "orthoses")
    private String orthoses;

}

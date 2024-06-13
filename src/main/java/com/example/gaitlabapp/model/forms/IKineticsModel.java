package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Kinetics")
public class IKineticsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "kinId")
    private Integer kinId;
    @Column(name = "side")
    private String side;
    @Column(name = "device")
    private String device;
    @Column(name = "orthosis")
    private String orthosis;
    @Column(name = "footwear")
    private String footwear;
    @Column(name = "comment")
    private String comment;
    @Column(name = "speed")
    private String speed;

}

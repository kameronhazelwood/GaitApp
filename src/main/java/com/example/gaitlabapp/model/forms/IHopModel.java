package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@Entity
@NoArgsConstructor
@Table(name = "Hop")
public class IHopModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hopId")
    private Integer hopId;
    @Column(name = "unilateralHop")
    private String unilateralHop;
    @Column(name = "unilaterHopInterp")
    private String unilaterHopInterp;
    @Column(name = "tripleHop")
    private String tripleHop;
    @Column(name = "tripleHopInterp")
    private String tripleHopInterp;
    @Column(name = "unilateralHop2")
    private String unilateralHop2;
    @Column(name = "unilateralHope3")
    private String unilateralHope3;
    @Column(name = "tripleHop2")
    private String tripleHop2;
    @Column(name = "tripleHop3")
    private String tripleHop3;

}

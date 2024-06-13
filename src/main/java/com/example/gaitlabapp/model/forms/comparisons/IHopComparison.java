package com.example.gaitlabapp.model.forms.comparisons;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "HopComparison")
public class IHopComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hopCompId")
    private Integer hopCompId;
    @Column(name = "unilateralHop")
    private String unilateralHop;
    @Column(name = "unilaterHopSd")
    private String unilaterHopSd;
    @Column(name = "tripleHop")
    private String tripleHop;
    @Column(name = "tripleHopSd")
    private String tripleHopSd;
    @Column(name = "unilateralHop2")
    private String unilateralHop2;
    @Column(name = "unilateralHope3")
    private String unilateralHope3;
    @Column(name = "tripleHop2")
    private String tripleHop2;
    @Column(name = "tripleHop3")
    private String tripleHop3;


}

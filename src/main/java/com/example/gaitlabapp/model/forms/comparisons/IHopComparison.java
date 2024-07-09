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
@Table(name = "hop_comparison")
public class IHopComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "hop_comp_Id")
    private Integer hopCompId;
    @Column(name = "unilateral_hop")
    private String unilateralHop;
    @Column(name = "unilater_hop_sd")
    private String unilaterHopSd;
    @Column(name = "triple_hop")
    private String tripleHop;
    @Column(name = "triple_hop_sd")
    private String tripleHopSd;
    @Column(name = "unilateral_hop2")
    private String unilateralHop2;
    @Column(name = "unilateral_hope3")
    private String unilateralHope3;
    @Column(name = "triple_hop2")
    private String tripleHop2;
    @Column(name = "triple_hop3")
    private String tripleHop3;


}

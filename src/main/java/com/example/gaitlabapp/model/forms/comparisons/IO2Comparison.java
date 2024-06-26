package com.example.gaitlabapp.model.forms.comparisons;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import jakarta.persistence.*;

@Setter
@NoArgsConstructor
@Getter
@Data
@Entity
@Table(name = "O2Comparison")
public class IO2Comparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "o2CompId")
    private Integer o2IdComp;
    @Column(name = "o2CostIndex")
    private String o2CostIndex;
    @Column(name = "o2CostIndexSd")
    private String o2CostIndexSd;
    @Column(name = "vo2RestIndex")
    private String vo2RestIndex;
    @Column(name = "vo2RestIndexSd")
    private String vo2RestIndexSd;
    @Column(name = "vo2ExerIndex")
    private String vo2ExerIndex;
    @Column(name = "vo2ExerIndexSd")
    private String vo2ExerIndexSd;
    @Column(name = "respRateEx")
    private String respRateEx;
    @Column(name = "respRateExSd")
    private String respRateExSd;
    @Column(name = "velmEx")
    private String velmEx;
    @Column(name = "velmExSd")
    private String velmExSd;
    @Column(name = "v02KgEx")
    private String v02KgEx;
    @Column(name = "v02KgExSd")
    private String v02KgExSd;
    @Column(name = "heartRateEx")
    private String heartRateEx;
    @Column(name = "heartRateExSd")
    private String heartRateExSd;


}

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
@Table(name = "o2comparison")
public class IO2Comparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "o2comp_id")
    private Integer o2IdComp;
    @Column(name = "o2cost_index")
    private String o2CostIndex;
    @Column(name = "o2cost_index_sd")
    private String o2CostIndexSd;
    @Column(name = "vo2rest_index")
    private String vo2RestIndex;
    @Column(name = "vo2rest_index_sd")
    private String vo2RestIndexSd;
    @Column(name = "vo2exer_index")
    private String vo2ExerIndex;
    @Column(name = "vo2exer_index_sd")
    private String vo2ExerIndexSd;
    @Column(name = "resp_rate_ex")
    private String respRateEx;
    @Column(name = "resp_rate_ex_sd")
    private String respRateExSd;
    @Column(name = "velm_ex")
    private String velmEx;
    @Column(name = "velm_ex_sd")
    private String velmExSd;
    @Column(name = "v02kg_ex")
    private String v02KgEx;
    @Column(name = "v02kg_ex_sd")
    private String v02KgExSd;
    @Column(name = "heart_rate_ex")
    private String heartRateEx;
    @Column(name = "heart_rate_ex_sd")
    private String heartRateExSd;


}

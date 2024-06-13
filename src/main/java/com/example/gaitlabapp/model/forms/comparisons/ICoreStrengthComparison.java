package com.example.gaitlabapp.model.forms.comparisons;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "CoreStrengthComparison")
public class ICoreStrengthComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coreStrengthComparisonId")
    private Integer coreStrengthComparisonId;
    @Column(name = "situpsCompleted")
    private String situpsCompleted;
    @Column(name = "situpsCompletedSd")
    private String situpsCompletedSd;
    @Column(name = "superManHoldTime")
    private String superManHoldTime;
    @Column(name = "superManHoldTimeSd")
    private String superManHoldTimeSd;
    @Column(name = "plank")
    private String plank;
    @Column(name = "plankSd")
    private String plankSd;

}

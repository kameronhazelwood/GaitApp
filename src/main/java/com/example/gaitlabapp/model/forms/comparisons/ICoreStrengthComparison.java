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
@Table(name = "core_strength_comparison")
public class ICoreStrengthComparison {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "core_strength_comparison_id")
    private Integer coreStrengthComparisonId;
    @Column(name = "situps_completed")
    private String situpsCompleted;
    @Column(name = "situps_completed_sd")
    private String situpsCompletedSd;
    @Column(name = "super_man_hold_time")
    private String superManHoldTime;
    @Column(name = "super_man_hold_time_sd")
    private String superManHoldTimeSd;
    @Column(name = "plank")
    private String plank;
    @Column(name = "plank_sd")
    private String plankSd;

}

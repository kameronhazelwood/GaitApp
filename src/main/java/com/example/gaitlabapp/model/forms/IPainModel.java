package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Data
@Setter
@Getter
@NoArgsConstructor
@Entity
@Table(name = "pain")
public class IPainModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pain_id")
    private Integer painId;
    @Column(name = "pain_assessment_method")
    private String painAssessmentMethod;
    @Column(name = "aggravating_factors")
    private String aggravatingFactors;
    @Column(name = "activities_impacted")
    private String activitiesImpacted;
    @Column(name = "current_level")
    private Integer currentLevel;
    @Column(name = "lowest_level")
    private Integer lowestLevel;
    @Column(name = "highest_level")
    private Integer highestLevel;
    @Column(name = "location_of_pain")
    private String locationOfPain;
    @Column(name = "frequency_of_pain")
    private String frequencyOfPain;
    @Column(name = "duration_of_pain")
    private String durationOfPain;

}

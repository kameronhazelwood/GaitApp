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
@Table(name = "Pain")
public class IPainModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "painId")
    private Integer painId;
    @Column(name = "painAssessmentMethod")
    private String painAssessmentMethod;
    @Column(name = "aggravatingFactors")
    private String aggravatingFactors;
    @Column(name = "activitiesImpacted")
    private String activitiesImpacted;
    @Column(name = "currentLevel")
    private Integer currentLevel;
    @Column(name = "lowestLevel")
    private Integer lowestLevel;
    @Column(name = "highestLevel")
    private Integer highestLevel;
    @Column(name = "locationOfPain")
    private String locationOfPain;
    @Column(name = "frequencyOfPain")
    private String frequencyOfPain;
    @Column(name = "durationOfPain")
    private String durationOfPain;

}

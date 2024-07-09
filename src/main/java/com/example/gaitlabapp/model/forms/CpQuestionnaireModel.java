package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "cp_questionnaire")
public class CpQuestionnaireModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "cp_questionnaire_id")
    private Integer cpQuestionnaireId;
    @Column(name = "personal_care")
    private String personalCare;
    @Column(name = "positioning")
    private String positioning;
    @Column(name = "comfort")
    private String comfort;
    @Column(name = "communication")
    private String communication;
    @Column(name = "health")
    private String health;
    @Column(name = "quality_of_life")
    private String qualityOfLife;


}

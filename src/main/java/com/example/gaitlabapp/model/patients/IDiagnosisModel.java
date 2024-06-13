package com.example.gaitlabapp.model.patients;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Data
@Getter
@NoArgsConstructor(force = true)
@Setter
@Entity
@Table(name="DiagnosisCode")
public class IDiagnosisModel {

    @Id
    @Column(name="code")
    private final String diagnosisCode;
    @Column(name = "description")
    private final String diagnosisDescription;

    public IDiagnosisModel(String diagnosisCode, String diagnosisDescription){
        this.diagnosisCode = diagnosisCode;
        this.diagnosisDescription = diagnosisDescription;
    }

}

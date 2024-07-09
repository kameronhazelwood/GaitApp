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
@Table(name="diagnosis_code")
public class IDiagnosisModel {

    @Id
    @Column(name="code")
    @Getter
    @Setter
    private String code;
    @Getter
    @Setter
    @Column(name = "description")
    private String description;

    public IDiagnosisModel(String code, String description){
        this.code = code;
        this.description = description;
    }

    public String getDiagnosisDescription() {
        return code;
    }

    public String getDiagnosisCode() {
        return description;
    }
}

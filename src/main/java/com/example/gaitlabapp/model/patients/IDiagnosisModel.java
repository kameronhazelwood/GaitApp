package com.example.gaitlabapp.model.patients;

import com.fasterxml.jackson.annotation.JsonBackReference;
import lombok.*;
import jakarta.persistence.*;
import java.util.Set;

@Setter
@Getter
@Data
@NoArgsConstructor(force = true)
@Entity
@Table(name="diagnosis_code")
public class IDiagnosisModel {

    @Id
    @Column(name="code")
    private String code;
    @Column(name = "description")
    private String description;

//    @ManyToMany(mappedBy = "gen_diagnosis", fetch = FetchType.LAZY)
//    @JsonBackReference
//
//
//     Set<IPatientModel> genDiagnosis;

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

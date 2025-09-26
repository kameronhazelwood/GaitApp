package com.example.gaitlabapp.model.forms;


import com.example.gaitlabapp.model.patients.IHealthHistoryModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Data
@NoArgsConstructor(force = true)
@Entity
@Table(name = "seizure")

public class ISeizureModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "seizureId")
    @Setter
    private Integer seizureId;
    @Column(name = "seizureMedicineName")
    @Setter
    private String seizureMedicineName;
    @Column(name = "patient_id")
    private Integer patientId;

    public ISeizureModel(Integer seizureId, String seizureMedicineName, Integer patientId) {
        this.seizureId = seizureId;
        this.seizureMedicineName = seizureMedicineName;
        this.patientId = patientId;
    }
}

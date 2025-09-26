package com.example.gaitlabapp.model.forms;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "core_strength")
public class ICoreStrengthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "core_strength_id")
    private Integer coreStrengthId;
    @Column(name = "situps_completed")
    private Integer situpsCompleted;
    @Column(name = "situp_completed_interp")
    private String situpCompletedInterp;
    @Column(name = "hold_time")
    private String holdTime;
    @Column(name = "hold_time_interp")
    private String holdTimeInterp;
    @Column(name = "plank")
    private String plank;
    @Column(name = "plank_interp")
    private String plankInterp;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

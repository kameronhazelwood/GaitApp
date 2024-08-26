package com.example.gaitlabapp.model.forms.videoAssessment;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Data
@Entity
@Setter
@NoArgsConstructor
@Table(name = "Running")
public class IRunningModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "run_Id")
    private Integer runId;
    @Column(name = "normal_running")
    private String normalRunning;
    @Column(name = "none_running")
    private String noneRunning;
    @Column(name = "increased_speed_no_float")
    private String increasedSpeedNoFloat;
    @Column(name = "slow_with_float")
    private String slowWithFloat;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IRunningModel(Integer runId, String normalRunning, String noneRunning, String increasedSpeedNoFloat, String slowWithFloat) {
//        this.runId = runId;
//        this.normalRunning = normalRunning;
//        this.noneRunning = noneRunning;
//        this.increasedSpeedNoFloat = increasedSpeedNoFloat;
//        this.slowWithFloat = slowWithFloat;
//    }
//
//    public Integer getRunId() {
//        return runId;
//    }
//
//    public void setRunId(Integer runId) {
//        this.runId = runId;
//    }
//
//    public String getNomalRunning() {
//        return normalRunning;
//    }
//
//    public void setNomalRunning(String nomalRunning) {
//        this.normalRunning = nomalRunning;
//    }
//
//    public String getNoneRunning() {
//        return noneRunning;
//    }
//
//    public void setNoneRunning(String noneRunning) {
//        this.noneRunning = noneRunning;
//    }
//
//    public String getIncreasedSpeedNoFloat() {
//        return increasedSpeedNoFloat;
//    }
//
//    public void setIncreasedSpeedNoFloat(String increasedSpeedNoFloat) {
//        this.increasedSpeedNoFloat = increasedSpeedNoFloat;
//    }
//
//    public String getSlowWithFloat() {
//        return slowWithFloat;
//    }
//
//    public void setSlowWithFloat(String slowWithFloat) {
//        this.slowWithFloat = slowWithFloat;
//    }
}

package com.example.gaitlabapp.model.forms.videoAssessment;

import lombok.Data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "Running")
public class IRunningModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "runId")
    private Integer runId;
    @Column(name = "normalRunning")
    private String normalRunning;
    @Column(name = "noneRunning")
    private String noneRunning;
    @Column(name = "increasedSpeedNoFloat")
    private String increasedSpeedNoFloat;
    @Column(name = "slowWithFloat")
    private String slowWithFloat;

    public IRunningModel(Integer runId, String normalRunning, String noneRunning, String increasedSpeedNoFloat, String slowWithFloat) {
        this.runId = runId;
        this.normalRunning = normalRunning;
        this.noneRunning = noneRunning;
        this.increasedSpeedNoFloat = increasedSpeedNoFloat;
        this.slowWithFloat = slowWithFloat;
    }

    public Integer getRunId() {
        return runId;
    }

    public void setRunId(Integer runId) {
        this.runId = runId;
    }

    public String getNomalRunning() {
        return normalRunning;
    }

    public void setNomalRunning(String nomalRunning) {
        this.normalRunning = nomalRunning;
    }

    public String getNoneRunning() {
        return noneRunning;
    }

    public void setNoneRunning(String noneRunning) {
        this.noneRunning = noneRunning;
    }

    public String getIncreasedSpeedNoFloat() {
        return increasedSpeedNoFloat;
    }

    public void setIncreasedSpeedNoFloat(String increasedSpeedNoFloat) {
        this.increasedSpeedNoFloat = increasedSpeedNoFloat;
    }

    public String getSlowWithFloat() {
        return slowWithFloat;
    }

    public void setSlowWithFloat(String slowWithFloat) {
        this.slowWithFloat = slowWithFloat;
    }
}

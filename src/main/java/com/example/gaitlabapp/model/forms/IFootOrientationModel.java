package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Data
@Entity
@Table(name = "footOrientation")
public class IFootOrientationModel {
    @Id
    @GeneratedValue
    @Column(name = "footOreinId")
    private String footOreinId;
    @Column(name = "footProgFCR")
    private String footProgFCR;
    @Column(name = "footProgFCL")
    private String footProgFCL;
    @Column(name = "footProgAngleMaxR")
    private String footProgAngleMaxR;
    @Column(name = "footProgAngleMaxL")
    private String footProgAngleMaxL;
    @Column(name = "footProgAngleMinR")
    private String footProgAngleMinR;
    @Column(name = "footProgAngleMinL")
    private String footProgAngleMinL;
    @Column(name = "footProgFCR_interp")
    private String footProgFCR_interp;
    @Column(name = "footProgFCL_interp")
    private String footProgFCL_interp;
    @Column(name = "footProgAngleMaxR_interp")
    private String footProgAngleMaxR_interp;
    @Column(name = "footProgAngleMaxL_interp")
    private String footProgAngleMaxL_interp;
    @Column(name = "footProgAngleMinR_interp")
    private String footProgAngleMinR_interp;
    @Column(name = "footProgAngleMinL_interp")
    private String footProgAngleMinL_interp;
}

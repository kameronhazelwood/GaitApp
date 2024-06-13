package com.example.gaitlabapp.model.forms.videoAssessment;

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
@Table(name = "UpperExt")
public class IUpperExtModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "upperExtId")
    private Integer upperExtId;
    @Column(name = "highGuard")
    private String highGuard;
    @Column(name = "mediumGuard")
    private String mediumGuard;
    @Column(name = "decreasedSwingLeft")
    private String decreasedSwingLeft;
    @Column(name = "decreasedSwingRight")
    private String decreasedSwingRight;
    @Column(name = "hemiplegicPosturingRight")
    private String hemiplegicPosturingRight;
    @Column(name = "hemiplegicPosturingLeft")
    private String hemiplegicPosturingLeft;
    @Column(name = "extensorPosturingLeft")
    private String extensorPosturingLeft;
    @Column(name = "extensorPosturingRight")
    private String extensorPosturingRight;
    @Column(name = "dystonicMovement")
    private String dystonicMovement;
    @Column(name = "athetoidMovement")
    private String athetoidMovement;
    @Column(name = "assistDevice")
    private String assistDevice;

    public IUpperExtModel(Integer upperExtId, String highGuard, String mediumGuard, String decreasedSwingLeft, String decreasedSwingRight, String hemiplegicPosturingRight, String hemiplegicPosturingLeft, String extensorPosturingLeft, String extensorPosturingRight, String dystonicMovement, String athetoidMovement, String assistDevice) {
        this.upperExtId = upperExtId;
        this.highGuard = highGuard;
        this.mediumGuard = mediumGuard;
        this.decreasedSwingLeft = decreasedSwingLeft;
        this.decreasedSwingRight = decreasedSwingRight;
        this.hemiplegicPosturingRight = hemiplegicPosturingRight;
        this.hemiplegicPosturingLeft = hemiplegicPosturingLeft;
        this.extensorPosturingLeft = extensorPosturingLeft;
        this.extensorPosturingRight = extensorPosturingRight;
        this.dystonicMovement = dystonicMovement;
        this.athetoidMovement = athetoidMovement;
        this.assistDevice = assistDevice;
    }

}

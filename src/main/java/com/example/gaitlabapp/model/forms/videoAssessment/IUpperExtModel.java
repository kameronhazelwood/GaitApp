package com.example.gaitlabapp.model.forms.videoAssessment;

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
@Table(name = "Upper_Ext")
public class IUpperExtModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "upper_Ext_Id")
    private Integer upperExtId;
    @Column(name = "high_Guard")
    private String highGuard;
    @Column(name = "medium_Guard")
    private String mediumGuard;
    @Column(name = "decreased_Swing_Left")
    private String decreasedSwingLeft;
    @Column(name = "decreased_Swing_Right")
    private String decreasedSwingRight;
    @Column(name = "hemiplegic_Posturing_Right")
    private String hemiplegicPosturingRight;
    @Column(name = "hemiplegic_Posturing_Left")
    private String hemiplegicPosturingLeft;
    @Column(name = "extensor_Posturing_Left")
    private String extensorPosturingLeft;
    @Column(name = "extensor_Posturing_Right")
    private String extensorPosturingRight;
    @Column(name = "dystonic_Movement")
    private String dystonicMovement;
    @Column(name = "athetoid_Movement")
    private String athetoidMovement;
    @Column(name = "assist_Device")
    private String assistDevice;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public IUpperExtModel(Integer upperExtId, String highGuard, String mediumGuard, String decreasedSwingLeft, String decreasedSwingRight, String hemiplegicPosturingRight, String hemiplegicPosturingLeft, String extensorPosturingLeft, String extensorPosturingRight, String dystonicMovement, String athetoidMovement, String assistDevice) {
//        this.upperExtId = upperExtId;
//        this.highGuard = highGuard;
//        this.mediumGuard = mediumGuard;
//        this.decreasedSwingLeft = decreasedSwingLeft;
//        this.decreasedSwingRight = decreasedSwingRight;
//        this.hemiplegicPosturingRight = hemiplegicPosturingRight;
//        this.hemiplegicPosturingLeft = hemiplegicPosturingLeft;
//        this.extensorPosturingLeft = extensorPosturingLeft;
//        this.extensorPosturingRight = extensorPosturingRight;
//        this.dystonicMovement = dystonicMovement;
//        this.athetoidMovement = athetoidMovement;
//        this.assistDevice = assistDevice;
//    }

}

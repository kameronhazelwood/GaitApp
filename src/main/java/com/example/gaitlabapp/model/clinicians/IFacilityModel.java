package com.example.gaitlabapp.model.clinicians;

import com.example.gaitlabapp.model.patients.IPatientModel;
import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Getter
@Data
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Facility")
public class IFacilityModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "facility_id")
    private Integer facilityId;
    @Column(name = "fac_name")
    private String facName;
    @Column(name = "fac_address1")
    private String facAddress1;
    @Column(name = "fac_address2")
    private String facAddress2;
    @Column(name = "fac_address3")
    private String facAddress3;
    @Column(name = "fac_zip")
    private String facZip;
    @Column(name = "fac_state")
    private String facState;
    @Column(name = "fac_city")
    private String facCity;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

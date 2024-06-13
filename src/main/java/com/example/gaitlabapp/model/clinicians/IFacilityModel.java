package com.example.gaitlabapp.model.clinicians;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Facility")
public class IFacilityModel {
    @Id
    @GeneratedValue
    @Column(name = "facilityId")
    private Integer facilityId;
    @Column(name = "facName")
    private String facName;
    @Column(name = "facAddress1")
    private String facAddress1;
    @Column(name = "facAddress2")
    private String facAddress2;
    @Column(name = "facAddress2")
    private String facAddress3;
    @Column(name = "facZip")
    private String facZip;
    @Column(name = "facState")
    private String facState;
    @Column(name = "facCity")
    private String facCity;
}

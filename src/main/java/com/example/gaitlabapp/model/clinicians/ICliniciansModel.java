package com.example.gaitlabapp.model.clinicians;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;



@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "Clinicians")
public class ICliniciansModel {
    @jakarta.persistence.Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinicianId")
    private Integer clinicianId;
    @Column(name = "clincianFName")
    private String clinicianFName;
    @Column(name = "clinicianLName")
    private String clinicianLName;
    @Column(name = "clinType")
    private String clinType;
    @Column(name = "clinSpeciality")
    private String clinSpeciality;
    @Column(name = "clinPhone")
    private String clinPhone;
    @Column(name = "clinAddress1")
    private String clinAddress1;
    @Column(name = "clinAddress2")
    private String clinAddress2;
    @Column(name = "clinAddress3")
    private String clinAddress3;
    @Column(name = "clinCity")
    private String clinCity;
    @Column(name = "clinState")
    private String clinState;
    @Column(name = "clinZip")
    private String clinZip;
    @Column(name = "clinEmail")
    private String clinEmail;
    @Column(name = "clinBillCode")
    private String clinBillCode;
    @Column(name = "active")
    private Integer active;
    @Column(name = "clinGender")
    private String clinGender;

}

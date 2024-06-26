package com.example.gaitlabapp.model.clinicians;

import jakarta.persistence.*;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "ClinicianSignatures" )
public class ICliniciansSignatures {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "clinSigId")
    private Integer clinSigId;
    @Column(name = "comment")
    private String  comment;
    @Column(name = "userId")
    private String userId;
    @Column(name = "signedTime")
    private String signedTime;
    @Column(name = "visitId")
    private Integer visitId;

}

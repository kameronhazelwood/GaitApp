package com.example.gaitlabapp.model.patients;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import lombok.*;

import jakarta.persistence.*;

import java.util.Set;

@Getter
@Entity
@Data
@Setter
@NoArgsConstructor(force = true)
@Table(name = "video")
public class IVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "video_id")
    private Integer videoId;
    @Column(name = "video_name")
    private String videoName;
    @Column(name = "video_comments")
    private String videoComments;
    @Column(name = "video_date")
    private String videoDate;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

}

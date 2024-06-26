package com.example.gaitlabapp.model.patients;

import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;

import lombok.*;

import jakarta.persistence.*;
@Entity
@Data
@Getter
@Setter
@NoArgsConstructor(force = true)
@Table(name = "video")
public class IVideo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "videoId")
    private Integer videoId;
    @Column(name = "videoName")
    private String videoName;
    @Column(name = "videoComments")
    private String videoComments;
    @Column(name = "videoDate")
    private String videoDate;

}

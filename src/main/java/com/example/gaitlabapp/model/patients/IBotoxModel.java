package com.example.gaitlabapp.model.patients;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.PropertySource;


@Data
@Entity
@Getter
@NoArgsConstructor(force = true)
@Table(name = "Botox")
public class IBotoxModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "botoxId")
    private final String botoxId;
    @Column(name = "botoxDate")
    @Setter
    private String botoxDate;
    @Column(name = "botoxLocation")
    @Setter
    private String botoxLocation;
    @Setter
    @Column(name = "botoxSide")
    private String botoxSide;
    @Column(name = "botoxMd")
    @Setter
    private String botoxMd;
    @Column(name = "botoxComments")
    @Setter
    private String botoxComments;
    @Column(name = "botoxFacility")
    @Setter
    private String botoxFacility;

    public IBotoxModel(String botoxId, String botoxDate, String botoxLocation, String botoxSide, String botoxMd, String botoxComments) {
        this.botoxId = botoxId;
        this.botoxDate = botoxDate;
        this.botoxLocation = botoxLocation;
        this.botoxSide = botoxSide;
        this.botoxMd = botoxMd;
        this.botoxComments = botoxComments;
    }

}

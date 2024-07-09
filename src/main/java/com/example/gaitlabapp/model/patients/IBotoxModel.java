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
@Table(name = "botox")
public class IBotoxModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "botox_Id")
    private final Integer botoxId;
    @Column(name = "botox_date")
    @Setter
    private String botoxDate;
    @Column(name = "botox_location")
    @Setter
    private String botoxLocation;
    @Setter
    @Column(name = "botox_side")
    private String botoxSide;
    @Column(name = "botox_md")
    @Setter
    private String botoxMd;
    @Column(name = "botox_comments")
    @Setter
    private String botoxComments;
    @Column(name = "botox_facility")
    @Setter
    private String botoxFacility;

    public IBotoxModel(Integer botoxId, String botoxDate, String botoxLocation, String botoxSide, String botoxMd, String botoxComments) {
        this.botoxId = botoxId;
        this.botoxDate = botoxDate;
        this.botoxLocation = botoxLocation;
        this.botoxSide = botoxSide;
        this.botoxMd = botoxMd;
        this.botoxComments = botoxComments;
    }

}

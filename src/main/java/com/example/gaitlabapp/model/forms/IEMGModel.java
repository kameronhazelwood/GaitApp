package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "EMG")
public class IEMGModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "emgId")
    private Integer emgId;
    @Column(name = "muscle")
    private String muscle;
    @Column(name = "electrode")
    private String electrode;
    @Column(name = "side")
    private String side;


    public IEMGModel(Integer emgId, String muscle, String electrode, String side) {
        this.emgId = emgId;
        this.muscle = muscle;
        this.electrode = electrode;
        this.side = side;
    }

}

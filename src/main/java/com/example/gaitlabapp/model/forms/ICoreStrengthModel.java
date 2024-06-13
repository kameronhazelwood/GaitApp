package com.example.gaitlabapp.model.forms;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Setter
@Getter
@NoArgsConstructor
@Data
@Entity
@Table(name = "CoreStrength")
public class ICoreStrengthModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "coreStrengthId")
    private Integer coreStrengthId;
    @Column(name = "situpsCompleted")
    private Integer situpsCompleted;
    @Column(name = "situpCompletedInterp")
    private String situpCompletedInterp;
    @Column(name = "holdTime")
    private String holdTime;
    @Column(name = "holdTimeInterp")
    private String holdTimeInterp;
    @Column(name = "plank")
    private String plank;
    @Column(name = "plankInterp")
    private String plankInterp;

}

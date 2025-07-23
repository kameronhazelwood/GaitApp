package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "ground_reaction_forces")
public class IGroundReactionForces {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ground_id")
    private Integer groundId;
    @Column(name = "name")
    private String name;
    @Column(name = "normals")
    private String normals;
    @Column(name = "value")
    private Double value;
    @Column(name = "interp")
    private String interp;
}

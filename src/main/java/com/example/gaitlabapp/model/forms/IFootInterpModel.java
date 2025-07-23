package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "foot_Interp")
public class IFootInterpModel {
    @Id
    @GeneratedValue
    @Column(name = "foot_id")
    private Integer foodId;
    @Column(name = "name")
    private String name;
    @Column(name = "normals")
    private String normals;
    @Column(name = "value")
    private Double value;
    @Column(name = "interp")
    private String interp;

}

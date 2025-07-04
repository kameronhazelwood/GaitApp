package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Data
@Table(name = "variability")
public class IVariabilityModel {
    @Id
    @GeneratedValue
    @Column(name = "var_Id")
    private Integer varId;
    @Column(name =  "name")
    private String name;
    @Column(name = "value")
    private Double value;
    @Column(name = "normal")
    private String normal;
    @Column(name = "interp")
    private String interp;

}

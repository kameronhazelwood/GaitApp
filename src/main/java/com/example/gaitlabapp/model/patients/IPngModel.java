package com.example.gaitlabapp.model.patients;

import lombok.Data;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "PNG")
public class IPngModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "pngId")
    private Integer pngId;
    @Column(name = "label")
    private String label;
    @Column(name = "fileName")
    private String fileName;
    @Column(name = "subDir")
    private String subDir;
    @Column(name = "level")
    private Integer level;
    @Column(name = "sortOrder")
    private Integer sortOrder;
    @Column(name = "active")
    private Boolean active;

}

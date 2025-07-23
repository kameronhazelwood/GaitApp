package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "pedobaragraph")
public class IPedobaragraphModel {
    @Id
    @GeneratedValue
    @Column(name = "pedobaragraph_id")
    private Integer pedobaragraphId;
    @Column(name = "name")
    private String name;
    @Column(name = "value")
    private Double value;
    @Column(name = "interp")
    private String interp;
    @Column(name = "normals")
    private String normals;
}


package com.example.gaitlabapp.model.forms;

import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Data
@Entity
@Getter
@NoArgsConstructor
@Setter
@Table(name = "LabView")
public class ILabViewModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "labId")
    private Integer labId;
    @Column(name = "category")
    private String  category;
    @Column(name = "parameter")
    private String  parameter;
    @Column(name = "mean")
    private Integer mean;
    @Column(name = "sd")
    private Integer sd;

}

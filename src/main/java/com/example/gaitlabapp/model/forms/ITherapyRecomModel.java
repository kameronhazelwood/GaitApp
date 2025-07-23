package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@NoArgsConstructor
@Data
@Table(name = "recom_therapy")
public class ITherapyRecomModel {
    @Id
    @GeneratedValue
    @Column(name = "recom_therapy_id")
    private Integer recom_therapy_id;
    @Column(name = "recom_selected")
    private Boolean recom_selected;
    @Column(name = "recom_name")
    private String recom_name;

    public ITherapyRecomModel(Integer recom_therapy_id, Boolean recom_selected, String recom_name) {
        this.recom_therapy_id = recom_therapy_id;
        this.recom_selected = recom_selected;
        this.recom_name = recom_name;
    }
}

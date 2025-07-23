package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor(force = true)
@Data
@Table(name = "diag_recommendation")
public class IDiagRecommendations {
    @Id
    @GeneratedValue
    @Column(name = "diag_recom_id")
    private Integer diag_recom_id;
    @Column(name = "recom_name")
    private String recom_name;
    @Column(name = "recom_comments")
    private String recom_comments;
    @Column(name = "selected")
    private Boolean selected;

    public IDiagRecommendations(Integer diag_recom_id, String recom_name, String recom_comments, Boolean selected) {
        this.diag_recom_id = diag_recom_id;
        this.recom_name = recom_name;
        this.recom_comments = recom_comments;
        this.selected = selected;
    }
}

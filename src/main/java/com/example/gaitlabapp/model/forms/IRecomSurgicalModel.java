package com.example.gaitlabapp.model.forms;


import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "recom_surgical")
public class IRecomSurgicalModel {
    @Id
    @GeneratedValue
    @Column(name = "recom_surgical_id")
    private Integer recom_surgical_id;
    @Column(name = "recom_normal")
    private Boolean recom_normal;
    @Column(name = "recom_right")
    private Boolean recom_right;
    @Column(name = "recom_left")
    private Boolean recom_left;
    @Column(name = "recom_both")
    private Boolean recom_both;
    @Column(name = "recom_procedure")
    private String recom_procedure;

    public static enum Values{
        N,
        L,
        R,
        B;
    }
}

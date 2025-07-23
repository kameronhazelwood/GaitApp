package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "recom_orthotics")
public class IOrthoticsRecomModel {
    @Id
    @GeneratedValue
    @Column(name = "recom_orth_id")
    private Integer recom_orth_id;
    @Column(name = "recom_orth_normal")
    private Boolean recom_orth_normal;
    @Column(name = "recom_orth_left")
    private Boolean recom_orth_left;
    @Column(name = "recom_orth_right")
    private Boolean recom_orth_right;
    @Column(name = "recom_orth_both")
    private Boolean recom_orth_both;
    @Column(name = "recom_orth_procedure")
    private String recom_orth_procedure;

    public static enum Values{
        N,
        L,
        R,
        B;
    }

}

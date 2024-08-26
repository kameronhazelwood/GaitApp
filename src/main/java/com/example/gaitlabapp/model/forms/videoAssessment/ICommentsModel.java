package com.example.gaitlabapp.model.forms.videoAssessment;

import com.example.gaitlabapp.model.patients.IPatientModel;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Set;

@Setter
@Getter
@Data
@NoArgsConstructor
@Entity
@Table(name = "Comments")
public class ICommentsModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "comment_Id")
    private Integer commentId;
    @Column(name = "comments_On_Past")
    private String commentsOnPast;
    @Column(name = "eval_Comments")
    private String evalComments;
    @Column(name = "patientId")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

//    public ICommentsModel(Integer commentId, String commentsOnPast, String evalComments) {
//        this.commentId = commentId;
//        this.commentsOnPast = commentsOnPast;
//        this.evalComments = evalComments;
//    }

}

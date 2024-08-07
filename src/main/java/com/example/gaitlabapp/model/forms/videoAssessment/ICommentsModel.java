package com.example.gaitlabapp.model.forms.videoAssessment;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

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

//    public ICommentsModel(Integer commentId, String commentsOnPast, String evalComments) {
//        this.commentId = commentId;
//        this.commentsOnPast = commentsOnPast;
//        this.evalComments = evalComments;
//    }

}

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
    @Column(name = "commentId")
    private Integer commentId;
    @Column(name = "commentsOnPast")
    private String commentsOnPast;
    @Column(name = "evalComments")
    private String evalComments;

    public ICommentsModel(Integer commentId, String commentsOnPast, String evalComments) {
        this.commentId = commentId;
        this.commentsOnPast = commentsOnPast;
        this.evalComments = evalComments;
    }

}

package com.example.gaitlabapp.model.forms;

import jakarta.persistence.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Getter
@NoArgsConstructor
@Data
@Table(name = "assessment_issues")
public class IAssessmentIssuesModel {
    @Id
    @GeneratedValue
    @Column(name = "assessment_issues_id" )
    private Integer assessment_issues_id;
    @Column(name = "assessment_issue_comments")
    private String assessment_issue_comments;

}

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
@Table(name = "Trunk")
public class ITrunkClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trunkId")
    private Integer trunkId;
    @Column(name = "leftSideForward")
    private String leftSideForward;
    @Column(name = "rightSideForward")
    private String rightSideForward;
    @Column(name = "leftLurch")
    private String leftLurch;
    @Column(name = "rightLurch")
    private String rightLurch;
    @Column(name = "leftLeaning")
    private String leftLeaning;
    @Column(name = "rightLeaning")
    private String rightLeaning;
    @Column(name = "forwardLeaning")
    private String forwardLeaning;
    @Column(name = "posteriorLeaning")
    private String posteriorLeaning;
    @Column(name = "increasedLordosis")
    private String increasedLordosis;
    @Column(name = "increasedKyphosis")
    private String increasedKyphosis;


    public ITrunkClass(String leftSideForward, String rightSideForward, String leftLurch, String rightLurch, String leftLeaning, String rightLeaning, String forwardLeaning, String posteriorLeaning, String increasedLordosis, String increasedKyphosis, Integer trunkId) {
        this.leftSideForward = leftSideForward;
        this.rightSideForward = rightSideForward;
        this.leftLurch = leftLurch;
        this.rightLurch = rightLurch;
        this.leftLeaning = leftLeaning;
        this.rightLeaning = rightLeaning;
        this.forwardLeaning = forwardLeaning;
        this.posteriorLeaning = posteriorLeaning;
        this.increasedLordosis = increasedLordosis;
        this.increasedKyphosis = increasedKyphosis;
        this.trunkId = trunkId;
    }

}

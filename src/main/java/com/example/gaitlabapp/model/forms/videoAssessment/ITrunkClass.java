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
@Table(name = "Trunk")
public class ITrunkClass {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "trunk_Id")
    private Integer trunkId;
    @Column(name = "left_Side_Forward")
    private String leftSideForward;
    @Column(name = "right_Side_Forward")
    private String rightSideForward;
    @Column(name = "left_Lurch")
    private String leftLurch;
    @Column(name = "right_Lurch")
    private String rightLurch;
    @Column(name = "left_Leaning")
    private String leftLeaning;
    @Column(name = "right_Leaning")
    private String rightLeaning;
    @Column(name = "forward_Leaning")
    private String forwardLeaning;
    @Column(name = "posterior_Leaning")
    private String posteriorLeaning;
    @Column(name = "increased_Lordosis")
    private String increasedLordosis;
    @Column(name = "increased_Kyphosis")
    private String increasedKyphosis;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;


//    public ITrunkClass(String leftSideForward, String rightSideForward, String leftLurch, String rightLurch, String leftLeaning, String rightLeaning, String forwardLeaning, String posteriorLeaning, String increasedLordosis, String increasedKyphosis, Integer trunkId) {
//        this.leftSideForward = leftSideForward;
//        this.rightSideForward = rightSideForward;
//        this.leftLurch = leftLurch;
//        this.rightLurch = rightLurch;
//        this.leftLeaning = leftLeaning;
//        this.rightLeaning = rightLeaning;
//        this.forwardLeaning = forwardLeaning;
//        this.posteriorLeaning = posteriorLeaning;
//        this.increasedLordosis = increasedLordosis;
//        this.increasedKyphosis = increasedKyphosis;
//        this.trunkId = trunkId;
//    }

}

package com.example.gaitlabapp.model.patients;

import jakarta.persistence.criteria.CriteriaBuilder;
import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;
@Getter
@Data
@NoArgsConstructor(force = true)
@Entity
@Table(name = "health_history")
public class IHealthHistoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "health_history_id")
    @Setter
    private Integer healthHistoryId;
    @Column(name = "condition_age")
    @Setter
    private String conditionAge;
    @Column(name = "condition")
    @Setter
    private String condition;
    @Column(name = "patient_id")
    private Integer patientId;


    @ManyToMany
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patient_iD"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))

    Set<IPatientModel> patientID;

    public IHealthHistoryModel(Integer healthHistoryId, String conditionAge, String condition) {
        this.healthHistoryId = healthHistoryId;
        this.conditionAge = conditionAge;
        this.condition = condition;
    }


//    public IHealthHistoryModel(String healthHistoryId, String conditionAge, String condition) {
//        this.conditionAge = new SimpleStringProperty(conditionAge);
//        this.healthHistoryId = new SimpleStringProperty(healthHistoryId);
//        this.condition = new SimpleStringProperty(condition) ;
//    }
//    public String getConditionAge(){ return conditionAge.get(); }
//    public String getHealthHistoryId(){return healthHistoryId.get();}
//    public String getCondition(){ return condition.get(); }
//
//
//    public void setCondition(String condition){ this.condition.set(condition);}
//    public void setHealthHistoryId(String healthHistoryId){this.healthHistoryId.set(healthHistoryId);}
//    public void setConditionAge(String conditionAge){ this.conditionAge.set(conditionAge);}

}

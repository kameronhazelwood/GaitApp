package com.example.gaitlabapp.model.patients;

import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.Data;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Getter
@NoArgsConstructor(force = true)
@Entity
@Table(name = "HealthHistory")
public class IHealthHistoryModel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "healthHistoryId")
    @Setter
    private String healthHistoryId;
    @Column(name = "conditionAge")
    @Setter
    private String conditionAge;
    @Column(name = "condition")
    @Setter
    private String condition;

    public IHealthHistoryModel(String healthHistoryId, String conditionAge, String condition) {
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

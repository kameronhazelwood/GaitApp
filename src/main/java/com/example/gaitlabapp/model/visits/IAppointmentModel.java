package com.example.gaitlabapp.model.visits;


import javafx.beans.property.SimpleStringProperty;
import javafx.beans.property.StringProperty;
import lombok.*;
import jakarta.persistence.*;

@Data
@Getter
@Setter
@Entity
@NoArgsConstructor(force = true)
@Table(name = "Visits")
public class IAppointmentModel  {

    public enum Type{GAIT, UE, FOOT}

//    @Id
//    @GeneratedValue(strategy = GenerationType.AUTO)
//    @Column(name = "visitId")
//    private final StringProperty visitId;
    @Column(name = "aptDate")
    private final String aptDate;
//    @Column(name = "attended")
//    private final StringProperty attended;
//    @Column(name = "startTime")
//    private final StringProperty startTime;
//    @Column(name = "stopTime")
//    private final StringProperty stopTime;
//    @Column(name = "dateScheduled")
//    private final StringProperty dateScheduled;
    @Column(name = "visitType")
    private final String visitType;
//    @Column(name = "visitSubType")
//    private final StringProperty visitSubType;
//    @Column(name = "dateToEpic")
//    private final BooleanProperty dateToEpic;
//    @Column(name = "dateProcessed")
//    private final StringProperty dateProcessed;
//    @Column(name = "diagnosis")
//    private final StringProperty diagnosis;
//    @Column(name = "reasonForAnalysis")
//    private final StringProperty reasonForAnalysis;
//    @Column(name = "visitComments")
//    private final StringProperty visitComments;
//    @Column(name = "interpDate")
//    private final StringProperty interpDate;
//    @Column(name = "interpMD")
//    private final StringProperty interpMD;
//    @Column(name = "interpPT")
//    private final StringProperty interpPT;
    @Column(name = "referringPhys")
    private final String referringPhys;
//    @Column(name = "visitPT")
//    private final StringProperty visitPT;
//    @Column(name = "visitPT2")
//    private final StringProperty visitPT2;
//    @Column(name = "visitBioMech")
//    private final StringProperty visitBioMech;
//    @Column(name = "visitBioMech2")
//    private final StringProperty visitBioMech2;
    @Column(name = "type")
    private final Type type;

    public IAppointmentModel(String aptDate, String visitType, String referringPhys, Type type) {
        this.aptDate = aptDate;
        this.visitType = visitType;
        this.referringPhys = referringPhys;
        this.type = type;
    }

//    public String getAptDate(){
//        return aptDate.get();
//    }
//    public void setAptDate(String aptDate){this.aptDate.set(aptDate);}
//    public  StringProperty aptDateProperty(){return aptDate;}
//    public String getVisitType(){
//        return visitType.get();
//    }
//    public void setVisitType(String visitType){this.visitType.set(visitType);}
//    public StringProperty visitTypeProperty(){return visitType;}
//    public String getReferringMd(){
//        return  referringPhys.get();
//    }
//    public void setReferringMd(String referringMd){this.referringPhys.set(referringMd);}
//    public StringProperty referringMdProperty(){return referringPhys;}
////    public Type getType(){return type.get();}
////    public void setType(Type type){this.type.set(type);}
////    public Type typeProperty(){return type;}

}

package com.example.gaitlabapp.model.visits;


import com.example.gaitlabapp.model.patients.IPatientModel;
import javafx.beans.property.BooleanProperty;
import lombok.*;
import jakarta.persistence.*;

import java.util.Set;
@Data
@Entity
@NoArgsConstructor(force = true)
@Getter
@Table(name = "appointments")
public class IAppointmentModel  {

    public enum Type{GAIT, UE, FOOT, MOVEMENT, POSTOP}

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "apt_id")
    private final Integer aptId;
    @Column(name = "apt_date")
    @Setter
    private String aptDate;
//    @Column(name = "attended")
//    private final StringProperty attended;
//    @Column(name = "startTime")
//    private final StringProperty startTime;
//    @Column(name = "stopTime")
//    private final StringProperty stopTime;
//    @Column(name = "dateScheduled")
//    private final StringProperty dateScheduled;
    @Column(name = "visit_type")
    @Setter
    private  String visitType;
    @Column(name = "visit_sub_type")
    @Setter
    private String visitSubType;
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
    @Column(name = "referring_phys")
    @Setter
    private String referringPhys;
    @Column(name = "visitPT")
    @Setter
    private  String visitPT;
    @Column(name = "visitPT2")
    @Setter
    private  String visitPT2;
    @Column(name = "visitBioMech")
    @Setter
    private String visitBioMech;
    @Column(name = "visitBioMech2")
    @Setter
    private String visitBioMech2;
    @Column(name = "type")
    private final Type type;
    @Column(name = "test_reason")
    @Setter
    private String testReason;
    @Column(name = "patientId")
    private Integer patientId;
    private Boolean collected = true;


    @OneToMany(cascade = CascadeType.ALL)
    @JoinTable(name = "patients", joinColumns = @JoinColumn(referencedColumnName = "patientID"),
            inverseJoinColumns = @JoinColumn(name = "patient_id"))
    public Set<IPatientModel> patientModel;

    public IAppointmentModel(Integer aptId, String aptDate, String visitType, String visitSubType, String referringPhys, Type type, String testReason, Integer patientId, String visitBioMech2, String visitBioMech, String visitPT, String visitPT2) {
        this.aptId = aptId;
        this.aptDate = aptDate;
        this.visitType = visitType;
        this.visitSubType = visitSubType;
        this.referringPhys = referringPhys;
        this.type = type;
        this.testReason = testReason;
        this.patientId = patientId;
        this.visitPT = visitPT;
        this.visitPT2 = visitPT2;
        this.visitBioMech = visitBioMech;
        this.visitBioMech2 = visitBioMech2;
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

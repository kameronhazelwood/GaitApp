package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.config.Config;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import com.sun.javafx.charts.Legend;
import javafx.animation.PauseTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class VisitDetailsFootController implements Initializable {
    @Autowired
    ConfigurableApplicationContext applicationContext;
    public TextField FEaptDateSent;
    private IAppointmentModel appointmentModel;
    public TextField FEaptReferringMd;
    public TextField FEvisitBio;
    public TextField FEvisitPt;
    public TextField FEaptPT;
    public TextField FEaptMd;
    public TextField FEinterpDate;
    public TextField FEaptComment;
    public TextField FEAptReason;
    public TextField FEaptDiagnosis;
    public TextField FEaptDateProcessed;
    public TextField FEaptSubType;
    public TextField FEaptVisitType;
    public TextField FEaptDate;
    public TextField FEaptStopTime;
    public TextField FEaptStartTime;
    public TextField FEaptAttended;
    public TextField FEaptTime;
    public TextField FEdate;
    public TextField FEvisitBio2;
    public TextField FEvisitPt2;
    public TextField FEDateSentEpic;
    public Tab physExamFoot;
    @FXML
    private TextField patientId;
    @FXML
    private TextField aptVisitType;
    @FXML
    private TextField date;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
//            PauseTransition delay = new PauseTransition(Duration.seconds(1));
//
//            BorderPane borderPane = new BorderPane();
//            Scene currentScene=new Scene(borderPane,200,10);
//            Stage popoverStage= new Stage();
//
//            popoverStage.alwaysOnTopProperty();
//            popoverStage.initStyle(StageStyle.UTILITY);
//            popoverStage.setTitle("All changes have been saved.");
//            popoverStage.setScene(currentScene);
//            popoverStage.setY(650);
//            popoverStage.setX(100);
//            popoverStage.show();
//            delay.setOnFinished(event -> popoverStage.close());
//            delay.play();
//        });

    }

    IPatientModel patientModel;

    public void setPatient(IPatientModel patientModel){
        this.patientModel = patientModel;
        //mrnTextField.setText("32581055");

    }
    public void setAppointment(IAppointmentModel appointmentModel) {
        this.appointmentModel = appointmentModel;

        FEaptTime.setText(appointmentModel.getAptDate());
        FEaptVisitType.setText(appointmentModel.getVisitType());
        FEaptSubType.setText(appointmentModel.getVisitSubType());
        FEaptReferringMd.setText(appointmentModel.getReferringPhys());
        FEvisitPt.setText(appointmentModel.getVisitPT());
        FEvisitPt2.setText(appointmentModel.getVisitPT2());
        FEvisitBio2.setText(appointmentModel.getVisitBioMech2());
        FEvisitBio.setText(appointmentModel.getVisitBioMech());
        FEaptStartTime.setText("1:00pm");
        FEaptStopTime.setText("3:00pm");

    }
    public void selectedItem(MouseEvent mouseEvent) {
    }

    public void onViewCompendiumSideNav(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/FootEval/GenerateFootCompendium.fxml")));
        Stage stage1 = new Stage();
        popUp.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
        stage1.setTitle("Patient Compendium");
        stage1.setScene(new Scene(popUp, 800, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }

    public void onViewInterpretation(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/FootEval/GenerateFootInterpretation.fxml")));
        Stage stage1 = new Stage();
        popUp.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
        stage1.setTitle("Patient Interpretation");
        stage1.setScene(new Scene(popUp, 900, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }


}

package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.config.Config;
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

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;

public class VisitDetailsFootController implements Initializable {
    public TextField FEaptDateSent;
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
    Connection connection;
    Config db = new Config();
    Statement statement = null;
    public int visitId;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        String visitSQL = "UPDATE Visits SET patientID, aptDate , attended, startTime, stopTime, dateScheduled, visitType, visitSubType," +
//                "dateToEpic, dateProcessed, diagnosis, reasonForAnalysis, visitComment, interpDate, interpMD, interpPT,"
//                + "referringPhys, visitPT, visitPT2, visitBioMech, visitBioMech2 WHERE patientID='" + patientId.getText() + "' ";
//        ChangeListener<String> listener = ((observable, oldValue, newValue) -> {
//
//            try {
//                connection = db.getDBConnection();
//                PreparedStatement ps = connection.prepareStatement(visitSQL, Statement.RETURN_GENERATED_KEYS);
//
//                ps.setString(21, patientId.getText());
//                ps.setString(1, FEaptDate.getText());
//                ps.setString(2, FEaptAttended.getText());
//                ps.setString(3, FEaptStartTime.getText());
//                ps.setString(4, FEaptStopTime.getText());
//                ps.setString(5, FEdate.getText());
//                ps.setString(6, FEaptVisitType.getText());
//                ps.setString(7, FEaptSubType.getText());
//                ps.setString(8, FEDateSentEpic.getText());
//                ps.setString(9, FEaptDateProcessed.getText());
//                ps.setString(10, FEaptDiagnosis.getText());
//                ps.setString(11, FEAptReason.getText());
//                ps.setString(12, FEaptComment.getText());
//                ps.setString(13, FEinterpDate.getText());
//                ps.setString(14, FEaptMd.getText());
//                ps.setString(15, FEaptPT.getText());
//                ps.setString(16, FEvisitPt.getText());
//                ps.setString(17, FEvisitPt2.getText());
//                ps.setString(18, FEvisitBio.getText());
//                ps.setString(19, FEvisitBio2.getText());
//                ps.setString(20, FEaptReferringMd.getText());
//
//
//            } catch (Exception e) {
//                throw new RuntimeException(e);
//            }
//        });
//
//        FEdate.textProperty().addListener(listener);
//        FEaptStartTime.textProperty().addListener(listener);
//        FEaptTime.textProperty().addListener(listener);
//        FEaptAttended.textProperty().addListener(listener);
//        FEaptStopTime.textProperty().addListener(listener);
//        FEaptComment.textProperty().addListener(listener);
//        FEAptReason.textProperty().addListener(listener);
//        FEaptDateProcessed.textProperty().addListener(listener);
//        FEaptReferringMd.textProperty().addListener(listener);
//        FEvisitBio2.textProperty().addListener(listener);
//        FEvisitBio.textProperty().addListener(listener);
//        FEvisitPt.textProperty().addListener(listener);
//        FEvisitPt2.textProperty().addListener(listener);
//        FEaptMd.textProperty().addListener(listener);
//        FEinterpDate.textProperty().addListener(listener);
//        FEaptComment.textProperty().addListener(listener);
//        FEDateSentEpic.textProperty().addListener(listener);
//        FEaptSubType.textProperty().addListener(listener);
//        FEaptVisitType.textProperty().addListener(listener);
//        FEaptDate.textProperty().addListener(listener);


        physExamFoot.setOnSelectionChanged(e -> {
            PauseTransition delay = new PauseTransition(Duration.seconds(1));

            BorderPane borderPane = new BorderPane();
            Scene currentScene=new Scene(borderPane,200,10);
            Stage popoverStage= new Stage();

            popoverStage.alwaysOnTopProperty();
            popoverStage.initStyle(StageStyle.UTILITY);
            popoverStage.setTitle("All changes have been saved.");
            popoverStage.setScene(currentScene);
            popoverStage.setY(650);
            popoverStage.setX(100);
            popoverStage.show();
            delay.setOnFinished(event -> popoverStage.close());
            delay.play();
        });

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

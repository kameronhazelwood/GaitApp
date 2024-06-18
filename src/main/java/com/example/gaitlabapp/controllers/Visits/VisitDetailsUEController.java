package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.config.Config;
import javafx.animation.PauseTransition;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;


public class VisitDetailsUEController implements Initializable {

    public ComboBox ueFMS5;
    public TextField activeForProL;
    @FXML
    private RadioButton CPwK0;

    @FXML
    private RadioButton CPwK1;

    @FXML
    private RadioButton CPwK2;

    @FXML
    private RadioButton CPwK3;

    @FXML
    private RadioButton CPwK4;

    @FXML
    private RadioButton CPwK5;

    @FXML
    private RadioButton FP0;

    @FXML
    private RadioButton FP1;

    @FXML
    private RadioButton FP2;

    @FXML
    private RadioButton FP3;

    @FXML
    private RadioButton FP4;

    @FXML
    private RadioButton FP5;

    @FXML
    private ComboBox<?> FPFing;

    @FXML
    private ComboBox<?> FPThum;

    @FXML
    private RadioButton FS0;

    @FXML
    private RadioButton FS1;

    @FXML
    private RadioButton FS2;

    @FXML
    private RadioButton FS3;

    @FXML
    private RadioButton FS4;

    @FXML
    private RadioButton FS5;

    @FXML
    private RadioButton PAP0;

    @FXML
    private RadioButton PAP1;

    @FXML
    private RadioButton PAP2;

    @FXML
    private RadioButton PAP3;

    @FXML
    private RadioButton PAP4;

    @FXML
    private RadioButton PAP5;

    @FXML
    private RadioButton PSO0;

    @FXML
    private RadioButton PSO1;

    @FXML
    private RadioButton PSO2;

    @FXML
    private RadioButton PSO3;

    @FXML
    private RadioButton PSO4;

    @FXML
    private RadioButton PSO5;

    @FXML
    private RadioButton PSOB0;

    @FXML
    private RadioButton PSOB1;

    @FXML
    private RadioButton PSOB2;

    @FXML
    private RadioButton PSOB3;

    @FXML
    private RadioButton PSOB4;

    @FXML
    private RadioButton PSOB5;

    @FXML
    private RadioButton SB0;

    @FXML
    private RadioButton SB1;

    @FXML
    private RadioButton SB2;

    @FXML
    private RadioButton SB3;

    @FXML
    private RadioButton SB4;

    @FXML
    private RadioButton SB5;

    @FXML
    private ComboBox<?> SBFin;

    @FXML
    private ComboBox<?> SBThum;

    @FXML
    private RadioButton TP0;

    @FXML
    private RadioButton TP1;

    @FXML
    private RadioButton TP2;

    @FXML
    private RadioButton TP3;

    @FXML
    private RadioButton TP4;

    @FXML
    private RadioButton TP5;

    @FXML
    private ComboBox<?> TPFing;

    @FXML
    private ComboBox<?> TPThum;

    @FXML
    private RadioButton UBC0;

    @FXML
    private RadioButton UBC1;

    @FXML
    private RadioButton UBC2;

    @FXML
    private RadioButton UBC3;

    @FXML
    private RadioButton UBC4;

    @FXML
    private RadioButton UBC5;

    @FXML
    private TextField UEDateFinalized;

    @FXML
    private TextField UEDatePrinted;

    @FXML
    private ComboBox<?> UEFMS5;

    @FXML
    private TextField UEaptAttended;

    @FXML
    private TextField UEaptComment;

    @FXML
    private TextField UEaptDate;

    @FXML
    private TextField UEaptDateProcessed;

    @FXML
    private TextField UEaptDateSent;

    @FXML
    private TextField UEaptDiagnosis;

    @FXML
    private TextField UEaptMd;

    @FXML
    private TextField UEaptPT;

    @FXML
    private TextField UEaptReason;

    @FXML
    private TextField UEaptReferringMd;

    @FXML
    private TextField UEaptStartTime;

    @FXML
    private TextField UEaptStopTime;

    @FXML
    private TextField UEaptSubType;

    @FXML
    private TextField UEaptTime;

    @FXML
    private TextField UEaptVisitType;

    @FXML
    private TextField UEbiomech2;

    @FXML
    private TextField UEdate;

    @FXML
    private TextField UEdateSentToEpic;

    @FXML
    private TextField UEinterpDate;

    @FXML
    private TextField UEpt2;

    @FXML
    private TextField UEvisitBio;

    @FXML
    private TextField UEvisitPt;

    @FXML
    private ComboBox<?> UnscrewBotCapWrist1;

    @FXML
    private ComboBox<?> UnscrewBotCapWrist2;

    @FXML
    private ComboBox<?> acceptCoins;

    @FXML
    private TextField activeElbExL;

    @FXML
    private TextField activeElbExR;

    @FXML
    private TextField activeElbFexL;

    @FXML
    private TextField activeElbFexR;

    @FXML
    private TextField activeFinExtL;

    @FXML
    private TextField activeFinExtR;

    @FXML
    private TextField activeFinFlexL;

    @FXML
    private TextField activeFinFlexR;

    @FXML
    private TextField activeForProR;

    @FXML
    private TextField activeForeSupL;

    @FXML
    private TextField activeForeSupR;

    @FXML
    private TextField activeShouldExRot90L;

    @FXML
    private TextField activeShouldExRot90R;

    @FXML
    private TextField activeShouldInRot90L;

    @FXML
    private TextField activeShouldInRot90R;

    @FXML
    private TextField activeShoulderAbdL;

    @FXML
    private TextField activeShoulderAbdR;

    @FXML
    private TextField activeShoulderExRotL;

    @FXML
    private TextField activeShoulderExRotR;

    @FXML
    private TextField activeShoulderFlexL;

    @FXML
    private TextField activeShoulderFlexR;

    @FXML
    private TextField activeShoulderInRotL;

    @FXML
    private TextField activeShoulderInRotR;

    @FXML
    private TextField activeThuCMCPalL;

    @FXML
    private TextField activeThuCMCPalR;

    @FXML
    private TextField activeThuCMCRadL;

    @FXML
    private TextField activeThuCMCRadR;

    @FXML
    private TextField activeThuMCPL;

    @FXML
    private TextField activeThuMCPR;

    @FXML
    private TextField activeThuOppL;

    @FXML
    private TextField activeThuOppR;

    @FXML
    private TextField activeWristExL;

    @FXML
    private TextField activeWristExR;

    @FXML
    private TextField activeWristFlexL;

    @FXML
    private TextField activeWristFlexR;

    @FXML
    private TextField activeWristRadL;

    @FXML
    private TextField activeWristRadR;

    @FXML
    private TextField activeWristUlL;

    @FXML
    private TextField activeWristUlR;

    @FXML
    private ComboBox<?> crawl;

    @FXML
    private ComboBox<?> cutPlay1;

    @FXML
    private ComboBox<?> cutPlay2;

    @FXML
    private Tab dataTab;

    @FXML
    private TreeView<String> dataTable;

    @FXML
    private TextField distalMuscL;

    @FXML
    private ComboBox<?> distalMuscLinterp;

    @FXML
    private TextField distalMuscR;

    @FXML
    private ComboBox<?> distalMuscRinterp;

    @FXML
    private ComboBox<?> earWithPalm;

    @FXML
    private TextField elbExtL;

    @FXML
    private ComboBox<?> elbExtLInterp;

    @FXML
    private TextField elbExtR;

    @FXML
    private ComboBox<?> elbExtRInterp;

    @FXML
    private TextField elbFlexL;

    @FXML
    private ComboBox<?> elbFlexLinterp;

    @FXML
    private TextField elbFlexR;

    @FXML
    private ComboBox<?> elbFlexRInterp;

    @FXML
    private ComboBox<?> fastenShow;

    @FXML
    private CheckBox fastenerAssist;

    @FXML
    private TextField fastenersComments;

    @FXML
    private CheckBox fastenersDep;

    @FXML
    private CheckBox fastenersIndep;

    @FXML
    private ComboBox<?> handToMouth;

    @FXML
    private CheckBox hygieneAssist;

    @FXML
    private TextField hygieneComments;

    @FXML
    private CheckBox hygieneDept;

    @FXML
    private CheckBox hygieneIndep;

    @FXML
    private TextField lFootLength;

    @FXML
    private TextField lFootWidth;

    @FXML
    private CheckBox leAssist;

    @FXML
    private TextField leComments;

    @FXML
    private CheckBox leDependent;

    @FXML
    private CheckBox leIndependent;

    @FXML
    private RadioButton mfw1;

    @FXML
    private RadioButton mfw2;

    @FXML
    private RadioButton mfw3;

    @FXML
    private RadioButton mfw4;

    @FXML
    private RadioButton mfw5;

    @FXML
    private ComboBox<?> mfwFing;

    @FXML
    private ComboBox<?> mfwThum;

    @FXML
    private RadioButton mwf0;

    @FXML
    private CheckBox orthoAssist;

    @FXML
    private TextField orthoComm;

    @FXML
    private CheckBox orthoIndep;

    @FXML
    private CheckBox orthodep;

    @FXML
    private TextField passiveElbExL;

    @FXML
    private TextField passiveElbExR;

    @FXML
    private TextField passiveElbFexL;

    @FXML
    private TextField passiveElbFexR;

    @FXML
    private TextField passiveFinExtL;

    @FXML
    private TextField passiveFinExtR;

    @FXML
    private TextField passiveFinFlexL;

    @FXML
    private TextField passiveFinFlexR;

    @FXML
    private TextField passiveForProL;

    @FXML
    private TextField passiveForProR;

    @FXML
    private TextField passiveForeSupL;

    @FXML
    private TextField passiveForeSupR;

    @FXML
    private TextField passiveShouldExRot90L;

    @FXML
    private TextField passiveShouldExRot90R;

    @FXML
    private TextField passiveShouldInRot90L;

    @FXML
    private TextField passiveShouldInRot90R;

    @FXML
    private TextField passiveShoulderAbdL;

    @FXML
    private TextField passiveShoulderAbdR;

    @FXML
    private TextField passiveShoulderExRotL;

    @FXML
    private TextField passiveShoulderExRotR;

    @FXML
    private TextField passiveShoulderFlexL;

    @FXML
    private TextField passiveShoulderFlexR;

    @FXML
    private TextField passiveThuCMCPalL;

    @FXML
    private TextField passiveThuCMCPalR;

    @FXML
    private TextField passiveThuCMCRadL;

    @FXML
    private TextField passiveThuCMCRadR;

    @FXML
    private TextField passiveThuMCPL;

    @FXML
    private TextField passiveThuMCPR;

    @FXML
    private TextField passiveThuOppL;

    @FXML
    private TextField passiveThuOppR;

    @FXML
    private TextField passiveWristExL;

    @FXML
    private TextField passiveWristExR;

    @FXML
    private TextField passiveWristFlexL;

    @FXML
    private TextField passiveWristFlexR;

    @FXML
    private TextField passiveWristRadL;

    @FXML
    private TextField passiveWristRadR;

    @FXML
    private TextField passiveWristUlL;

    @FXML
    private TextField passiveWristUlR;

    @FXML
    private TextField passtiveShoulderInRotL;

    @FXML
    private TextField passtiveShoulderInRotR;

    @FXML
    private Tab physExamUE;

    @FXML
    private TextField promxMuscL;

    @FXML
    private ComboBox<?> promxMuscLinterp;

    @FXML
    private TextField promxMuscR;

    @FXML
    private ComboBox<?> promxMuscRinterp;

    @FXML
    private ComboBox<?> pullApartPlay1;

    @FXML
    private ComboBox<?> pullApartPlay2;

    @FXML
    private TextField rFootLength;

    @FXML
    private TextField rFootWidth;

    @FXML
    private ComboBox<?> recieve5;

    @FXML
    private Tab reportTab;

    @FXML
    private CheckBox shoesAssist;

    @FXML
    private TextField shoesComments;

    @FXML
    private CheckBox shoesDepen;

    @FXML
    private CheckBox shoesDepend;

    @FXML
    private CheckBox shoesIndep;

    @FXML
    private TextField shoulderExtL;

    @FXML
    private ComboBox<?> shoulderExtLInterp;

    @FXML
    private TextField shoulderExtR;

    @FXML
    private ComboBox<?> shoulderExtRInterp;

    @FXML
    private TextField shoulderFexL;

    @FXML
    private TextField shoulderFexR;

    @FXML
    private ComboBox<?> shoulderFexRInterp;

    @FXML
    private Button sideNavCompen;

    @FXML
    private Button sideNavInterp;

    @FXML
    private CheckBox socksAssist;

    @FXML
    private TextField socksComments;

    @FXML
    private CheckBox socksIndep;

    @FXML
    private ComboBox<?> socksOn;

    @FXML
    private ComboBox<?> stickerOnBall;

    @FXML
    private CheckBox ueAssist;

    @FXML
    private TextArea ueComments;

    @FXML
    private TextField ueComments2;

    @FXML
    private CheckBox ueDependent;

    @FXML
    private ComboBox<?> ueFMS50;

    @FXML
    private ComboBox<?> ueFMS500;

    @FXML
    private ComboBox<?> ueGMFCS;

    @FXML
    private TextField ueHeight;

    @FXML
    private CheckBox ueIndependent;

    @FXML
    private ComboBox<?> ueMACS;

    @FXML
    private TextField ueWeight;

    @FXML
    private ComboBox<?> wristExtGrasp;

    @FXML
    private TextField wristExtL;

    @FXML
    private ComboBox<?> wristExtLInterp;

    @FXML
    private TextField wristExtR;

    @FXML
    private ComboBox<?> wristExtRInterp;

    @FXML
    private ComboBox<?> wristExtRelease;

    @FXML
    private ComboBox<?> wristFlexGrasp;

    @FXML
    private TextField wristFlexL;

    @FXML
    private ComboBox<?> wristFlexLinterp;

    @FXML
    private TextField wristFlexR;

    @FXML
    private ComboBox<?> wristFlexRelease;

    @FXML
    private ComboBox<?> wristFlexRinterp;

    @FXML
    private ComboBox<?> wristNeutGrasp;

    @FXML
    private ComboBox<?> wristNeutRelease;


    //parent root
    TreeItem<String> parentDataRoot = new TreeItem<>("");
    TreeItem<String> parentPhotoVideoRoot = new TreeItem<>("");
    // data types
    TreeItem<String> showAll = new TreeItem<>("Show all");
    TreeItem<String> pngFiles = new TreeItem<String>("PNG Files");
    TreeItem<String> photos = new TreeItem<>("Photos");
    TreeItem<String> videos = new TreeItem<>("Videos");
    TreeItem<String> compendium = new TreeItem<>("Compendium");
    TreeItem<String> interpretation = new TreeItem<>("Interpretation");

    TreeItem<String> kinematics = new TreeItem<>("Kinematics");
    TreeItem<String> footKinematics = new TreeItem<>("Foot Kinematics");
    TreeItem<String> kinetics = new TreeItem<>("Kinetics");
    TreeItem<String> hipJointAngles = new TreeItem<>("Hip Joint Angles");
    TreeItem<String> ankleJointAngles = new TreeItem<>("Ankle Joint Angles");

    TreeItem<String> lateralForefoot = new TreeItem<>("Lateral Forefoot");
    TreeItem<String> medialForefoot = new TreeItem<>("Medial Forefoot");
    TreeItem<String> hipJoint = new TreeItem<>("Hip Joint Moments");
    TreeItem<String> kneeJoint = new TreeItem<>("Knee Joint Moments");
    TreeItem<String> ankleJoint = new TreeItem<>("Ankle Joint Moments");
    Connection connection;
    Config db = new Config();
    Statement statement = null;
    private TextField patientId;
    int patientID = 13;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        /*
        visit update query
         */

        String visitSQL = "UPDATE Visits SET  aptDate=? , attended=?, startTime=?, stopTime=?, dateScheduled=?, visitType=?, visitSubType=?," +
                "dateToEpic=?, dateProcessed=?, diagnosis=?, reasonForAnalysis=?, visitComment=?, interpDate=?, interpMD=?, interpPT=?,"
                + "referringPhys=?, visitPT=?, visitPT2=?, visitBioMech=?, visitBioMech2=? WHERE patientID='" + patientId + "' ";
        ChangeListener<String> listener = ((observable, oldValue, newValue) -> {

            try {
                connection = db.getDBConnection();
                PreparedStatement ps = connection.prepareStatement(visitSQL, Statement.RETURN_GENERATED_KEYS);

                ps.setString(1, UEaptDate.getText());
                ps.setString(2, UEaptAttended.getText());
                ps.setString(3, UEaptStartTime.getText());
                ps.setString(4, UEaptStopTime.getText());
                ps.setString(5, UEdate.getText());
                ps.setString(6, UEaptVisitType.getText());
                ps.setString(7, UEaptSubType.getText());
                ps.setString(8, UEdateSentToEpic.getText());
                ps.setString(9, UEaptDateProcessed.getText());
                ps.setString(10, UEaptDiagnosis.getText());
                ps.setString(11, UEaptReason.getText());
                ps.setString(12, UEaptComment.getText());
                ps.setString(13, UEinterpDate.getText());
                ps.setString(14, UEaptMd.getText());
                ps.setString(15, UEaptPT.getText());
                ps.setString(16, UEvisitPt.getText());
                ps.setString(17, UEpt2.getText());
                ps.setString(18, UEvisitBio.getText());
                ps.setString(19, UEbiomech2.getText());
                ps.setString(20, UEaptReferringMd.getText());


            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        });

        UEdate.textProperty().addListener(listener);
        UEaptStartTime.textProperty().addListener(listener);
        UEaptTime.textProperty().addListener(listener);
        UEaptAttended.textProperty().addListener(listener);
        UEaptStopTime.textProperty().addListener(listener);
        UEaptComment.textProperty().addListener(listener);
        UEaptReason.textProperty().addListener(listener);
        UEaptDateProcessed.textProperty().addListener(listener);
        UEaptReferringMd.textProperty().addListener(listener);
        UEbiomech2.textProperty().addListener(listener);
        UEvisitBio.textProperty().addListener(listener);
        UEvisitPt.textProperty().addListener(listener);
        UEpt2.textProperty().addListener(listener);
        UEaptMd.textProperty().addListener(listener);
        UEinterpDate.textProperty().addListener(listener);
        UEaptComment.textProperty().addListener(listener);
        UEdateSentToEpic.textProperty().addListener(listener);
        UEaptSubType.textProperty().addListener(listener);
        UEaptVisitType.textProperty().addListener(listener);
        UEaptDate.textProperty().addListener(listener);

        /*
        ue phys exam update queries.
         */

        String genMarkerInfoUpdateQuery =  "UPDATE GenMarkInfo SET "
                + "height=?,"
                + "weight=?,"
                + "leftFootLength=?,"
                + "rightFootLength= ?,"
                + "rightFootWidth=?,"
                + "leftFootWidth=?,"
                + "macs=?,"
                + "gmfcs=?,"
                + "fms5m=?,"
                + "fms50m=?,"
                + "fms500m=?  WHERE patientID = '"+patientID+"'";

        ChangeListener<String > genMarkerInfoListener = ((obs, newValue, oldValue) -> {

            try {
                connection = db.getDBConnection();
                PreparedStatement ps = connection.prepareStatement(genMarkerInfoUpdateQuery);
                ps.setString(1, ueHeight.getText());
                ps.setString(2, ueWeight.getText());
                ps.setString(3, lFootLength.getText());
                ps.setString(4, rFootLength.getText());
                ps.setString(5, rFootWidth.getText());
                ps.setString(6, lFootWidth.getText());
//                ps.setString(7, ueMACS.getSelectionModel().getSelectedItem().toString());
//                ps.setString(8, ueGMFCS.getSelectionModel().getSelectedItem().toString());
//                ps.setString(9, ueFMS5.getSelectionModel().getSelectedItem().toString());
//                ps.setString(10, ueFMS50.getSelectionModel().getSelectedItem().toString());
//                ps.setString(11, ueFMS500.getSelectionModel().getSelectedItem().toString());

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });

        ueHeight.textProperty().addListener(genMarkerInfoListener);
        ueWeight.textProperty().addListener(genMarkerInfoListener);
        lFootLength.textProperty().addListener(genMarkerInfoListener);
        rFootLength.textProperty().addListener(genMarkerInfoListener);
        rFootWidth.textProperty().addListener(genMarkerInfoListener);
        lFootWidth.textProperty().addListener(genMarkerInfoListener);
//        ueMACS.getSelectionModel().selectedItemProperty().addListener((InvalidationListener) genMarkerInfoListener);
//        ueGMFCS.getSelectionModel().selectedItemProperty().addListener((InvalidationListener) genMarkerInfoListener);
//        ueFMS5.getSelectionModel().selectedItemProperty().addListener((InvalidationListener) genMarkerInfoListener);
//        ueFMS50.getSelectionModel().selectedItemProperty().addListener((InvalidationListener) genMarkerInfoListener);
//        ueFMS500.getSelectionModel().selectedItemProperty().addListener((InvalidationListener) genMarkerInfoListener);
        /*
        ADL update query
         */
        String ADLUpdateQuery = "UPDATE ADL SET "
                + "ueDressingIndep=?,"
                + "leDressingIndep=?, leDressingAssist, leDressingComments,"
                + "orthotic=?, ueDressingDep=?, leDressingDep=?, ueDressingAssist=?, ueDressingComments=?,"
                + "adlShoes=?, orthAssist=?, orthIndep=?, orthDep=?, orthComments=?,"
                + "adlSocks=?,"
                + "adlFasteners=?,"
                + "adlHygiene=? WHERE patientID = '"+patientID+"'";
        ChangeListener<String> ADLListener = ((obs, newValue, oldValue) -> {
            try {
                connection = db.getDBConnection();
                PreparedStatement ps = connection.prepareStatement(ADLUpdateQuery);
                ps.setString(1, ueIndependent.getText());
                ps.setString(2, leDependent.getText());
                ps.setString(3, leAssist.getText());
                ps.setString(4, leComments.getText());
                ps.setString(5, ueDependent.getText());
                ps.setString(6, leDependent.getText());
                ps.setString(7, ueAssist.getText());
                ps.setString(8, ueComments.getText());
                ps.setString(9, shoesAssist.getText());
                ps.setString(10, socksAssist.getText());
                ps.setString(11, fastenerAssist.getText());

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        ueIndependent.textProperty().addListener(ADLListener);
        leDependent.textProperty().addListener(ADLListener);
        leAssist.textProperty().addListener(ADLListener);
        leComments.textProperty().addListener(ADLListener);
        ueDependent.textProperty().addListener(ADLListener);
        leDependent.textProperty().addListener(ADLListener);
        ueAssist.textProperty().addListener(ADLListener);
        ueComments.textProperty().addListener(ADLListener);
        shoesAssist.textProperty().addListener(ADLListener);
        socksAssist.textProperty().addListener(ADLListener);
        fastenerAssist.textProperty().addListener(ADLListener);

        /*
        AROM Update Query
         */
        String AROMUpdateQuery = "UPDATE AROM SET shoulderAbductionR_act=?, shoulderAbductionR_pass=?, shoulderAbductionL_act=?," +
                " shoulderAbductionL_pass=?, shoulderFlexR_act=?, shoulderFlexR_pass=?, shoulderFlexL_act=?, shoulderFlexL_pass=?," +
                " shoulderInternRotR_act=?, shoulderInternRotR_pass=?, shoulderInternRotL_act=?, shoulderInternRotL_pass=?, " +
                "shoulderExtRotR_act=?, shoulderExtRotL_act=?, shoulderExtRotR_pass=?, shoulderExtRotL_pass=?, shoulderInternRot90R_act=?, " +
                "shoulderInternRot90R_pass=?, shoulderInternRot90L_act=?, shoulderInternRot90L_pass=?, shoulderExtRot90R_act=?, " +
                "shoulderExtRot90R_pass=?, " +
                "shoulderExtRot90L_act=?, shoulderExtRot90L_pass=?, elbowFlexR_act=?, elbowFlexR_pass=?, elbowFlexL_act=?, elbowFlexL_pass=?," +
                " elbowExtR_act=?, elbowExtR_pass=?, elbowExtL_pass=?, elbowExtR_act=?, forearmSupR_act=?, forearmSupR_pass=?," +
                " forearmSupL_act=?, forearmSupL_pass=?, forearmProL_pass=?, " +
                "forearmProL_act=?, forearmProR_pass=?, forearmProR_act=?, " +
                "wristFlexR_act=?, wristFlexR_pass=?, wristFlexL_act=?, wristFlexL_pass=?, wristExtR_pass=?, wristExtR_act=?," +
                " wristExtL_act=?, wristExtR_pass=?, wristUlnarDevR_pass=?, wristUlnarDevR_act=?, wristUlnarDevL_pass=?," +
                " wristUlnarDevL_act=?, wristRadialDevR_act=?, wristRadialDevR_pass=?, wristRadialDevL_act=?, wristRadialDevL_pass=?," +
                " fingerFlexR_act=?, fingerFlexR_pass=?, fingerFlexL_act=?, fingerFlexL_pass=?, fingerExtR_act=?, fingerExtR_pass=?, " +
                "fingerExtL_act=?, fingerExtL_pass=?, thumbPalmerR_pass=?, thumbPalmerR_act=?, thumbPalmerL_pass=?, thumbPalmerL_act=?, " +
                "thumbMcpR_pass=?, thumbMcpR_act=?, thumbMcpL_act=?, thumbMcpL_pass=?, thumbOppL_act=?, thumbOppL_pass=?, thumbOppR_act=?," +
                " thumbOppR_pass=?"
                + "WHERE patientID = '"+patientID+"'";
        ChangeListener<String> AROMListener = ((obs, newValue, oldValue) -> {
            try {
                connection = db.getDBConnection();
                PreparedStatement ps = connection.prepareStatement(AROMUpdateQuery);
                ps.setString(1, activeShoulderAbdR.getText());
                ps.setString(2, passiveShoulderAbdR.getText());
                ps.setString(3, activeShoulderAbdL.getText());
                ps.setString(4, passiveShoulderAbdL.getText());
                ps.setString(5, activeShoulderFlexR.getText());
                ps.setString(6, passiveShoulderFlexR.getText());
                ps.setString(7, activeShoulderFlexL.getText());
                ps.setString(8, passiveShoulderFlexL.getText());
                ps.setString(9, activeShoulderInRotR.getText());
                ps.setString(10, passtiveShoulderInRotR.getText());
                ps.setString(11, activeShoulderInRotL.getText());
                ps.setString(12, passtiveShoulderInRotL.getText());
                ps.setString(13, activeShoulderExRotR.getText());
                ps.setString(14, activeShoulderExRotL.getText());
                ps.setString(15, passiveShoulderExRotR.getText());
                ps.setString(16, passiveShoulderExRotL.getText());
                ps.setString(17, activeShouldInRot90R.getText());
                ps.setString(18, passiveShouldInRot90R.getText());
                ps.setString(19, activeShouldInRot90L.getText());
                ps.setString(20, passiveShouldInRot90L.getText());
                ps.setString(21, activeShouldExRot90R.getText());
                ps.setString(22, passiveShouldExRot90R.getText());
                ps.setString(23, activeShouldExRot90L.getText());
                ps.setString(24, passiveShouldExRot90L.getText());
                ps.setString(25, activeElbFexR.getText());
                ps.setString(26, passiveElbFexR.getText());
                ps.setString(27, activeElbFexL.getText());
                ps.setString(28, passiveElbFexL.getText());
                ps.setString(29, activeElbExR.getText());
                ps.setString(30, passiveElbExR.getText());
                ps.setString(31, passiveElbExL.getText());
                ps.setString(32, activeElbExL.getText());
                ps.setString(33, activeForeSupR.getText());
                ps.setString(34, passiveForeSupR.getText());
                ps.setString(35, activeForeSupL.getText());
                ps.setString(36, passiveForeSupL.getText());
                ps.setString(37, passiveForProL.getText());
                ps.setString(38, activeForProL.getText());
                ps.setString(39, passiveForProR.getText());
                ps.setString(40, activeForProR.getText());
                ps.setString(41, activeWristFlexR.getText());
                ps.setString(42, passiveWristFlexR.getText());
                ps.setString(43, activeWristFlexL.getText());
                ps.setString(44, passiveWristFlexL.getText());
                ps.setString(45, passiveWristExR.getText());
                ps.setString(46, activeWristExR.getText());
                ps.setString(47, activeWristExL.getText());
                ps.setString(48, passiveWristExL.getText());
                ps.setString(49, passiveWristUlR.getText());
                ps.setString(50, activeWristUlR.getText());
                ps.setString(51, passiveWristUlL.getText());
                ps.setString(52, activeWristUlL.getText());
                ps.setString(53, activeWristRadR.getText());
                ps.setString(54, passiveWristRadR.getText());
                ps.setString(55, activeWristRadL.getText());
                ps.setString(56, passiveWristRadL.getText());
                ps.setString(57, activeFinFlexR.getText());
                ps.setString(58, passiveFinFlexR.getText());
                ps.setString(59, activeFinFlexL.getText());
                ps.setString(60, passiveFinFlexL.getText());
                ps.setString(61, activeFinExtR.getText());
                ps.setString(62, passiveFinExtR.getText());
                ps.setString(63, activeFinExtL.getText());
                ps.setString(64, passiveFinExtL.getText());
                ps.setString(65, passiveThuCMCPalR.getText());
                ps.setString(66, activeThuCMCPalR.getText());
                ps.setString(67, passiveThuCMCPalL.getText());
                ps.setString(68, activeThuCMCPalL.getText());
                ps.setString(69, passiveThuMCPR.getText());
                ps.setString(70, activeThuMCPR.getText());
                ps.setString(71, activeThuMCPL.getText());
                ps.setString(72, passiveThuMCPL.getText());
                ps.setString(73, activeThuOppL.getText());
                ps.setString(74, passiveThuOppL.getText());
                ps.setString(75, activeThuOppR.getText());
                ps.setString(76, passiveThuOppR.getText());

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }
        });
        activeShoulderAbdR.textProperty().addListener(AROMListener);
        passiveShoulderAbdR.textProperty().addListener(AROMListener);
        activeShoulderAbdL.textProperty().addListener(AROMListener);
        passiveShoulderAbdL.textProperty().addListener(AROMListener);
        activeShoulderFlexR.textProperty().addListener(AROMListener);
        passiveShoulderFlexR.textProperty().addListener(AROMListener);
        activeShoulderFlexL.textProperty().addListener(AROMListener);
        passiveShoulderFlexL.textProperty().addListener(AROMListener);
        activeShoulderInRotR.textProperty().addListener(AROMListener);
        passtiveShoulderInRotL.textProperty().addListener(AROMListener);
        activeShoulderInRotR.textProperty().addListener(AROMListener);
        passtiveShoulderInRotR.textProperty().addListener(AROMListener);
        activeShoulderExRotR.textProperty().addListener(AROMListener);
        activeShoulderExRotL.textProperty().addListener(AROMListener);
        passiveShoulderExRotR.textProperty().addListener(AROMListener);
        passiveShoulderExRotL.textProperty().addListener(AROMListener);
        activeShoulderInRotR.textProperty().addListener(AROMListener);
        passiveShouldInRot90R.textProperty().addListener(AROMListener);
        activeShouldInRot90L.textProperty().addListener(AROMListener);
        passiveShouldInRot90L.textProperty().addListener(AROMListener);
        activeShouldExRot90R.textProperty().addListener(AROMListener);
        passiveShouldExRot90R.textProperty().addListener(AROMListener);
        activeShouldExRot90L.textProperty().addListener(AROMListener);
        passiveShouldExRot90L.textProperty().addListener(AROMListener);
        activeElbFexR.textProperty().addListener(AROMListener);
        passiveElbFexR.textProperty().addListener(AROMListener);
        activeElbFexL.textProperty().addListener(AROMListener);
        passiveElbFexL.textProperty().addListener(AROMListener);
        activeElbFexR.textProperty().addListener(AROMListener);
        activeElbExL.textProperty().addListener(AROMListener);
        passiveElbExL.textProperty().addListener(AROMListener);
        activeElbExR.textProperty().addListener(AROMListener);
        passiveElbExR.textProperty().addListener(AROMListener);
        activeForeSupR.textProperty().addListener(AROMListener);
        passiveForeSupR.textProperty().addListener(AROMListener);
        activeForeSupL.textProperty().addListener(AROMListener);
        passiveForeSupL.textProperty().addListener(AROMListener);
        passiveForProL.textProperty().addListener(AROMListener);
        activeForProL.textProperty().addListener(AROMListener);
        passiveForProR.textProperty().addListener(AROMListener);
        activeForProR.textProperty().addListener(AROMListener);
        activeWristFlexR.textProperty().addListener(AROMListener);
        activeWristFlexL.textProperty().addListener(AROMListener);
        passiveWristFlexL.textProperty().addListener(AROMListener);
        passiveWristFlexR.textProperty().addListener(AROMListener);
        passiveWristExR.textProperty().addListener(AROMListener);
        activeWristExR.textProperty().addListener(AROMListener);
        passiveWristExL.textProperty().addListener(AROMListener);
        activeWristExL.textProperty().addListener(AROMListener);
        passiveWristUlR.textProperty().addListener(AROMListener);
        activeWristUlR.textProperty().addListener(AROMListener);
        passiveWristUlL.textProperty().addListener(AROMListener);
        activeWristUlL.textProperty().addListener(AROMListener);
        activeWristRadR.textProperty().addListener(AROMListener);
        passiveWristRadR.textProperty().addListener(AROMListener);
        activeWristRadL.textProperty().addListener(AROMListener);
        passiveWristRadL.textProperty().addListener(AROMListener);
        activeFinFlexR.textProperty().addListener(AROMListener);
        passiveFinFlexR.textProperty().addListener(AROMListener);
        activeFinFlexL.textProperty().addListener(AROMListener);
        passiveFinFlexL.textProperty().addListener(AROMListener);
        activeFinExtR.textProperty().addListener(AROMListener);
        passiveFinExtR.textProperty().addListener(AROMListener);
        activeFinExtL.textProperty().addListener(AROMListener);
        passiveFinExtL.textProperty().addListener(AROMListener);
        passiveThuCMCPalR.textProperty().addListener(AROMListener);
        activeThuCMCPalR.textProperty().addListener(AROMListener);
        passiveThuCMCPalL.textProperty().addListener(AROMListener);
        activeThuCMCPalL.textProperty().addListener(AROMListener);
        passiveThuMCPR.textProperty().addListener(AROMListener);
        activeThuMCPR.textProperty().addListener(AROMListener);
        passiveThuMCPL.textProperty().addListener(AROMListener);
        activeThuMCPL.textProperty().addListener(AROMListener);
        activeThuOppL.textProperty().addListener(AROMListener);
        passiveThuOppL.textProperty().addListener(AROMListener);
        activeThuOppR.textProperty().addListener(AROMListener);
        passiveThuOppL.textProperty().addListener(AROMListener);




        physExamUE.setOnSelectionChanged(e -> {
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




















        // adding to the tree view
        kinematics.getChildren().addAll(hipJointAngles, ankleJointAngles);
        footKinematics.getChildren().addAll(lateralForefoot, medialForefoot);
        kinetics.getChildren().addAll(hipJoint, kneeJoint, ankleJoint);
        pngFiles.getChildren().addAll(kinematics);
        pngFiles.getChildren().addAll(footKinematics);
        pngFiles.getChildren().addAll(kinetics);

        parentDataRoot.getChildren().addAll(showAll);
        parentDataRoot.getChildren().addAll(pngFiles);

        parentDataRoot.setExpanded(true);
        dataTable.setRoot(parentDataRoot);
        this.dataTable.setShowRoot(false);
    }

    Image lateralForeFoot = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_LateralForeFoot.png")));
    Image kneeJointMoments = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_KneeJointMoments.png")));
    Image kneeJointAngles = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_KneeJointAngles.png")));
    Image hipJointMoments = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_HipJointMoments.png")));
    Image hipJointAnglesImage = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_HipJointAngles.png")));
    Image medialForeFoot = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_MedialForeFoot.png")));
    Image comparisonPhoto = new Image(String.valueOf(getClass().getResource("/images/comparison.png")));

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;


    public void selectedItem() throws IOException {
        TreeItem<String> item = dataTable.getSelectionModel().getSelectedItem();
        if (item.equals(showAll)) {
            Pane pane = new Pane();
            ImageView imageView1 = new ImageView(kneeJointAngles);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            ImageView imageView3 = new ImageView(hipJointAnglesImage);
            ImageView imageView4 = new ImageView(comparisonPhoto);
            ImageView imageView5 = new ImageView(hipJointAnglesImage);
            ImageView imageView6 = new ImageView(comparisonPhoto);
            ImageView imageView7 = new ImageView(lateralForeFoot);
            ImageView imageView8 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(300);
            imageView1.setFitHeight(300);
            imageView1.setTranslateY(0);
            imageView1.setTranslateX(0);
            //image2
            imageView2.setFitHeight(300);
            imageView2.setFitWidth(300);
            imageView2.setTranslateY(0);
            imageView2.setTranslateX(310);

            //image 3
            imageView3.setFitHeight(300);
            imageView3.setFitWidth(300);
            imageView3.setTranslateY(310);
            imageView3.setTranslateX(0);

            //image 4
            imageView4.setFitWidth(300);
            imageView4.setFitHeight(300);
            imageView4.setTranslateY(310);
            imageView4.setTranslateX(310);

            //image 5
            imageView5.setFitHeight(300);
            imageView5.setFitWidth(300);
            imageView5.setTranslateY(0);
            imageView5.setTranslateX(620);

            //image 6
            imageView6.setFitHeight(300);
            imageView6.setFitWidth(300);
            imageView6.setTranslateY(0);
            imageView6.setTranslateX(920);

            //image 7
            imageView7.setFitHeight(300);
            imageView7.setFitWidth(300);
            imageView7.setTranslateY(315);
            imageView7.setTranslateX(620);

            //image 8
            imageView8.setFitHeight(300);
            imageView8.setFitWidth(300);
            imageView8.setTranslateY(315);
            imageView8.setTranslateX(920);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            pane.getChildren().add(imageView3);
            pane.getChildren().add(imageView4);
            pane.getChildren().add(imageView5);
            pane.getChildren().add(imageView6);
            pane.getChildren().add(imageView7);
            pane.getChildren().add(imageView8);

            Scene scene = new Scene(pane, 1200, 650);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(kneeJoint)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(kneeJointAngles);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(hipJointAngles)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(hipJointAnglesImage);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(lateralForefoot)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(lateralForeFoot);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(medialForefoot)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(medialForeFoot);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(ankleJointAngles)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(kneeJointMoments);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(hipJoint)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(hipJointMoments);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }

    }

    @FXML
    void onViewCompendium(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/UE/GenerateUECompendium.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Patient Compendium");
        stage1.setScene(new Scene(popUp, 800, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }

    @FXML
    private BorderPane bp;
    public void onVideoAssessment(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationVideoUE.fxml")));
        bp.setCenter(root);
    }

    public void onUEPhys(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/UpperExtremityForm.fxml")));
        bp.setCenter(root);
    }

    public void onKinematics(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationKinematics.fxml")));
        bp.setCenter(root);
    }

    public void onPhotos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationPhotos.fxml")));
        bp.setCenter(root);
    }

    public void onAssessmentForm(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationAssessment.fxml")));
        bp.setCenter(root);
    }

    public void onRecomendations(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationRecommendations.fxml")));
        bp.setCenter(root);
    }

    public void onSignatures(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationSignature.fxml")));
        bp.setCenter(root);
    }

    public void onViewInterpretation(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/GenerateUEInterpretation.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Patient Compendium");
        stage1.setScene(new Scene(popUp, 700, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }



}

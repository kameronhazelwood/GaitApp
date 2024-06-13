package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.GaitLabAppApplication;
import com.example.gaitlabapp.config.Config;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import javafx.animation.PauseTransition;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
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
import java.sql.*;
import java.util.Objects;
import java.util.ResourceBundle;


public class VisitDetailsGaitController implements Initializable {


    public ComboBox<String> hipAdbInterpR;
    public ComboBox<String> hipAdbInterpL;
    public TabPane visitTabPane;

    public ComboBox<String> GMFCSCombo;
    public ComboBox<String> hipExtRP;
    public ComboBox<String> hipExtLP;
    public ComboBox<String> hipExtLS;
    public ComboBox<String> hipExtRS;
    public ComboBox<String> hipAbdRP;
    public ComboBox<String> hipAbdLP;
    public ComboBox<String> hipAbdRS;
    public ComboBox<String> hipAbdLS;
    public ComboBox<String> hipIntRotRP;
    public ComboBox<String> hipIntRotLP;
    public ComboBox<String> hipIntRotRS;
    public ComboBox<String> hipIntRotLS;
    public ComboBox<String> hipExtRotRP;
    public ComboBox<String> hipExtRotLP;
    public ComboBox<String> hipExtRotRS;
    public ComboBox<String> hipExtRotLS;
    public ComboBox<String> ryderRP;
    public ComboBox<String> ryderLP;
    public ComboBox<String> ryderRS;
    public ComboBox<String> ryderLS;
    public ComboBox<String> kneeExtRP;
    public ComboBox<String> kneeExtLP;
    public ComboBox<String> kneeExtRS;
    public ComboBox<String> kneeExtLS;
    public ComboBox<String> extLagRP;
    public ComboBox<String> extLagLP;
    public ComboBox<String> extLagRS;
    public ComboBox<String> extLagLS;
    public ComboBox<String> kneeFlexRP;
    public ComboBox<String> kneeFlexLP;
    public ComboBox<String> kneeFlexRS;
    public ComboBox<String> kneeFlexLS;
    public ComboBox<String> popAngRP;
    public ComboBox<String> popAngLP;
    public ComboBox<String> popAngRS;
    public ComboBox<String> popAngLS;
    public ComboBox<String> biPopAngRP;
    public ComboBox<String> biPopAngLP;
    public ComboBox<String> elyTestRP;
    public ComboBox<String> elyTestLP;
    public ComboBox<String> dorsiFlexRP;
    public ComboBox<String> dorsiFlexLP;
    public ComboBox<String> dorsiExtRP;
    public ComboBox<String> dorsiExtLP;
    public ComboBox<String> plantarRP;
    public ComboBox<String> plantarLP;
    public ComboBox<String> plantarRS;
    public ComboBox<String> plantarLS;
    public ComboBox<String> ankleInvRP;
    public ComboBox<String> ankleInvLP;
    public ComboBox<String> ankleInvRS;
    public ComboBox<String> ankleInvLS;
    public ComboBox<String> ankleEverRP;
    public ComboBox<String> ankleEverLP;
    public ComboBox<String> ankleEverRS;
    public ComboBox<String> ankleEverLS;
    public ComboBox<String> tmaRP;
    public ComboBox<String> tmaLP;
    public ComboBox<String> tfaRP;
    public ComboBox<String> tfaLP;
    public ComboBox<String> ffRP;
    public ComboBox<String> ffLP;
    public ComboBox<String> calInvRP;
    public ComboBox<String> calInvLP;
    public ComboBox<String> calEverRP;
    public ComboBox<String> calEverLP;
    public ComboBox<String> legLengthRP;
    public ComboBox<String> legLengthLP;
    public ComboBox<String> kneeVarusRP;
    public ComboBox<String> kneeVarusLP;


    String gmfcsOptions[] = {"I", "II", "III", "IV", "V"};
    @FXML
    private CheckBox AFadl;

    @FXML
    private CheckBox AFmovement;

    @FXML
    private CheckBox AFother;

    @FXML
    private CheckBox AFrun;

    @FXML
    private CheckBox AFstand;

    @FXML
    private CheckBox AFtouch;

    @FXML
    private CheckBox AFwalk;

    @FXML
    private CheckBox AFwb;

    @FXML
    private CheckBox AIads;

    @FXML
    private CheckBox AIfuncMob;

    @FXML
    private CheckBox AIother;

    @FXML
    private CheckBox AIschool;

    @FXML
    private CheckBox AIsleep;

    @FXML
    private CheckBox AIsports;

    @FXML
    private CheckBox CL0;

    @FXML
    private CheckBox CL1;

    @FXML
    private CheckBox CL10;

    @FXML
    private CheckBox CL2;

    @FXML
    private CheckBox CL3;

    @FXML
    private CheckBox CL4;

    @FXML
    private CheckBox CL5;

    @FXML
    private CheckBox CL6;

    @FXML
    private CheckBox CL7;

    @FXML
    private CheckBox CL8;

    @FXML
    private CheckBox CL9;

    @FXML
    private ComboBox<String> FMS500M;
    String fms500mOptions[] = {"N", "C", "1", "2", "3", "4", "5", "6"};

    @FXML
    private ComboBox<String> FMS50M;
    String fms50mOptions[] = {"N", "C", "1", "2", "3", "4", "5", "6"};

    @FXML
    private ComboBox<String> FMS5M;
    String fms5mOptions[] = {"N", "C", "1", "2", "3", "4", "5", "6"};

    @FXML
    private RadioButton GAITAS1;

    @FXML
    private RadioButton GAITAS2;

    @FXML
    private RadioButton GAITAS3;

    @FXML
    private RadioButton GAITAS4;

    @FXML
    private RadioButton GAITAS5;

    @FXML
    private RadioButton GAITAS6;

    @FXML
    private TextField GAITHeight;

    @FXML
    private TextField GAITLFL;

    @FXML
    private TextField GAITLFW;

    @FXML
    private TextField GAITModA;

    @FXML
    private TextField GAITModB;

    @FXML
    private TextField GAITModC;

    @FXML
    private TextField GAITModE;

    @FXML
    private TextField GAITRFL;

    @FXML
    private TextField GAITRFW;

    @FXML
    private TextField GAITWeight;

    @FXML
    private TextArea GAITcomments;

    @FXML
    private TextField GAITptsL;

    @FXML
    private TextField GAITptsR;

    @FXML
    private TextField GAITstand20L;

    @FXML
    private TextField GAITstand20R;

    @FXML
    private TextField GAITstand3L;

    @FXML
    private TextField GAITstand3R;

    @FXML
    private ComboBox<String> GMFCS;

    @FXML
    private CheckBox HL0;

    @FXML
    private CheckBox HL1;

    @FXML
    private CheckBox HL10;

    @FXML
    private CheckBox HL2;

    @FXML
    private CheckBox HL3;

    @FXML
    private CheckBox HL4;

    @FXML
    private CheckBox HL5;

    @FXML
    private CheckBox HL6;

    @FXML
    private CheckBox HL7;

    @FXML
    private CheckBox HL8;

    @FXML
    private CheckBox HL9;

    @FXML
    private CheckBox LL0;

    @FXML
    private CheckBox LL1;

    @FXML
    private CheckBox LL10;

    @FXML
    private CheckBox LL2;

    @FXML
    private CheckBox LL3;

    @FXML
    private CheckBox LL4;

    @FXML
    private CheckBox LL5;

    @FXML
    private CheckBox LL6;

    @FXML
    private CheckBox LL7;

    @FXML
    private CheckBox LL8;

    @FXML
    private CheckBox LL9;

    @FXML
    private RadioButton PAMNum;

    @FXML
    private RadioButton PAMWrong;

    @FXML
    private RadioButton PAMflacc;

    @FXML
    private TextField PROMAnkEvL;

    @FXML
    private TextField PROMAnkEvR;

    @FXML
    private TextField PROMAnkInvL;

    @FXML
    private TextField PROMAnkInvR;

    @FXML
    private TextField PROMBilatL;

    @FXML
    private TextField PROMBilatR;

    @FXML
    private TextField PROMCalEvL;

    @FXML
    private TextField PROMCalEvR;

    @FXML
    private TextField PROMCalInvL;

    @FXML
    private TextField PROMCalInvR;

    @FXML
    private TextField PROMDorsiEL;

    @FXML
    private TextField PROMDorsiER;

    @FXML
    private TextField PROMDorsiFL;

    @FXML
    private TextField PROMDorsiFR;

    @FXML
    private TextField PROMElyL;

    @FXML
    private TextField PROMElyR;

    @FXML
    private TextField PROMExtLagL;

    @FXML
    private TextField PROMExtLagR;

    @FXML
    private TextField PROMHipExtL;

    @FXML
    private TextField PROMHipExtR;

    @FXML
    private TextField PROMHipExtRotL;

    @FXML
    private TextField PROMHipExtRotR;

    @FXML
    private TextField PROMHipIntRotL;

    @FXML
    private TextField PROMHipIntRotR;

    @FXML
    private TextField PROMHipL;

    @FXML
    private TextField PROMHipR;

    @FXML
    private TextField PROMHipabdL;

    @FXML
    private TextField PROMHipabdR;

    @FXML
    private TextField PROMKneeExtL;

    @FXML
    private TextField PROMKneeExtR;

    @FXML
    private TextField PROMKneeFlexL;

    @FXML
    private TextField PROMKneeFlexR;

    @FXML
    private TextField PROMPlantarL;

    @FXML
    private TextField PROMPlantarR;

    @FXML
    private TextField PROMPopAngleL;

    @FXML
    private TextField PROMPopAngleR;

    @FXML
    private TextField PROMRyderTestL;

    @FXML
    private TextField PROMRyderTestR;

    @FXML
    private TextField PROMffL;

    @FXML
    private TextField PROMffR;

    @FXML
    private TextField PROMtfaL;

    @FXML
    private TextField PROMtfaR;

    @FXML
    private TextField PROMtmaL;

    @FXML
    private TextField PROMtmaR;

    @FXML
    private TextField RankJerL;

    @FXML
    private ComboBox<String> RankJerLinterp;

    @FXML
    private TextField RankJerR;

    @FXML
    private ComboBox<String> RankJerRinterp;

    @FXML
    private TextField StregHipExtL;

    @FXML
    private TextField StregHipExtR;

    @FXML
    private TextField StregRyertestL;

    @FXML
    private TextField StregRyertestR;

    @FXML
    private TextField StrenHipFlexL;

    @FXML
    private TextField StrenHipFlexR;

    @FXML
    private TextField StrengAnkEvL;

    @FXML
    private TextField StrengAnkEvR;

    @FXML
    private TextField StrengAnklInvL;

    @FXML
    private TextField StrengAnklInvR;

    @FXML
    private TextField StrengHipExtL;

    @FXML
    private TextField StrengHipExtR;

    @FXML
    private TextField StrengHipIntRotL;

    @FXML
    private TextField StrengHipIntRotR;

    @FXML
    private TextField StrengPlantarL;

    @FXML
    private TextField StrengPlantarR;

    @FXML
    private TextField StrengthExtLagL;

    @FXML
    private TextField StrengthExtLagR;

    @FXML
    private TextField StrengthHipExtRotL;

    @FXML
    private TextField StrengthHipExtRotR;

    @FXML
    private TextField StrengthKneeExtL;

    @FXML
    private TextField StrengthKneeExtR;

    @FXML
    private TextField StrengthKneeFlexL;

    @FXML
    private TextField StrengthKneeFlexR;

    @FXML
    private TextField StrengthPopAngleL;

    @FXML
    private TextField StrengthPopAngleR;

    @FXML
    private TextField TaddL;

    @FXML
    private ComboBox<String> TaddLinterp;

    @FXML
    private TextField TaddR;

    @FXML
    private ComboBox<String> TaddRinterp;

    @FXML
    private TextField TantL;

    @FXML
    private ComboBox<String> TantLinterp;

    @FXML
    private TextField TantR;

    @FXML
    private ComboBox<String> TantRInterp;

    @FXML
    private TextField TbabinL;

    @FXML
    private ComboBox<String> TbabinLinterp;

    @FXML
    private TextField TbabinR;

    @FXML
    private ComboBox<String> TbabinRinterp;

    @FXML
    private TextField TclonusL;

    @FXML
    private ComboBox<String> TclonusLinterp;

    @FXML
    private TextField TclonusR;

    @FXML
    private ComboBox<String> TclonusRinterp;

    @FXML
    private TextField TdistalL;

    @FXML
    private ComboBox<String> TdistalLinterp;

    @FXML
    private TextField TdistalR;

    @FXML
    private ComboBox<String> TdistalRinterp;

    @FXML
    private TextField TgastroL;

    @FXML
    private ComboBox<String> TgastroLinterp;

    @FXML
    private TextField TgastroR;

    @FXML
    private ComboBox<String> TgastroRinterp;

    @FXML
    private TextField TgluteMaxL;

    @FXML
    private ComboBox<String> TgluteMaxLinterp;

    @FXML
    private TextField TgluteMaxR;

    @FXML
    private ComboBox<String> TgluteMaxRinterp;

    @FXML
    private TextField ThamstringL;

    @FXML
    private ComboBox<String> ThamstringLinterp;

    @FXML
    private TextField ThamstringR;

    @FXML
    private ComboBox<String> ThamstringRinterp;

    @FXML
    private TextField TillipsoasL;

    @FXML
    private ComboBox<String> TillipsoasLinterp;

    @FXML
    private TextField TillipsoasR;

    @FXML
    private ComboBox<String> TillipsoasRinterp;
    String toneOptions[] = {"N", "VH", "H", "L", "VL"};

    @FXML
    private TextField TkneeJerL;

    @FXML
    private ComboBox<String> TkneeJerLinterp;

    @FXML
    private TextField TkneeJerR;

    @FXML
    private ComboBox<String> TkneeJerRinterp;

    @FXML
    private TextField TpostTibL;

    @FXML
    private ComboBox<String> TpostTibLinterp;

    @FXML
    private TextField TpostTibR;

    @FXML
    private ComboBox<String> TpostTibRInterp;

    @FXML
    private TextField TproxL;

    @FXML
    private ComboBox<String> TproxLinterp;

    @FXML
    private TextField TproxR;

    @FXML
    private ComboBox<String> TproxRinterp;

    @FXML
    private TextField TrecCatchL;

    @FXML
    private ComboBox<String> TrecCatchLinterp;

    @FXML
    private TextField TrecCatchR;

    @FXML
    private ComboBox<String> TrecCatchRinterp;

    @FXML
    private TextField TrecFemL;

    @FXML
    private ComboBox<String> TrecFemLinterp;

    @FXML
    private TextField TrecFemR;

    @FXML
    private ComboBox<String> TrecFemRInterp;

    @FXML
    private TextField TvastmedL;

    @FXML
    private ComboBox<String> TvastmedLinterp;

    @FXML
    private TextField TvastmedR;

    @FXML
    private ComboBox<String> TvastmedRInterp;

    @FXML
    private TextField antL;

    @FXML
    private ComboBox<String> antLInterp;

    @FXML
    private TextField antR;

    @FXML
    private ComboBox<String> antRInterp;

    @FXML
    private TextField aptAttended;

    @FXML
    private TextField aptComment;

    @FXML
    private TextField aptDate;

    @FXML
    private TextField aptDateProcessed;

    @FXML
    private TextField aptDateSent;

    @FXML
    private TextField aptDiagnosis;

    @FXML
    private TextField aptMd;

    @FXML
    private TextField aptPT;

    @FXML
    private TextField aptReason;

    @FXML
    private TextField aptReferringMd;

    @FXML
    private TextField aptStartTime;

    @FXML
    private TextField aptStopTime;

    @FXML
    private TextField aptSubType;

    @FXML
    private TextField aptTime;

    @FXML
    private TextField aptVisitType;

    @FXML
    private Button comSideNav;

    @FXML
    private Tab dataTab;

    @FXML
    private TreeView<?> dataTable;

    @FXML
    private TextField date;

    @FXML
    private TextField dateToEpic;

    @FXML
    private TextField distaleL;

    @FXML
    private ComboBox<String> distaleLinterp;

    @FXML
    private TextField distaleR;

    @FXML
    private ComboBox<String> distaleRinterp;

    @FXML
    private TextField durOfPain;

    @FXML
    private TextField freqOfPain;

    @FXML
    private TextField gastroL;

    @FXML
    private ComboBox<String> gastroLInterp;

    @FXML
    private TextField gastroR;

    @FXML
    private ComboBox<String> gastroRInterp;

    @FXML
    private TextField gluteMaxL;

    @FXML
    private ComboBox<String> gluteMaxLInterp;

    @FXML
    private TextField gluteMaxR;

    @FXML
    private ComboBox<String> gluteMaxRInterp;

    @FXML
    private TextField gluteMedL;

    @FXML
    private ComboBox<String> gluteMedLInterp;

    @FXML
    private TextField gluteMedR;

    @FXML
    private ComboBox<String> gluteMedRInterp;

    @FXML
    private TextField hamstringL;

    @FXML
    private ComboBox<String> hamstringLinterp;

    @FXML
    private TextField hamstringR;

    @FXML
    private ComboBox<String> hamstringRInterp;

    @FXML
    private TextField hipAddL;

    @FXML
    private ComboBox<String> hipAddLInterp;

    @FXML
    private TextField hipAddR;

    @FXML
    private ComboBox<String> hipAddRInterp;

    @FXML
    private ComboBox<String> hipLP;

    @FXML
    private ComboBox<String> hipLS;

    @FXML
    private ComboBox<String> hipRP;
    String promOptions[] = {"N", "VH", "H", "L", "VL"};

    @FXML
    private ComboBox<String> hipRS;

    @FXML
    private TextField illopsoasL;

    @FXML
    private ComboBox<String> illopsoasLInterp;

    @FXML
    private TextField illopsoasR;

    @FXML
    private ComboBox<String> illopsoasRInterp;
    String motorControlInterpCB[] = {"Good", "Fair", "Poor"};

    @FXML
    private TextField interpDate;

    @FXML
    private Button interpSideNav1;

    @FXML
    private TextField kneeToStandL;

    @FXML
    private TextField kneeToStandR;

    @FXML
    private TextField kneeVarL;

    @FXML
    private TextField kneeVarR;

    @FXML
    private TextField legLengthL;

    @FXML
    private TextField legLengthR;

    @FXML
    private TextField locOfPain;

    @FXML
    private TextField lowerToFloorL;

    @FXML
    private TextField lowerToFloorR;

    @FXML
    private Label norms;

    @FXML
    private TextField oneLegL;

    @FXML
    private TextField oneLegR;

    @FXML
    private TextField oneLegStanceL;

    @FXML
    private TextField oneLegStanceR;

    @FXML
    private TextField peronL;

    @FXML
    private ComboBox<String> peronLinterp;

    @FXML
    private TextField peronR;

    @FXML
    private ComboBox<String> peronRinterp;

    @FXML
    private Tab physExamGait;

    @FXML
    private TextField postTibL;

    @FXML
    private ComboBox<String> postTibLinterp;

    @FXML
    private TextField postTibR;

    @FXML
    private ComboBox<String> postTibRInterp;

    @FXML
    private TextField proximalL;

    @FXML
    private ComboBox<String> proximalLinterp;

    @FXML
    private TextField proximalR;

    @FXML
    private ComboBox<String> proximalRInterp;

    @FXML
    private TextField quadsL;

    @FXML
    private ComboBox<String> quadsLinterp;

    @FXML
    private TextField quadsR;

    @FXML
    private ComboBox<String> quadsRInterp;

    @FXML
    private Tab reportTab;

    @FXML
    private TextField sitStandL;

    @FXML
    private TextField sitStandR;

    @FXML
    private TextField soleusL;

    @FXML
    private ComboBox<String> soleusLinterp;

    @FXML
    private TextField soleusR;

    @FXML
    private ComboBox<String> soleusRinterp;

    @FXML
    private TextField squatsL;

    @FXML
    private TextField squatsR;

    @FXML
    private TextField standingL;

    @FXML
    private TextField standingR;

    @FXML
    private TextField visitBio;

    @FXML
    private TextField visitBio2;

    @FXML
    private TextField visitPt;

    @FXML
    private TextField visitPt2;

    @FXML
    private Tab visitTab;
    int patientID = 13;




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

    //categories
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

    int patient = 13;
    Connection connection;
    Config db = new Config();
    Statement statement;
    public int visitId;
    ResultSet resultSet;
    IAppointmentModel.Type type;
    private final ObservableList<IAppointmentModel> visitListView = FXCollections.observableArrayList();
    ObjectProperty<IAppointmentModel> visitValue = new SimpleObjectProperty<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        GMFCSCombo.getItems().setAll(gmfcsOptions);
        FMS5M.getItems().setAll(fms5mOptions);
        FMS50M.getItems().setAll(fms50mOptions);
        FMS500M.getItems().setAll(fms500mOptions);
        illopsoasRInterp.getItems().setAll(motorControlInterpCB);
        illopsoasLInterp.getItems().setAll(motorControlInterpCB);
        gluteMedLInterp.getItems().setAll(motorControlInterpCB);
        gluteMaxRInterp.getItems().setAll(motorControlInterpCB);
        hipAddRInterp.getItems().setAll(motorControlInterpCB);
        hipAddLInterp.getItems().setAll(motorControlInterpCB);
        gluteMedLInterp.getItems().setAll(motorControlInterpCB);
        gluteMedRInterp.getItems().setAll(motorControlInterpCB);
        quadsLinterp.getItems().setAll(motorControlInterpCB);
        quadsRInterp.getItems().setAll(motorControlInterpCB);
        hamstringLinterp.getItems().setAll(motorControlInterpCB);
        hamstringRInterp.getItems().setAll(motorControlInterpCB);
        antRInterp.getItems().setAll(motorControlInterpCB);
        antLInterp.getItems().setAll(motorControlInterpCB);
        gastroLInterp.getItems().setAll(motorControlInterpCB);
        gastroRInterp.getItems().setAll(motorControlInterpCB);
        postTibLinterp.getItems().setAll(motorControlInterpCB);
        postTibRInterp.getItems().setAll(motorControlInterpCB);
        soleusLinterp.getItems().setAll(motorControlInterpCB);
        soleusRinterp.getItems().setAll(motorControlInterpCB);
        peronLinterp.getItems().setAll(motorControlInterpCB);
        peronRinterp.getItems().setAll(motorControlInterpCB);
        proximalLinterp.getItems().setAll(motorControlInterpCB);
        proximalRInterp.getItems().setAll(motorControlInterpCB);
        distaleLinterp.getItems().setAll(motorControlInterpCB);
        distaleRinterp.getItems().setAll(motorControlInterpCB);
        TillipsoasLinterp.getItems().setAll(toneOptions);
        TillipsoasRinterp.getItems().setAll(toneOptions);
        TgluteMaxLinterp.getItems().setAll(toneOptions);
        TgluteMaxRinterp.getItems().setAll(toneOptions);
        TaddRinterp.getItems().setAll(toneOptions);
        TaddLinterp.getItems().setAll(toneOptions);
        TrecFemLinterp.getItems().setAll(toneOptions);
        TrecFemRInterp.getItems().setAll(toneOptions);
        TrecCatchLinterp.getItems().setAll(toneOptions);
        TrecCatchRinterp.getItems().setAll(toneOptions);
        TvastmedLinterp.getItems().setAll(toneOptions);
        TvastmedRInterp.getItems().setAll(toneOptions);
        ThamstringLinterp.getItems().setAll(toneOptions);
        ThamstringRinterp.getItems().setAll(toneOptions);
        TpostTibLinterp.getItems().setAll(toneOptions);
        TpostTibRInterp.getItems().setAll(toneOptions);
        TantRInterp.getItems().setAll(toneOptions);
        TantLinterp.getItems().setAll(toneOptions);
        TgastroLinterp.getItems().setAll(toneOptions);
        TgastroRinterp.getItems().setAll(toneOptions);
        TclonusLinterp.getItems().setAll(toneOptions);
        TclonusRinterp.getItems().setAll(toneOptions);
        TkneeJerLinterp.getItems().setAll(toneOptions);
        TkneeJerRinterp.getItems().setAll(toneOptions);
        RankJerLinterp.getItems().setAll(toneOptions);
        RankJerRinterp.getItems().setAll(toneOptions);
        TbabinLinterp.getItems().setAll(toneOptions);
        TbabinRinterp.getItems().setAll(toneOptions);
        TproxLinterp.getItems().setAll(toneOptions);
        TproxRinterp.getItems().setAll(toneOptions);
        TdistalLinterp.getItems().setAll(toneOptions);
        TdistalRinterp.getItems().setAll(toneOptions);
        hipRP.getItems().setAll(promOptions);
        hipLP.getItems().setAll(promOptions);
        hipRS.getItems().setAll(promOptions);
        hipLS.getItems().setAll(promOptions);
        hipExtRP.getItems().setAll(promOptions);
        hipExtLP.getItems().setAll(promOptions);
        hipExtLS.getItems().setAll(promOptions);
        hipExtRS.getItems().setAll(promOptions);
        hipAbdRP.getItems().setAll(promOptions);
        hipAbdLP.getItems().setAll(promOptions);
        hipAbdLS.getItems().setAll(promOptions);
        hipAbdRS.getItems().setAll(promOptions);
        hipIntRotLP.getItems().setAll(promOptions);
        hipIntRotRP.getItems().setAll(promOptions);
        hipIntRotLS.getItems().setAll(promOptions);
        hipIntRotRS.getItems().setAll(promOptions);
        hipExtRotRS.getItems().setAll(promOptions);
        hipExtRotLS.getItems().setAll(promOptions);
        hipExtRotRP.getItems().setAll(promOptions);
        hipExtRotLP.getItems().setAll(promOptions);
        ryderLP.getItems().setAll(promOptions);
        ryderLS.getItems().setAll(promOptions);
        ryderRP.getItems().setAll(promOptions);
        ryderRS.getItems().setAll(promOptions);
        kneeExtRP.getItems().setAll(promOptions);
        kneeExtLP.getItems().setAll(promOptions);
        kneeExtRS.getItems().setAll(promOptions);
        kneeExtLS.getItems().setAll(promOptions);
        extLagLP.getItems().setAll(promOptions);
        extLagLS.getItems().setAll(promOptions);
        extLagRP.getItems().setAll(promOptions);
        extLagRS.getItems().setAll(promOptions);
        kneeFlexRP.getItems().setAll(promOptions);
        kneeFlexLP.getItems().setAll(promOptions);
        kneeFlexLS.getItems().setAll(promOptions);
        kneeFlexRS.getItems().setAll(promOptions);
        popAngLP.getItems().setAll(promOptions);
        popAngRP.getItems().setAll(promOptions);
        popAngLS.getItems().setAll(promOptions);
        popAngRS.getItems().setAll(promOptions);
        biPopAngLP.getItems().setAll(promOptions);
        biPopAngRP.getItems().setAll(promOptions);
        elyTestLP.getItems().setAll(promOptions);
        elyTestRP.getItems().setAll(promOptions);
        dorsiFlexLP.getItems().setAll(promOptions);
        dorsiFlexRP.getItems().setAll(promOptions);
        dorsiExtLP.getItems().setAll(promOptions);
        dorsiExtRP.getItems().setAll(promOptions);
        plantarLP.getItems().setAll(promOptions);
        plantarRP.getItems().setAll(promOptions);
        plantarLS.getItems().setAll(promOptions);
        plantarRS.getItems().setAll(promOptions);
        ankleInvLP.getItems().setAll(promOptions);
        ankleInvRP.getItems().setAll(promOptions);
        ankleInvLS.getItems().setAll(promOptions);
        ankleInvRS.getItems().setAll(promOptions);
        ankleEverLP.getItems().setAll(promOptions);
        ankleEverRP.getItems().setAll(promOptions);
        ankleEverLS.getItems().setAll(promOptions);
        ankleEverRS.getItems().setAll(promOptions);
        tmaLP.getItems().setAll(promOptions);
        tmaRP.getItems().setAll(promOptions);
        tfaLP.getItems().setAll(promOptions);
        tfaRP.getItems().setAll(promOptions);
        ffLP.getItems().setAll(promOptions);
        ffRP.getItems().setAll(promOptions);
        calEverLP.getItems().setAll(promOptions);
        calEverRP.getItems().setAll(promOptions);
        calInvLP.getItems().setAll(promOptions);
        calInvRP.getItems().setAll(promOptions);
        legLengthRP.getItems().setAll(promOptions);
        legLengthLP.getItems().setAll(promOptions);
        kneeVarusLP.getItems().setAll(promOptions);
        kneeVarusRP.getItems().setAll(promOptions);


        physExamGait.setOnSelectionChanged(e -> {
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



        /*
        need to see if this is in use.
         */
        // adding to the tree view
        kinematics.getChildren().addAll(hipJointAngles, ankleJointAngles);
        footKinematics.getChildren().addAll(lateralForefoot, medialForefoot);
        kinetics.getChildren().addAll(hipJoint, kneeJoint, ankleJoint);

        pngFiles.getChildren().addAll(kinematics);
        pngFiles.getChildren().addAll(footKinematics);
        pngFiles.getChildren().addAll(kinetics);

        /*
        Gen marker info
//         */
//        GAITHeight.textProperty().addListener(onSaveGenMarker());
//        GAITWeight.textProperty().addListener(onSaveGenMarker());
//        GAITRFL.textProperty().addListener(onSaveGenMarker());
//        GAITRFW.textProperty().addListener(onSaveGenMarker());
//        GAITLFL.textProperty().addListener(onSaveGenMarker());
//        GAITLFW.textProperty().addListener(onSaveGenMarker());
//        GAITAS1.textProperty().addListener(onSaveGenMarker());
//        GAITAS2.textProperty().addListener(onSaveGenMarker());
//        GAITAS3.textProperty().addListener(onSaveGenMarker());
//        GAITAS4.textProperty().addListener(onSaveGenMarker());
//        GAITAS5.textProperty().addListener(onSaveGenMarker());
//        GAITAS6.textProperty().addListener(onSaveGenMarker());
//
//        /*
//        visit details info
//         */
//
//        aptDate.textProperty().addListener(onSaveVisit());
//        aptStartTime.textProperty().addListener(onSaveVisit());
//        aptStopTime.textProperty().addListener(onSaveVisit());
//        date.textProperty().addListener(onSaveVisit());
//        aptVisitType.textProperty().addListener(onSaveVisit());
//        aptSubType.textProperty().addListener(onSaveVisit());
//        dateToEpic.textProperty().addListener(onSaveVisit());
//        aptDateProcessed.textProperty().addListener(onSaveVisit());
//        aptDiagnosis.textProperty().addListener(onSaveVisit());
//        aptReason.textProperty().addListener(onSaveVisit());
//        aptComment.textProperty().addListener(onSaveVisit());
//        interpDate.textProperty().addListener(onSaveVisit());
//        aptPT.textProperty().addListener(onSaveVisit());
//        aptReferringMd.textProperty().addListener(onSaveVisit());
//        visitPt.textProperty().addListener(onSaveVisit());
//        visitPt2.textProperty().addListener(onSaveVisit());
//        visitBio.textProperty().addListener(onSaveVisit());
//        visitBio2.textProperty().addListener(onSaveVisit());

        //        try {
//           visitListView.clear();
//           connection = db.getDBConnection();
//           statement = connection.createStatement();
//           resultSet = statement.executeQuery("SELECT * FROM Visits;");
//
//           while(resultSet.next()){
//               visitListView.add(new IAppointmentModel(
//                       resultSet.getString("Date"),
//                       resultSet.getString("Visit Type"),
//                       resultSet.getString("Referring Phys"),
//                       (IAppointmentModel.Type) resultSet.getObject(type.ordinal())
//               ));
//           }
//
//        } catch (Exception e) {
//            throw new RuntimeException(e);
//        }
//
//        visitValue.addListener((obs, old, val) -> {
//            if(val != null){
//                aptDate.setText(val.getAptDate());
//            }
//        });

    }
    public ChangeListener<? super String> onSaveGenMarker(){
        String genMarkerUpdateQuery = "UPDATE GenMarkInfo SET " +
                "height=?, weight=?, rightFootLength=?, leftFootLength=?, rightFootWidth=?, leftFootLength=?, " +
                "leftFootWidth=?, AS1=?, AS2=?, AS3=?, AS4=?, AS5=?, AS6=?, gmfcs=?, fms5m=?, fms50m=?, fms500m=?, comments=?, macs=? " +
                "WHERE patientID = '" + patientID + "'";
        ChangeListener<String> genMarkerListener = ((obs, newVal, oldVal)-> {
        try {
            connection = db.getDBConnection();
            PreparedStatement ps = connection.prepareStatement(genMarkerUpdateQuery);
            ps.setString(1, GAITHeight.getText());
            ps.setString(2, GAITWeight.getText());
            ps.setString(3, GAITRFL.getText());
            ps.setString(4, GAITLFL.getText());
            ps.setString(5, GAITRFW.getText());
            ps.setString(6, GAITLFW.getText());
            ps.setString(7, GAITAS1.getText());
            ps.setString(8, GAITAS2.getText());
            ps.setString(9, GAITAS3.getText());
            ps.setString(10, GAITAS4.getText());
            ps.setString(11, GAITAS5.getText());
            ps.setString(12, GAITAS6.getText());
            ps.setString(13, GMFCS.toString());
            ps.setString(14, FMS5M.toString());
            ps.setString(15, FMS50M.toString());
            ps.setString(16, FMS500M.toString());
            ps.setString(17, GAITcomments.getText());
            ps.executeUpdate();
            System.out.println(genMarkerUpdateQuery);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        });
        return null;
    }

    public ChangeListener<? super String> onSaveVisit(){

        String visitUpdateQuery = "UPDATE Visits SET "
                + "aptDate=?, startTime=?, stopTime=?, dateScheduled=?, visitType=?, visitSubType=?, dateToEpic=?, dateProcessed=?," +
                "diagnosis=?, reasonForAnalysis=?, visitComment=?, interpDate=?, interpPT=?, referringPhys=?, visitPT=?," +
                "visitPT2=?, visitBioMech=?, visitBioMech2=?   WHERE patientID = '" + patientID + "'";


            try {
                connection = db.getDBConnection();
                PreparedStatement ps1 = connection.prepareStatement(visitUpdateQuery);
                ps1.setString(1, aptDate.getText());
                ps1.setString(2, aptStartTime.getText());
                ps1.setString(3, aptStopTime.getText());
                ps1.setString(4, date.getText());
                ps1.setString(5, aptVisitType.getText());
                ps1.setString(6, aptSubType.getText());
                ps1.setString(7, dateToEpic.getText());
                ps1.setString(8, aptDateProcessed.getText());
                ps1.setString(9, aptDiagnosis.getText());
                ps1.setString(10, aptReason.getText());
                ps1.setString(11, aptComment.getText());
                ps1.setString(12, interpDate.getText());
                ps1.setString(13, aptPT.getText());
                ps1.setString(14, aptReferringMd.getText());
                ps1.setString(15, visitPt.getText());
                ps1.setString(16, visitPt2.getText());
                ps1.setString(17, visitBio.getText());
                ps1.setString(18, visitBio2.getText());
                ps1.executeUpdate();
                System.out.println(visitUpdateQuery);

            } catch (SQLException e) {
                throw new RuntimeException(e);
            }

        return null;
    }

     public ChangeListener<? super String> onFuncStrengthSave(){
         String funcStrengthUpdateQuery = "UPDATE FunctionalStrength SET "
                 + "pullToStandR=?, pullToStandL=?, standingArmsFreeL_3sec=?, standingArmsFreeR_3sec=?, standingArmsFreeL_20sec=?, standingArmsFreeR_20sec=?,"
                 + " legStandHandHeldL=?, legStandHandHeldR=?, oneLegStanceL=?, oneLegStanceR=?, shortSitToStandL=?, shortSitToStandR=?, " +
                 "highKneeStandL=?, highKneeStandR=?, lowersToFloorL=?, lowersToFloorR=?, squatsL=?, squatsR=?, penFromFloorL=?, penFromFloorR=?" +
                 "  WHERE patientID = '" + patientID +  "'";

         try {
             connection = db.getDBConnection();
             PreparedStatement ps = connection.prepareStatement(funcStrengthUpdateQuery);
             ps.setString(1, GAITptsR.getText());
             ps.setString(2, GAITptsL.getText());
             ps.setString(3, GAITstand3L.getText());
             ps.setString(4, GAITstand3R.getText());
             ps.setString(5, GAITstand20L.getText());
             ps.setString(6, GAITstand20R.getText());
             ps.setString(7, oneLegStanceL.getText());
             ps.setString(8, oneLegStanceR.getText());
             ps.setString(9, sitStandR.getText());
             ps.setString(10, sitStandL.getText());
             ps.setString(11, kneeToStandL.getText());
             ps.setString(12, kneeToStandR.getText());
             ps.setString(13, lowerToFloorL.getText());
             ps.setString(14, lowerToFloorR.getText());
             ps.setString(15, squatsL.getText());
             ps.setString(16, squatsR.getText());
             ps.setString(17, standingL.getText());
             ps.setString(18, standingR.getText());
             ps.executeUpdate();
             System.out.println(funcStrengthUpdateQuery);

         } catch (SQLException e) {
             throw new RuntimeException(e);
         }

         return null;
     }

    public ChangeListener<? super String> onPROMSave(){
        String PROMUpdateQuery = "UPDATE PROM SET "
                + "hipFlexR=?, hipFlexL=?, hipFlexStrenR, hipFlexStrenL, hipExtL=?, hipExtR=?, hipExtStrenL, hipExtStrenR" +
                ",hipAbdR=?, hipAbdL=?, hipAbdStrenR, hipAbdStrenL,hipIntRotR=?, hipIntRotL=?, hipIntRotStrenR, hipIntRotStrenL" +
                ", hipExtr, hipExtL, hipExtStrenR, hipExtStrenL, ryderTestR, ryderTestL, ryderTestStrenR, ryderTestStrenL," +
                " kneeExtR, kneeExtL,  kneeExtStrenR, kneeExtStrenL, extLagR, extLagL, ExtLagStrenR, ExtLagStrenL, kneeFlexR," +
                "kneeFlexL, kneeFlexStrenR, kneeFlexStrenL, popAngR, popAngR, PopAngStrenR, PopAngStrenL, bilateralPopR, bilateralPopL, elyR" +
                ", elyL, dorsiFR, dorsiFL, dorsiER, dorsiEL, plantarR, plantarL, PlantarStrenR, PlantarStrenL, ankleInvL, ankleInvR, " +
                "ankleEverL, ankleEverR, ankleEvStrengR, ankleEvStrengL, ankleInvR, ankleInvL, ankleInvStrengR, ankleInvStrengL," +
                "tmaR, tmaL, tfaR, tfaL, ffAbaddR, ffAbaddL" +
                "  WHERE patientID = '" + patientID +  "'";

        try {
            connection = db.getDBConnection();
            PreparedStatement ps = connection.prepareStatement(PROMUpdateQuery);

            ps.executeUpdate();
            System.out.println(PROMUpdateQuery);

        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

        return null;
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
        TreeItem<String> item = (TreeItem<String>) dataTable.getSelectionModel().getSelectedItem();
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
    void onViewCompendiumSideNav(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Compendium/GAIT/GenerateCompendiumSide.fxml")));
        Stage stage1 = new Stage();
        popUp.getStylesheets().add(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/styles.css")).toExternalForm());
        stage1.setTitle("Patient Compendium");
        stage1.setScene(new Scene(popUp, 800, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }

    public void onViewInterpretation(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/GAIT/GenerateGAITInterpretation.fxml")));
        Stage stage1 = new Stage();
        popUp.getStylesheets().add(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/styles.css")).toExternalForm());
        stage1.setTitle("Patient Interpretation");
        stage1.setScene(new Scene(popUp, 900, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }
}




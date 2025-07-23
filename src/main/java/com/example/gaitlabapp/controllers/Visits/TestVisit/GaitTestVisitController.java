package com.example.gaitlabapp.controllers.Visits.TestVisit;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.config.RadioButtonCell;
import com.example.gaitlabapp.controllers.Visits.TestNoteController;
import com.example.gaitlabapp.controllers.Wizards.AddOrthosisWizard;
import com.example.gaitlabapp.controllers.Wizards.AddSeizureMedsController;
import com.example.gaitlabapp.model.forms.*;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import com.example.gaitlabapp.model.visits.IAppointmentSetDates;
import com.example.gaitlabapp.services.*;
import jakarta.persistence.Table;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.CheckBoxTableCell;
import javafx.scene.control.cell.ComboBoxTableCell;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.EnumSet;
import java.util.Objects;
import java.util.ResourceBundle;


@Component
@ComponentScan
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class GaitTestVisitController implements Initializable {
    public TextField mrnTextField;
    @Autowired
    ConfigurableApplicationContext applicationContext;
    public Button onViewCompendiumSideNav;
    public Text personReporting;
    public Text relationshipToPatientQues;
    public Text dateReported;
    public Text premature;
    public Text firstWalk;
    public Text firstTalked;
    public Text childLearn;
    public Button editBaseline;
    public TableColumn<String, ISeizureModel> seziureMedicationColumn;
    public TableView<ISeizureModel> seizureTable;
    public Button addSeizureMeds;
    public TextField seizureTextfield;
    public Label orthosisLabel;
    public Label sideLabel;
    public Text PTHospital;
    public Text PTClinic;
    public Text PTSchool;
    public Text PTHome;
    public Text OTHospital;
    public Text OTClinic;
    public Text OTSchool;
    public Text OTHome;
    public Button questionnaires;
    @Autowired
    PatientService patientService;

    public TableView<String> reportsTable;
    public TableColumn<String, String> test;
    @FXML
    public TableColumn<Table, Boolean> aptDateReport;
    public TableColumn<String, String> aptReasonReport;
    public Tooltip tooltip;
    public Button addOrthosis;
    public Button gaitVisitSave;
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
    public Button setDatesVisitGait;
    public CheckBox videoGait;
    public CheckBox videoGait1;
    public CheckBox GAITKinematics;
    public CheckBox GAITKinematics1;
    public CheckBox gaitMultiSegment;
    public CheckBox gaitMultiSegment1;
    public CheckBox gaitEMG;
    public CheckBox gaitEMG1;
    public CheckBox gaitEMGFine;
    public CheckBox gaitEMGFine1;
    public CheckBox GAITPTExam1;
    public CheckBox GAITPTExam;
    public CheckBox GAITWalking;
    public CheckBox GAITWalking1;
    public CheckBox GAITExercise;
    public CheckBox GAITExercise1;
    public CheckBox GAITExerciseWalk;
    public CheckBox GAITExerciseWalk1;
    public CheckBox GAITStep;
    public CheckBox GAITStep1;
    public CheckBox GAITHistory;
    public CheckBox GAITHistory1;


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
    private TreeView<String> dataTable;

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
    private Label patientId;
    @FXML
    private Tab visitTab;
    //parent root

    TreeItem<String> parentPhotoVideoRoot = new TreeItem<>("");
    // data types
    TreeItem<String> showAll = new TreeItem<>("Show all");
    TreeItem<String> pngFiles = new TreeItem<String>("PNG Files");
    TreeItem<String> interpFiles = new TreeItem<>("Interpt");
    TreeItem<String> photos = new TreeItem<>("Photos");
    TreeItem<String> videos = new TreeItem<>("Videos");
    TreeItem<String> compendium = new TreeItem<>("Compendium");
    TreeItem<String> interpretation = new TreeItem<>("Interpretation");

    //categories
    TreeItem<String> kinematics = new TreeItem<>("Kinematics");
    TreeItem<String> recommendations = new TreeItem<>("Recommendations");
    TreeItem<String> assessmentForm = new TreeItem<>("Assessment Form");
    TreeItem<String> kinematicsData = new TreeItem<>("Kinematics");
    TreeItem<String> footKinematics = new TreeItem<>("Foot Kinematics");
    TreeItem<String> kinetics = new TreeItem<>("Kinetics");
    TreeItem<String> hipJointAngles = new TreeItem<>("Hip Joint Angles");
    TreeItem<String> ankleJointAngles = new TreeItem<>("Ankle Joint Angles");
    TreeItem<String> lateralForefoot = new TreeItem<>("Lateral Forefoot");
    TreeItem<String> medialForefoot = new TreeItem<>("Medial Forefoot");
    TreeItem<String> hipJoint = new TreeItem<>("Hip Joint Moments");
    TreeItem<String> kneeJoint = new TreeItem<>("Knee Joint Moments");
    TreeItem<String> ankleJoint = new TreeItem<>("Ankle Joint Moments");
    TreeItem<String> kineticsData = new TreeItem<>("Kinetics");
    TreeItem<String> footModel = new TreeItem<>("Foot Model");
    TreeItem<String> pedobaragraph = new TreeItem<>("Pedobaragraph");
    TreeItem<String> o2Consumption = new TreeItem<>("02 Consumption");
    TreeItem<String> recommendationDiagnostic = new TreeItem<>("Diagnostic");
    TreeItem<String> recommendationSurgical = new TreeItem<>("Surgical");
    TreeItem<String> recommendationTherapy = new TreeItem<>("Therapy");
    TreeItem<String> recommendationOrthodics = new TreeItem<>("Orthotics");
    TreeItem<String> assessmentIssues = new TreeItem<>("Issues");
    TreeItem<String> assessmentBehavior = new TreeItem<>("Behavior/Cognitive Function");
    TreeItem<String>  assessmentMotorControl = new TreeItem<>("Motor Control/Static Balance");
    TreeItem<String> assessmentMuscleStrength = new TreeItem<>("Muscle Strength");
    TreeItem<String> assessmentMovement = new TreeItem<>("Movement Disorder");
    TreeItem<String> assessmentMuscleTone = new TreeItem<>("Muscle Tone");
    TreeItem<String> assessmentStance = new TreeItem<>("Stance Stability");
    TreeItem<String> assessmentSwing = new TreeItem<>("Swing Phase Function");

    //subcategories
    TreeItem<String> temporalSpatial = new TreeItem<>("Temporal/Spatial Parameters");
    TreeItem<String> trunkOrientation = new TreeItem<>("Trunk Orientation Relative to Room");
    TreeItem<String> hipJointData = new TreeItem<>("Hip Joint Angles(deg)");
    TreeItem<String> ankleJointData = new TreeItem<>("Ankle Joint Angles (deg)");
    TreeItem<String> variabilityData = new TreeItem<>("Variability");
    TreeItem<String> armJointData = new TreeItem<>("Arm Joint Angles");
    TreeItem<String> pelvisOrientation = new TreeItem<>("Pelvis Orientation Relative to Room");
    TreeItem<String> kneeJointData = new TreeItem<>("Knee Joint Angles (deg)");
    TreeItem<String> footOrientation = new TreeItem<>("Foot Orientation Relative to Room");
    TreeItem<String> groundForcesData = new TreeItem<>("Ground Reaction Forces (BW)");
    TreeItem<String> kneeJointMoments = new TreeItem<>("Knee Joint Moments");
    TreeItem<String> sagittalPowers = new TreeItem<>("Sagittal Joint Powers");
    TreeItem<String> hipMoments = new TreeItem<>("Hip Joint Moments");
    TreeItem<String> ankleMoments = new TreeItem<>("Ankle Joint Moments");

    //main tree
    TreeItem<String> parent2DataRoot = new TreeItem<>("");

    @Autowired
    private AptsService aptsService;
    @Autowired
    private GenMarkerService genMarkerService;
    private IAppointmentModel appointmentModel;
    public Text visitDate;
    public Text completingQuestionnaire;
    public Text relationshipToPatient;
    public Text changeWalk;
    public Text supportInWalk;
    public Text FMS5Text;
    public Text FMS50Text;
    public Text FMS500Text;
    public Text currentDevice;
    public Text gaitConcerns;
    public Text pain;
    public Text ptFreq;
    public Text otFreq;
    public Text followupDate;
    public Text genConcerns;
    public Text currentDevices;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        visitPt.setText("Chris Church");
        aptReferringMd.setText("Dr. Freeman Miller");
        GAITHeight.setText("128.0");
        GAITWeight.setText("21.0");
        GAITRFL.setText("10");
        GAITRFW.setText("5");
        GAITLFL.setText("10");
        GAITLFW.setText("5");
        GAITAS1.setSelected(true);
        GMFCSCombo.setValue("III");
        FMS5M.setValue("1");
        FMS50M.setValue("N");
        FMS500M.setValue("4");
        GAITcomments.setText("akdsf;lasafd");
        GAITptsR.setText("3");
        GAITstand3R.setText("3");
        GAITstand20R.setText("3");
        oneLegStanceR.setText("3");
        oneLegStanceL.setText("3");
        oneLegR.setText("3");
        oneLegL.setText("1");
        sitStandR.setText("3");
        kneeToStandR.setText("2");
        kneeToStandL.setText("3");
        lowerToFloorR.setText("3");
        squatsR.setText("3");
        standingR.setText("3");
        GAITModA.setText("100");
        GAITModB.setText("92");
        GAITModC.setText("100");
        GAITModE.setText("100");
        PAMNum.setSelected(true);
        AFrun.setSelected(true);
        AIsports.setSelected(true);
        CL0.setSelected(true);
        LL0.setSelected(true);
        HL5.setSelected(true);
        locOfPain.setText("ankle");
        freqOfPain.setText("1x week");
        PROMHipR.setText("125");
        PROMHipL.setText("125");
        StrenHipFlexR.setText("4+");
        StrenHipFlexL.setText("5");
        hipRP.setValue("N");
        hipLP.setValue("N");
        hipRS.setValue("VH");
        hipLS.setValue("VH");
        PROMHipExtR.setText("0");
        PROMHipExtL.setText("5");
        StrengHipExtR.setText("4+");
        StrengHipExtL.setText("5");
        hipExtRP.setValue("L");
        hipExtRS.setValue("VL");
        PROMHipabdR.setText("30");
        PROMHipabdL.setText("30");
        StregHipExtR.setText("4+");
        StregHipExtL.setText("5");
        PROMHipIntRotR.setText("60");
        PROMHipIntRotL.setText("55");
        hipIntRotRP.setValue("N");
        hipIntRotLP.setValue("N");
        PROMHipExtRotR.setText("L");
        PROMHipExtRotL.setText("25");
        PROMHipExtRotR.setText("25");
        PROMRyderTestR.setText("-30");
        PROMRyderTestL.setText("-20");
        PROMKneeExtR.setText("-8");
        PROMKneeExtL.setText("-5");
        StrengthKneeExtR.setText("4+");
        StrengthKneeExtL.setText("5");
        PROMExtLagR.setText("-15");
        PROMExtLagL.setText("-5");
        PROMKneeFlexR.setText("999");
        PROMKneeFlexL.setText("999");
        StrengthKneeFlexR.setText("4+");
        StrengthKneeFlexL.setText("5");
        extLagRP.setValue("L");
        extLagLP.setValue("L");
        PROMPopAngleR.setText("75");
        PROMPopAngleL.setText("60");
        popAngRP.setValue("H");
        popAngLP.setValue("H");
        PROMBilatR.setText("60");
        PROMBilatL.setText("55");
        biPopAngRP.setValue("H");
        biPopAngLP.setValue("H");
        PROMElyR.setText("120");
        PROMElyL.setText("125");
        PROMDorsiFR.setText("-15");
        PROMDorsiFL.setText("20");
        PROMDorsiER.setText("-20");
        PROMDorsiEL.setText("10");
        dorsiExtRP.setValue("L");
        dorsiExtLP.setValue("N");
        PROMPlantarR.setText("65");
        PROMPlantarL.setText("60");
        StrengPlantarR.setText("1+");
        StrengPlantarL.setText("5");
        PROMAnkInvR.setText("30");
        PROMAnkInvL.setText("45");
        StrengAnklInvR.setText("1");
        StrengAnklInvL.setText("5");
        PROMAnkEvR.setText("30");
        PROMAnkEvL.setText("35");
        StrengAnkEvR.setText("1");
        StrengAnkEvL.setText("5");
        PROMtmaR.setText("15");
        PROMtmaL.setText("12");
        tmaRP.setValue("N");
        tmaLP.setValue("N");
        PROMtfaR.setText("8");
        PROMtfaL.setText("8");
        PROMffR.setText("-3");
        PROMffL.setText("-5");
        PROMCalInvR.setText("30");
        PROMCalInvL.setText("20");
        PROMCalEvR.setText("10");
        PROMCalEvL.setText("5");
        legLengthR.setText("62.5");
        legLengthL.setText("63");
        illopsoasR.setText("g");
        illopsoasL.setText("g");
        gluteMedR.setText("g");
        gluteMedL.setText("g");
        hipAddR.setText("g");
        hipAddL.setText("g");
        gluteMaxR.setText("g");
        gluteMaxL.setText("g");
        quadsR.setText("g");
        quadsL.setText("g");
        hamstringR.setText("g");
        hamstringL.setText("g");
        antR.setText("p");
        antL.setText("g");
        gastroR.setText("p");
        gastroL.setText("g");
        postTibR.setText("p");
        postTibL.setText("g");
        soleusR.setText("p");
        peronR.setText("p");
        proximalR.setText("p");
        distaleR.setText("p");
        soleusL.setText("g");
        peronL.setText("g");
        proximalL.setText("g");
        distaleL.setText("g");
        proximalRInterp.setValue("Good");
        proximalRInterp.setValue("Poor");
        proximalLinterp.setValue("Poor");
        distaleLinterp.setValue("Good");
        TillipsoasR.setText("0");
        TillipsoasL.setText("0");
        TgluteMaxR.setText("1");
        TgluteMaxL.setText("0");
        TaddR.setText("1");
        TaddL.setText("0");
        TrecFemR.setText("1");
        TrecFemL.setText("0");
        TrecCatchR.setText("115");
        TrecCatchL.setText("120");
        TvastmedR.setText("1");
        TvastmedL.setText("0");
        ThamstringR.setText("1+");
        ThamstringL.setText("0");
        TpostTibR.setText("1");
        TpostTibL.setText("0");
        TantR.setText("0");
        TantL.setText("0");
        TgastroR.setText("1+");
        TgastroL.setText("0");
        TclonusR.setText("0");
        TclonusL.setText("0");
        TkneeJerR.setText("3+");
        TkneeJerL.setText("3+");
        RankJerR.setText("2+");
        RankJerL.setText("2+");
        TbabinR.setText("0");
        TbabinL.setText("0");
        TproxRinterp.setValue("H");
        TproxLinterp.setValue("N");
        TdistalRinterp.setValue("H");
        TdistalLinterp.setValue("N");
        personReporting.setText("Kameron Hazelwood");
        relationshipToPatientQues.setText("Birth Parent");
        dateReported.setText("4/5/2025");
        premature.setText("Not Premature");
        visitDate.setText("03/07/2025");
        completingQuestionnaire.setText("Kameron Hazelwood");
        supportInWalk.setText("Requires Support");
        changeWalk.setText("No Change");
        currentDevices.setText("Hand Led");
        gaitConcerns.setText("Frequent Tripping");
        followupDate.setText("05/31/2025");
        genConcerns.setText("n/a");
        firstWalk.setText("");
        firstTalked.setText("");
        FMS5Text.setText("Uses crutches");
        FMS50Text.setText("Independent on level surfaces (Requires a rail for stairs) ");
        FMS500Text.setText("Crawling");
        seizureTextfield.setText("Depakote");
        pain.setText(" R -- Fingers L -- Shoulder L -- Wrist");
        PTHospital.setText("None");
        PTClinic.setText("One of more times per week");
        PTSchool.setText("Two of three times per week");
        PTHome.setText("About once per month");
        OTHospital.setText("None");
        OTClinic.setText("One of more times per week");
        OTSchool.setText("About one per month");
        OTHome.setText("About once per month");
        firstTalked.setText("18 months");
        firstWalk.setText("18 months");
        childLearn.setText("Slow learner, needs special class");
        relationshipToPatient.setText("Birth Parent");

        GMFCSCombo.getItems().addAll(
                " ",
                "I",
                "II",
                "III",
                "IV",
                "V"

        );
        FMS5M.getItems().addAll(
                " ",
                "N",
                "C",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        );
        FMS50M.getItems().addAll(
                " ",
                "N",
                "C",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        );
        FMS500M.getItems().addAll(
                " ",
                "N",
                "C",
                "1",
                "2",
                "3",
                "4",
                "5",
                "6"
        );

        hipRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipExtRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipExtLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipExtRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipExtLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipAbdRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipAbdLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipAbdRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipAbdLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipIntRotRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipIntRotLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
//        hipIntRotRS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
//        hipIntRotLS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
        hipExtRotRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        hipExtRotLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
//        hipExtRotRS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
//        hipExtRotLS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
        ryderRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ryderLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
//        ryderRS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
//        ryderLS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
        kneeExtRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeExtLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeExtRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeExtLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        extLagRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        extLagLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
//        extLagRS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
//        extLagLS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
        kneeFlexRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeFlexLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeFlexRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeFlexLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        popAngRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        popAngLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
//        popAngRS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
//        popAngLS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
        biPopAngRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        biPopAngLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        elyTestRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        elyTestLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        dorsiFlexRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        dorsiFlexRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        dorsiFlexLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        dorsiExtRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        dorsiExtLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        plantarRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        plantarRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        plantarLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleInvRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleInvLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleInvRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleInvLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleEverRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleEverLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleEverRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ankleEverLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        tmaRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        tmaRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        tmaLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        tfaRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ffRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ffLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        calInvRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        calInvLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        calEverRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeVarusRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        kneeVarusLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );

        illopsoasRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        illopsoasLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        gluteMedRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        gluteMedLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        hipAddRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        hipAddLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        gluteMaxRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        gluteMaxLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        quadsRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        quadsLinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        hamstringRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        hamstringLinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        antRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        antLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        gastroRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        gastroLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        postTibRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        postTibLinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        soleusRinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        soleusLinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        peronRinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        peronLinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        proximalRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        proximalLinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        distaleRinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        distaleLinterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        TillipsoasRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TillipsoasLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TgluteMaxRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TgluteMaxLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TaddRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TaddLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TrecFemRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TrecFemLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TrecCatchRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TrecCatchRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TrecCatchLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TvastmedRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TvastmedLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ThamstringRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        ThamstringLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TpostTibRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TpostTibLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TantRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TantLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TgastroRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TgastroLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TclonusRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TclonusLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TkneeJerRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TkneeJerLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        RankJerRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        RankJerLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TbabinRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TbabinLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TproxRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TproxLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TdistalRinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        TdistalLinterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );


        gaitpics.setSelected(true);
        //gaitpics1.setSelected(true);
        gaitFootPressure.setSelected(true);
        // gaitFootPressure1.setSelected(true);
        videoGait.setSelected(true);
        gaitMultiSegment.setSelected(true);
        GAITKinematics.setSelected(true);






        /*
        report table. first row apt date along with include test checkboxes below
         */
//        aptDateReport.setCellValueFactory(new Callback<TableColumn.CellDataFeatures<Table, Boolean>, ObservableValue<Boolean>>() {
//            @Override
//            public ObservableValue<Boolean> call(TableColumn.CellDataFeatures<Table, Boolean> param) {
//                return param.getValue().
//            }
//        });


        /*
        data tree
         */
//        GMFCSCombo.getItems().setAll(gmfcsOptions);
//        FMS5M.getItems().setAll(fms5mOptions);
//        FMS50M.getItems().setAll(fms50mOptions);
//        FMS500M.getItems().setAll(fms500mOptions);
//        illopsoasRInterp.getItems().setAll(motorControlInterpCB);
//        illopsoasLInterp.getItems().setAll(motorControlInterpCB);
//        gluteMedLInterp.getItems().setAll(motorControlInterpCB);
//        gluteMaxRInterp.getItems().setAll(motorControlInterpCB);
//        hipAddRInterp.getItems().setAll(motorControlInterpCB);
//        hipAddLInterp.getItems().setAll(motorControlInterpCB);
//        gluteMedLInterp.getItems().setAll(motorControlInterpCB);
//        gluteMedRInterp.getItems().setAll(motorControlInterpCB);
//        quadsLinterp.getItems().setAll(motorControlInterpCB);
//        quadsRInterp.getItems().setAll(motorControlInterpCB);
//        hamstringLinterp.getItems().setAll(motorControlInterpCB);
//        hamstringRInterp.getItems().setAll(motorControlInterpCB);
//        antRInterp.getItems().setAll(motorControlInterpCB);
//        antLInterp.getItems().setAll(motorControlInterpCB);
//        gastroLInterp.getItems().setAll(motorControlInterpCB);
//        gastroRInterp.getItems().setAll(motorControlInterpCB);
//        postTibLinterp.getItems().setAll(motorControlInterpCB);
//        postTibRInterp.getItems().setAll(motorControlInterpCB);
//        soleusLinterp.getItems().setAll(motorControlInterpCB);
//        soleusRinterp.getItems().setAll(motorControlInterpCB);
//        peronLinterp.getItems().setAll(motorControlInterpCB);
//        peronRinterp.getItems().setAll(motorControlInterpCB);
//        proximalLinterp.getItems().setAll(motorControlInterpCB);
//        proximalRInterp.getItems().setAll(motorControlInterpCB);
//        distaleLinterp.getItems().setAll(motorControlInterpCB);
//        distaleRinterp.getItems().setAll(motorControlInterpCB);
//        TillipsoasLinterp.getItems().setAll(toneOptions);
//        TillipsoasRinterp.getItems().setAll(toneOptions);
//        TgluteMaxLinterp.getItems().setAll(toneOptions);
//        TgluteMaxRinterp.getItems().setAll(toneOptions);
//        TaddRinterp.getItems().setAll(toneOptions);
//        TaddLinterp.getItems().setAll(toneOptions);
//        TrecFemLinterp.getItems().setAll(toneOptions);
//        TrecFemRInterp.getItems().setAll(toneOptions);
//        TrecCatchLinterp.getItems().setAll(toneOptions);
//        TrecCatchRinterp.getItems().setAll(toneOptions);
//        TvastmedLinterp.getItems().setAll(toneOptions);
//        TvastmedRInterp.getItems().setAll(toneOptions);
//        ThamstringLinterp.getItems().setAll(toneOptions);
//        ThamstringRinterp.getItems().setAll(toneOptions);
//        TpostTibLinterp.getItems().setAll(toneOptions);
//        TpostTibRInterp.getItems().setAll(toneOptions);
//        TantRInterp.getItems().setAll(toneOptions);
//        TantLinterp.getItems().setAll(toneOptions);
//        TgastroLinterp.getItems().setAll(toneOptions);
//        TgastroRinterp.getItems().setAll(toneOptions);
//        TclonusLinterp.getItems().setAll(toneOptions);
//        TclonusRinterp.getItems().setAll(toneOptions);
//        TkneeJerLinterp.getItems().setAll(toneOptions);
//        TkneeJerRinterp.getItems().setAll(toneOptions);
//        RankJerLinterp.getItems().setAll(toneOptions);
//        RankJerRinterp.getItems().setAll(toneOptions);
//        TbabinLinterp.getItems().setAll(toneOptions);
//        TbabinRinterp.getItems().setAll(toneOptions);
//        TproxLinterp.getItems().setAll(toneOptions);
//        TproxRinterp.getItems().setAll(toneOptions);
//        TdistalLinterp.getItems().setAll(toneOptions);
//        TdistalRinterp.getItems().setAll(toneOptions);
//        hipRP.getItems().setAll(promOptions);
//        hipLP.getItems().setAll(promOptions);
//        hipRS.getItems().setAll(promOptions);
//        hipLS.getItems().setAll(promOptions);
//        hipExtRP.getItems().setAll(promOptions);
//        hipExtLP.getItems().setAll(promOptions);
//        hipExtLS.getItems().setAll(promOptions);
//        hipExtRS.getItems().setAll(promOptions);
//        hipAbdRP.getItems().setAll(promOptions);
//        hipAbdLP.getItems().setAll(promOptions);
//        hipAbdLS.getItems().setAll(promOptions);
//        hipAbdRS.getItems().setAll(promOptions);
//        hipIntRotLP.getItems().setAll(promOptions);
//        hipIntRotRP.getItems().setAll(promOptions);
////        hipIntRotLS.getItems().setAll(promOptions);
//        hipIntRotRS.getItems().setAll(promOptions);
//        hipExtRotRS.getItems().setAll(promOptions);
//        hipExtRotLS.getItems().setAll(promOptions);
//        hipExtRotRP.getItems().setAll(promOptions);
//        hipExtRotLP.getItems().setAll(promOptions);
//        ryderLP.getItems().setAll(promOptions);
//        ryderLS.getItems().setAll(promOptions);
//        ryderRP.getItems().setAll(promOptions);
//        ryderRS.getItems().setAll(promOptions);
//        kneeExtRP.getItems().setAll(promOptions);
//        kneeExtLP.getItems().setAll(promOptions);
//        kneeExtRS.getItems().setAll(promOptions);
//        kneeExtLS.getItems().setAll(promOptions);
//        extLagLP.getItems().setAll(promOptions);
//        extLagLS.getItems().setAll(promOptions);
//        extLagRP.getItems().setAll(promOptions);
//        extLagRS.getItems().setAll(promOptions);
//        kneeFlexRP.getItems().setAll(promOptions);
//        kneeFlexLP.getItems().setAll(promOptions);
//        kneeFlexLS.getItems().setAll(promOptions);
//        kneeFlexRS.getItems().setAll(promOptions);
//        popAngLP.getItems().setAll(promOptions);
//        popAngRP.getItems().setAll(promOptions);
//        popAngLS.getItems().setAll(promOptions);
//        popAngRS.getItems().setAll(promOptions);
//        biPopAngLP.getItems().setAll(promOptions);
//        biPopAngRP.getItems().setAll(promOptions);
//        elyTestLP.getItems().setAll(promOptions);
//        elyTestRP.getItems().setAll(promOptions);
//        dorsiFlexLP.getItems().setAll(promOptions);
//        dorsiFlexRP.getItems().setAll(promOptions);
//        dorsiExtLP.getItems().setAll(promOptions);
//        dorsiExtRP.getItems().setAll(promOptions);
//        plantarLP.getItems().setAll(promOptions);
//        plantarRP.getItems().setAll(promOptions);
//        plantarLS.getItems().setAll(promOptions);
//        plantarRS.getItems().setAll(promOptions);
//        ankleInvLP.getItems().setAll(promOptions);
//        ankleInvRP.getItems().setAll(promOptions);
//        ankleInvLS.getItems().setAll(promOptions);
//        ankleInvRS.getItems().setAll(promOptions);
//        ankleEverLP.getItems().setAll(promOptions);
//        ankleEverRP.getItems().setAll(promOptions);
//        ankleEverLS.getItems().setAll(promOptions);
//        ankleEverRS.getItems().setAll(promOptions);
//        tmaLP.getItems().setAll(promOptions);
//        tmaRP.getItems().setAll(promOptions);
//        tfaLP.getItems().setAll(promOptions);
//        tfaRP.getItems().setAll(promOptions);
//        ffLP.getItems().setAll(promOptions);
//        ffRP.getItems().setAll(promOptions);
//        calEverLP.getItems().setAll(promOptions);
//        calEverRP.getItems().setAll(promOptions);
//        calInvLP.getItems().setAll(promOptions);
//        calInvRP.getItems().setAll(promOptions);
//        legLengthRP.getItems().setAll(promOptions);
//        legLengthLP.getItems().setAll(promOptions);
//        kneeVarusLP.getItems().setAll(promOptions);
//        kneeVarusRP.getItems().setAll(promOptions);


//        /*
//        need to see if this is in use.
//         */
//        // adding to the tree view subcats
        kinematics.getChildren().addAll(hipJointAngles, ankleJointAngles);
        footKinematics.getChildren().addAll(lateralForefoot, medialForefoot);
        kinetics.getChildren().addAll(hipJoint, kneeJoint, ankleJoint);
        pngFiles.getChildren().addAll(kinematics);
        pngFiles.getChildren().addAll(footKinematics);
        pngFiles.getChildren().addAll(kinetics);
        kinematicsData.getChildren().addAll(temporalSpatial, trunkOrientation, hipJointData, ankleJointData, variabilityData, armJointData,
                pelvisOrientation, kneeJointData, footOrientation);
        kineticsData.getChildren().addAll(groundForcesData, kneeJointMoments, sagittalPowers, hipMoments, ankleMoments);

        //main tree
        recommendations.getChildren().addAll(recommendationDiagnostic, recommendationSurgical, recommendationTherapy, recommendationOrthodics);
        assessmentForm.getChildren().addAll(assessmentIssues, assessmentBehavior, assessmentMotorControl, assessmentMuscleStrength, assessmentMovement, assessmentMuscleTone, assessmentStance, assessmentSwing);


        // parent2DataRoot.getChildren().addAll(showAll);
        parent2DataRoot.getChildren().addAll(kineticsData);
        parent2DataRoot.getChildren().addAll(kineticsData);
        parent2DataRoot.getChildren().addAll(footModel);
        parent2DataRoot.getChildren().addAll(pedobaragraph);
        parent2DataRoot.getChildren().addAll(o2Consumption);
        parent2DataRoot.getChildren().addAll(assessmentForm);
        parent2DataRoot.getChildren().addAll(recommendations);
        parent2DataRoot.getChildren().addAll(pngFiles);


        parent2DataRoot.setExpanded(true);
        dataTable.setRoot(parent2DataRoot);
        this.dataTable.setShowRoot(false);


        gaitpics.selectedProperty().addListener((o, newValue, oldValue) -> {
            if (newValue) {
                addTestReason();
                gaitpics.getStylesheets().add("/styles.css");
                tooltip.setText("This is a test reason");

            }
        });
//            gaitpics1.selectedProperty().addListener((o, newValue, oldValue) -> {
//                if (newValue) {
//                    addTestReason();
//                    gaitpics1.getStylesheets().add("/styles.css");
//                }
//            });
        gaitFootPressure.selectedProperty().addListener((o, newValue, oldValue) -> {
            if (newValue) {
                addTestReason();
                gaitFootPressure.getStylesheets().add("/styles.css");
            }
        });
//            gaitFootPressure1.selectedProperty().addListener((o, newValue, oldValue) -> {
//                if (newValue) {
//                    addTestReason();
//                    gaitFootPressure1.getStylesheets().add("/styles.css");
//                }
//            });
        videoGait.selectedProperty().addListener((o, newValue, oldValue) -> {
            if (newValue) {
                addTestReason();
                videoGait.getStylesheets().add("/styles.css");
            }
        });
//            videoGait1.selectedProperty().addListener((o, newValue, oldValue) -> {
//                if (newValue) {
//                    addTestReason();
//                    videoGait.getStylesheets().add("/styles.css");
//
//                }
//            });

    }

    private IAppointmentModel showTestNoteDialog(IAppointmentModel appointmentModel) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Launcher.class.getResource("/Visits/TestNote.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popup = fxmlLoader.load();
        TestNoteController testNoteController = fxmlLoader.getController();
        testNoteController.setTestNote(appointmentModel);

        Stage stage1 = new Stage();
        stage1.setTitle("Reason: ");
        stage1.setScene(new Scene(popup, 380, 200));
        stage1.show();

        return testNoteController.isSaved() ? appointmentModel : null;

    }

    public void addTestReason() {
        try {
            IAppointmentModel newTestReason = showTestNoteDialog(
                    new IAppointmentModel(null, null, null, null, null, null, null, null, null, null, null, null)
            );
        } catch (IOException ignored) {

        }
    }


    public void setAppointmentModel(IAppointmentModel appointmentModel, IPatientModel patientModel) {
        this.appointmentModel = appointmentModel;
        this.patientModel = patientModel;

        aptDate.setText(appointmentModel.getAptDate());
        aptVisitType.setText(appointmentModel.getVisitType());
        aptSubType.setText(appointmentModel.getVisitSubType());
        aptReferringMd.setText(appointmentModel.getReferringPhys());
        visitPt.setText(appointmentModel.getVisitPT());
        visitPt2.setText(appointmentModel.getVisitPT2());
        visitBio2.setText(appointmentModel.getVisitBioMech2());
        visitBio.setText(appointmentModel.getVisitBioMech());
        aptStartTime.setText("1:00pm");
        aptStopTime.setText("3:00pm");
        //mrnTextField.setText(patientModel.getMrn());

    }

    IPatientModel patientModel;

    public void setPatient(IPatientModel patientModel) {
        this.patientModel = patientModel;
        //  mrnTextField.setText(patientModel.getMrn());
        //mrnTextField.setText("32581055");
    }

    @FXML
    public void onSetDatesVisitGait(IAppointmentModel appointmentModel1) throws IOException {
        /*
        service needs to show all dates for an appointment. also shows if pics are available or grayed out.
        i think a new popup window that displays all apointment dates would be best
         */
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Wizards/SetDatesWizard.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Select Comparison Dates Below: ");
        stage1.setScene(new Scene(popUp, 600, 450));
        stage1.show();


    }

    Image lateralForeFoot = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_LateralForeFoot.png")));
    Image kneeJointMoments1 = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_KneeJointMoments.png")));
    Image kneeJointAngles = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_KneeJointAngles.png")));
    Image hipJointMoments = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_HipJointMoments.png")));
    Image hipJointAnglesImage = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_HipJointAngles.png")));
    Image medialForeFoot = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_MedialForeFoot.png")));
    Image comparisonPhoto = new Image(String.valueOf(getClass().getResource("/images/comparison.png")));

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @FXML
    private Stage stage;


    public void selectedItem() throws IOException {
        dataTable.setOnMouseClicked(new EventHandler<MouseEvent>() {
            @Override
            public void handle(MouseEvent mouseEvent) {
                    if(mouseEvent.getButton().equals(MouseButton.PRIMARY)){
                        if(mouseEvent.getClickCount() == 2){
                            BorderPane root = new BorderPane();
                            root.setCenter(getViewOne());
                            TreeItem<String> item = (TreeItem<String>) dataTable.getSelectionModel().getSelectedItem();
                            if (item == armJointData) {
                                root.setCenter(getArmJointAngles());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == temporalSpatial) {
                                root.setCenter(getTempSpaView());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                //width first and length second 6 and 5
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == trunkOrientation) {
                                root.setCenter(getTrunkOriet());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == hipJointData) {
                                root.setCenter(getHipJointAngles());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == variabilityData) {
                                root.setCenter(getVaraiblity());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == pelvisOrientation) {
                                root.setCenter(getPelvisOreit());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == kneeJointData) {
                                root.setCenter(getKneeJointAngles());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == footOrientation) {
                                root.setCenter(getFootOreint());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == groundForcesData) {
                                root.setCenter(getGroundForces());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == hipMoments) {
                                root.setCenter(getHipJointMoments());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == hipJointAngles) {
                                root.setCenter(getHipJointMoments());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == lateralForefoot) {
                                root.setCenter(getViewOne());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == medialForefoot) {
                                root.setCenter(getViewOne());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == ankleJoint) {
                                root.setCenter(getAnkleMoments());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 680, 600));
                                stage.show();
                            } else if (item == kneeJointData) {
                                root.setCenter(getKneeJointMoments());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == footModel) {
                                root.setCenter(getFootModel());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == pedobaragraph) {
                                root.setCenter(getPedobaragraph());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == o2Consumption) {
                                root.setCenter(geto2Consumption());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == ankleMoments) {
                                root.setCenter(getAnkleMoments());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 680, 600));
                                stage.show();
                            }
                            else if (item == kneeJointMoments) {
                                root.setCenter(getKneeJointMoments());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == sagittalPowers) {
                                root.setCenter(getSaggitalJointPowers());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            } else if (item == ankleJointData) {
                                root.setCenter(getAnkleJointAngles());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == recommendationDiagnostic){
                                root.setCenter(getDiagRecommendations());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == recommendationSurgical){
                                root.setCenter(getSurgRecommendations());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 850, 600));
                                stage.show();
                            }
                            else if (item == recommendationTherapy){
                                root.setCenter(getTherapyRecommendations());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 850, 600));
                                stage.show();
                            }
                            else if (item == recommendationOrthodics){
                                root.setCenter(getOrthRecommendations());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 850, 600));
                                stage.show();
                            }
                            else if (item == assessmentIssues){
                                root.setCenter(getIssuesAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 850, 600));
                                stage.show();
                            }
                            else if (item == assessmentBehavior){
                                root.setCenter(getBehaviorAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == assessmentMotorControl){
                                root.setCenter(getMotorAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == assessmentMuscleStrength){
                                root.setCenter(getMuscleAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == assessmentMovement){
                                root.setCenter(getMovementAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == assessmentMuscleTone){
                                root.setCenter(getMuscleToneAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == assessmentStance){
                                root.setCenter(getStanceAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                            else if (item == assessmentSwing){
                                root.setCenter(getSwingAssessment());
                                Stage stage = new Stage();
                                stage.initModality(Modality.WINDOW_MODAL);
                                stage.initStyle(StageStyle.UNDECORATED);
                                stage.setScene(new Scene(root, 650, 600));
                                stage.show();
                            }
                        }
                    }
            }
        });

    }
    public VBox getViewOne() {
        Button cancelButton = new Button("Close");
        Label testLabel = new Label("ViewOne");

        VBox vbox = new VBox();
        vbox.getChildren().addAll(testLabel, cancelButton);

        cancelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
            }
        });
        testLabel.setTranslateX(10);
        cancelButton.setMinWidth(90);
        cancelButton.setMinHeight(50);
        cancelButton.setTranslateX(400);
        cancelButton.setTranslateY(400);
        return vbox;
    }

    private TableView temporialTable = new TableView();
    @Autowired
    TemporalService temporalService;
    private final ObservableList<ITemporalModel> listviewTemporal = FXCollections.observableArrayList();
    public VBox getTempSpaView() {
        Button closeButton = new Button("Close");
        Button saveButton = new Button("Save");
        Label textLabel = new Label("Temporal/Spatial Parameters");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        TextArea textArea = new TextArea();

        listviewTemporal.addAll(FXCollections.observableArrayList(temporalService.findAll()));
        temporialTable.setItems(listviewTemporal);
        TableColumn<ITemporalModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<ITemporalModel, String> valueCol = new TableColumn<>("Value");
        TableColumn<ITemporalModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
         interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));
         interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));

        nameCol.prefWidthProperty().bind(temporialTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(temporialTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(temporialTable.widthProperty().multiply(0.3));

        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);

        temporialTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
        temporialTable.setEditable(true);
        temporialTable.getColumns().addAll(nameCol, valueCol, interpCol);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, temporialTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                temporialTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                temporialTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        temporialTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }
    private TableView<ITrunkOrientationModel> trunkOrienTable = new TableView<>();
    @Autowired
    TrunkOrienService trunkOrienService;
    private final ObservableList<ITrunkOrientationModel> listviewTrunkOrien = FXCollections.observableArrayList();
    public VBox getTrunkOriet() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Trunk Orientation Relative to Room");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewTrunkOrien.addAll(FXCollections.observableArrayList(trunkOrienService.findAll()));
        trunkOrienTable.setItems(listviewTrunkOrien);
        trunkOrienTable.setEditable(true);

        TableColumn<ITrunkOrientationModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<ITrunkOrientationModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<ITrunkOrientationModel, String > interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));
        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));


        //  interpCol.setCellValueFactory(ComboBoxTableCell.forTableColumn("High", "Low", "Very Low", "Normal", "Very High"));
        nameCol.prefWidthProperty().bind(trunkOrienTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(trunkOrienTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(trunkOrienTable.widthProperty().multiply(0.3));

        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        trunkOrienTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        trunkOrienTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, trunkOrienTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                trunkOrienTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                trunkOrienTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        trunkOrienTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IHipJointModel> hipJointTable = new TableView<>();
    @Autowired
    HipJointService hipJointService;
    private final ObservableList<IHipJointModel> listviewHipJoint = FXCollections.observableArrayList();
    public VBox getHipJointAngles() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Hip Joint Angles(deg)");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewHipJoint.addAll(FXCollections.observableArrayList(hipJointService.findAll()));
        hipJointTable.setItems(listviewHipJoint);
        hipJointTable.setEditable(true);

        TableColumn<IHipJointModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IHipJointModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IHipJointModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(hipJointTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(hipJointTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(hipJointTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        hipJointTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        hipJointTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, hipJointTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                hipJointTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                hipJointTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        hipJointTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IAnkleJointAnglesModel> ankleJointTable = new TableView<>();
    @Autowired
    AnkleJointService ankleJointService;
    private final ObservableList<IAnkleJointAnglesModel> listviewAnkleJoint = FXCollections.observableArrayList();
    public VBox getAnkleJointAngles() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Ankle Joint Angles(deg)");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewAnkleJoint.addAll(FXCollections.observableArrayList(ankleJointService.findAll()));
        ankleJointTable.setItems(listviewAnkleJoint);
        ankleJointTable.setEditable(true);

        TableColumn<IAnkleJointAnglesModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IAnkleJointAnglesModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IAnkleJointAnglesModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(ankleJointTable.widthProperty().multiply(0.4));
        valueCol.prefWidthProperty().bind(ankleJointTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(ankleJointTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        ankleJointTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        ankleJointTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, ankleJointTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                ankleJointTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                ankleJointTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        ankleJointTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IVariabilityModel> variabilityTable = new TableView<>();
    @Autowired
    VariabilityService variabilityService;
    private final ObservableList<IVariabilityModel> listviewVar = FXCollections.observableArrayList();


    public VBox getVaraiblity() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Variability");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewVar.addAll(FXCollections.observableArrayList(variabilityService.findAll()));
        variabilityTable.setItems(listviewVar);
        variabilityTable.setEditable(true);

        TableColumn<IVariabilityModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IVariabilityModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IVariabilityModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(variabilityTable.widthProperty().multiply(0.4));
        valueCol.prefWidthProperty().bind(variabilityTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(variabilityTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        variabilityTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        variabilityTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, variabilityTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                variabilityTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                variabilityTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        variabilityTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IArmJointAnglesModel> armJointTable = new TableView();
    @Autowired
    ArmJointsAnglesSerivce armJointsAnglesSerivce;

    private final ObservableList<IArmJointAnglesModel> listviewArmJoints = FXCollections.observableArrayList();

    public VBox getArmJointAngles() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Arm Joints Angles");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewArmJoints.addAll(FXCollections.observableArrayList(armJointsAnglesSerivce.findAll()));
        armJointTable.setItems(listviewArmJoints);
        armJointTable.setEditable(true);

        TableColumn<IArmJointAnglesModel, String> nameCol = new TableColumn<>("Name");
                TableColumn<IArmJointAnglesModel, Double> valueCol = new TableColumn<>("Value");
                TableColumn<IArmJointAnglesModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
                valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
                interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(armJointTable.widthProperty().multiply(0.3));
                valueCol.prefWidthProperty().bind(armJointTable.widthProperty().multiply(0.3));
                interpCol.prefWidthProperty().bind(armJointTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
                valueCol.setResizable(false);
                interpCol.setResizable(false);
                interpCol.setEditable(true);

        armJointTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

                armJointTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, armJointTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                armJointTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                armJointTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        armJointTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IPelvisOrientationModel> pelvisOrienTable = new TableView<>();
    @Autowired
    PelvisOrienService pelvisOrienService;
    private final ObservableList<IPelvisOrientationModel> listviewPelvisOrien = FXCollections.observableArrayList();

    public VBox getPelvisOreit() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Pelvis Orientation Relative to Room");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewPelvisOrien.addAll(FXCollections.observableArrayList(pelvisOrienService.findAll()));
        pelvisOrienTable.setItems(listviewPelvisOrien);
        pelvisOrienTable.setEditable(true);

        TableColumn<IPelvisOrientationModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IPelvisOrientationModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IPelvisOrientationModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(pelvisOrienTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(pelvisOrienTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(pelvisOrienTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        pelvisOrienTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        pelvisOrienTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, pelvisOrienTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                pelvisOrienTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                pelvisOrienTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        pelvisOrienTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IKneeJointAnglesModel> kneeJointTable = new TableView<>();
    @Autowired
    KneeJointService kneeJointService;
    private final ObservableList<IKneeJointAnglesModel> listviewKneeJoint = FXCollections.observableArrayList();
    public VBox getKneeJointAngles() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Knee Joint Angles(deg)");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewKneeJoint.addAll(FXCollections.observableArrayList(kneeJointService.findAll()));
        kneeJointTable.setItems(listviewKneeJoint);
        kneeJointTable.setEditable(true);

        TableColumn<IKneeJointAnglesModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IKneeJointAnglesModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IKneeJointAnglesModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(kneeJointTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(kneeJointTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(kneeJointTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        kneeJointTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        kneeJointTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, kneeJointTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                kneeJointTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                kneeJointTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        kneeJointTable.setTranslateY(-70);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IFootOrientationModel> footOrientTable = new TableView<>();
    @Autowired
    FootOrienService footOrienService;
    private final ObservableList<IFootOrientationModel> listviewFootOrien = FXCollections.observableArrayList();
    public VBox getFootOreint() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Foot Orientation Relative to Room");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewFootOrien.addAll(FXCollections.observableArrayList(footOrienService.findAll()));
        footOrientTable.setItems(listviewFootOrien);
        footOrientTable.setEditable(true);

        TableColumn<IFootOrientationModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IFootOrientationModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IFootOrientationModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(footOrientTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(footOrientTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(footOrientTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        footOrientTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        footOrientTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel,textArea, saveButton, closeButton, footOrientTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                footOrientTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                footOrientTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        footOrientTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IGroundReactionForces> groundTable = new TableView<>();
    @Autowired
    GroundReactionService groundReactionService;
    private final ObservableList<IGroundReactionForces> listviewGround = FXCollections.observableArrayList();
    public VBox getGroundForces() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Ground Reaction Forces (BW)");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewGround.addAll(FXCollections.observableArrayList(groundReactionService.findAll()));
        groundTable.setItems(listviewGround);
        groundTable.setEditable(true);

        TableColumn<IGroundReactionForces, String> nameCol = new TableColumn<>("Name");
        TableColumn<IGroundReactionForces, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IGroundReactionForces, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(groundTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(groundTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(groundTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        groundTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        groundTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, groundTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                groundTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                groundTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        groundTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IKneeMomentsModel> kneeMomentTable = new TableView<>();
    @Autowired
    KneeMomentService kneeMomentService;
    private final ObservableList<IKneeMomentsModel> listviewKneeMoment = FXCollections.observableArrayList();

    public VBox getKneeJointMoments() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Knee Joint Moments");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewKneeMoment.addAll(FXCollections.observableArrayList(kneeMomentService.findAll()));
        kneeMomentTable.setItems(listviewKneeMoment);
        kneeMomentTable.setEditable(true);

        TableColumn<IKneeMomentsModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IKneeMomentsModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IKneeMomentsModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(kneeMomentTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(kneeMomentTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(kneeMomentTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        kneeMomentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        kneeMomentTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, groundTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                kneeMomentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                kneeMomentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        kneeMomentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);

        return vbox;
    }
    private TableView<ISaggitalJointModel> saggitalTable = new TableView<>();
    @Autowired
    SaggitalJointService saggitalJointService;
    private final ObservableList<ISaggitalJointModel> listviewSaggital = FXCollections.observableArrayList();

    public VBox getSaggitalJointPowers() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Sagittal Joint Powers");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewSaggital.addAll(FXCollections.observableArrayList(saggitalJointService.findAll()));
        saggitalTable.setItems(listviewSaggital);
        saggitalTable.setEditable(true);

        TableColumn<ISaggitalJointModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<ISaggitalJointModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<ISaggitalJointModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(saggitalTable.widthProperty().multiply(0.4));
        valueCol.prefWidthProperty().bind(saggitalTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(saggitalTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        saggitalTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        saggitalTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, saggitalTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                saggitalTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                saggitalTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        saggitalTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IHipJointMomentsModel> hipMomentTable = new TableView<>();
    @Autowired
    HipJointMomentService hipJointMomentService;
    private final ObservableList<IHipJointMomentsModel> listviewHipMoment = FXCollections.observableArrayList();
    public VBox getHipJointMoments() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Hip Joint Moments");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewHipMoment.addAll(FXCollections.observableArrayList(hipJointMomentService.findAll()));
        hipMomentTable.setItems(listviewHipMoment);
        hipMomentTable.setEditable(true);

        TableColumn<IHipJointMomentsModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IHipJointMomentsModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IHipJointMomentsModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(hipMomentTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(hipMomentTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(hipMomentTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        hipMomentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        hipMomentTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, hipMomentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                hipMomentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                hipMomentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        hipMomentTable.setTranslateY(-1400);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IFootInterpModel> footInterpTable = new TableView<>();
    @Autowired
    FootInterpService footInterpService;
    private final ObservableList<IFootInterpModel> listviewFootInterp = FXCollections.observableArrayList();
    public VBox getFootModel() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Foot Model");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewFootInterp.addAll(FXCollections.observableArrayList(footInterpService.findAll()));
        footInterpTable.setItems(listviewFootInterp);
        footInterpTable.setEditable(true);

        TableColumn<IFootInterpModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IFootInterpModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IFootInterpModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(footInterpTable.widthProperty().multiply(0.4));
        valueCol.prefWidthProperty().bind(footInterpTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(footInterpTable.widthProperty().multiply(0.3));

        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        footInterpTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        footInterpTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, footInterpTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                footInterpTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                footInterpTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        footInterpTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IPedobaragraphModel> pedobaragraphTable = new TableView<>();
    @Autowired
    PedobaragraphService pedobaragraphService;
    private final ObservableList<IPedobaragraphModel> listviewPedobar = FXCollections.observableArrayList();

    public VBox getPedobaragraph() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Pedobaragraph");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewPedobar.addAll(FXCollections.observableArrayList(pedobaragraphService.findAll()));
        pedobaragraphTable.setItems(listviewPedobar);
        pedobaragraphTable.setEditable(true);

        TableColumn<IPedobaragraphModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IPedobaragraphModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IPedobaragraphModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(pedobaragraphTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(pedobaragraphTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(pedobaragraphTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        pedobaragraphTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        pedobaragraphTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, pedobaragraphTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                pedobaragraphTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                pedobaragraphTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        pedobaragraphTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    public VBox geto2Consumption() {
        Button cancelButton = new Button("Close");
        Label testLabel = new Label("O2 Consumption");

        VBox vbox = new VBox();
        vbox.getChildren().addAll(testLabel, cancelButton);

        cancelButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
            }
        });
        testLabel.setTranslateX(10);
        cancelButton.setMinWidth(90);
        cancelButton.setMinHeight(50);
        cancelButton.setTranslateX(400);
        cancelButton.setTranslateY(400);
        return vbox;
    }

    private TableView<IAnkleJointMomentModel> ankleMomentTable = new TableView<>();
    @Autowired
    AnkleJointMomentService ankleJointMomentService;
    private final ObservableList<IAnkleJointMomentModel> listviewAnkleMoment = FXCollections.observableArrayList();

    public VBox getAnkleMoments() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Ankle Joint Moments");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewAnkleMoment.addAll(FXCollections.observableArrayList(ankleJointMomentService.findAll()));
        ankleMomentTable.setItems(listviewAnkleMoment);
        ankleMomentTable.setEditable(true);

        TableColumn<IAnkleJointMomentModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IAnkleJointMomentModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IAnkleJointMomentModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(ankleMomentTable.widthProperty().multiply(0.4));
        valueCol.prefWidthProperty().bind(ankleMomentTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(ankleMomentTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        ankleMomentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        ankleMomentTable.getColumns().addAll(nameCol, valueCol, interpCol);

        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, ankleMomentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                ankleMomentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                ankleMomentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        ankleMomentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);

        return vbox;
    }


    private TableView<IDiagRecommendations> diagRecomTable = new TableView<>();
    @Autowired
    DiagRecomService diagRecomService;
    private final ObservableList<IDiagRecommendations> listviewDiagRecom = FXCollections.observableArrayList();
    public VBox getDiagRecommendations() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Recommendation: Diagnostic");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IDiagRecommendations, Boolean> valueCol = new TableColumn<>("");
        TableColumn<IDiagRecommendations, String> nameCol = new TableColumn<>("");

        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));
        nameCol.setCellValueFactory((new PropertyValueFactory<>("recom_name")));

        nameCol.prefWidthProperty().bind(diagRecomTable.widthProperty().multiply(0.8));
        valueCol.prefWidthProperty().bind(diagRecomTable.widthProperty().multiply(0.1));

        valueCol.setCellFactory(CheckBoxTableCell.forTableColumn(valueCol));

        IDiagRecommendations diagRecommendations = new IDiagRecommendations(1, "Recommend pre-operative gait analysis", "", null);
        IDiagRecommendations diagRecommendations1 = new IDiagRecommendations(2, "Recommend post operative gait analysis in one year to document outcome", "", null);
        IDiagRecommendations diagRecommendations2 = new IDiagRecommendations(3, "Based on this evaluation, no additional diagnostic tests are indicated", "", null);
        IDiagRecommendations diagRecommendations3 = new IDiagRecommendations(4, "Radiographs if they are felt to be clinically indicated", "", null);
        IDiagRecommendations diagRecommendations4 = new IDiagRecommendations(5, "Based on the available data the diagnosis is not clear and further work up may be useful.", "", null);
        IDiagRecommendations diagRecommendations5 = new IDiagRecommendations(6, "Spinal imaging to rule out spinal cord pathology.", "", null);
        IDiagRecommendations diagRecommendations6 = new IDiagRecommendations(7, "Work up for myopathy or peripheral neuropathy.", "", null);
        IDiagRecommendations diagRecommendations7 = new IDiagRecommendations(8, "Recommend a full development assessment.", "", null);
        IDiagRecommendations diagRecommendations8 = new IDiagRecommendations(9, "CT scan to assess femoral anteversion.", "", null);
        IDiagRecommendations diagRecommendations9 = new IDiagRecommendations(10, "Continue regular orthopedic follow-up", "", null);
        IDiagRecommendations diagRecommendations10 = new IDiagRecommendations(11, "Gait lab re-evaluation in 6 months", "", null);
        IDiagRecommendations diagRecommendations11 = new IDiagRecommendations(12, "Pre-op Social needs Assessment", "", null);

        diagRecomTable.getItems().addAll(diagRecommendations, diagRecommendations1, diagRecommendations2,diagRecommendations3, diagRecommendations4,
                diagRecommendations5,diagRecommendations6, diagRecommendations7,diagRecommendations8, diagRecommendations9, diagRecommendations10,diagRecommendations11  );
        diagRecomTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        diagRecomTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        diagRecomTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, diagRecomTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                diagRecomTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                diagRecomTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        diagRecomTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IRecomSurgicalModel> surgRecomTable = new TableView<>();
    @Autowired
    RecomSurgicalService recomSurgicalService;
    private final ObservableList<IRecomSurgicalModel> listviewSurgRecom = FXCollections.observableArrayList();
    public VBox getSurgRecommendations() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Recommendation: Surgical");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewSurgRecom.addAll(FXCollections.observableArrayList(recomSurgicalService.findAll()));
        surgRecomTable.setItems(listviewSurgRecom);

        TableColumn<IRecomSurgicalModel, String> nameCol = new TableColumn<>("");
        TableColumn<IRecomSurgicalModel, IRecomSurgicalModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("recom_procedure")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

//        valueCol.setOnEditCommit(
//                new EventHandler<TableColumn.CellEditEvent<IRecomSurgicalModel, Boolean>>() {
//                    @Override
//                    public void handle(TableColumn.CellEditEvent<IRecomSurgicalModel, Boolean> t) {
//                        ((IRecomSurgicalModel) t.getTableView().getItems().get(t.getTablePosition().getRow()).setRecom_normal(t.getNewValue());
//                    }
//                }
//        );

        nameCol.prefWidthProperty().bind(surgRecomTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(surgRecomTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IRecomSurgicalModel, IRecomSurgicalModel.Values>(EnumSet.allOf(IRecomSurgicalModel.Values.class)));

        surgRecomTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        surgRecomTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        surgRecomTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, surgRecomTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                surgRecomTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                surgRecomTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        surgRecomTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(700);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }
    private TableView<ITherapyRecomModel> therapyRecomTable = new TableView<>();
    @Autowired
    TherapyRecomService therapyRecomService;
    private final ObservableList<ITherapyRecomModel> listviewTherapyRecom = FXCollections.observableArrayList();
    public VBox getTherapyRecommendations() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Recommendation: Therapy");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<ITherapyRecomModel, Boolean> valueCol = new TableColumn<>("");
        TableColumn<ITherapyRecomModel, String> nameCol = new TableColumn<>("");

        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));
        nameCol.setCellValueFactory((new PropertyValueFactory<>("recom_name")));

        valueCol.prefWidthProperty().bind(therapyRecomTable.widthProperty().multiply(0.1));
        nameCol.prefWidthProperty().bind(therapyRecomTable.widthProperty().multiply(0.9));

        valueCol.setCellFactory(CheckBoxTableCell.forTableColumn(valueCol));

        ITherapyRecomModel diagRecommendations = new ITherapyRecomModel(1, null,  "Based on this evaluation, no physical therapy is recommended.");
        ITherapyRecomModel diagRecommendations1 = new ITherapyRecomModel(2, null, "Current therapy program seems reasonable.");
        ITherapyRecomModel diagRecommendations2 = new ITherapyRecomModel(3, null, "Pre-Operative Physical Therapy is recommended");
        ITherapyRecomModel diagRecommendations3 = new ITherapyRecomModel(4, null, "Comprehensive post-operative rehabilitation including, but not limited to, PT and OT to address pain management, gait training with appropriate assistive device, functional mobility training, transfers, strengthening, stretching, ADLs and patient and family education.");
        ITherapyRecomModel diagRecommendations4 = new ITherapyRecomModel(5, null, "Outpatient physical therapy to address gait training with appropriate assistive device (walker, crutches, forearm crutches), functional mobility, strengthening, stretching, balance training to improve motor control strategies, and development of a home exercise program.");
        ITherapyRecomModel diagRecommendations5 = new ITherapyRecomModel(6,null,  "One-time consult with Physical Therapy or Adaptive trainer to set up a home exercise program");
        ITherapyRecomModel diagRecommendations6 = new ITherapyRecomModel(7,  null, "Encourage participation in age-appropriate activities such as martial arts, dance, soccer, and swimming.");
        ITherapyRecomModel diagRecommendations7 = new ITherapyRecomModel(8, null,  "Consult to seating clinic for new wheelchair or adjustments");
        ITherapyRecomModel diagRecommendations8 = new ITherapyRecomModel(9, null, "Equipment evaluation or Physical therapy to assess needs for stander, walker, forearm crutch or other assistive devices and training.");
        ITherapyRecomModel diagRecommendations9 = new ITherapyRecomModel(10, null,  "Consult to Occupational therapy");

        therapyRecomTable.getItems().addAll(diagRecommendations, diagRecommendations1, diagRecommendations2,diagRecommendations3, diagRecommendations4,
                diagRecommendations5,diagRecommendations6, diagRecommendations7,diagRecommendations8, diagRecommendations9);
        therapyRecomTable.setEditable(true);

        nameCol.setCellFactory(new Callback<TableColumn<ITherapyRecomModel, String>, TableCell<ITherapyRecomModel, String>>() {
            @Override
            public TableCell<ITherapyRecomModel, String> call(TableColumn<ITherapyRecomModel, String> iTherapyRecomModelStringTableColumn) {
                TableCell<ITherapyRecomModel, String> nameCell = new TableCell<>();
                Text text = new Text();
                nameCell.setGraphic(text);
                text.wrappingWidthProperty().bind(nameCell.widthProperty());
                text.textProperty().bind(nameCell.itemProperty());
                return nameCell;
            }
        });

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        therapyRecomTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        therapyRecomTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, therapyRecomTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                therapyRecomTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                therapyRecomTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        therapyRecomTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }
    private TableView<IOrthoticsRecomModel> orthRecomTable = new TableView<>();
    @Autowired
    OrthRecomService orthRecomService;
    private final ObservableList<IOrthoticsRecomModel> listviewOrthRecom = FXCollections.observableArrayList();
    public VBox getOrthRecommendations() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Recommendation: Orthotics");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewOrthRecom.addAll(FXCollections.observableArrayList(orthRecomService.findAll()));
        orthRecomTable.setItems(listviewOrthRecom);

        TableColumn<IOrthoticsRecomModel, String> nameCol = new TableColumn<>("");
        TableColumn<IOrthoticsRecomModel, IOrthoticsRecomModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("recom_orth_procedure")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

//        valueCol.setOnEditCommit(
//                new EventHandler<TableColumn.CellEditEvent<IRecomSurgicalModel, Boolean>>() {
//                    @Override
//                    public void handle(TableColumn.CellEditEvent<IRecomSurgicalModel, Boolean> t) {
//                        ((IRecomSurgicalModel) t.getTableView().getItems().get(t.getTablePosition().getRow()).setRecom_normal(t.getNewValue());
//                    }
//                }
//        );

        nameCol.prefWidthProperty().bind(orthRecomTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(orthRecomTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IOrthoticsRecomModel, IOrthoticsRecomModel.Values>(EnumSet.allOf(IOrthoticsRecomModel.Values.class)));

        orthRecomTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        orthRecomTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        orthRecomTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, orthRecomTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                orthRecomTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                orthRecomTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        orthRecomTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(700);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }


    public VBox getIssuesAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Issues Impacting Gait Function");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, closeButton, saveButton, textArea);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();

            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();

            }
        });


        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(650);
        closeButton.setTranslateY(480);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(550);
        saveButton.setTranslateY(430);

        textArea.setMaxHeight(700);
        textArea.setMaxWidth(700);
        textArea.setTranslateX(10);
        textArea.setTranslateY(50);
        return vbox;
    }
    private final TableView<IAssessmentBehaviorModel> behAssessmentTable = new TableView<>();

    public VBox getBehaviorAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Behavior/Cognitive Function");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IAssessmentBehaviorModel, String> nameCol = new TableColumn<>("");
        TableColumn<IAssessmentBehaviorModel, IAssessmentBehaviorModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("assessment_behavior_condition")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(behAssessmentTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(behAssessmentTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IAssessmentBehaviorModel, IAssessmentBehaviorModel.Values>(EnumSet.allOf(IAssessmentBehaviorModel.Values.class)));

        IAssessmentBehaviorModel as1 = new IAssessmentBehaviorModel(1, null, null, null, null, "", "No problem");
        IAssessmentBehaviorModel as2 = new IAssessmentBehaviorModel(2, null, null, null, null, "", "Negatively impacted the evaluation");
        IAssessmentBehaviorModel as3 = new IAssessmentBehaviorModel(3, null, null, null, null, "", "Is a primary impairment to gait function");
        IAssessmentBehaviorModel as4 = new IAssessmentBehaviorModel(4, null, null, null, null, "", "Is an associated impairment");
        behAssessmentTable.getItems().addAll(as1, as2, as3, as4);

        behAssessmentTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        behAssessmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        behAssessmentTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, behAssessmentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                behAssessmentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                behAssessmentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        behAssessmentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IAssessmentMotorModel> motorAssessmentTable = new TableView<>();
    public VBox getMotorAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Motor Control/ Static Balance");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IAssessmentMotorModel, String> nameCol = new TableColumn<>("");
        TableColumn<IAssessmentMotorModel, IAssessmentMotorModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("assessment_motor_condition")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(motorAssessmentTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(motorAssessmentTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IAssessmentMotorModel, IAssessmentMotorModel.Values>(EnumSet.allOf(IAssessmentMotorModel.Values.class)));

        IAssessmentMotorModel as1 = new IAssessmentMotorModel(1, null, null, null, null, "", "No problem");
        IAssessmentMotorModel as2 = new IAssessmentMotorModel(2, null, null, null, null, "", "Mild impairment");
        IAssessmentMotorModel as3 = new IAssessmentMotorModel(3, null, null, null, null, "",  "Moderate impairment limiting gait function");
        IAssessmentMotorModel as4 = new IAssessmentMotorModel(4, null, null, null, null, "", "Severe impairment probably limiting functional community ambulation");
        motorAssessmentTable.getItems().addAll(as1, as2, as3, as4);

        motorAssessmentTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        motorAssessmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        motorAssessmentTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, motorAssessmentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                motorAssessmentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                motorAssessmentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        motorAssessmentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }
    private TableView<IAssessmentStrengthModel> muscleAssessmentTable = new TableView<>();
    public VBox getMuscleAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Muscle Strength");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IAssessmentStrengthModel, String> nameCol = new TableColumn<>("");
        TableColumn<IAssessmentStrengthModel, IAssessmentStrengthModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("assessment_strength_condition")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(muscleAssessmentTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(muscleAssessmentTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IAssessmentStrengthModel, IAssessmentStrengthModel.Values>(EnumSet.allOf(IAssessmentStrengthModel.Values.class)));

        IAssessmentStrengthModel as1 = new IAssessmentStrengthModel(1, null, null, null, null,"", "Normal");
        IAssessmentStrengthModel as2 = new IAssessmentStrengthModel(2, null, null, null, null, "", "Isolated weakness");
        IAssessmentStrengthModel as3 = new IAssessmentStrengthModel(3, null, null, null, null, "",  "Global weakness");
        muscleAssessmentTable.getItems().addAll(as1, as2, as3);

        muscleAssessmentTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        muscleAssessmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        muscleAssessmentTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, muscleAssessmentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                muscleAssessmentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                muscleAssessmentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        muscleAssessmentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IAssessmentMovementModel> movementAssessmentTable = new TableView<>();
    public VBox getMovementAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Movement Disorder");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IAssessmentMovementModel, String> nameCol = new TableColumn<>("");
        TableColumn<IAssessmentMovementModel, IAssessmentMovementModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("assessment_movement_condition")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(movementAssessmentTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(movementAssessmentTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IAssessmentMovementModel, IAssessmentMovementModel.Values>(EnumSet.allOf(IAssessmentMovementModel.Values.class)));

        IAssessmentMovementModel as1 = new IAssessmentMovementModel(1, null, null, null, null, "None", "");
        IAssessmentMovementModel as2 = new IAssessmentMovementModel(2, null, null, null, null,  "Dystonia", "");
        IAssessmentMovementModel as3 = new IAssessmentMovementModel(3, null, null, null, null,  "Athetosis" , "");
        IAssessmentMovementModel as4 = new IAssessmentMovementModel(4, null, null, null, null, "Ballismus" , "");
        IAssessmentMovementModel as5 = new IAssessmentMovementModel(5, null, null, null, null,  "Mixed" , "");
        IAssessmentMovementModel as6 = new IAssessmentMovementModel(6, null, null, null, null,  "Ataxia", "");
        movementAssessmentTable.getItems().addAll(as1, as2, as3, as4, as5, as6);

        movementAssessmentTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        movementAssessmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        movementAssessmentTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, movementAssessmentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                movementAssessmentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                movementAssessmentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        movementAssessmentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }

    private TableView<IAssessmentToneModel> muscleToneAssessmentTable = new TableView<>();
    public VBox getMuscleToneAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Muscle Tone");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IAssessmentToneModel, String> nameCol = new TableColumn<>("");
        TableColumn<IAssessmentToneModel, IAssessmentToneModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("assessment_tone_condition")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(muscleToneAssessmentTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(muscleToneAssessmentTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IAssessmentToneModel, IAssessmentToneModel.Values>(EnumSet.allOf(IAssessmentToneModel.Values.class)));

        IAssessmentToneModel as1 = new IAssessmentToneModel(1, null, null, null, null, "", "None");
        IAssessmentToneModel as2 = new IAssessmentToneModel(2, null, null, null, null, "",  "Hypotonia");
        IAssessmentToneModel as3 = new IAssessmentToneModel(3, null, null, null, null, "",  "Spasticity assisting support");
        IAssessmentToneModel as4 = new IAssessmentToneModel(4, null, null, null, null, "",  "Spasticity causes associated impairment to gait");
        IAssessmentToneModel as5 = new IAssessmentToneModel(5, null, null, null, null, "", "Spasticity the primary gait impairment");
        muscleToneAssessmentTable.getItems().addAll(as1, as2, as3, as4, as5);

        muscleToneAssessmentTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        muscleToneAssessmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        muscleToneAssessmentTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, muscleToneAssessmentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                muscleToneAssessmentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                muscleToneAssessmentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        muscleToneAssessmentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }
    private TableView<IAssessmentStanceModel> stanceAssessmentTable = new TableView<>();
    public VBox getStanceAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Stance Stability");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IAssessmentStanceModel, String> nameCol = new TableColumn<>("");
        TableColumn<IAssessmentStanceModel, IAssessmentStanceModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("assessment_stance_condition")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(stanceAssessmentTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(stanceAssessmentTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IAssessmentStanceModel, IAssessmentStanceModel.Values>(EnumSet.allOf(IAssessmentStanceModel.Values.class)));

        IAssessmentStanceModel as1 = new IAssessmentStanceModel(1, null, null, null, null, "Increased lumbar lordosis", "");
        IAssessmentStanceModel as2 = new IAssessmentStanceModel(2, null, null, null, null, "High knee flexion midstance-crouch", "");
        IAssessmentStanceModel as3 = new IAssessmentStanceModel(3, null, null, null, null, "Planovalgus feet", "");
        IAssessmentStanceModel as4 = new IAssessmentStanceModel(4, null, null, null, null, "Equinus", "");
        IAssessmentStanceModel as5 = new IAssessmentStanceModel(5, null, null, null, null, "Equinovarus", "");
        IAssessmentStanceModel as6 = new IAssessmentStanceModel(6, null, null, null, null, "Rotational malalignment", "");
        IAssessmentStanceModel as7 = new IAssessmentStanceModel(7, null, null, null, null, "No problem", "");

        stanceAssessmentTable.getItems().addAll(as1, as2, as3, as4, as5, as6, as7);
        stanceAssessmentTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        stanceAssessmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        stanceAssessmentTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, stanceAssessmentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                stanceAssessmentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                stanceAssessmentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        stanceAssessmentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }
    private TableView<IAssessmentSwingModel> swingAssessmentTable = new TableView<>();
    public VBox getSwingAssessment() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Swing Phase Function");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        TableColumn<IAssessmentSwingModel, String> nameCol = new TableColumn<>("");
        TableColumn<IAssessmentSwingModel, IAssessmentSwingModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("assessment_swing_condition")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(swingAssessmentTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(swingAssessmentTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IAssessmentSwingModel, IAssessmentSwingModel.Values>(EnumSet.allOf(IAssessmentSwingModel.Values.class)));

        IAssessmentSwingModel as1 = new IAssessmentSwingModel(1, null, null, null, null, "", "Decreased knee flexion with toe drag");
        IAssessmentSwingModel as2 = new IAssessmentSwingModel(2, null, null, null, null, "", "Increased rectus EMG activity");
        IAssessmentSwingModel as3 = new IAssessmentSwingModel(3, null, null, null, null, "",  "Limited ankle dorsiflexion");
        IAssessmentSwingModel as4 = new IAssessmentSwingModel(4, null, null, null, null, "",  "No problem");

        swingAssessmentTable.getItems().addAll(as1, as2, as3, as4);
        swingAssessmentTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        swingAssessmentTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        swingAssessmentTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, swingAssessmentTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                swingAssessmentTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                swingAssessmentTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        swingAssessmentTable.setTranslateY(-140);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(600);
        textArea.setTranslateX(10);
        textArea.setTranslateY(420);
        return vbox;
    }


//            if (item.equals(showAll)) {
//                Pane pane = new Pane();
//                ImageView imageView1 = new ImageView(kneeJointAngles);
//                ImageView imageView2 = new ImageView(comparisonPhoto);
//                ImageView imageView3 = new ImageView(hipJointAnglesImage);
//                ImageView imageView4 = new ImageView(comparisonPhoto);
//                ImageView imageView5 = new ImageView(hipJointAnglesImage);
//                ImageView imageView6 = new ImageView(comparisonPhoto);
//                ImageView imageView7 = new ImageView(lateralForeFoot);
//                ImageView imageView8 = new ImageView(comparisonPhoto);
//                //image1
//                imageView1.setFitWidth(300);
//                imageView1.setFitHeight(300);
//                imageView1.setTranslateY(0);
//                imageView1.setTranslateX(0);
//                //image2
//                imageView2.setFitHeight(300);
//                imageView2.setFitWidth(300);
//                imageView2.setTranslateY(0);
//                imageView2.setTranslateX(310);
//
//                //image 3
//                imageView3.setFitHeight(300);
//                imageView3.setFitWidth(300);
//                imageView3.setTranslateY(310);
//                imageView3.setTranslateX(0);
//
//                //image 4
//                imageView4.setFitWidth(300);
//                imageView4.setFitHeight(300);
//                imageView4.setTranslateY(310);
//                imageView4.setTranslateX(310);
//
//                //image 5
//                imageView5.setFitHeight(300);
//                imageView5.setFitWidth(300);
//                imageView5.setTranslateY(0);
//                imageView5.setTranslateX(620);
//
//                //image 6
//                imageView6.setFitHeight(300);
//                imageView6.setFitWidth(300);
//                imageView6.setTranslateY(0);
//                imageView6.setTranslateX(920);
//
//                //image 7
//                imageView7.setFitHeight(300);
//                imageView7.setFitWidth(300);
//                imageView7.setTranslateY(315);
//                imageView7.setTranslateX(620);
//
//                //image 8
//                imageView8.setFitHeight(300);
//                imageView8.setFitWidth(300);
//                imageView8.setTranslateY(315);
//                imageView8.setTranslateX(920);
//
//                pane.getChildren().add(imageView1);
//                pane.getChildren().add(imageView2);
//                pane.getChildren().add(imageView3);
//                pane.getChildren().add(imageView4);
//                pane.getChildren().add(imageView5);
//                pane.getChildren().add(imageView6);
//                pane.getChildren().add(imageView7);
//                pane.getChildren().add(imageView8);
//
//                Scene scene = new Scene(pane, 1200, 650);
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.show();
//            }
//            if (item.equals(kneeJoint)) {
//                Pane pane = new HBox(150);
//                ImageView imageView1 = new ImageView(kneeJointAngles);
//                ImageView imageView2 = new ImageView(comparisonPhoto);
//                //image1
//                imageView1.setFitWidth(400);
//                imageView1.setFitHeight(400);
//                //image2
//                imageView2.setFitHeight(400);
//                imageView2.setFitWidth(400);
//
//                pane.getChildren().add(imageView1);
//                pane.getChildren().add(imageView2);
//                Scene scene = new Scene(pane, 1000, 500);
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.show();
//            }
//            if (item.equals(hipJointAngles)) {
//                Pane pane = new HBox(150);
//                ImageView imageView1 = new ImageView(hipJointAnglesImage);
//                ImageView imageView2 = new ImageView(comparisonPhoto);
//                //image1
//                imageView1.setFitWidth(400);
//                imageView1.setFitHeight(400);
//                //image2
//                imageView2.setFitHeight(400);
//                imageView2.setFitWidth(400);
//
//                pane.getChildren().add(imageView1);
//                pane.getChildren().add(imageView2);
//                Scene scene = new Scene(pane, 1000, 500);
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.show();
//            }
//            if (item.equals(lateralForefoot)) {
//                Pane pane = new HBox(150);
//                ImageView imageView1 = new ImageView(lateralForeFoot);
//                ImageView imageView2 = new ImageView(comparisonPhoto);
//                //image1
//                imageView1.setFitWidth(400);
//                imageView1.setFitHeight(400);
//                //image2
//                imageView2.setFitHeight(400);
//                imageView2.setFitWidth(400);
//
//                pane.getChildren().add(imageView1);
//                pane.getChildren().add(imageView2);
//                Scene scene = new Scene(pane, 1000, 500);
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.show();
//            }
//            if (item.equals(medialForefoot)) {
//                Pane pane = new HBox(150);
//                ImageView imageView1 = new ImageView(medialForeFoot);
//                ImageView imageView2 = new ImageView(comparisonPhoto);
//                //image1
//                imageView1.setFitWidth(400);
//                imageView1.setFitHeight(400);
//                //image2
//                imageView2.setFitHeight(400);
//                imageView2.setFitWidth(400);
//
//                pane.getChildren().add(imageView1);
//                pane.getChildren().add(imageView2);
//                Scene scene = new Scene(pane, 1000, 500);
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.show();
//            }
//            if (item.equals(ankleJointAngles)) {
//                Pane pane = new HBox(150);
//                ImageView imageView1 = new ImageView(kneeJointMoments);
//                ImageView imageView2 = new ImageView(comparisonPhoto);
//                //image1
//                imageView1.setFitWidth(400);
//                imageView1.setFitHeight(400);
//                //image2
//                imageView2.setFitHeight(400);
//                imageView2.setFitWidth(400);
//
//                pane.getChildren().add(imageView1);
//                pane.getChildren().add(imageView2);
//                Scene scene = new Scene(pane, 1000, 500);
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.show();
//            }
//            if (item.equals(hipJoint)) {
//                Pane pane = new HBox(150);
//                ImageView imageView1 = new ImageView(hipJointMoments);
//                ImageView imageView2 = new ImageView(comparisonPhoto);
//                //image1
//                imageView1.setFitWidth(400);
//                imageView1.setFitHeight(400);
//                //image2
//                imageView2.setFitHeight(400);
//                imageView2.setFitWidth(400);
//
//                pane.getChildren().add(imageView1);
//                pane.getChildren().add(imageView2);
//                Scene scene = new Scene(pane, 1000, 500);
//                Stage stage = new Stage();
//                stage.setScene(scene);
//                stage.show();
//            }


    //patientId.setText(String.valueOf(patientModel.getPatientID()));

    @FXML
    void onViewCompendiumSideNav(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Compendium/GAIT/test/GenerateCompendium3.fxml"));
        //fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();
        // GenerateCompendium3 generateCompendium3 = fxmlLoader.getController();

        // generateCompendiumSide.setInfo(patientModel);
        //generateCompendiumSide.setAptInfo(appointmentModel);

        Stage stage1 = new Stage();
        popUp.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
        stage1.setTitle("Patient Compendium:  ");
        stage1.setScene(new Scene(popUp, 800, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }


    public void showPatientDetails(IPatientModel patientModel) throws IOException {

        //this.patientModel = patientModel;


//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Compendium/GAIT/GenerateCompendiumSide.fxml"));
//        fxmlLoader.setControllerFactory(applicationContext::getBean);
//        Parent popUp = fxmlLoader.load();
//        GenerateCompendiumSide generateCompendiumSide = fxmlLoader.getController();
//        generateCompendiumSide.setInfo(patientModel);
//
//        Stage stage1 = new Stage();
//        popUp.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
//        stage1.setTitle("Patient Compendium:  ");
//        stage1.setScene(new Scene(popUp, 800, 680));
//        stage1.setScene(popUp.getScene());
//        stage1.show();
//
//        return generateCompendiumSide.isSaved() ? patientModel : null;
    }

//        if(gaitpics.isSelected() && gaitpics1.isSelected()){
//            Parent popUp;
//            FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Compendium/GAIT/GenerateCompendiumSide.fxml"));
//            popUp = fxmlLoader.load();
//            Stage stage1 = new Stage();
//            popUp.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
//            stage1.setTitle("Patient Compendium:  ");
//            stage1.setScene(new Scene(popUp, 800, 680));
//            stage1.setScene(popUp.getScene());
//            stage1.show();
//        }else if(gaitFootPressure.isSelected() && gaitFootPressure1.isSelected()) {
//            Parent popUp1;
//            FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Compendium/GAIT/test/GenerateCompendiumSide2.fxml"));
//            popUp1 = fxmlLoader.load();
//            Stage stage1 = new Stage();
//            popUp1.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
//            stage1.setTitle("Patient Compendium: ");
//            stage1.setScene(new Scene(popUp1, 900, 680));
//            stage1.setScene(popUp1.getScene());
//            stage1.show();
//        }  if(gaitFootPressure.isSelected() && gaitFootPressure1.isSelected() && gaitpics.isSelected() && gaitpics1.isSelected()){
//            Parent popUp2;
//            FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Compendium/GAIT/test/GenerateCompendium3.fxml"));
//            popUp2 = fxmlLoader.load();
//            Stage stage1 = new Stage();
//            popUp2.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
//            stage1.setTitle("Patient Compendium: ");
//            stage1.setScene(new Scene(popUp2, 900, 680));
//            stage1.setScene(popUp2.getScene());
//            stage1.show();
//        }

    public void onViewInterpretation(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/GAIT/GenerateGAITInterpretation.fxml")));
        Stage stage1 = new Stage();
        popUp.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
        stage1.setTitle("Patient Interpretation");
        stage1.setScene(new Scene(popUp, 900, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }

    private boolean saved;

    private Stage getMyStage() {
        return (Stage) gaitVisitSave.getScene().getWindow();
    }

    public void onGaitVisitSave(ActionEvent event) {
        appointmentModel.setAptDate(date.getText());
        appointmentModel.setVisitType(aptVisitType.getText());
        appointmentModel.setVisitSubType(aptSubType.getText());
//


        saved = true;
        getMyStage().close();
    }

    public void onSetDatesVisitGait(ActionEvent event) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Visits/TestVisit/SetDatesTest.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Set Dates:  ");
        stage1.setScene(new Scene(popUp, 900, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }

    Image testImage = new Image(String.valueOf(getClass().getResource("/Rowan/IMG_20241204_204827.jpg")));
    @FXML
    public CheckBox gaitpics;
    @FXML
    public CheckBox gaitpics1;
    @FXML
    public CheckBox gaitFootPressure;
    @FXML
    public CheckBox gaitFootPressure1;


    public void onVideoGait1(ActionEvent event) {
    }

    public void onVideoGait(ActionEvent event) {
    }

    public void onGaitpics1(ActionEvent event) {
    }

    @FXML
    public Boolean selected;

    public void onGaitpics(ActionEvent event) {
        if (gaitpics.isSelected()) {
            selected = true;
        }
    }

    public void onShowOrthosisDialog(IOrthosisModel orthosisModel) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setLocation(Launcher.class.getResource("/Wizards/AddOrthosis.fxml"));
        Parent orthosisPane = fxmlLoader.load();
        AddOrthosisWizard addOrthosisWizard = fxmlLoader.getController();

        addOrthosisWizard.setOrthosis(orthosisModel);
        Stage addOrthosisStage = new Stage((StageStyle.UTILITY));
        addOrthosisStage.initModality(Modality.WINDOW_MODAL);

        addOrthosisStage.setScene(new Scene(orthosisPane, 550, 250));
        addOrthosisStage.showAndWait();

        orthosisLabel.setText(orthosisModel.getOrthosis());
        sideLabel.setText(orthosisModel.getSide());
    }

//        private Window getOrthosisWindow(){
//            return orthosisTable.getScene().getWindow();
//        }

    public void addOrthosis() throws IOException {
        IOrthosisModel orthosisModel = new IOrthosisModel();
        onShowOrthosisDialog(orthosisModel);
//            int selectedItem = orthosisTable.getSelectionModel().getSelectedIndex();
//
//            try {
//                IOrthosisModel newOrthosis = onAddOrthosis(new IOrthosisModel(null, null, null));
//
//                if(newOrthosis != null){
//                    orthosisTable.getItems().add(
//                            selectedItem + 1, newOrthosis
//                    );
//                }
//            } catch (IOException e) {
//                throw new RuntimeException(e);
//            }
    }


    public void onSavePTExam(ActionEvent event) {
        /*
        save gen marker data
         */
        IGenMarkInfoModel genMarkInfoModel = genMarkerService.findByMRN(mrnTextField.getText());
        genMarkInfoModel.setHeight(Integer.valueOf(GAITHeight.getText()));

        genMarkerService.save(genMarkInfoModel);

    }

    public void onEditBaseline(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Wizards/EditBaselineInfo.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();

        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Edit Baseline Questionnaire Info:   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 600, 550));
        stage1.showAndWait();

    }

    public void onAddSeizureMeds(ActionEvent event) throws IOException {
        ISeizureModel iSeizureModel = new ISeizureModel();
        onShowDialog(iSeizureModel);
    }

    public void onShowDialog(ISeizureModel seizureModel) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Wizards/AddSeizureMeds.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();
        AddSeizureMedsController addSeizureMedsController = fxmlLoader.getController();

        addSeizureMedsController.setAddSeizure(seizureModel);
        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Add Seizure Meds:   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 550, 400));
        stage1.showAndWait();

        seizureTextfield.setText(seizureModel.getSeizureMedicineName());

    }

    public void onQuestionnaireToEdit(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/DevicesAndBraces.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();

        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Questionnaire   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 950, 680));
        stage1.showAndWait();

    }

    private TableView<IAppointmentSetDates> aptDateTable = new TableView();
    @Autowired
    AppointmentSetDateService appointmentSetDateService;
    private final ObservableList<IAppointmentSetDates> listviewAptSetDates = FXCollections.observableArrayList();
    private IAppointmentSetDates setDates;

    public VBox getAptDates(){
        Button closeButton = new Button("Close");
        Button saveButton = new Button("Save");
        Label textLabel = new Label("Appointment Set Dates");

        listviewAptSetDates.addAll(FXCollections.observableArrayList(appointmentSetDateService.findAll()));
        aptDateTable.setItems(listviewAptSetDates);

        aptDateTable.setEditable(true);

        TableColumn<IAppointmentSetDates, String> nameCol = new TableColumn<>("Name");
        TableColumn<IAppointmentSetDates, Boolean> dateCol = new TableColumn<>("Date");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        dateCol.setCellValueFactory((new PropertyValueFactory<>("date")));

        nameCol.prefWidthProperty().bind(aptDateTable.widthProperty().multiply(0.3));
        dateCol.prefWidthProperty().bind(aptDateTable.widthProperty().multiply(0.3));

        // i need to figure out how to bind the table column value to the column
        dateCol.setCellFactory(CheckBoxTableCell.forTableColumn(dateCol));


        aptDateTable.getColumns().addAll(nameCol, dateCol);

        VBox vbox = new VBox();
        vbox.getChildren().addAll(textLabel, saveButton, closeButton, aptDateTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
            }
        });
        textLabel.setTranslateX(10);

        aptDateTable.setTranslateY(-70);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);
        return vbox;

    }
    public void onAptDates(ActionEvent event) {
        BorderPane root = new BorderPane();
        root.setCenter(getViewOne());
        root.setCenter(getAptDates());
        Stage stage = new Stage();
        stage.initModality(Modality.WINDOW_MODAL);
        stage.initStyle(StageStyle.UNDECORATED);
        stage.setScene(new Scene(root, 650, 550));
        stage.show();
    }

//    public void onQuestionnaires(ActionEvent event) throws IOException {
//        FXMLLoader fxmlLoader = new FXMLLoader();
//        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Visits/TestVisit/Questionnaries.fxml"));
//        // fxmlLoader.setControllerFactory(applicationContext::getBean);
//        Parent popUp = fxmlLoader.load();
//
//        Stage stage1 = new Stage((StageStyle.UTILITY));
//        stage1.initModality(Modality.WINDOW_MODAL);
//        stage1.setTitle("Questionnaire   ");
//        // stage1.setFullScreen(true);
//        stage1.setScene(new Scene(popUp, 950, 680));
//        stage1.showAndWait();
//    }
}







package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.config.Config;
import com.example.gaitlabapp.config.RadioButtonCell;
import com.example.gaitlabapp.controllers.Wizards.AddOrthosisWizard;
import com.example.gaitlabapp.controllers.Wizards.AddSeizureMedsController;
import com.example.gaitlabapp.model.forms.*;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import com.example.gaitlabapp.model.visits.IAppointmentSetDates;
import com.example.gaitlabapp.services.*;
import com.sun.javafx.charts.Legend;
import javafx.animation.PauseTransition;
import javafx.beans.property.SimpleBooleanProperty;
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
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Callback;
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
import java.util.EnumSet;
import java.util.Objects;
import java.util.ResourceBundle;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class VisitDetailsFootController implements Initializable {
    @Autowired
    ConfigurableApplicationContext applicationContext;
    @FXML
    private RadioButton FEAmbulation1;

    @FXML
    private RadioButton FEAmbulation2;

    @FXML
    private RadioButton FEAmbulation3;

    @FXML
    private RadioButton FEAmbulation4;

    @FXML
    private RadioButton FEAmbulation5;

    @FXML
    private RadioButton FEAmbulation6;

    @FXML
    private TextField FEAptReason;

    @FXML
    private TextField FEDateSentEpic;

    @FXML
    private TextField FEExtLagL;

    @FXML
    private TextField FEExtLagR;

    @FXML
    private TextField FEHandHelpL;

    @FXML
    private TextField FEHandHelpR;

    @FXML
    private TextField FEHighKneelL;

    @FXML
    private TextField FEHighKneelR;
    public TextField seizureTextfield;

    @FXML
    private TextField FEHipAbdL;

    @FXML
    private TextField FEHipAbdR;

    @FXML
    private TextField FEHipExtL;

    @FXML
    private TextField FEHipExtR;

    @FXML
    private TextField FEHipFlexL;

    @FXML
    private TextField FEHipFlexR;

    @FXML
    private TextField FEHipIntRotL;

    @FXML
    private TextField FEHipIntRotR;

    @FXML
    private TextField FEIlliopsoasL;

    @FXML
    private ComboBox<String> FEIlliopsoasLInterp;

    @FXML
    private TextField FEIlliopsoasR;

    @FXML
    private ComboBox<String> FEIlliopsoasRInterp;

    @FXML
    private TextField FEIndepStandingL20;

    @FXML
    private TextField FEIndepStandingL3;

    @FXML
    private Pane FEIndepStandingR;

    @FXML
    private TextField FEIndepStandingR20;

    @FXML
    private TextField FEIndepStandingR3;

    @FXML
    private TextField FEKneeFlexL;

    @FXML
    private TextField FEKneeFlexR;

    @FXML
    private TextField FELefStanceL;

    @FXML
    private TextField FELefStanceR;

    @FXML
    private TextField FELowersFloorL;

    @FXML
    private TextField FELowersFloorR;

    @FXML
    private TextField FEModuleA;

    @FXML
    private TextField FEModuleB;

    @FXML
    private TextField FEModuleC;

    @FXML
    private TextField FEModuleE;

    @FXML
    private TextField FEPlantarL;

    @FXML
    private TextField FEPlantarR;

    @FXML
    private TextField FEPopAngleL;

    @FXML
    private TextField FEPopAngleR;

    @FXML
    private TextField FEShortSitL;

    @FXML
    private TextField FEShortSitR;

    @FXML
    private TextField FESquatsL;

    @FXML
    private TextField FESquatsR;

    @FXML
    private TextField FEStandingL;

    @FXML
    private TextField FEStandingR;

    @FXML
    private TextField FETadductorL;

    @FXML
    private ComboBox<String> FETadductorLInterp;

    @FXML
    private TextField FETadductorR;

    @FXML
    private ComboBox<String> FETadductorRInterp;

    @FXML
    private TextField FETankleJerkL;

    @FXML
    private ComboBox<String> FETankleJerkLInterp;

    @FXML
    private TextField FETankleJerkR;

    @FXML
    private ComboBox<String> FETankleJerkRInterp;

    @FXML
    private TextField FETantTibL;

    @FXML
    private ComboBox<String> FETantTibLInterp;

    @FXML
    private TextField FETantTibR;

    @FXML
    private ComboBox<String> FETantTibRInterp;

    @FXML
    private TextField FETbabinskiL;

    @FXML
    private ComboBox<String> FETbabinskiLInterp;

    @FXML
    private TextField FETbabinskiR;

    @FXML
    private ComboBox<String> FETbabinskiRnterp;

    @FXML
    private TextField FETclonusL;

    @FXML
    private ComboBox<String> FETclonusLInterp;

    @FXML
    private TextField FETclonusR;

    @FXML
    private ComboBox<String> FETclonusRInterp;

    @FXML
    private TextField FETdistalL;

    @FXML
    private ComboBox<String> FETdistalLInterp;

    @FXML
    private TextField FETdistalR;

    @FXML
    private ComboBox<String> FETdistalRInterp;

    @FXML
    private TextField FETgastroL;

    @FXML
    private ComboBox<String> FETgastroLInterp;

    @FXML
    private TextField FETgastroR;

    @FXML
    private ComboBox<String> FETgastroRInterp;

    @FXML
    private TextField FETgluteMaxL;

    @FXML
    private ComboBox<String> FETgluteMaxLInterp;

    @FXML
    private TextField FETgluteMaxR;

    @FXML
    private ComboBox<String> FETgluteMaxRInterp;

    @FXML
    private TextField FEThamstringL;

    @FXML
    private ComboBox<String> FEThamstringLInterp;

    @FXML
    private TextField FEThamstringR;

    @FXML
    private ComboBox<String> FEThamstringRInterp;

    @FXML
    private TextField FETilliopsoasL;

    @FXML
    private ComboBox<String> FETilliopsoasLInterp;

    @FXML
    private TextField FETilliopsoasR;

    @FXML
    private ComboBox<String> FETilliopsoasRInterp;

    @FXML
    private TextField FETkneeJerkL;

    @FXML
    private ComboBox<String> FETkneeJerkLInterp;

    @FXML
    private TextField FETkneeJerkR;

    @FXML
    private ComboBox<String> FETkneeJerkRInterp;

    @FXML
    private TextField FETpostTibL;

    @FXML
    private ComboBox<String> FETpostTibLInterp;

    @FXML
    private TextField FETpostTibR;

    @FXML
    private ComboBox<String> FETpostTibRInterp;

    @FXML
    private TextField FETproxminalL;

    @FXML
    private ComboBox<String> FETproxminalLInterp;

    @FXML
    private TextField FETproxminalR;

    @FXML
    private ComboBox<String> FETproxminalRInterp;

    @FXML
    private TextField FETrectusCatchL;

    @FXML
    private ComboBox<String> FETrectusCatchLInterp;

    @FXML
    private TextField FETrectusCatchR;

    @FXML
    private ComboBox<String> FETrectusCatchRInterp;

    @FXML
    private TextField FETrectusFemL;

    @FXML
    private ComboBox<String> FETrectusFemLInterp;

    @FXML
    private TextField FETrectusFemR;

    @FXML
    private ComboBox<String> FETrectusFemRInterp;

    @FXML
    private TextField FETvasstusML;

    @FXML
    private ComboBox<String> FETvasstusMLInterp;

    @FXML
    private TextField FETvasstusMR;

    @FXML
    private ComboBox<String> FETvasstusMRInterp;

    @FXML
    private CheckBox FEactivitesadls;

    @FXML
    private CheckBox FEactivitiesSchool;

    @FXML
    private CheckBox FEactivitiesSports;

    @FXML
    private CheckBox FEactivitiesmobility;

    @FXML
    private CheckBox FEactivitiesother;

    @FXML
    private CheckBox FEaggravatingOther;

    @FXML
    private CheckBox FEaggravatingalds;

    @FXML
    private TextField FEankleEverL;

    @FXML
    private ComboBox<String> FEankleEverLP;

    @FXML
    private ComboBox<String> FEankleEverLS;

    @FXML
    private TextField FEankleEverR;

    @FXML
    private ComboBox<String> FEankleEverRP;

    @FXML
    private ComboBox<String> FEankleEverRS;

    @FXML
    private TextField FEankleEverStL;

    @FXML
    private TextField FEankleEverStR;

    @FXML
    private TextField FEankleInvL;

    @FXML
    private ComboBox<String> FEankleInvLP;

    @FXML
    private ComboBox<String> FEankleInvLS;

    @FXML
    private TextField FEankleInvR;

    @FXML
    private ComboBox<String> FEankleInvRP;

    @FXML
    private ComboBox<String> FEankleInvRS;

    @FXML
    private TextField FEankleInvStL;

    @FXML
    private TextField FEankleInvStR;

    @FXML
    private TextField FEanttibL;

    @FXML
    private ComboBox<String> FEanttibLInterp;

    @FXML
    private TextField FEanttibR;

    @FXML
    private ComboBox<String> FEanttibRInterp;

    @FXML
    private TextField FEaptAttended;

    @FXML
    private TextField FEaptComment;

    @FXML
    private TextField FEaptDate;

    @FXML
    private TextField FEaptDateProcessed;

    @FXML
    private TextField FEaptDateSent;

    @FXML
    private TextField FEaptDiagnosis;

    @FXML
    private TextField FEaptMd;

    @FXML
    private TextField FEaptPT;

    @FXML
    private TextField FEaptReferringMd;

    @FXML
    private TextField FEaptStartTime;

    @FXML
    private TextField FEaptStopTime;

    @FXML
    private TextField FEaptSubType;

    @FXML
    private TextField FEaptTime;

    @FXML
    private TextField FEaptVisitType;

    @FXML
    private TextField FEbilateL;

    @FXML
    private TextField FEbilateR;

    @FXML
    private ComboBox<String> FEbilateralLP;

    @FXML
    private ComboBox<String> FEbilateralRP;

    @FXML
    private TextField FEcalcanealEverL;

    @FXML
    private TextField FEcalcanealEverR;

    @FXML
    private ComboBox<String> FEcalcanealIEvRP;

    @FXML
    private TextField FEcalcanealInvL;

    @FXML
    private ComboBox<String> FEcalcanealInvLP;

    @FXML
    private TextField FEcalcanealInvR;

    @FXML
    private ComboBox<String> FEcalcanealInvRP;

    @FXML
    private TextArea FEcomments;

    @FXML
    private TextField FEdate;

    @FXML
    private TextField FEdistalMuscleL;

    @FXML
    private ComboBox<String> FEdistalMuscleLInterp;

    @FXML
    private TextField FEdistalMuscleR;

    @FXML
    private ComboBox<String> FEdistalMuscleRInterp;

    @FXML
    private ComboBox<String> FEdorsiELP;

    @FXML
    private ComboBox<String> FEdorsiERP;

    @FXML
    private TextField FEdorsiExtL;

    @FXML
    private TextField FEdorsiExtR;

    @FXML
    private ComboBox<String> FEdorsiFLP;

    @FXML
    private ComboBox<String> FEdorsiFRP;

    @FXML
    private TextField FEdorsiL;

    @FXML
    private TextField FEdorsiR;

    @FXML
    private Label FEdurationOfPain;

    @FXML
    private TextField FEelyL;

    @FXML
    private ComboBox<String> FEelyLP;

    @FXML
    private TextField FEelyR;

    @FXML
    private ComboBox<String> FEelyRP;

    @FXML
    private ComboBox<String> FEextensoLP;

    @FXML
    private ComboBox<String> FEextensoLS;
    public Label orthosisLabel;
    public Label sideLabel;

    @FXML
    private ComboBox<String> FEextensoRP;

    @FXML
    private ComboBox<String> FEextensoRS;

    @FXML
    private TextField FEextensorStL;

    @FXML
    private TextField FEextensorStR;

    @FXML
    private TextField FEffabL;

    @FXML
    private ComboBox<String> FEffabLP;

    @FXML
    private TextField FEffabR;

    @FXML
    private ComboBox<String> FEffabRP;

    @FXML
    private ComboBox<String> FEfms5;
    String fms5mOptions[] = {"N", "C", "1", "2", "3", "4", "5", "6"};

    @FXML
    private ComboBox<String> FEfms50;
    String fms50mOptions[] = {"N", "C", "1", "2", "3", "4", "5", "6"};

    @FXML
    private ComboBox<String> FEfms500;
    String fms500mOptions[] = {"N", "C", "1", "2", "3", "4", "5", "6"};

    @FXML
    private TextField FEfootLengthL;

    @FXML
    private TextField FEfootWidthL;

    @FXML
    private TextField FEfootWidthR;

    @FXML
    private Label FEfrequencyOfPain;

    @FXML
    private TextField FEgastroL;

    @FXML
    private ComboBox<String> FEgastroLInterp;

    @FXML
    private TextField FEgastroR;

    @FXML
    private ComboBox<String> FEgastroRInterp;

    @FXML
    private TextField FEgluteMaxL;

    @FXML
    private ComboBox<String> FEgluteMaxLInterp;

    @FXML
    private TextField FEgluteMaxR;

    @FXML
    private ComboBox<String> FEgluteMaxRInterp;

    @FXML
    private TextField FEgluteMedL;

    @FXML
    private ComboBox<String> FEgluteMedLInterp;

    @FXML
    private TextField FEgluteMedR;

    @FXML
    private ComboBox<String> FEgluteMedRInterp;

    @FXML
    private ComboBox<String> FEgmfcs;

    @FXML
    private TextField FEhamstringL;

    @FXML
    private ComboBox<String> FEhamstringLInterp;

    @FXML
    private TextField FEhamstringR;

    @FXML
    private ComboBox<String> FEhamstringRInterp;

    @FXML
    private TextField FEheight;

    @FXML
    private ComboBox<String> FEhipAbdLP;

    @FXML
    private ComboBox<String> FEhipAbdLS;

    @FXML
    private ComboBox<String> FEhipAbdRP;

    @FXML
    private ComboBox<String> FEhipAbdRS;

    @FXML
    private TextField FEhipAbdStL;

    @FXML
    private TextField FEhipAbdStR;

    @FXML
    private TextField FEhipAddL;

    @FXML
    private ComboBox<String> FEhipAddLInterp;

    @FXML
    private TextField FEhipAddR;

    @FXML
    private ComboBox<String> FEhipAddRInterp;

    @FXML
    private ComboBox<String> FEhipExtLP;

    @FXML
    private ComboBox<String> FEhipExtLS;

    @FXML
    private ComboBox<String> FEhipExtRP;

    @FXML
    private ComboBox<String> FEhipExtRS;

    @FXML
    private ComboBox<String> FEhipExtRotLP;

    @FXML
    private ComboBox<String> FEhipExtRotLS;

    @FXML
    private ComboBox<String> FEhipExtRotRP;

    @FXML
    private ComboBox<String> FEhipExtRotRS;

    @FXML
    private TextField FEhipExtRotStL;

    @FXML
    private TextField FEhipExtRotStR;

    @FXML
    private TextField FEhipExtStL;

    @FXML
    private TextField FEhipExtStR;

    @FXML
    private ComboBox<String> FEhipFlexLP;

    @FXML
    private ComboBox<String> FEhipFlexLS;

    @FXML
    private ComboBox<String> FEhipFlexRP;

    @FXML
    private ComboBox<String> FEhipFlexRS;

    @FXML
    private TextField FEhipFlexStL;

    @FXML
    private TextField FEhipFlexStR;

    @FXML
    private ComboBox<String> FEhipIntRotLP;

    @FXML
    private ComboBox<String> FEhipIntRotLS;

    @FXML
    private ComboBox<String> FEhipIntRotRP;

    @FXML
    private ComboBox<String> FEhipIntRotRS;

    @FXML
    private TextField FEhipIntRotStL;

    @FXML
    private TextField FEhipIntRotStR;

    @FXML
    private TextField FEinterpDate;

    @FXML
    private TextField FEkneeExtL;

    @FXML
    private ComboBox<String> FEkneeExtLP;

    @FXML
    private ComboBox<String> FEkneeExtLS;

    @FXML
    private TextField FEkneeExtR;

    @FXML
    private ComboBox<String> FEkneeExtRP;

    @FXML
    private ComboBox<String> FEkneeExtRS;

    @FXML
    private TextField FEkneeExtStL;

    @FXML
    private TextField FEkneeExtStR;

    @FXML
    private ComboBox<String> FEkneeFlexLP;

    @FXML
    private ComboBox<String> FEkneeFlexLS;

    @FXML
    private ComboBox<String> FEkneeFlexRP;

    @FXML
    private ComboBox<String> FEkneeFlexRS;

    @FXML
    private TextField FEkneeFlexStL;

    @FXML
    private TextField FEkneeFlexStR;

    @FXML
    private TextField FEkneeVarusL;

    @FXML
    private ComboBox<String> FEkneeVarusLP;

    @FXML
    private TextField FEkneeVarusR;

    @FXML
    private ComboBox<String> FEkneeVarusRP;

    @FXML
    private TextField FElegLengthL;

    @FXML
    private ComboBox<String> FElegLengthLP;

    @FXML
    private TextField FElegLengthR;

    @FXML
    private ComboBox<String> FElegLengthRP;

    @FXML
    private Label FElocationOfPain;

    @FXML
    private CheckBox FEmovement;

    @FXML
    private CheckBox FEpainCL0;

    @FXML
    private CheckBox FEpainCL1;

    @FXML
    private CheckBox FEpainCL10;

    @FXML
    private CheckBox FEpainCL2;

    @FXML
    private CheckBox FEpainCL3;

    @FXML
    private CheckBox FEpainCL4;

    @FXML
    private CheckBox FEpainCL5;

    @FXML
    private CheckBox FEpainCL6;

    @FXML
    private CheckBox FEpainCL7;

    @FXML
    private CheckBox FEpainCL8;

    @FXML
    private CheckBox FEpainCL9;

    @FXML
    private RadioButton FEpainFLACC;

    @FXML
    private CheckBox FEpainHL0;

    @FXML
    private CheckBox FEpainHL1;

    @FXML
    private CheckBox FEpainHL10;

    @FXML
    private CheckBox FEpainHL2;

    @FXML
    private CheckBox FEpainHL3;

    @FXML
    private CheckBox FEpainHL4;

    @FXML
    private CheckBox FEpainHL5;

    @FXML
    private CheckBox FEpainHL6;

    @FXML
    private CheckBox FEpainHL7;

    @FXML
    private CheckBox FEpainHL8;

    @FXML
    private CheckBox FEpainHL9;

    @FXML
    private CheckBox FEpainLL0;

    @FXML
    private CheckBox FEpainLL1;

    @FXML
    private CheckBox FEpainLL10;

    @FXML
    private CheckBox FEpainLL2;

    @FXML
    private CheckBox FEpainLL3;

    @FXML
    private CheckBox FEpainLL4;

    @FXML
    private CheckBox FEpainLL5;

    @FXML
    private CheckBox FEpainLL6;

    @FXML
    private CheckBox FEpainLL7;

    @FXML
    private CheckBox FEpainLL8;

    @FXML
    private CheckBox FEpainLL9;

    @FXML
    private RadioButton FEpainNumerical;

    @FXML
    private CheckBox FEpainSleep;

    @FXML
    private CheckBox FEpainWeightBearing;

    @FXML
    private RadioButton FEpainWrong;

    @FXML
    private TextField FEperonealsL;

    @FXML
    private ComboBox<String> FEperonealsLInterp;

    @FXML
    private TextField FEperonealsR;

    @FXML
    private ComboBox<String> FEperonealsRInterp;

    @FXML
    private ComboBox<String> FEplantarLP;

    @FXML
    private ComboBox<String> FEplantarLS;

    @FXML
    private ComboBox<String> FEplantarRP;

    @FXML
    private ComboBox<String> FEplantarRS;

    @FXML
    private TextField FEplantarStL;

    @FXML
    private TextField FEplantarStR;

    @FXML
    private ComboBox<String> FEpopLP;

    @FXML
    private ComboBox<String> FEpopLS;

    @FXML
    private ComboBox<String> FEpopRP;

    @FXML
    private TextField FEpopangleStL;

    @FXML
    private TextField FEpopangleStR;

    @FXML
    private TextField FEpostMuscleL;

    @FXML
    private ComboBox<String> FEpostMuscleLInterp;

    @FXML
    private TextField FEpostMuscleR;

    @FXML
    private ComboBox<String> FEpostMuscleRInterp;

    @FXML
    private TextField FEpostTibL;

    @FXML
    private ComboBox<String> FEpostTibLInterp;

    @FXML
    private TextField FEpostTibR;

    @FXML
    private ComboBox<String> FEpostTibRInterp;

    @FXML
    private TextField FEpullToStandL;

    @FXML
    private TextField FEpullToStandR;

    @FXML
    private TextField FEquadsL;

    @FXML
    private ComboBox<String> FEquadsLInterp;

    @FXML
    private TextField FEquadsR;

    @FXML
    private ComboBox<String> FEquadsRInterp;

    @FXML
    private CheckBox FErunning;

    @FXML
    private ComboBox<String> FEryderLP;

    @FXML
    private ComboBox<String> FEryderLS;

    @FXML
    private ComboBox<String> FEryderRP;

    @FXML
    private ComboBox<String> FEryderRS;

    @FXML
    private TextField FEryderStL;

    @FXML
    private TextField FEryderStR;

    @FXML
    private TextField FEryderTestL;

    @FXML
    private TextField FEryderTestR;

    @FXML
    private TextField FEsoleusL;

    @FXML
    private ComboBox<String> FEsoleusLInterp;

    @FXML
    private TextField FEsoleusR;

    @FXML
    private ComboBox<String> FEsoleusRInterp;

    @FXML
    private TextField FEtfaL;

    @FXML
    private ComboBox<String> FEtfaLP;

    @FXML
    private TextField FEtfaR;

    @FXML
    private ComboBox<String> FEtfaRP;

    @FXML
    private TextField FEtmaL;

    @FXML
    private ComboBox<String> FEtmaLP;

    @FXML
    private TextField FEtmaR;

    @FXML
    private ComboBox<String> FEtmaRP;

    @FXML
    private CheckBox FEtouch;

    @FXML
    private TextField FEvisitBio;

    @FXML
    private TextField FEvisitBio2;

    @FXML
    private TextField FEvisitPt;

    @FXML
    private TextField FEvisitPt2;

    @FXML
    private TextField FEweight;

    @FXML
    private CheckBox FepainStanding;

    @FXML
    private Button comSideNav;

    @FXML
    private Tab dataTab;

    @FXML
    private TreeView<String> dataTable;

    @FXML
    private CheckBox feWalking;

    @FXML
    private Button interpSideNav1;

    @FXML
    private Label norms;

    @FXML
    private Tab physExamFoot;

    @FXML
    private Tab reportTab;

    @FXML
    private Tab visitTab;
    TreeItem<String> kinematics = new TreeItem<>("Kinematics");
    TreeItem<String> recommendations = new TreeItem<>("Recommendations");
    TreeItem<String> assessmentForm = new TreeItem<>("Assessment Form");
    TreeItem<String> signatures = new TreeItem<>("Signatures");
    TreeItem<String> kinematicsData = new TreeItem<>("Kinematics");
    TreeItem<String> footKinematics = new TreeItem<>("Foot Kinematics");
    TreeItem<String> kinetics = new TreeItem<>("Kinetics");
    TreeItem<String> signatureForm = new TreeItem<>("Signatures");
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
    TreeItem<String> pngFiles = new TreeItem<String>("PNG Files");

    //main tree
    TreeItem<String> parent2DataRoot = new TreeItem<>("");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        FEpullToStandR.setText("3");
        FEIndepStandingR3.setText("3");
        FEIndepStandingR20.setText("3");
        FEHandHelpR.setText("3");
        FEHandHelpL.setText("3");
        FELefStanceR.setText("1");
        FELefStanceL.setText("1");
        FEShortSitR.setText("3");
        FEHighKneelR.setText("2");
        FEHighKneelL.setText("2");
        FELowersFloorR.setText("2");
        FESquatsR.setText("2");
        FEStandingR.setText("3");
        FEheight.setText("104.0  (z = -0.8)");
        FEfootWidthR.setText("6.0 ");
        FEfootWidthL.setText("6.0 ");
        FEfootLengthL.setText( "14.0");
        FEweight.setText( "18.3  (z = 0.5 )");
        FEAmbulation1.setSelected(true);
        FEfms5.setValue("5");
        FEfms50.setValue("5");
        FEfms500.setValue("1");
        FEcomments.setText("Sophia is a 4-year-old female diagnosed with Arthrogryposis and has bilateral clubfeet. " +
                "Sophia was evaluated with her grandparents and brother present. Sophia was very age-appropriate in " +
                "conversation and she articulated that she did not like to walk without her socks and shoes donned. " +
                "Sophia was very concerned about her feet, which made evaluating them somewhat difficult. We eventually " +
                "were able to get some walking on video by using her favorite snack M & M's. Sophia has articulating AFO's, " +
                "receives physical therapy once a week and uses a stroller for distances. Her grandmother stated that " +
                "Sophia's mother was most concerned with both of her feet turning in more. It was reported that Sophia's" +
                " mother believes that physical therapy has helped. Sophia did not want this therapist measuring her feet " +
                "and so dorsiflexion measures in extension may be inaccurate. ");
        FEModuleA.setText("");
        FEModuleB.setText("");
        FEModuleC.setText("");
        FEModuleE.setText("31 / 39 = 79 %");
        FEHipFlexR.setText("120");
        FEHipFlexL.setText("115");
        FEhipFlexStR.setText("4-");
        FEhipFlexStL.setText("4-");
        FEHipAbdR.setText("40");
        FEHipAbdL.setText("40");
        FEhipAbdStR.setText("");
        FEhipAbdStL.setText("");
        FEHipIntRotR.setText("35");
        FEHipIntRotL.setText("30");
        FEkneeExtR.setText("-3");
        FEkneeExtL.setText("0");
        FEkneeExtStR.setText("3+");
        FEkneeExtStL.setText("3+");
        FEKneeFlexR.setText("130");
        FEKneeFlexL.setText("130");
        FEkneeFlexStR.setText("3+");
        FEkneeFlexStL.setText("3+");
        FEelyR.setText("120");
        FEelyL.setText("125");


        //mc
        FEIlliopsoasR.setText("g");
        FEIlliopsoasL.setText("g");
        FEgluteMedR.setText("g");
        FEgluteMedL.setText("g");
        FEhipAddR.setText("g");
        FEhipAddL.setText("g");
        FEgluteMaxR.setText("g");
        FEgluteMaxL.setText("g");
        FEquadsR.setText("g");
        FEquadsL.setText("g");
        FEhamstringR.setText("g");
        FEhamstringL.setText("g");
        FEgastroR.setText("f");
        FEgastroL.setText("f");
        FEpostTibR.setText("p");
        FEpostTibL.setText("p");
        FEsoleusR.setText("f");
        FEsoleusL.setText("f");
        FEperonealsR.setText("p");
        FEperonealsL.setText("p");
        FEpostMuscleR.setText("g");
        FEpostMuscleL.setText("g");
        FEdistalMuscleR.setText("f");
        FEdistalMuscleL.setText("f");

        //tone
        FETilliopsoasR.setText("0");
        FETilliopsoasL.setText("0");
        FETgluteMaxR.setText("0");
        FETgluteMaxL.setText("0");
        FETadductorR.setText("0");
        FETadductorL.setText("0");
        FETrectusFemR.setText("0");
        FETrectusFemL.setText("0");
        FETrectusCatchR.setText("0");
        FETrectusCatchL.setText("0");
        FETvasstusMR.setText("0");
        FETvasstusML.setText("0");
        FEThamstringR.setText("0");
        FEThamstringL.setText("0");
        FETpostTibR.setText("0");
        FETpostTibL.setText("0");
        FETantTibR.setText("0");
        FETantTibL.setText("0");
        FETgastroR.setText("0");
        FETgastroL.setText("0");
        FETclonusR.setText("0");
        FETclonusL.setText("0");
        FETkneeJerkR.setText("nr");
        FETkneeJerkL.setText("nr");
        FETankleJerkR.setText("nr");
        FETankleJerkL.setText("dn");
        FETbabinskiR.setText("dn");
        FETbabinskiL.setText("dn");
        FETproxminalR.setText("0");
        FETproxminalL.setText("0");
        FETproxminalLInterp.setValue("N");
        FETproxminalRInterp.setValue("N");
        FETdistalR.setText("0");
        FETdistalL.setText("0");
        FETdistalLInterp.setValue("N");
        FETdistalRInterp.setValue("N");

        //combo boxes
        FEhipFlexRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipFlexLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipFlexRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipFlexLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipExtRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipExtLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipExtRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipExtLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipAbdRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipAbdLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipAbdRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipAbdLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipIntRotRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipIntRotLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
//        FEhipIntRotRS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
//        FEhipIntRotLS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
        FEhipIntRotRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipExtRotRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEhipExtRotLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
//        FEhipExtRotRS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
//        FEhipExtRotLS.getItems().addAll(
//                " ",
//                "N",
//                "VH",
//                "H",
//                "VL",
//                "L"
//        );
        FEryderRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEryderLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeExtRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeExtLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeExtLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeExtRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEextensoRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEextensoLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEextensoLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEextensoRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeFlexRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeFlexLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeFlexRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeFlexLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEpopRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEpopLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEbilateralRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEbilateralLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEelyRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEelyLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEdorsiFRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEdorsiFLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEdorsiERP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEdorsiELP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEplantarRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEplantarLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEplantarRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEplantarLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleInvRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleInvLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleInvRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleInvLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleEverRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleEverLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleEverRS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEankleEverLS.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEtmaRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEtmaLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEtfaRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEtfaLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEffabRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEffabLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEcalcanealInvRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEcalcanealInvLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEcalcanealIEvRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FElegLengthRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FElegLengthLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeVarusRP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEkneeVarusLP.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );

        FEIlliopsoasRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEIlliopsoasLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEgluteMedRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEgluteMedLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEhipAddRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEhipAddLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEgluteMaxRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEgluteMaxLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEquadsRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEquadsLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEhamstringRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEhamstringLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEanttibRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEanttibLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEgastroRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEgastroLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEpostTibRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEpostTibLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEsoleusRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEsoleusLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEperonealsRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEperonealsLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEpostMuscleRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEpostMuscleLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEdistalMuscleRInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FEdistalMuscleLInterp.getItems().addAll(
                " ",
                "Good",
                "Fair",
                "Poor"
        );
        FETilliopsoasRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETilliopsoasLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETgluteMaxRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETgluteMaxLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETadductorRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETadductorLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETrectusFemRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETrectusFemLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETrectusCatchRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETrectusCatchLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETvasstusMRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETvasstusMLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEThamstringRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FEThamstringLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETpostTibRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETpostTibLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETantTibRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );

        FETantTibLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETgastroRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETgastroLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETclonusRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETclonusLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETkneeJerkRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETkneeJerkLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETankleJerkRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETankleJerkLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETbabinskiRnterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETbabinskiLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETproxminalRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETproxminalLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETdistalRInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );
        FETdistalLInterp.getItems().addAll(
                " ",
                "N",
                "VH",
                "H",
                "VL",
                "L"
        );







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
//            delay.setOnFinished(event -> popoverStage.close());3
//            delay.play();
//        });


        FEfms5.getItems().addAll(
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
        FEfms50.getItems().addAll(
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
        FEfms500.getItems().addAll(
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

        kinematics.getChildren().addAll(hipJointAngles, ankleJointAngles);
        footKinematics.getChildren().addAll(lateralForefoot, medialForefoot);
        kinetics.getChildren().addAll(hipJoint, kneeJoint, ankleJoint);
        pngFiles.getChildren().addAll(kinematics);
        pngFiles.getChildren().addAll(footKinematics);
        pngFiles.getChildren().addAll(kinetics);
//        kinematicsData.getChildren().addAll(temporalSpatial, trunkOrientation, hipJointData, ankleJointData, variabilityData, armJointData,
//                pelvisOrientation, kneeJointData, footOrientation);
//        kineticsData.getChildren().addAll(groundForcesData, kneeJointMoments, sagittalPowers, hipMoments, ankleMoments);

        //main tree
        recommendations.getChildren().addAll(recommendationDiagnostic, recommendationSurgical, recommendationTherapy, recommendationOrthodics);
        assessmentForm.getChildren().addAll(assessmentIssues, assessmentBehavior, assessmentMotorControl, assessmentMuscleStrength, assessmentMovement, assessmentMuscleTone, assessmentStance, assessmentSwing);


        // parent2DataRoot.getChildren().addAll(showAll);
//        parent2DataRoot.getChildren().addAll(kinematicsData);
//        parent2DataRoot.getChildren().addAll(kineticsData);
        parent2DataRoot.getChildren().addAll(pedobaragraph);
        parent2DataRoot.getChildren().addAll(assessmentForm);
        parent2DataRoot.getChildren().addAll(recommendations);
        parent2DataRoot.getChildren().addAll(signatures);
        parent2DataRoot.getChildren().addAll(pngFiles);


        parent2DataRoot.setExpanded(true);
        dataTable.setRoot(parent2DataRoot);
        this.dataTable.setShowRoot(false);

    }

    private IPatientModel patientModel;
    private IAppointmentModel appointmentModel;

    public  void setPatient(IPatientModel patientModel){
        this.patientModel = patientModel;
        //mrnTextField.setText("32581055");

    }
    public  void setAppointmentModel(IAppointmentModel appointmentModel, IPatientModel patientModel) {
        this.appointmentModel = appointmentModel;
        this.patientModel = patientModel;

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
        //mrnTextField.setText(patientModel.getMrn());
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


    public void onGaitVisitSave(ActionEvent event) {
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

//    public VBox getViewOne() {
//        Button cancelButton = new Button("Close");
//        Label testLabel = new Label("ViewOne");
//
//        VBox vbox = new VBox();
//        vbox.getChildren().addAll(testLabel, cancelButton);
//
//        cancelButton.setOnAction(new EventHandler<ActionEvent>() {
//            @Override
//            public void handle(ActionEvent event) {
//                vbox.getScene().getWindow().hide();
//            }
//        });
//        testLabel.setTranslateX(10);
//        cancelButton.setMinWidth(90);
//        cancelButton.setMinHeight(50);
//        cancelButton.setTranslateX(400);
//        cancelButton.setTranslateY(400);
//        return vbox;
//    }

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

    public SimpleBooleanProperty disabledProperty = new SimpleBooleanProperty(false);
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
                        } else if (item == kneeJointMoments) {
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
                        else if (item == signatures){
                            root.setCenter(getSignatures());
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
        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low", "Posterior", "Anterior", "Very Posterior", "Very Anterior" ));


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

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very Internal", "Internal", "Normal", "External", "Very External"));
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

    private final TableView<IKneeJointAnglesModel> kneeJointAnglesTable = new TableView<>();
    @Autowired
    KneeJointService kneeJointAnglesService;
    private final ObservableList<IKneeJointAnglesModel> listviewKneeJointAngles = FXCollections.observableArrayList();
    public VBox getKneeJointAngles() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Knee Joint Angles(deg)");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        TextArea textArea = new TextArea();

        listviewKneeJointAngles.addAll(FXCollections.observableArrayList(kneeJointAnglesService.findAll()));
        kneeJointAnglesTable.setItems(listviewKneeJointAngles);
        kneeJointAnglesTable.setEditable(true);

        TableColumn<IKneeJointAnglesModel, String> nameCol = new TableColumn<>("Name");
        TableColumn<IKneeJointAnglesModel, Double> valueCol = new TableColumn<>("Value");
        TableColumn<IKneeJointAnglesModel, String> interpCol = new TableColumn<>("Interpretation");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("name")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("value")));
        interpCol.setCellValueFactory((new PropertyValueFactory<>("interp")));

        interpCol.setCellFactory(ComboBoxTableCell.forTableColumn("Very High", "High", "Normal", "Low", "Very Low"));
        nameCol.prefWidthProperty().bind(kneeJointAnglesTable.widthProperty().multiply(0.3));
        valueCol.prefWidthProperty().bind(kneeJointAnglesTable.widthProperty().multiply(0.3));
        interpCol.prefWidthProperty().bind(kneeJointAnglesTable.widthProperty().multiply(0.3));


        nameCol.setResizable(false);
        valueCol.setResizable(false);
        interpCol.setResizable(false);
        interpCol.setEditable(true);

        kneeJointAnglesTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        kneeJointAnglesTable.getColumns().addAll(nameCol, valueCol, interpCol);


        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));
        vbox.getChildren().addAll(textLabel, textArea, saveButton, closeButton, kneeJointAnglesTable);

        closeButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                kneeJointAnglesTable.getColumns().clear();
            }
        });

        saveButton.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                vbox.getScene().getWindow().hide();
                kneeJointAnglesTable.getColumns().clear();
            }
        });
        textLabel.setTranslateX(10);

        kneeJointAnglesTable.setTranslateY(-70);

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
    public ScrollPane getOrthRecommendations() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Recommendation: Orthotics");
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Label preopLabel = new Label("Pre-Op Recommendation");
        preopLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");
        Button postOpRec = new Button("Add Post-Op Recommendation");
        Button preOpRec = new Button("Add Pre-Op Recommendation");
        TextArea textArea = new TextArea();
        TextArea preOpTextArea = new TextArea();

        listviewOrthRecom.addAll(FXCollections.observableArrayList(orthRecomService.findAll()));
        orthRecomTable.setItems(listviewOrthRecom);

        TableColumn<IOrthoticsRecomModel, String> nameCol = new TableColumn<>("");
        TableColumn<IOrthoticsRecomModel, IOrthoticsRecomModel.Values> valueCol = new TableColumn<>("");

        nameCol.setCellValueFactory((new PropertyValueFactory<>("recom_orth_procedure")));
        valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

        nameCol.prefWidthProperty().bind(orthRecomTable.widthProperty().multiply(0.7));
        valueCol.prefWidthProperty().bind(orthRecomTable.widthProperty().multiply(0.2 ));

        valueCol.setCellFactory((param) -> new RadioButtonCell<IOrthoticsRecomModel, IOrthoticsRecomModel.Values>(EnumSet.allOf(IOrthoticsRecomModel.Values.class)));

        orthRecomTable.setEditable(true);

        nameCol.setResizable(false);
        valueCol.setResizable(false);


        orthRecomTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);

        orthRecomTable.getColumns().addAll( valueCol,nameCol);


        VBox vbox = new VBox();
        ScrollPane sp = new ScrollPane();
        //vbox.setPadding(new Insets(1,0,0,1));
        sp.setContent(vbox);
        vbox.getChildren().addAll(textLabel, textArea, preOpRec, postOpRec, saveButton , closeButton, orthRecomTable);

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

        preOpRec.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                TableView<IOrthoticsRecomModel> preOpTable = new TableView<>();
                ObservableList<IOrthoticsRecomModel> listviewOrthRecom = FXCollections.observableArrayList();

                listviewOrthRecom.addAll(FXCollections.observableArrayList(orthRecomService.findAll()));
                preOpTable.setItems(listviewOrthRecom);

                TableColumn<IOrthoticsRecomModel, String> nameCol = new TableColumn<>("");
                TableColumn<IOrthoticsRecomModel, IOrthoticsRecomModel.Values> valueCol = new TableColumn<>("");

                nameCol.setCellValueFactory((new PropertyValueFactory<>("recom_orth_procedure")));
                valueCol.setCellValueFactory((new PropertyValueFactory<>("selected")));

                nameCol.prefWidthProperty().bind(preOpTable.widthProperty().multiply(0.7));
                valueCol.prefWidthProperty().bind(preOpTable.widthProperty().multiply(0.2 ));

                valueCol.setCellFactory((param) -> new RadioButtonCell<IOrthoticsRecomModel, IOrthoticsRecomModel.Values>(EnumSet.allOf(IOrthoticsRecomModel.Values.class)));

                preOpTable.setEditable(true);

                nameCol.setResizable(false);
                valueCol.setResizable(false);

                preOpTable.setColumnResizePolicy(TableView.CONSTRAINED_RESIZE_POLICY);
                preOpTable.getColumns().addAll( valueCol,nameCol);

                vbox.getChildren().addAll(preopLabel, preOpTextArea, preOpTable);
                sp.setContent(vbox);

                preOpTable.setTranslateY(-90);

                preopLabel.setTranslateY(-70);
                preopLabel.setTranslateX(5);

                preOpTextArea.setTranslateY(380);
                preOpTextArea.setTranslateX(0);
                preOpTextArea.setMaxHeight(50);
                preOpTextArea.setMaxWidth(700);

            }
        });
        textLabel.setTranslateX(10);

        orthRecomTable.setTranslateY(-235);

        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(303);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(450);
        saveButton.setTranslateY(353);

        preOpRec.setMinHeight(50);
        preOpRec.setMinWidth(90);
        preOpRec.setTranslateX(0);
        preOpRec.setTranslateY(453);

        postOpRec.setMinHeight(50);
        postOpRec.setMinWidth(90);
        postOpRec.setTranslateX(205);
        postOpRec.setTranslateY(404);

        textArea.setMaxHeight(50);
        textArea.setMaxWidth(700);
        textArea.setTranslateX(5);
        textArea.setTranslateY(420);

        vbox.setMinHeight(5500);
        sp.setMinHeight(800);
        return sp;
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


    public VBox getSignatures() {
        Button closeButton = new Button("Close");
        Label textLabel = new Label("Signatures");
        Label physicianSig = new Label("Interpreting Physician Signature");
        Label physicalSig = new Label("Interpreting Physical Therapist Signature");
        Label addendumSig = new Label("Addendum Signature");
        CheckBox physicianCheck = new CheckBox();
        CheckBox physicalCheck = new CheckBox();
        CheckBox addendumCheck = new CheckBox();
        textLabel.setStyle("-fx-font-size:20; -fx-font-weight: Bold");
        Button saveButton = new Button("Save");

        VBox vbox = new VBox();
        //vbox.setPadding(new Insets(1,0,0,1));

        vbox.getChildren().addAll(textLabel, saveButton, closeButton,physicianCheck, physicianSig, physicalCheck, physicalSig, addendumCheck, addendumSig);
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


        closeButton.setMinWidth(90);
        closeButton.setMinHeight(50);
        closeButton.setTranslateX(550);
        closeButton.setTranslateY(400);

        saveButton.setMinHeight(50);
        saveButton.setMinWidth(90);
        saveButton.setTranslateX(445);
        saveButton.setTranslateY(450);

        physicianSig.setTranslateX(5);
        physicianSig.setTranslateY(-88);
        physicianSig.setStyle("-fx-font-size:15;");

        physicianCheck.setTranslateX(225);
        physicianCheck.setTranslateY(-68);

        physicalCheck.setTranslateX(280);
        physicalCheck.setTranslateY(-50);

        physicalSig.setTranslateX(5);
        physicalSig.setTranslateY(-70);
        physicalSig.setStyle("-fx-font-size:15;");

        addendumCheck.setTranslateX(160);
        addendumCheck.setTranslateY(-18);

        addendumSig.setTranslateX(5);
        addendumSig.setTranslateY(-40);
        addendumSig.setStyle("-fx-font-size:15;");

        return vbox;
    }


}

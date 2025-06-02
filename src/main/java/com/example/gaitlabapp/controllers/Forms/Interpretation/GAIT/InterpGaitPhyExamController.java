package com.example.gaitlabapp.controllers.Forms.Interpretation.GAIT;

import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Tab;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
public class InterpGaitPhyExamController {
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
    private ComboBox<?> FMS500M;

    @FXML
    private ComboBox<?> FMS50M;

    @FXML
    private ComboBox<?> FMS5M;

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
    private ComboBox<?> GMFCSCombo;

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
    private ComboBox<?> RankJerLinterp;

    @FXML
    private TextField RankJerR;

    @FXML
    private ComboBox<?> RankJerRinterp;

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
    private ComboBox<?> TaddLinterp;

    @FXML
    private TextField TaddR;

    @FXML
    private ComboBox<?> TaddRinterp;

    @FXML
    private TextField TantL;

    @FXML
    private ComboBox<?> TantLinterp;

    @FXML
    private TextField TantR;

    @FXML
    private ComboBox<?> TantRInterp;

    @FXML
    private TextField TbabinL;

    @FXML
    private ComboBox<?> TbabinLinterp;

    @FXML
    private TextField TbabinR;

    @FXML
    private ComboBox<?> TbabinRinterp;

    @FXML
    private TextField TclonusL;

    @FXML
    private ComboBox<?> TclonusLinterp;

    @FXML
    private TextField TclonusR;

    @FXML
    private ComboBox<?> TclonusRinterp;

    @FXML
    private TextField TdistalL;

    @FXML
    private ComboBox<?> TdistalLinterp;

    @FXML
    private TextField TdistalR;

    @FXML
    private ComboBox<?> TdistalRinterp;

    @FXML
    private TextField TgastroL;

    @FXML
    private ComboBox<?> TgastroLinterp;

    @FXML
    private TextField TgastroR;

    @FXML
    private ComboBox<?> TgastroRinterp;

    @FXML
    private TextField TgluteMaxL;

    @FXML
    private ComboBox<?> TgluteMaxLinterp;

    @FXML
    private TextField TgluteMaxR;

    @FXML
    private ComboBox<?> TgluteMaxRinterp;

    @FXML
    private TextField ThamstringL;

    @FXML
    private ComboBox<?> ThamstringLinterp;

    @FXML
    private TextField ThamstringR;

    @FXML
    private ComboBox<?> ThamstringRinterp;

    @FXML
    private TextField TillipsoasL;

    @FXML
    private ComboBox<?> TillipsoasLinterp;

    @FXML
    private TextField TillipsoasR;

    @FXML
    private ComboBox<?> TillipsoasRinterp;

    @FXML
    private TextField TkneeJerL;

    @FXML
    private ComboBox<?> TkneeJerLinterp;

    @FXML
    private TextField TkneeJerR;

    @FXML
    private ComboBox<?> TkneeJerRinterp;

    @FXML
    private TextField TpostTibL;

    @FXML
    private ComboBox<?> TpostTibLinterp;

    @FXML
    private TextField TpostTibR;

    @FXML
    private ComboBox<?> TpostTibRInterp;

    @FXML
    private TextField TproxL;

    @FXML
    private ComboBox<?> TproxLinterp;

    @FXML
    private TextField TproxR;

    @FXML
    private ComboBox<?> TproxRinterp;

    @FXML
    private TextField TrecCatchL;

    @FXML
    private ComboBox<?> TrecCatchLinterp;

    @FXML
    private TextField TrecCatchR;

    @FXML
    private ComboBox<?> TrecCatchRinterp;

    @FXML
    private TextField TrecFemL;

    @FXML
    private ComboBox<?> TrecFemLinterp;

    @FXML
    private TextField TrecFemR;

    @FXML
    private ComboBox<?> TrecFemRInterp;

    @FXML
    private TextField TvastmedL;

    @FXML
    private ComboBox<?> TvastmedLinterp;

    @FXML
    private TextField TvastmedR;

    @FXML
    private ComboBox<?> TvastmedRInterp;

    @FXML
    private ComboBox<?> ankleEverLP;

    @FXML
    private ComboBox<?> ankleEverLS;

    @FXML
    private ComboBox<?> ankleEverRP;

    @FXML
    private ComboBox<?> ankleEverRS;

    @FXML
    private ComboBox<?> ankleInvLP;

    @FXML
    private ComboBox<?> ankleInvLS;

    @FXML
    private ComboBox<?> ankleInvRP;

    @FXML
    private ComboBox<?> ankleInvRS;

    @FXML
    private TextField antL;

    @FXML
    private ComboBox<?> antLInterp;

    @FXML
    private TextField antR;

    @FXML
    private ComboBox<?> antRInterp;

    @FXML
    private ComboBox<?> biPopAngLP;

    @FXML
    private ComboBox<?> biPopAngRP;

    @FXML
    private ComboBox<?> calEverLP;

    @FXML
    private ComboBox<?> calEverRP;

    @FXML
    private ComboBox<?> calInvLP;

    @FXML
    private ComboBox<?> calInvRP;

    @FXML
    private TextField distaleL;

    @FXML
    private ComboBox<?> distaleLinterp;

    @FXML
    private TextField distaleR;

    @FXML
    private ComboBox<?> distaleRinterp;

    @FXML
    private ComboBox<?> dorsiExtLP;

    @FXML
    private ComboBox<?> dorsiExtRP;

    @FXML
    private ComboBox<?> dorsiFlexLP;

    @FXML
    private ComboBox<?> dorsiFlexRP;

    @FXML
    private TextField durOfPain;

    @FXML
    private ComboBox<?> elyTestLP;

    @FXML
    private ComboBox<?> elyTestRP;

    @FXML
    private ComboBox<?> extLagLP;

    @FXML
    private ComboBox<?> extLagLS;

    @FXML
    private ComboBox<?> extLagRP;

    @FXML
    private ComboBox<?> extLagRS;

    @FXML
    private ComboBox<?> ffLP;

    @FXML
    private ComboBox<?> ffRP;

    @FXML
    private TextField freqOfPain;

    @FXML
    private TextField gastroL;

    @FXML
    private ComboBox<?> gastroLInterp;

    @FXML
    private TextField gastroR;

    @FXML
    private ComboBox<?> gastroRInterp;

    @FXML
    private TextField gluteMaxL;

    @FXML
    private ComboBox<?> gluteMaxLInterp;

    @FXML
    private TextField gluteMaxR;

    @FXML
    private ComboBox<?> gluteMaxRInterp;

    @FXML
    private TextField gluteMedL;

    @FXML
    private ComboBox<?> gluteMedLInterp;

    @FXML
    private TextField gluteMedR;

    @FXML
    private ComboBox<?> gluteMedRInterp;

    @FXML
    private TextField hamstringL;

    @FXML
    private ComboBox<?> hamstringLinterp;

    @FXML
    private TextField hamstringR;

    @FXML
    private ComboBox<?> hamstringRInterp;

    @FXML
    private ComboBox<?> hipAbdLP;

    @FXML
    private ComboBox<?> hipAbdLS;

    @FXML
    private ComboBox<?> hipAbdRP;

    @FXML
    private ComboBox<?> hipAbdRS;

    @FXML
    private TextField hipAddL;

    @FXML
    private ComboBox<?> hipAddLInterp;

    @FXML
    private TextField hipAddR;

    @FXML
    private ComboBox<?> hipAddRInterp;

    @FXML
    private ComboBox<?> hipExtLP;

    @FXML
    private ComboBox<?> hipExtLS;

    @FXML
    private ComboBox<?> hipExtRP;

    @FXML
    private ComboBox<?> hipExtRS;

    @FXML
    private ComboBox<?> hipExtRotLP;

    @FXML
    private ComboBox<?> hipExtRotLS;

    @FXML
    private ComboBox<?> hipExtRotRP;

    @FXML
    private ComboBox<?> hipExtRotRS;

    @FXML
    private ComboBox<?> hipIntRotLP;

    @FXML
    private ComboBox<?> hipIntRotLS;

    @FXML
    private ComboBox<?> hipIntRotRP;

    @FXML
    private ComboBox<?> hipIntRotRS;

    @FXML
    private ComboBox<?> hipLP;

    @FXML
    private ComboBox<?> hipLS;

    @FXML
    private ComboBox<?> hipRP;

    @FXML
    private ComboBox<?> hipRS;

    @FXML
    private TextField illopsoasL;

    @FXML
    private ComboBox<?> illopsoasLInterp;

    @FXML
    private TextField illopsoasR;

    @FXML
    private ComboBox<?> illopsoasRInterp;

    @FXML
    private ComboBox<?> kneeExtLP;

    @FXML
    private ComboBox<?> kneeExtLS;

    @FXML
    private ComboBox<?> kneeExtRP;

    @FXML
    private ComboBox<?> kneeExtRS;

    @FXML
    private ComboBox<?> kneeFlexLP;

    @FXML
    private ComboBox<?> kneeFlexLS;

    @FXML
    private ComboBox<?> kneeFlexRP;

    @FXML
    private ComboBox<?> kneeFlexRS;

    @FXML
    private TextField kneeToStandL;

    @FXML
    private TextField kneeToStandR;

    @FXML
    private TextField kneeVarL;

    @FXML
    private TextField kneeVarR;

    @FXML
    private ComboBox<?> kneeVarusLP;

    @FXML
    private ComboBox<?> kneeVarusRP;

    @FXML
    private TextField legLengthL;

    @FXML
    private ComboBox<?> legLengthLP;

    @FXML
    private TextField legLengthR;

    @FXML
    private ComboBox<?> legLengthRP;

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
    private ComboBox<?> peronLinterp;

    @FXML
    private TextField peronR;

    @FXML
    private ComboBox<?> peronRinterp;

    @FXML
    private Tab physExamGait;

    @FXML
    private ComboBox<?> plantarLP;

    @FXML
    private ComboBox<?> plantarLS;

    @FXML
    private ComboBox<?> plantarRP;

    @FXML
    private ComboBox<?> plantarRS;

    @FXML
    private ComboBox<?> popAngLP;

    @FXML
    private ComboBox<?> popAngLS;

    @FXML
    private ComboBox<?> popAngRP;

    @FXML
    private ComboBox<?> popAngRS;

    @FXML
    private TextField postTibL;

    @FXML
    private ComboBox<?> postTibLinterp;

    @FXML
    private TextField postTibR;

    @FXML
    private ComboBox<?> postTibRInterp;

    @FXML
    private TextField proximalL;

    @FXML
    private ComboBox<?> proximalLinterp;

    @FXML
    private TextField proximalR;

    @FXML
    private ComboBox<?> proximalRInterp;

    @FXML
    private TextField quadsL;

    @FXML
    private ComboBox<?> quadsLinterp;

    @FXML
    private TextField quadsR;

    @FXML
    private ComboBox<?> quadsRInterp;

    @FXML
    private ComboBox<?> ryderLP;

    @FXML
    private ComboBox<?> ryderLS;

    @FXML
    private ComboBox<?> ryderRP;

    @FXML
    private ComboBox<?> ryderRS;

    @FXML
    private TextField sitStandL;

    @FXML
    private TextField sitStandR;

    @FXML
    private TextField soleusL;

    @FXML
    private ComboBox<?> soleusLinterp;

    @FXML
    private TextField soleusR;

    @FXML
    private ComboBox<?> soleusRinterp;

    @FXML
    private TextField squatsL;

    @FXML
    private TextField squatsR;

    @FXML
    private TextField standingL;

    @FXML
    private TextField standingR;

    @FXML
    private ComboBox<?> tfaLP;

    @FXML
    private ComboBox<?> tfaRP;

    @FXML
    private ComboBox<?> tmaLP;

    @FXML
    private ComboBox<?> tmaRP;
}

package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.controllers.PatientModuleController;
import com.example.gaitlabapp.model.forms.IPainModel;
import com.example.gaitlabapp.model.forms.IPromModel;
import com.example.gaitlabapp.model.forms.IToneModel;
import com.example.gaitlabapp.services.PainService;
import com.example.gaitlabapp.services.PromService;
import com.example.gaitlabapp.services.ToneService;
import javafx.collections.FXCollections;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class VisitsDetailsMovementDisorder implements Initializable {
    public TextField GAITRFL;
    public TextField GAITRFW;
    public TextField GAITLFL;
    public TextField GAITLFW;
    public RadioButton GAITAS1;
    public RadioButton GAITAS2;
    public RadioButton GAITAS3;
    public RadioButton GAITAS4;
    public RadioButton GAITAS5;
    public RadioButton GAITAS6;
    public TextField PROMHipR;
    public TextField PROMHipL;
    public TextField StrenHipFlexR;
    public TextField StrenHipFlexL;
    public TextField PROMHipExtL;
    public TextField StrengHipExtL;
    public TextField StrengHipExtR;
    public TextField PROMHipExtR;
    public TextField PROMHipabdR;
    public TextField PROMHipabdL;
    public TextField StregHipAbdR;
    public TextField StregHipAbdL;
    public TextField PROMHipIntRotL;
    public TextField StrengHipIntRotR;
    public TextField StrengHipIntRotL;
    public TextField PROMHipExtRotR;
    public TextField PROMHipExtRotL;
    public TextField StrengthHipExtRotR;
    public TextField StrengthHipExtRotL;
    public TextField PROMRyderTestR;
    public TextField PROMRyderTestL;
    public TextField StregRyertestL;
    public TextField PROMKneeExtR;
    public TextField PROMKneeExtL;
    public TextField StrengthKneeExtR;
    public TextField StrengthKneeExtL;
    public TextField PROMExtLagR;
    public TextField PROMExtLagL;
    public TextField StrengthExtLagR;
    public TextField StrengthExtLagL;
    public TextField PROMKneeFlexR;
    public TextField PROMKneeFlexL;
    public TextField StrengthKneeFlexR;
    public TextField StrengthKneeFlexL;
    public TextField PROMPopAngleR;
    public TextField PROMPopAngleL;
    public TextField PROMBilatR;
    public TextField PROMBilatL;
    public TextField PROMElyR;
    public TextField PROMElyL;
    public TextField PROMDorsiFR;
    public TextField PROMDorsiFL;
    public TextField PROMDorsiER;
    public TextField PROMDorsiEL;
    public TextField PROMPlantarR;
    public TextField PROMPlantarL;
    public TextField StrengPlantarR;
    public TextField StrengPlantarL;
    public TextField PROMAnkInvR;
    public TextField PROMAnkInvL;
    public TextField StrengAnklInvR;
    public TextField StrengAnklInvL;
    public TextField PROMAnkEvR;
    public TextField PROMAnkEvL;
    public TextField StrengAnkEvR;
    public TextField StrengAnkEvL;
    public TextField PROMtmaR;
    public TextField PROMtmaL;
    public TextField PROMtfaR;
    public TextField PROMtfaL;
    public TextField PROMffR;
    public TextField PROMffL;
    public TextField PROMCalInvR;
    public TextField PROMCalInvL;
    public TextField PROMCalEvR;
    public TextField PROMCalEvL;
    public TextField legLengthR;
    public TextField legLengthL;
    public TextField kneeVarR;
    public TextField kneeVarL;
    public ComboBox orthosisDropdown;
    public TextField StrengthPopAngleR;
    public TextField StrengthPopAngleL;
    public TextField TillipsoasL;
    public TextField TillipsoasR;
    public TextField TgluteMaxL;
    public TextField TgluteMaxR;
    public TextField TaddL;
    public TextField TaddR;
    public TextField TrecFemL;
    public TextField TrecFemR;
    public TextField TrecCatchR;
    public TextField TrecCatchL;
    public TextField TvastmedL;
    public TextField TvastmedR;
    public TextField ThamstringL;
    public TextField ThamstringR;
    public TextField TpostTibL;
    public TextField TpostTibR;
    public TextField TantL;
    public TextField TantR;
    public TextField TgastroL;
    public TextField TgastroR;
    public TextField TclonusL;
    public TextField TclonusR;
    public TextField TkneeJerR;
    public TextField RankJerL;
    public TextField RankJerR;
    public TextField TkneeJerL;
    public TextField TbabinL;
    public TextField TproxR;
    public TextField TproxL;
    public TextField TbabinR;
    public TextField TdistalL;
    public TextField TdistalR;
    public TextField locOfPain;
    public TextField freqOfPain;
    public TextField durOfPain;
    public Button MovementDisSave;
    public RadioButton uerDesignated0;
    public RadioButton uerDesignated1;
    public RadioButton lerDesignated0;
    public RadioButton lerDesignated1;
    public RadioButton uelDesignated0;
    public RadioButton uelDesignated1;
    public RadioButton lelDesignated0;
    public RadioButton lelDesignated1;
    public RadioButton uerPurposeful0;
    public RadioButton uerPurposeful1;
    public RadioButton lerPurposeful0;
    public RadioButton lerPurposeful1;
    public RadioButton uelPurposeful0;
    public RadioButton uelPurposeful1;
    public RadioButton lelPurposeful0;
    public RadioButton lelPurposeful1;
    public RadioButton uerStretch0;
    public RadioButton uerStretch1;
    public RadioButton lerStretch0;
    public RadioButton lerStretch1;
    public RadioButton uelStretch0;
    public RadioButton uelStretch1;
    public RadioButton lelStretch0;
    public RadioButton lelStretch1;
    public RadioButton uerSpastic0;
    public RadioButton uerSpastic1;
    public RadioButton lerSpastic0;
    public RadioButton lerSpastic1;
    public RadioButton uelSpastic0;
    public RadioButton uelSpastic1;
    public RadioButton lelSpastic0;
    public RadioButton lelSpastic1;
    public RadioButton uerJoint0;
    public RadioButton uerJoint1;
    public RadioButton lerJoint0;
    public RadioButton lerJoint1;
    public RadioButton uelJoint0;
    public RadioButton uelJoint1;
    public RadioButton lelJoint0;
    public RadioButton lelJoint1;
    public RadioButton uerTone0;
    public RadioButton uerTone1;
    public RadioButton lerTone0;
    public RadioButton lerTone1;
    public RadioButton uelTone0;
    public RadioButton uelTone1;
    public RadioButton lelTone0;
    public RadioButton lelTone1;
    public RadioButton uerPosition0;
    public RadioButton uerPosition1;
    public RadioButton lerPosition0;
    public RadioButton lerPosition1;
    public RadioButton uelPosition0;
    public RadioButton uelPosition1;
    public RadioButton lelPosition0;
    public RadioButton lelPosition1;
    public RadioButton mounth1;
    public RadioButton mounth2;
    public RadioButton mounth3;
    public RadioButton mounth4;
    public RadioButton mounthUnable;
    public TextField date;
    public TextField aptTime;
    public TextField aptAttended;
    public TextField aptStartTime;
    public TextField aptStopTime;
    public TextField aptDate;
    public TextField aptVisitType;
    public TextField aptSubType;
    public TextField dateToEpic;
    public TextField aptDateProcessed;
    public TextField aptDiagnosis;
    public TextField aptReason;
    public TextField aptComment;
    public TextField interpDate;
    public TextField aptPT;
    public TextField aptMd;
    public TextField visitPt;
    public TextField visitPt2;
    public TextField visitBio;
    public TextField visitBio2;
    public TextField aptReferringMd;
    public TextField aptDateSent;
    public TextField GAITHeight;
    public TextField GAITWeight;
    public TextArea GAITcomments;
    public Button setDates;
    @Autowired
    PromService promService;
    public CheckBox CL0;
    public CheckBox CL1;
    public CheckBox CL2;
    public CheckBox CL3;
    public CheckBox CL4;
    public CheckBox CL5;
    public CheckBox CL6;
    public CheckBox CL7;
    public CheckBox CL8;
    public CheckBox CL9;
    public CheckBox CL10;
    public CheckBox LL0;
    public CheckBox LL1;
    public CheckBox LL2;
    public CheckBox LL3;
    public CheckBox LL4;
    public CheckBox LL5;
    public CheckBox LL6;
    public CheckBox LL7;
    public CheckBox LL8;
    public CheckBox LL9;
    public CheckBox LL10;
    public CheckBox HL0;
    public CheckBox HL1;
    public CheckBox HL2;
    public CheckBox HL3;
    public CheckBox HL4;
    public CheckBox HL5;
    public CheckBox HL6;
    public CheckBox HL7;
    public CheckBox HL8;
    public CheckBox HL9;
    public CheckBox HL10;


    public ComboBox<String> FMS5M;
    public ComboBox<String> FMS50M;
    public ComboBox<String> FMS500M;
    public ComboBox<String> GMFCSCombo;
    public ComboBox<String> CFCSComboBox;
    public ComboBox<String> MACSCombobox;
    public ComboBox hipRP;
    public ComboBox hipLP;
    public ComboBox hipRS;
    public ComboBox hipLS;
    public ComboBox hipExtRP;
    public ComboBox hipExtLP;
    public ComboBox hipExtLS;
    public ComboBox hipExtRS;
    public ComboBox hipAbdRP;
    public ComboBox hipAbdLP;
    public ComboBox hipAbdRS;
    public ComboBox hipAbdLS;
    public ComboBox hipIntRotRP;
    public ComboBox hipIntRotLP;
    public ComboBox hipIntRotRS;
    public ComboBox hipIntRotLS;
    public ComboBox hipExtRotRP;
    public ComboBox hipExtRotLP;
    public ComboBox hipExtRotRS;
    public ComboBox hipExtRotLS;
    public ComboBox ryderRP;
    public ComboBox ryderLP;
    public ComboBox ryderRS;
    public ComboBox ryderLS;
    public ComboBox kneeExtRP;
    public ComboBox kneeExtLP;
    public ComboBox kneeExtRS;
    public ComboBox kneeExtLS;
    public ComboBox extLagRP;
    public ComboBox extLagLP;
    public ComboBox extLagRS;
    public ComboBox extLagLS;
    public ComboBox kneeFlexRP;
    public ComboBox kneeFlexLP;
    public ComboBox kneeFlexRS;
    public ComboBox kneeFlexLS;
    public ComboBox popAngRP;
    public ComboBox popAngLP;
    public ComboBox popAngRS;
    public ComboBox popAngLS;
    public ComboBox biPopAngRP;
    public ComboBox biPopAngLP;
    public ComboBox elyTestRP;
    public ComboBox elyTestLP;
    public ComboBox dorsiFlexRP;
    public ComboBox dorsiFlexLP;
    public ComboBox dorsiExtRP;
    public ComboBox dorsiExtLP;
    public ComboBox plantarRP;
    public ComboBox plantarLP;
    public ComboBox plantarRS;
    public ComboBox plantarLS;
    public ComboBox ankleInvRP;
    public ComboBox ankleInvLP;
    public ComboBox ankleInvRS;
    public ComboBox ankleInvLS;
    public ComboBox ankleEverRP;
    public ComboBox ankleEverLP;
    public ComboBox ankleEverRS;
    public ComboBox ankleEverLS;
    public ComboBox tmaRP;
    public ComboBox tmaLP;
    public ComboBox tfaRP;
    public ComboBox tfaLP;
    public ComboBox ffRP;
    public ComboBox ffLP;
    public ComboBox calInvRP;
    public ComboBox calInvLP;
    public ComboBox calEverRP;
    public ComboBox calEverLP;
    public ComboBox legLengthRP;
    public ComboBox legLengthLP;
    public ComboBox kneeVarusRP;
    public ComboBox kneeVarusLP;
    public ComboBox TillipsoasLinterp;
    public ComboBox TillipsoasRinterp;
    public ComboBox TgluteMaxLinterp;
    public ComboBox TgluteMaxRinterp;
    public ComboBox TaddLinterp;
    public ComboBox TaddRinterp;
    public ComboBox TrecFemLinterp;
    public ComboBox TrecFemRInterp;
    public ComboBox TrecCatchLinterp;
    public ComboBox TrecCatchRinterp;
    public ComboBox TvastmedLinterp;
    public ComboBox TvastmedRInterp;
    public ComboBox ThamstringLinterp;
    public ComboBox ThamstringRinterp;
    public ComboBox TpostTibLinterp;
    public ComboBox TpostTibRInterp;
    public ComboBox TantLinterp;
    public ComboBox TantRInterp;
    public ComboBox TgastroLinterp;
    public ComboBox TgastroRinterp;
    public ComboBox TclonusLinterp;
    public ComboBox TclonusRinterp;
    public ComboBox TkneeJerLinterp;
    public ComboBox TkneeJerRinterp;
    public ComboBox RankJerLinterp;
    public ComboBox RankJerRinterp;
    public ComboBox TbabinLinterp;
    public ComboBox TbabinRinterp;
    public ComboBox TproxLinterp;
    public ComboBox TproxRinterp;
    public ComboBox TdistalLinterp;
    public ComboBox TdistalRinterp;
    public RadioButton PAMNum;
    public RadioButton PAMWrong;
    public RadioButton PAMflacc;
    public CheckBox AFwb;
    public CheckBox AFstand;
    public CheckBox AFwalk;
    public CheckBox AFrun;
    public CheckBox AFadl;
    public CheckBox AFtouch;
    public CheckBox AFmovement;
    public CheckBox AFother;
    public CheckBox AIsleep;
    public CheckBox AIads;
    public CheckBox AIschool;
    public CheckBox AIsports;
    public CheckBox AIfuncMob;
    public CheckBox AIother;
    public RadioButton eye0;
    public RadioButton eye1;
    public RadioButton eye2;
    public RadioButton eye3;
    public RadioButton eye4;
    public RadioButton eyeUnable;
    public RadioButton mouth0;
    public RadioButton mouth1;
    public RadioButton mouth2;
    public RadioButton mouth3;
    public RadioButton mouth4;
    public RadioButton mouthUnable;
    public RadioButton neck0;
    public RadioButton neck1;
    public RadioButton neck2;
    public RadioButton neck3;
    public RadioButton neck4;
    public RadioButton neckUnable;
    public RadioButton trunk0;
    public RadioButton trunk1;
    public RadioButton trunk2;
    public RadioButton trunk3;
    public RadioButton trunk4;
    public RadioButton trunkUnable;
    @Autowired
    ToneService toneService;
    @Autowired
    PainService painService;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        /*
        Assigning all comboboxes their appropriate values
         */

        //General
        GMFCSCombo.getSelectionModel().selectFirst();
        MACSCombobox.getSelectionModel().selectFirst();
        CFCSComboBox.getSelectionModel().selectFirst();
        FMS500M.getSelectionModel().selectFirst();
        FMS5M.getSelectionModel().selectFirst();
        FMS50M.getSelectionModel().selectFirst();

        //PROM and Strength
        hipRP.getSelectionModel().selectFirst();
        hipLP.getSelectionModel().selectFirst();
        hipRS.getSelectionModel().selectFirst();
        hipLS.getSelectionModel().selectFirst();
        hipExtRP.getSelectionModel().selectFirst();
        hipExtLP.getSelectionModel().selectFirst();
        hipExtLS.getSelectionModel().selectFirst();
        hipExtRS.getSelectionModel().selectFirst();
        hipAbdRP.getSelectionModel().selectFirst();
        hipAbdLP.getSelectionModel().selectFirst();
        hipAbdLS.getSelectionModel().selectFirst();
        hipAbdRS.getSelectionModel().selectFirst();
        hipExtRotRP.getSelectionModel().selectFirst();
        hipExtRotLP.getSelectionModel().selectFirst();
        hipExtRotLS.getSelectionModel().selectFirst();
        hipExtRotRS.getSelectionModel().selectFirst();
        ryderRP.getSelectionModel().selectFirst();
        ryderLP.getSelectionModel().selectFirst();
        ryderRS.getSelectionModel().selectFirst();
        ryderLS.getSelectionModel().selectFirst();
        kneeExtRP.getSelectionModel().selectFirst();
        kneeExtLP.getSelectionModel().selectFirst();
        kneeExtRS.getSelectionModel().selectFirst();
        kneeExtLS.getSelectionModel().selectFirst();
        kneeFlexRP.getSelectionModel().selectFirst();
        kneeFlexLP.getSelectionModel().selectFirst();
        kneeFlexRS.getSelectionModel().selectFirst();
        kneeFlexLS.getSelectionModel().selectFirst();
        popAngRP.getSelectionModel().selectFirst();
        popAngLP.getSelectionModel().selectFirst();
        popAngRS.getSelectionModel().selectFirst();
        popAngLS.getSelectionModel().selectFirst();
        biPopAngRP.getSelectionModel().selectFirst();
        biPopAngLP.getSelectionModel().selectFirst();
        elyTestRP.getSelectionModel().selectFirst();
        elyTestLP.getSelectionModel().selectFirst();
        dorsiExtRP.getSelectionModel().selectFirst();
        dorsiExtLP.getSelectionModel().selectFirst();
        dorsiFlexLP.getSelectionModel().selectFirst();
        dorsiFlexRP.getSelectionModel().selectFirst();
        plantarRP.getSelectionModel().selectFirst();
        plantarLP.getSelectionModel().selectFirst();
        plantarRS.getSelectionModel().selectFirst();
        plantarLS.getSelectionModel().selectFirst();
        ankleInvRP.getSelectionModel().selectFirst();
        ankleInvLP.getSelectionModel().selectFirst();
        ankleInvRS.getSelectionModel().selectFirst();
        ankleInvLS.getSelectionModel().selectFirst();
        ankleEverRP.getSelectionModel().selectFirst();
        ankleEverLP.getSelectionModel().selectFirst();
        ankleEverRS.getSelectionModel().selectFirst();
        ankleEverLS.getSelectionModel().selectFirst();
        tmaRP.getSelectionModel().selectFirst();
        tmaLP.getSelectionModel().selectFirst();
        tfaLP.getSelectionModel().selectFirst();
        tfaRP.getSelectionModel().selectFirst();
        ffLP.getSelectionModel().selectFirst();
        ffRP.getSelectionModel().selectFirst();
        calInvLP.getSelectionModel().selectFirst();
        calInvRP.getSelectionModel().selectFirst();
        calEverLP.getSelectionModel().selectFirst();
        calEverRP.getSelectionModel().selectFirst();
        legLengthLP.getSelectionModel().selectFirst();
        legLengthRP.getSelectionModel().selectFirst();
        kneeVarusLP.getSelectionModel().selectFirst();
        kneeVarusRP.getSelectionModel().selectFirst();

        //Tone comboboxes
        TillipsoasLinterp.getSelectionModel().selectFirst();
        TillipsoasRinterp.getSelectionModel().selectFirst();
        TgluteMaxLinterp.getSelectionModel().selectFirst();
        TgastroRinterp.getSelectionModel().selectFirst();
        TaddLinterp.getSelectionModel().selectFirst();
        TaddRinterp.getSelectionModel().selectFirst();
        TrecFemLinterp.getSelectionModel().selectFirst();
        TrecFemRInterp.getSelectionModel().selectFirst();
        TrecCatchLinterp.getSelectionModel().selectFirst();
        TrecCatchRinterp.getSelectionModel().selectFirst();
        TvastmedLinterp.getSelectionModel().selectFirst();
        TvastmedRInterp.getSelectionModel().selectFirst();
        ThamstringLinterp.getSelectionModel().selectFirst();
        ThamstringRinterp.getSelectionModel().selectFirst();
        TpostTibLinterp.getSelectionModel().selectFirst();
        TpostTibRInterp.getSelectionModel().selectFirst();
        TantLinterp.getSelectionModel().selectFirst();
        TantRInterp.getSelectionModel().selectFirst();
        TgastroRinterp.getSelectionModel().selectFirst();
        TgastroLinterp.getSelectionModel().selectFirst();
        TclonusLinterp.getSelectionModel().selectFirst();
        TclonusRinterp.getSelectionModel().selectFirst();
        TkneeJerLinterp.getSelectionModel().selectFirst();
        TkneeJerRinterp.getSelectionModel().selectFirst();
        RankJerLinterp.getSelectionModel().selectFirst();
        RankJerRinterp.getSelectionModel().selectFirst();
        TbabinLinterp.getSelectionModel().selectFirst();
        TbabinRinterp.getSelectionModel().selectFirst();
        TproxLinterp.getSelectionModel().selectFirst();
        TproxRinterp.getSelectionModel().selectFirst();
        TdistalLinterp.getSelectionModel().selectFirst();
        TdistalRinterp.getSelectionModel().selectFirst();

    }

    public void OnMovementDisSave(ActionEvent event) {
        //Save textfields
        IPromModel promModel = promService.save(new IPromModel());
        promModel.setHipFlexR(PROMHipR.getText());
        promModel.setHipFlexL(PROMHipL.getText());
        promModel.setHipFlexStrenR(StrenHipFlexR.getText());
        promModel.setHipFlexStrenL(StrenHipFlexL.getText());
        promModel.setHipExtL(Integer.valueOf(PROMHipExtL.getText()));
        promModel.setHipExtr(Integer.valueOf(PROMHipExtR.getText()));
        promModel.setHipExtStrenL(StrengHipExtL.getText());
        promModel.setHipExtStrenR(StrengHipExtR.getText());
        promModel.setHipAbdL(Integer.valueOf(PROMHipabdL.getText()));
        promModel.setHipAbdR(Integer.getInteger(PROMHipabdR.getText()));
        promModel.setHipAbdStrenR(StregHipAbdR.getText());
        promModel.setHipAbdStrenL(StregHipAbdL.getText());
        promModel.setHipIntRotL(PROMHipIntRotL.getText());
        promModel.setHipIntRotR(PROMHipExtRotR.getText());
        promModel.setHipIntRotStrenR(StrengHipIntRotR.getText());
        promModel.setHipIntRotStrenL(StrengHipIntRotL.getText());
        promModel.setHipExtr(Integer.valueOf(PROMHipExtR.getText()));
        promModel.setHipExtL(Integer.getInteger(PROMHipExtL.getText()));
        promModel.setHipExtStrenR(StrengHipExtR.getText());
        promModel.setHipExtStrenL(StrengHipExtL.getText());
        promModel.setRyderTestR(PROMRyderTestR.getText());
        promModel.setRyderTestL(PROMRyderTestL.getText());
        promModel.setRyderTestStrenL(StregRyertestL.getText());
        promModel.setRyderTestStrenR(StregRyertestL.getText());
        promModel.setKneeExtR(PROMKneeExtR.getText());
        promModel.setKneeExtL(PROMKneeExtL.getText());
        promModel.setExtLagL(PROMExtLagL.getText());
        promModel.setExtLagR(PROMExtLagR.getText());
        promModel.setExtLagStrenL(StrengthExtLagL.getText());
        promModel.setExtLagStrenR(StrengthExtLagR.getText());
        promModel.setKneeFlexL(PROMKneeFlexL.getText());
        promModel.setKneeFlexR(PROMKneeFlexR.getText());
        promModel.setKneeFlextStrenL(StrengthKneeFlexL.getText());
        promModel.setKneeFlextStrenR(StrengthKneeFlexR.getText());
        promModel.setPopAngL(PROMPopAngleL.getText());
        promModel.setPopAngR(PROMPopAngleR.getText());
        promModel.setPopAngStrenL(StrengthPopAngleL.getText());
        promModel.setPopAngStrenR(StrengthPopAngleR.getText());
        promModel.setBilateralPopL(PROMBilatL.getText());
        promModel.setBilateralPopR(PROMBilatR.getText());
        promModel.setElyL(Integer.valueOf(PROMElyL.getText()));
        promModel.setElyR(Integer.valueOf(PROMElyR.getText()));
        promModel.setDorsiFL(Integer.valueOf(PROMDorsiFL.getText()));
        promModel.setDorsiFR(Integer.valueOf(PROMDorsiFR.getText()));
        promModel.setDorsiEL(Integer.valueOf(PROMDorsiEL.getText()));
        promModel.setDorsiER(Integer.valueOf(PROMDorsiER.getText()));
        promModel.setPlantarR(Integer.valueOf(PROMPlantarR.getText()));
        promModel.setPlantarL(Integer.valueOf(PROMPlantarL.getText()));
        promModel.setPlantarStrenL(StrengPlantarL.getText());
        promModel.setPlantarStrenR(StrengPlantarR.getText());
        promModel.setAnkleInvL(PROMAnkInvL.getText());
        promModel.setAnkleInvR(PROMAnkInvR.getText());
        promModel.setAnkInvStrenL(StrengAnklInvL.getText());
        promModel.setAnkInvStrenR(StrengAnklInvR.getText());
        promModel.setAnkleEverL(PROMAnkEvL.getText());
        promModel.setAnkleEverR(PROMAnkEvR.getText());
        promModel.setAnkleEvStrengR(StrengAnkEvR.getText());
        promModel.setAnkleEvStrengL(StrengAnkEvL.getText());
        promModel.setTfaL(PROMtfaL.getText());
        promModel.setTfaR(PROMtfaR.getText());
        promModel.setFfAbaddL(PROMffL.getText());
        promModel.setFfAbaddR(PROMffR.getText());
        promModel.setCalcanealInv(PROMCalInvL.getText());
        promModel.setCalcanealEver(PROMCalEvR.getText());
        promModel.setLegLengthL(legLengthL.getText());
        promModel.setLegLengthR(legLengthR.getText());
        promModel.setKneeVargus(kneeVarL.getText());

        //Tone
        IToneModel toneModel = toneService.save(new IToneModel());
        toneModel.setIliopsoasL(TillipsoasL.getText());
        toneModel.setIliopsoasR(TillipsoasR.getText());
        toneModel.setGluteMaxL(TgluteMaxL.getText());
        toneModel.setGluteMaxR(TgluteMaxR.getText());
        toneModel.setAdductorL(TaddL.getText());
        toneModel.setAdductorR(TaddR.getText());
        toneModel.setRectusFemorisL(TrecFemL.getText());
        toneModel.setRectusFemorisR(TrecFemR.getText());
        toneModel.setVastusMedialisL(TvastmedL.getText());
        toneModel.setVastusMedialisR(TvastmedR.getText());
        toneModel.setHamstringL(ThamstringL.getText());
        toneModel.setHamstringR(ThamstringR.getText());
        toneModel.setPostTibL(TpostTibL.getText());
        toneModel.setPostTibR(TpostTibR.getText());
        toneModel.setAntTibL(TantL.getText());
        toneModel.setAntTibR(TantR.getText());
        toneModel.setGastrocL(TgastroL.getText());
        toneModel.setGastrocR(TgastroR.getText());
        toneModel.setColnusL(TclonusL.getText());
        toneModel.setColnusR(TclonusR.getText());
        toneModel.setKneeJerkL(TkneeJerL.getText());
        toneModel.setKneeJerkR(TkneeJerR.getText());
        toneModel.setAnkleJerkL(RankJerL.getText());
        toneModel.setAnkleJerkR(RankJerR.getText());
        toneModel.setBabinskiL(TbabinL.getText());
        toneModel.setBabinskiR(TbabinR.getText());
        toneModel.setProximalMuscleToneL(TproxL.getText());
        toneModel.setProximalMuscleToneR(TproxR.getText());
        toneModel.setDistalMuscleToneL(TdistalL.getText());
        toneModel.setDistalMuscleToneR(TdistalR.getText());

        //Pain Assessment
        IPainModel painModel = painService.save(new IPainModel());
        if (PAMNum.isSelected()) {
            painModel.setPainAssessmentMethod(PAMNum.getText());
            painService.save(painModel);
        }
        if (PAMWrong.isSelected()) {
            painModel.setPainAssessmentMethod(PAMWrong.getText());
            painService.save(painModel);
        }
        if (PAMflacc.isSelected()) {
            painModel.setPainAssessmentMethod(PAMflacc.getText());
            painService.save(painModel);
        }
        if (AFwb.isSelected()) {
            painModel.setPainAssessmentMethod(AFwb.getText());
            painService.save(painModel);
        }
        if (AFstand.isSelected()) {
            painModel.setPainAssessmentMethod(AFstand.getText());
            painService.save(painModel);
        }
        if (AFwalk.isSelected()) {
            painModel.setPainAssessmentMethod(AFwalk.getText());
            painService.save(painModel);
        }
        if (AFrun.isSelected()) {
            painModel.setPainAssessmentMethod(AFrun.getText());
            painService.save(painModel);
        }
        if (AFadl.isSelected()) {
            painModel.setPainAssessmentMethod(AFadl.getText());
            painService.save(painModel);
        }
        if (AFtouch.isSelected()) {
            painModel.setPainAssessmentMethod(AFtouch.getText());
            painService.save(painModel);
        }
        if (AFmovement.isSelected()) {
            painModel.setPainAssessmentMethod(AFmovement.getText());
            painService.save(painModel);
        }
        if (AFother.isSelected()) {
            painModel.setPainAssessmentMethod(AFother.getText());
            painService.save(painModel);
        }
        if (AIsleep.isSelected()) {
            painModel.setPainAssessmentMethod(AIsleep.getText());
            painService.save(painModel);
        }
        if (AIads.isSelected()) {
            painModel.setPainAssessmentMethod(AIads.getText());
            painService.save(painModel);
        }
        if (AIschool.isSelected()) {
            painModel.setPainAssessmentMethod(AIschool.getText());
            painService.save(painModel);
        }
        if (AIfuncMob.isSelected()) {
            painModel.setPainAssessmentMethod(AIfuncMob.getText());
            painService.save(painModel);
        }
        if (AIother.isSelected()) {
            painModel.setPainAssessmentMethod(AIother.getText());
            painService.save(painModel);
        }
        if (CL0.isSelected()) {
            painModel.setPainAssessmentMethod(CL0.getText());
            painService.save(painModel);
        }
        if (CL1.isSelected()) {
            painModel.setPainAssessmentMethod(CL1.getText());
            painService.save(painModel);
        }
        if (CL2.isSelected()) {
            painModel.setPainAssessmentMethod(CL2.getText());
            painService.save(painModel);
        }
        if (CL3.isSelected()) {
            painModel.setPainAssessmentMethod(CL3.getText());
            painService.save(painModel);
        }
        if (CL4.isSelected()) {
            painModel.setPainAssessmentMethod(CL4.getText());
            painService.save(painModel);
        }
        if (CL5.isSelected()) {
            painModel.setPainAssessmentMethod(CL5.getText());
            painService.save(painModel);
        }
        if (CL6.isSelected()) {
            painModel.setPainAssessmentMethod(CL6.getText());
            painService.save(painModel);
        }
        if (CL7.isSelected()) {
            painModel.setPainAssessmentMethod(CL7.getText());
            painService.save(painModel);
        }
        if (CL8.isSelected()) {
            painModel.setPainAssessmentMethod(CL8.getText());
            painService.save(painModel);
        }
        if (CL9.isSelected()) {
            painModel.setPainAssessmentMethod(CL9.getText());
            painService.save(painModel);
        }
        if (CL10.isSelected()) {
            painModel.setPainAssessmentMethod(CL10.getText());
            painService.save(painModel);
        }
        if (LL0.isSelected()) {
            painModel.setPainAssessmentMethod(LL0.getText());
            painService.save(painModel);
        }
        if (LL1.isSelected()) {
            painModel.setPainAssessmentMethod(LL1.getText());
            painService.save(painModel);
        }
        if (LL2.isSelected()) {
            painModel.setPainAssessmentMethod(LL2.getText());
            painService.save(painModel);
        }
        if (LL3.isSelected()) {
            painModel.setPainAssessmentMethod(LL3.getText());
            painService.save(painModel);
        }
        if (LL4.isSelected()) {
            painModel.setPainAssessmentMethod(LL4.getText());
            painService.save(painModel);
        }
        if (LL5.isSelected()) {
            painModel.setPainAssessmentMethod(LL5.getText());
            painService.save(painModel);
        }
        if (LL6.isSelected()) {
            painModel.setPainAssessmentMethod(LL6.getText());
            painService.save(painModel);
        }
        if (LL7.isSelected()) {
            painModel.setPainAssessmentMethod(LL7.getText());
            painService.save(painModel);
        }
        if (LL8.isSelected()) {
            painModel.setPainAssessmentMethod(LL8.getText());
            painService.save(painModel);
        }
        if (LL9.isSelected()) {
            painModel.setPainAssessmentMethod(LL9.getText());
            painService.save(painModel);
        }
        if (LL10.isSelected()) {
            painModel.setPainAssessmentMethod(LL10.getText());
            painService.save(painModel);
        }
        if (HL0.isSelected()) {
            painModel.setPainAssessmentMethod(HL0.getText());
            painService.save(painModel);
        }
        if (HL1.isSelected()) {
            painModel.setPainAssessmentMethod(HL1.getText());
            painService.save(painModel);
        }
        if (HL2.isSelected()) {
            painModel.setPainAssessmentMethod(HL2.getText());
            painService.save(painModel);
        }
        if (HL3.isSelected()) {
            painModel.setPainAssessmentMethod(HL3.getText());
            painService.save(painModel);
        }
        if (HL4.isSelected()) {
            painModel.setPainAssessmentMethod(HL4.getText());
            painService.save(painModel);
        }
        if (HL5.isSelected()) {
            painModel.setPainAssessmentMethod(HL5.getText());
            painService.save(painModel);
        }
        if (HL6.isSelected()) {
            painModel.setPainAssessmentMethod(HL6.getText());
            painService.save(painModel);
        }
        if (HL7.isSelected()) {
            painModel.setPainAssessmentMethod(HL7.getText());
            painService.save(painModel);
        }
        if (HL8.isSelected()) {
            painModel.setPainAssessmentMethod(HL8.getText());
            painService.save(painModel);
        }
        if (HL9.isSelected()) {
            painModel.setPainAssessmentMethod(HL9.getText());
            painService.save(painModel);
        }
        if (HL10.isSelected()) {
            painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }

        painModel.setLocationOfPain(locOfPain.getText());
        painModel.setFrequencyOfPain(freqOfPain.getText());
        painModel.setDurationOfPain(durOfPain.getText());

        //HAT scale
        if (uerDesignated0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerDesignated1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerDesignated0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerDesignated1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelDesignated0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelDesignated1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelDesignated0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelDesignated1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerPurposeful0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerPurposeful1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerPurposeful0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerPurposeful1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelPurposeful0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelPurposeful1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelPurposeful0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelPurposeful1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerStretch0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerStretch1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerStretch0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerStretch1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelStretch0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelStretch1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelStretch0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelStretch1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerSpastic0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerSpastic1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerSpastic0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerSpastic1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelSpastic0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelSpastic1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelSpastic0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelSpastic1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerJoint0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerJoint1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerJoint0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerJoint1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelJoint0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelJoint1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelJoint0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelJoint1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerTone0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerTone1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerTone0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerTone1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelTone0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelTone1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelTone0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelTone1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerPosition0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uerPosition1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerPosition0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lerPosition1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelPosition0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (uelPosition1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelPosition0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (lelPosition1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }

        //Dystonia Scale
        if (eye0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (eye1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (eye2.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (eye3.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (eye4.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (eyeUnable.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (mouth0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (mouth1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (mouth2.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (mouth3.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (mouth4.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (mounthUnable.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (neck0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (neck1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (neck2.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (neck3.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (neck4.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (neckUnable.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (trunk0.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (trunk1.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (trunk2.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (trunk3.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (trunk4.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }
        if (trunkUnable.isSelected()) {
            //painModel.setPainAssessmentMethod(HL10.getText());
            painService.save(painModel);
        }

        //Visit details information


    }

    public void setDates(ActionEvent event) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/GAIT/GenerateGAITInterpretation.fxml")));
        Stage stage1 = new Stage();
        popUp.getStylesheets().add(Objects.requireNonNull(Launcher.class.getResource("/styles.css")).toExternalForm());
        stage1.setTitle("Patient Interpretation");
        stage1.setScene(new Scene(popUp, 900, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }

    //TODO
    /*
    Save combobox options
     */
}

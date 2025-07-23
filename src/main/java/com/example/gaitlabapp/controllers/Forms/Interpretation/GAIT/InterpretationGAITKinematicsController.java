package com.example.gaitlabapp.controllers.Forms.Interpretation.GAIT;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class InterpretationGAITKinematicsController implements Initializable {

    @FXML
    private Text AntPelvicMaxRInterp;

    @FXML
    private Text AntPelvicMaxRNormals;

    @FXML
    private Text AntPelvicMaxRValue;

    @FXML
    private Text TOLInterp;

    @FXML
    private Text TOLNormals;

    @FXML
    private Text TOLValue;

    @FXML
    private Text TORInterp;

    @FXML
    private Text TORNormals;

    @FXML
    private Text TORValue;

    @FXML
    private Text angleSupportLInterp;

    @FXML
    private Text angleSupportLNormals;

    @FXML
    private Text angleSupportLValue;

    @FXML
    private Text angleSupportRInterp;

    @FXML
    private Text angleSupportRNormals;

    @FXML
    private Text angleSupportRValue;

    @FXML
    private Text ankleDorsiFCLInterp;

    @FXML
    private Text ankleDorsiFCLNormals;

    @FXML
    private Text ankleDorsiFCLValue;

    @FXML
    private Text ankleDorsiMaxLInterp;

    @FXML
    private Text ankleDorsiMaxLNormals;

    @FXML
    private Text ankleDorsiMaxLValue;

    @FXML
    private Text ankleDorsiMaxRInterp;

    @FXML
    private Text ankleDorsiMaxRNormals;

    @FXML
    private Text ankleDorsiMaxRValue;

    @FXML
    private Text ankleDorsiTimeLInterp;

    @FXML
    private Text ankleDorsiTimeLNormals;

    @FXML
    private Text ankleDorsiTimeLValue;

    @FXML
    private Text ankleDorsiTimeRInterp;

    @FXML
    private Text ankleDorsiTimeRNormals;

    @FXML
    private Text ankleDorsiTimeRValue;

    @FXML
    private Text ankleFCRInterp;

    @FXML
    private Text ankleFCRNormals;

    @FXML
    private Text ankleFCRValue;

    @FXML
    private Text antPelvicMaxLInterp;

    @FXML
    private Text antPelvicMaxLNormals;

    @FXML
    private Text antPelvicMaxLValue;

    @FXML
    private Text cadenceRInterp;

    @FXML
    private Text cadenceRNormals;

    @FXML
    private Text cadenceRValue;

    @FXML
    private Text elbowFlexFCLInterp;

    @FXML
    private Text elbowFlexFCLNormals;

    @FXML
    private Text elbowFlexFCLValue;

    @FXML
    private Text elbowFlexFCRInterp;

    @FXML
    private Text elbowFlexFCRNormals;

    @FXML
    private Text elbowFlexFCRValue;

    @FXML
    private Text elbowFlexMaxLeftLInterp;

    @FXML
    private Text elbowFlexMaxLeftLNormals;

    @FXML
    private Text elbowFlexMaxLeftLValue;

    @FXML
    private Text elbowFlexMaxRightRInterp;

    @FXML
    private Text elbowFlexMaxRightRNormals;

    @FXML
    private Text elbowFlexMaxRightRValue;

    @FXML
    private Text extMaxLInterp;

    @FXML
    private Text extMaxLNormals;

    @FXML
    private Text extMaxLValue;

    @FXML
    private Text extMaxRInterp;

    @FXML
    private Text extMaxRNormals;

    @FXML
    private Text extMaxRValue;

    @FXML
    private Text flexFCLInterp;

    @FXML
    private Text flexFCLNormals;

    @FXML
    private Text flexFCLValue;

    @FXML
    private Text flexFCRInterp;

    @FXML
    private Text flexFCRNormals;

    @FXML
    private Text flexFCRValue;

    @FXML
    private Text flexMaxLInterp;

    @FXML
    private Text flexMaxLNormals;

    @FXML
    private Text flexMaxLValue;

    @FXML
    private Text flexMaxRInterp;

    @FXML
    private Text flexMaxRNormals;

    @FXML
    private Text flexMaxRValue;

    @FXML
    private Text footContRInterp;

    @FXML
    private Text footContRNormals;

    @FXML
    private Text footContRValue;

    @FXML
    private Text footContactLInterp;

    @FXML
    private Text footContactLNormals;

    @FXML
    private Text footContactLValue;

    @FXML
    private Text footProgAngleMaxLInterp;

    @FXML
    private Text footProgAngleMaxLNormals;

    @FXML
    private Text footProgAngleMaxLValue;

    @FXML
    private Text footProgAngleMaxRInterp;

    @FXML
    private Text footProgAngleMaxRNormals;

    @FXML
    private Text footProgAngleMaxRValue;

    @FXML
    private Text footProgAngleMinLInterp;

    @FXML
    private Text footProgAngleMinLNormals;

    @FXML
    private Text footProgAngleMinLValue;

    @FXML
    private Text footProgAngleMinRInterp;

    @FXML
    private Text footProgAngleMinRNormals;

    @FXML
    private Text footProgAngleMinRValue;

    @FXML
    private Text footprogFcLInterp;

    @FXML
    private Text footprogFcLNormals;

    @FXML
    private Text footprogFcLValue;

    @FXML
    private Text footprogFcRInterp;

    @FXML
    private Text footprogFcRValue;

    @FXML
    private Text footprogFcRnormals;

    @FXML
    private Text forwardTrunkRInterp;

    @FXML
    private Text forwardTrunkRNormals;

    @FXML
    private Text forwardTrunkRValue;

    @FXML
    private Text forwardVelLInterp;

    @FXML
    private Text forwardVelLNormals;

    @FXML
    private Text forwardVelLValue;

    @FXML
    private Text forwardVelRInterp;

    @FXML
    private Text forwardVelRNormals;

    @FXML
    private Text forwardVelRValue;

    @FXML
    private Text forwardtrunkLInterp;

    @FXML
    private Text forwardtrunkLNormals;

    @FXML
    private Text forwardtrunkLValue;

    @FXML
    private Text gairProfScoreInterp;

    @FXML
    private Text gairProfScoreNormals;

    @FXML
    private Text gairProfScoreValue;

    @FXML
    private Text gaitDevLInterp;

    @FXML
    private Text gaitDevLNormals;

    @FXML
    private Text gaitDevLValue;

    @FXML
    private Text gaitDevRInterp;

    @FXML
    private Text gaitDevRNormals;

    @FXML
    private Text gaitDevRValue;

    @FXML
    private Text kneeFlexFcLInterp;

    @FXML
    private Text kneeFlexFcLNormals;

    @FXML
    private Text kneeFlexFcLValue;

    @FXML
    private Text kneeFlexFcRInterp;

    @FXML
    private Text kneeFlexFcRNormals;

    @FXML
    private Text kneeFlexFcRValue;

    @FXML
    private Text kneeFlexMaxLInterp;

    @FXML
    private Text kneeFlexMaxLNormals;

    @FXML
    private Text kneeFlexMaxLValue;

    @FXML
    private Text kneeFlexMaxRInterp;

    @FXML
    private Text kneeFlexMaxRNormals;

    @FXML
    private Text kneeFlexMaxRValue;

    @FXML
    private Text kneeFlexMaxSwTimeRValue;

    @FXML
    private Text kneeFlexSwingLInterp;

    @FXML
    private Text kneeFlexSwingLNormals;

    @FXML
    private Text kneeFlexSwingLValue;

    @FXML
    private Text kneeFlexSwingRInterp;

    @FXML
    private Text kneeFlexSwingRNormals;

    @FXML
    private Text kneeFlexSwingRValue;

    @FXML
    private Text kneeMaxExtLInterp;

    @FXML
    private Text kneeMaxExtLNormals;

    @FXML
    private Text kneeMaxExtLValue;

    @FXML
    private Text kneeMaxExtRInterp;

    @FXML
    private Text kneeMaxExtRNormals;

    @FXML
    private Text kneeMaxExtRValue;

    @FXML
    private Text kneeVarusValLInterp;

    @FXML
    private Text kneeVarusValLNormals;

    @FXML
    private Text kneeVarusValLValue;

    @FXML
    private Text kneeVarusValRInterp;

    @FXML
    private Text kneeVarusValRNormals;

    @FXML
    private Text kneeVarusValRValue;

    @FXML
    private Text latTrunkLInterp;

    @FXML
    private Text latTrunkLNormals;

    @FXML
    private Text latTrunkLValue;

    @FXML
    private Text latTrunkRInterp;

    @FXML
    private Text latTrunkRNormals;

    @FXML
    private Text latTrunkRValue;

    @FXML
    private Text meanDistanceStraLineInterp;

    @FXML
    private Text meanDistanceStraLineNormals;

    @FXML
    private Text meanDistanceStraLineValue;

    @FXML
    private Text meanVarFootAPLInterp;

    @FXML
    private Text meanVarFootAPLNormals;

    @FXML
    private Text meanVarFootAPLValue;

    @FXML
    private Text meanVarFootMLLInterp;

    @FXML
    private Text meanVarFootMLLNormals;

    @FXML
    private Text meanVarFootMLLRnterp;

    @FXML
    private Text meanVarFootMLLValue;

    @FXML
    private Text meanVarFootMLRNormals;

    @FXML
    private Text meanVarFootMLRValue;

    @FXML
    private Text meanVariFootAPRInterp;

    @FXML
    private Text meanVariFootAPRNormals;

    @FXML
    private Text meanVariFootAPRValue;

    @FXML
    private Text pelvicObLInterp;

    @FXML
    private Text pelvicObLNormals;

    @FXML
    private Text pelvicObLValue;

    @FXML
    private Text pelvicObMaxRInterp;

    @FXML
    private Text pelvicObMaxRNormals;

    @FXML
    private Text pelvicObMaxRValue;

    @FXML
    private Text pelvicRotFCRInterp;

    @FXML
    private Text pelvicRotFCRNormals;

    @FXML
    private Text pelvicRotFCRValue;

    @FXML
    private Text pelvicRotFcLInterp;

    @FXML
    private Text pelvicRotFcLNormals;

    @FXML
    private Text pelvicRotFcLValue;

    @FXML
    private Text pelvicRotMaxLInterp;

    @FXML
    private Text pelvicRotMaxLNormals;

    @FXML
    private Text pelvicRotMaxLValue;

    @FXML
    private Text pelvicRotMaxRNormals;

    @FXML
    private Text pelvicRotMaxRValue;

    @FXML
    private Text pelvicRotMaxRinterp;

    @FXML
    private Text pelvicRotMinLInterp;

    @FXML
    private Text pelvicRotMinLNormals;

    @FXML
    private Text pelvicRotMinLValue;

    @FXML
    private Text pelvicRotMinRInterp;

    @FXML
    private Text pelvicRotMinRNormals;

    @FXML
    private Text pelvicRotMinRValue;

    @FXML
    private Text shoulderADDFCRInterp;

    @FXML
    private Text shoulderADDFCRNormals;

    @FXML
    private Text shoulderADDFCRValue;

    @FXML
    private Text shoulderAddFCLInterp;

    @FXML
    private Text shoulderAddFCLNormals;

    @FXML
    private Text shoulderAddFCLValue;

    @FXML
    private Text shoulderFlexFCLInterp;

    @FXML
    private Text shoulderFlexFCLNormals;

    @FXML
    private Text shoulderFlexFCLValue;

    @FXML
    private Text shoulderFlexFCRInterp;

    @FXML
    private Text shoulderFlexFCRNormals;

    @FXML
    private Text shoulderFlexFCRValue;

    @FXML
    private Text singleSupportTimeLInterp;

    @FXML
    private Text singleSupportTimeLNormals;

    @FXML
    private Text singleSupportTimeLValue;

    @FXML
    private Text singleSupportTimeRInterp;

    @FXML
    private Text singleSupportTimeRNormals;

    @FXML
    private Text singleSupportTimeRValue;

    @FXML
    private Text stepLengthHNLInterp;

    @FXML
    private Text stepLengthHNLNormals;

    @FXML
    private Text stepLengthHNLValue;

    @FXML
    private Text stepLengthHNRInterp;

    @FXML
    private Text stepLengthHNRNormals;

    @FXML
    private Text stepLengthHNRValue;

    @FXML
    private Text stepLengthLInterp;

    @FXML
    private Text stepLengthLNormals;

    @FXML
    private Text stepLengthLValue;

    @FXML
    private Text stepLengthRInterp;

    @FXML
    private Text stepLengthRNormals;

    @FXML
    private Text stepLengthRValue;

    @FXML
    private Text stepWidthLInterp;

    @FXML
    private Text stepWidthLNormals;

    @FXML
    private Text stepWidthLValue;

    @FXML
    private Text stepWidthRInterp;

    @FXML
    private Text stepWidthRNormals;

    @FXML
    private Text stepWidthRValue;

    @FXML
    private Text strideLengthLInterp;

    @FXML
    private Text strideLengthLNormals;

    @FXML
    private Text strideLengthLValue;

    @FXML
    private Text strideLengthRInterp;

    @FXML
    private Text strideLengthRNormals;

    @FXML
    private Text strideLengthRValue;

    @FXML
    private Text tibTorsionMaxLInterp;

    @FXML
    private Text tibTorsionMaxLNormals;

    @FXML
    private Text tibTorsionMaxLValue;

    @FXML
    private Text tibTorsionMaxRInterp;

    @FXML
    private Text tibTorsionMaxRNormals;

    @FXML
    private Text tibTorsionMaxRValue;

    @FXML
    private Text tibiaRotLInterp;

    @FXML
    private Text tibiaRotLNormals;

    @FXML
    private Text tibiaRotLValue;

    @FXML
    private Text tibiaRotRInterp;

    @FXML
    private Text tibiaRotRNormals;

    @FXML
    private Text tibiaRotRValue;

    @FXML
    private Text totSupportTimeLInterp;

    @FXML
    private Text totSupportTimeLNormals;

    @FXML
    private Text totSupportTimeLValue;

    @FXML
    private Text totSupportTimeRInterp;

    @FXML
    private Text totSupportTimeRNormals;

    @FXML
    private Text totSupportTimeRValue;

    @FXML
    private Text trunkRotLInterp;

    @FXML
    private Text trunkRotLNormals;

    @FXML
    private Text trunkRotLValue;

    @FXML
    private Text trunkRotRInterp;

    @FXML
    private Text trunkRotRNormals;

    @FXML
    private Text trunkRotRValue;

    @FXML
    private Text velocityRInterp;

    @FXML
    private Text velocityRNormals;

    @FXML
    private Text velocityRValue;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        stepLengthRValue.setText("43.76");
        stepLengthRInterp.setText("Normal");
        stepLengthLValue.setText("44.03");
        stepLengthLInterp.setText("Normal");
        strideLengthRValue.setText("87.98");
        strideLengthRInterp.setText("Normal");
        strideLengthLValue.setText("88.34");
        strideLengthLInterp.setText("Normal");
        forwardVelRValue.setText("88.71");
        forwardVelLValue.setText("89.71");
        forwardVelRInterp.setText("Low");
        strideLengthLInterp.setText("Low");
        cadenceRValue.setText("120.24");
        cadenceRInterp.setText("Low");
        totSupportTimeRValue.setText("55.56");
        totSupportTimeRInterp.setText("Low");
        totSupportTimeLValue.setText("61.19");
        totSupportTimeLInterp.setText("Normal");
        singleSupportTimeRValue.setText("38.81");
        singleSupportTimeRValue.setText("Normal");
        singleSupportTimeLValue.setText("44.44");
        singleSupportTimeLInterp.setText("Normal");
        stepWidthRValue.setText("11.15");
        stepWidthRInterp.setText("Normal");
        stepWidthLValue.setText("11.15");
        stepWidthLInterp.setText("Normal");
        velocityRValue.setText("0.69");
        velocityRInterp.setText("Low");
        stepLengthHNRValue.setText("0.34");
        stepLengthHNRInterp.setText("Low");
        stepLengthHNLValue.setText("0.34");
        stepLengthHNLInterp.setText("Low");
        gaitDevRValue.setText("66.34");
        gaitDevRInterp.setText("Very Low");
        gaitDevLValue.setText("93.88");
        gaitDevLInterp.setText("Normal");
        gairProfScoreValue.setText("9.41");
        gairProfScoreInterp.setText("Very High");
        latTrunkRValue.setText("3.14");
        latTrunkRInterp.setText(" ");
        latTrunkLValue.setText("-0.58");
        forwardTrunkRValue.setText("6.81");
        forwardTrunkRInterp.setText("Normal");
        forwardtrunkLValue.setText("5.44");
        forwardtrunkLInterp.setText("Normal");
        trunkRotRValue.setText("-7.05");
        trunkRotRInterp.setText("Posterior");
        trunkRotLValue.setText("15.98");
        trunkRotLInterp.setText("Anterior");
        footContRValue.setText("16.1");
        footContRInterp.setText("Very Internal");
        footContactLValue.setText("-8.68");
        footContactLInterp.setText("Normal");
        TORValue.setText("23.47");
        TOLValue.setText("-5.34");
        angleSupportRValue.setText("6.82");
        angleSupportLValue.setText("7.55");
        flexFCRValue.setText("38.03");
        flexFCLValue.setText("39.53");
        flexMaxRValue.setText("38.03");
        flexMaxLValue.setText("40.41");
        extMaxRValue.setText("1.1");
        extMaxLValue.setText("-3.37");
        flexFCRInterp.setText("Normal");
        flexFCRInterp.setText("Normal");
        flexFCLInterp.setText("Normal");
        flexMaxRInterp.setText("Normal");
        flexMaxLInterp.setText("Normal");
        extMaxRInterp.setText("Normal");
        extMaxLInterp.setText("Normal");
        tibiaRotRValue.setText("14.18");
        tibiaRotLValue.setText("21.73");
        ankleFCRValue.setText("-21.04");
        ankleDorsiFCLValue.setText("-10.08");
        ankleDorsiMaxRValue.setText("-6.78");
        ankleDorsiMaxLValue.setText("16.28");
        ankleDorsiTimeRValue.setText("23.19");
        ankleDorsiTimeLValue.setText("46.65");
        tibiaRotRInterp.setText("Internal  ");
        tibiaRotLInterp.setText("Very Internal");
        ankleFCRInterp.setText("Very Low");
        ankleDorsiFCLInterp.setText("Low");
        ankleDorsiMaxRInterp.setText("Very Low");
        ankleDorsiMaxLInterp.setText("Normal");
        ankleDorsiTimeRInterp.setText("Very Early");
        ankleDorsiTimeLInterp.setText("Normal");
        meanDistanceStraLineValue.setText("2.28");
        meanVariFootAPRValue.setText("1.78");
        meanVarFootMLRValue.setText("1.47");
        meanVarFootAPLValue.setText("2.25");
        meanVarFootMLLValue.setText("1.77");
        meanDistanceStraLineInterp.setText("High");
        meanVariFootAPRInterp.setText("High");
        meanVarFootMLLRnterp.setText("High");
        meanVarFootAPLInterp.setText("High");
        meanVarFootMLLInterp.setText("High");
        elbowFlexFCRValue.setText("52.95");
        elbowFlexMaxRightRValue.setText("60.86");
        elbowFlexFCLValue.setText("33.94");
        elbowFlexMaxLeftLValue.setText("57.49");
        shoulderADDFCRValue.setText("8.86");
        shoulderAddFCLValue.setText("13.31");
        shoulderFlexFCRValue.setText("-14.24");
        shoulderFlexFCLValue.setText("-22.58");
        elbowFlexFCRInterp.setText("High");
        elbowFlexMaxRightRInterp.setText("Normal");
        elbowFlexFCLInterp.setText("Normal");
        elbowFlexMaxLeftLInterp.setText("Normal");
        pelvicObMaxRValue.setText("1.48");
        pelvicObLValue.setText("4.68");
        AntPelvicMaxRValue.setText("19.78");
        antPelvicMaxLValue.setText("17.73");
        pelvicRotFCRValue.setText("-1.23");
        pelvicRotFcLValue.setText("14.22");
        pelvicRotMaxRValue.setText("-0.72");
        pelvicRotMaxLValue.setText("14.98");
        pelvicRotMinRValue.setText("-14.54");
        pelvicRotMinLValue.setText("0.75");
        pelvicObMaxRInterp.setText("Normal");
        pelvicObLInterp.setText("Normal");
        AntPelvicMaxRInterp.setText("Normal");
        antPelvicMaxLInterp.setText("Normal");
        pelvicRotMaxRinterp.setText("Posterior");
        pelvicRotMaxLInterp.setText("Anterior");
        tibTorsionMaxRValue.setText("-28.88");
        tibTorsionMaxLValue.setText("-13.55");
        kneeVarusValRValue.setText("3.83");
        kneeVarusValLValue.setText("-3.02");
        kneeFlexFcRValue.setText("19.81");
        kneeFlexFcLValue.setText("13.36");
        kneeFlexMaxRValue.setText("26.72");
        kneeFlexMaxLValue.setText("39.83");
        kneeMaxExtRValue.setText("12.03");
        kneeMaxExtLValue.setText("13.01");
        kneeFlexSwingRValue.setText("67.1");
        kneeFlexSwingLValue.setText("65.01");
        kneeFlexMaxSwTimeRValue.setText("74.37");
        tibTorsionMaxRInterp.setText("Very External");
        tibTorsionMaxLInterp.setText("External");
        kneeFlexFcRInterp.setText("High");
        kneeFlexFcLInterp.setText("Normal");
        kneeMaxExtRInterp.setText("Normal");
        kneeMaxExtLInterp.setText("High");
        kneeFlexSwingRInterp.setText("Normal");
        kneeFlexSwingLInterp.setText("Low");
        footprogFcRValue.setText("-14.37");
        footprogFcLValue.setText("-1.45");
        footProgAngleMaxRValue.setText("-6");
        footProgAngleMaxLValue.setText("3.06");
        footProgAngleMinRValue.setText("-15.88");
        footProgAngleMinLValue.setText("-3.06");
    }
}

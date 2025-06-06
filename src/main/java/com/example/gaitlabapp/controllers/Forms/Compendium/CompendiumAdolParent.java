package com.example.gaitlabapp.controllers.Forms.Compendium;

import javafx.fxml.Initializable;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.text.Text;

public class CompendiumAdolParent implements Initializable {
    public Text harrisHipScore;
    public Text uclaActHipScore;
    public Text painHipScore;
    public Text stiffnessHipScore;
    public Text physFunHipScore;
    public Text harrisHipNormals;
    public Text uclaActNormals;
    public Text stiffnessHipScoreNorm;
    public Text painHipScoreNorm;
    public Text physFuncHipScoreNormals;
    @FXML
    private Text extremityRaw;

    @FXML
    private Text globalMean;

    @FXML
    private Text globalNorm;

    @FXML
    private Text globalRaw;

    @FXML
    private Text globalStandard;

    @FXML
    private Text happinessMean;

    @FXML
    private Text happinessNorm;

    @FXML
    private Text happinessRaw;

    @FXML
    private Text happinessStandard;

    @FXML
    private Text meanExt;

    @FXML
    private Text mobilityMean;

    @FXML
    private Text mobilityNorm;

    @FXML
    private Text mobilityRaw;

    @FXML
    private Text mobilityStandard;

    @FXML
    private Text normExt;

    @FXML
    private Label normRaw;

    @FXML
    private Text painMean;

    @FXML
    private Text painNorm;

    @FXML
    private Text painRaw;

    @FXML
    private Text painStandard;

    @FXML
    private Text sportsMean;

    @FXML
    private Text sportsNorm;

    @FXML
    private Text sportsRaw;

    @FXML
    private Text sportsStandard;

    @FXML
    private Text standardExt;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        extremityRaw.setText("14");
        meanExt.setText("2");
        standardExt.setText("75");
        normExt.setText("35");
        mobilityRaw.setText("23");
        mobilityMean.setText("2");
        mobilityStandard.setText("58");
        mobilityNorm.setText("-20");
        sportsRaw.setText("28");
        sportsMean.setText("2");
        sportsStandard.setText("56");
        sportsNorm.setText("15");
        painRaw.setText("7");
        painMean.setText("2");
        painStandard.setText("70");
        painNorm.setText("34");
        happinessMean.setText("85");
        happinessNorm.setText("47");
        globalRaw.setText("---");
        globalMean.setText("---");
        globalStandard.setText("65");
        globalNorm.setText("11");
        harrisHipNormals.setText("91/91");
        harrisHipScore.setText("91/91");
        uclaActHipScore.setText("3/10");
        uclaActNormals.setText("10/10");
        painHipScore.setText("0/20");
        painHipScoreNorm.setText("0");
        stiffnessHipScoreNorm.setText("0");
        physFuncHipScoreNormals.setText("0");
        stiffnessHipScore.setText("0/8");
        physFunHipScore.setText("0/68");

    }




}

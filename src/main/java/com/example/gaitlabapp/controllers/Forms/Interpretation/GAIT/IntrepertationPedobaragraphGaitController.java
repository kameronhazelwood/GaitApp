package com.example.gaitlabapp.controllers.Forms.Interpretation.GAIT;


import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class IntrepertationPedobaragraphGaitController implements Initializable {
    @FXML
    private Text footProgressionLInterp;

    @FXML
    private Text footProgressionLNormals;

    @FXML
    private Text footProgressionLValue;

    @FXML
    private Text footProgressionRInterp;

    @FXML
    private Text footProgressionRNormals;

    @FXML
    private Text footProgressionRValue;

    @FXML
    private Text heelWeightLInterp;

    @FXML
    private Text heelWeightLNormals;

    @FXML
    private Text heelWeightLValue;

    @FXML
    private Text heelWeightRInterp;

    @FXML
    private Text heelWeightRNormals;

    @FXML
    private Text heelWeightRValue;

    @FXML
    private Text impuleHeelLInterp;

    @FXML
    private Text impuleHeelLNormal;

    @FXML
    private Text impuleHeelLValue;

    @FXML
    private Text impuleHeelRInterp;

    @FXML
    private Text impuleHeelRNormals;

    @FXML
    private Text impuleHeelRvalue;

    @FXML
    private Text impuleLatFootRInterp;

    @FXML
    private Text impuleLatFootRNormals;

    @FXML
    private Text impuleLatFootRValue;

    @FXML
    private Text impuleMedialRInterp;

    @FXML
    private Text impuleMedialRNormals;

    @FXML
    private Text impuleMedialRValue;

    @FXML
    private Text impulseForeFootLNormals;

    @FXML
    private Text impulseForeFootLValue;

    @FXML
    private Text impulseForeootLInterp;

    @FXML
    private Text impulseLatForeRInterp;

    @FXML
    private Text impulseLatForeRNormals;

    @FXML
    private Text impulseLatForeRValue;

    @FXML
    private Text impulseLatRInterp;

    @FXML
    private Text impulseLatRNormals;

    @FXML
    private Text impulseLatRValue;

    @FXML
    private Text medialFootRInterp;

    @FXML
    private Text medialFootRNormals;

    @FXML
    private Text medialFootRValue;

    @FXML
    private Text medialForeFoorLInterp;

    @FXML
    private Text medialForeFoorLNormals;

    @FXML
    private Text medialForeFoorLValue;

    @FXML
    private Text medialForeFoorRNormals;

    @FXML
    private Text medialForeFoorRVInterp;

    @FXML
    private Text medialForeFoorRValue;

    @FXML
    private Text valgusPositionLInterp;

    @FXML
    private Text valgusPositionLNormals;

    @FXML
    private Text valgusPositionLValue;

    @FXML
    private Text valgusPostitionRInterp;

    @FXML
    private Text valgusPostitionRNormals;

    @FXML
    private Text valgusPostitionRValue;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        heelWeightRValue.setText("4.3");
        heelWeightLValue.setText("27.7");
        impuleHeelRvalue.setText("0.3");
        impuleHeelLValue.setText("19.7");
        impuleLatFootRValue.setText("0");
        impulseLatRValue.setText("1.1");
        impuleMedialRValue.setText("0");
        medialFootRValue.setText("0");
        impulseLatForeRValue.setText("24.3");
        impulseForeFootLValue.setText("31.5");
        medialForeFoorRValue.setText("75.4");
        medialForeFoorLValue.setText("47.8");
        valgusPostitionRValue.setText("51.3");
        valgusPositionLValue.setText("18.9");
        footProgressionRValue.setText("25");
        footProgressionLValue.setText("1");

        heelWeightRInterp.setText("Very Early");
        heelWeightLInterp.setText("Very Early");
        impuleHeelRInterp.setText("Very Early");
        impuleHeelLInterp.setText("Low");
        valgusPostitionRNormals.setText("Moderate Valgus");
        valgusPositionLNormals.setText("Normal");
        footProgressionRNormals.setText("Very External");
        footProgressionLNormals.setText("Normal");
    }
}

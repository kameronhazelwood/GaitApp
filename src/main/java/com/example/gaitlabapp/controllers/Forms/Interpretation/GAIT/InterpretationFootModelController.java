package com.example.gaitlabapp.controllers.Forms.Interpretation.GAIT;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class InterpretationFootModelController implements Initializable {
    @FXML
    private Text archIndexLInterp;

    @FXML
    private Text archIndexLNormals;

    @FXML
    private Text archIndexLValue;

    @FXML
    private Text archIndexRInterp;

    @FXML
    private Text archIndexRNormals;

    @FXML
    private Text archIndexRValue;

    @FXML
    private Text footaddLInterp;

    @FXML
    private Text footaddLNormals;

    @FXML
    private Text footaddLValue;

    @FXML
    private Text footaddRInterp;

    @FXML
    private Text footaddRNormals;

    @FXML
    private Text footaddRValue;

    @FXML
    private Text forefootSupLInterp;

    @FXML
    private Text forefootSupLNormals;

    @FXML
    private Text forefootSupLValue;

    @FXML
    private Text forefootSupRInterp;

    @FXML
    private Text forefootSupRNormals;

    @FXML
    private Text forefootSupRValue;

    @FXML
    private Text halluxFlexLInterp;

    @FXML
    private Text halluxFlexLNormals;

    @FXML
    private Text halluxFlexLValue;

    @FXML
    private Text halluxFlexRInterp;

    @FXML
    private Text halluxFlexRNormals;

    @FXML
    private Text halluxFlexRValue;

    @FXML
    private Text halluxValgusLInterp;

    @FXML
    private Text halluxValgusLNormals;

    @FXML
    private Text halluxValgusLValue;

    @FXML
    private Text halluxValgusRInterp;

    @FXML
    private Text halluxValgusRNormals;

    @FXML
    private Text halluxValgusRValue;

    @FXML
    private Text hindfootValgusLInterp;

    @FXML
    private Text hindfootValgusLNormals;

    @FXML
    private Text hindfootValgusLValue;

    @FXML
    private Text hindfootValgusRInterp;

    @FXML
    private Text hindfootValgusRNormals;

    @FXML
    private Text hindfootValgusRValue;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        hindfootValgusRValue.setText("-2.59");
        hindfootValgusRInterp.setText("Normal");
        hindfootValgusLValue.setText("2.36");
        hindfootValgusLInterp.setText("Normal");
        halluxFlexRValue.setText("2.92");
        halluxFlexRInterp.setText("");
        halluxFlexLValue.setText("-5.93");
        halluxFlexLInterp.setText("");
        archIndexRValue.setText("0.22");
        archIndexRInterp.setText("Low");
        archIndexLValue.setText("0.27");
        archIndexLInterp.setText("Normal");
        halluxValgusRValue.setText("-1.35");
        halluxValgusRInterp.setText("");
        halluxValgusLValue.setText("4.12");
        halluxValgusLInterp.setText("");
        forefootSupRValue.setText("9.58");
        forefootSupRInterp.setText("");
        forefootSupLValue.setText("14.92");
        forefootSupLInterp.setText("");
        footaddRValue.setText("-0.61");
        footaddRInterp.setText("Adducted");
        footaddLValue.setText("-4.37");
        footaddLInterp.setText("Normal");
    }
}

package com.example.gaitlabapp.controllers.Forms.Compendium;

import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CompendiumPtHistoryController implements Initializable {
    public Text surgicalHisDate;
    public Text surgicalHisProcedure;
    public Text surgicalHisSide;
    public Text surgicalHisMd;
    public Text surgicalHisFacility;
    public Text surgicalHisComments;
    public Text botoxLocation;
    public Text botoxDate;
    public Text botoxSide;
    public Text botoxMd;
    public Text botoxFacility;
    public Text healthAge;
    public Text healthHistCondition;
    public Text healthCondition;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        surgicalHisDate.setText("1/1/2025");
        surgicalHisDate.setText("Adductor");
        surgicalHisSide.setText("L");
        surgicalHisMd.setText("test");
        surgicalHisFacility.setText("test facility");
        surgicalHisComments.setText("lkfdslkal");

        botoxDate.setText("2/1/2025");
        botoxLocation.setText("Adductor");
        botoxSide.setText("L");

        healthAge.setText("4 years");
        healthCondition.setText("Asphyxia");
        healthHistCondition.setText("Heart Problems");

    }
}

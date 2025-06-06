package com.example.gaitlabapp.controllers.Visits.TestVisit;

import javafx.fxml.Initializable;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.ResourceBundle;

public class CompendiumLower2 implements Initializable {
    public Text msAmbulationScale;
    public Text msGMFCS;
    public Text msFMS5;
    public Text msFMS50;
    public Text msFMS500;
    public Text msMACS;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        msFMS5.setText("3-- Uses Crutches");
        msFMS50.setText("5 -- Independent on level surfaces (Requires a rail for stairs");
        msFMS500.setText("6 -- Independent on all surfaces");
        msAmbulationScale.setText("1 -- Independent ambulation all environments, no use of an assistive device or wheelchair");

    }
}

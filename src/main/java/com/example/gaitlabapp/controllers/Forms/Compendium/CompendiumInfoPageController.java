package com.example.gaitlabapp.controllers.Forms.Compendium;

import javafx.fxml.Initializable;
import javafx.scene.control.Label;

import java.net.URL;
import java.util.ResourceBundle;

public class CompendiumInfoPageController implements Initializable {
    public Label fName;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        fName.setText("Test Test");
    }
}

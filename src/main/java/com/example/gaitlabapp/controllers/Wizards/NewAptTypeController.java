package com.example.gaitlabapp.controllers.Wizards;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class NewAptTypeController {
    public Button newApt;
    public Button cancelApt;
    public AnchorPane newAptType;

    public void onCancel(){
        this.newAptType.getScene().getWindow().hide();
    }
}

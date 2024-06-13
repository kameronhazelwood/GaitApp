package com.example.gaitlabapp.controllers.Wizards;

import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

public class EditAptTypeController {
    public Button saveEdits;


    public Button cancelEdits;
    public AnchorPane editAptType;

    public void onCancel(){
        this.editAptType.getScene().getWindow().hide();
    }
}

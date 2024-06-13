package com.example.gaitlabapp.controllers.Wizards;

import javafx.event.ActionEvent;
import javafx.scene.layout.AnchorPane;

public class EditResourceController {
    public AnchorPane newAptResource;


    public void onCancelResource(ActionEvent event) {
        this.newAptResource.getScene().getWindow().hide();
    }
}

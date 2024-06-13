package com.example.gaitlabapp.controllers.Wizards;

import javafx.scene.layout.AnchorPane;

public class NewResourceController {
    public AnchorPane newResource;


    public void onCancel(){
        this.newResource.getScene().getWindow().hide();
    }


}

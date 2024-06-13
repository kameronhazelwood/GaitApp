package com.example.gaitlabapp.controllers;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class LogoutController {

    @FXML
    private AnchorPane scenePane;

    Stage stage;

    public void logout(ActionEvent event){
        stage = (Stage) scenePane.getScene().getWindow();
        System.out.println("You successfully logged out");
        stage.close();
    }
}

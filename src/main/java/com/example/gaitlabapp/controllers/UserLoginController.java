package com.example.gaitlabapp.controllers;


import com.example.gaitlabapp.GaitLabAppApplication;
import com.example.gaitlabapp.services.PatientService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.IOException;
import java.util.Optional;

public class UserLoginController {

    @FXML
    public TextField nameTextField;
    @FXML
    public Button loginButton;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
//    Timeline alertTimer = new Timeline(new KeyFrame(Duration.minutes(1), event1 -> {
//
//    }));
    Timeline alertTimer;


    public void login(ActionEvent event) throws IOException{

        FXMLLoader loader = new FXMLLoader(GaitLabAppApplication.class.getResource("/PatientModule.fxml"));
        root = loader.load();
        stage = (Stage) ((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Patient Module");
        stage.setHeight(750);
        stage.setWidth(1050);
        stage.setScene(scene);
        stage.show();
        alertTimer = new Timeline(new KeyFrame(Duration.hours(1), event1 -> {
            showAlert();
        }));
    }

    public void showAlert(){
        Platform.runLater(()-> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You're about to be logged out!");
            alert.setContentText("Are you sure you would like to logout?");
            Optional<ButtonType> result = alert.showAndWait();

            if(result.isEmpty()){
                alertTimer.play();
            }else if(result.get() == ButtonType.OK){
                stage = (Stage) root.getScene().getWindow();
                stage.close();
            } else if (result.get() == ButtonType.CANCEL) {
                alertTimer.play();
            }
        });
    }

}

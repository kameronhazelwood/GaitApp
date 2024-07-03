package com.example.gaitlabapp.controllers;


import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.services.PatientService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.util.Duration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;



public class UserLoginController implements Initializable {

    @FXML
    public TextField nameTextField;
    @FXML
    private Button loginButton;


    private ApplicationContext context;
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


    public UserLoginController(Stage stage) throws IOException {
        try {

            FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/UserLogin.fxml"));
            fxmlLoader.setController(UserLoginController.class);
            Parent root = fxmlLoader.load();
//            Parent root = load("UserLogin.fxml", this);

            Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

            stage.getIcons().add(icon);
            stage.setTitle("Login");
            stage.setWidth(450);
            stage.setHeight(250);

            stage.setScene(new Scene(root));
            stage.setResizable(false);
            stage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        loginButton.setOnAction(event -> {
            try {
                login(event);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        });
    }



   @FXML
    private void openPatientModule(ActionEvent event){

    }

    @FXML
    public void login(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader(Launcher.class.getResource("/PatientModule.fxml"));
        root = loader.load();
       stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
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

    public void showAlert() {
        Platform.runLater(() -> {
            Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
            alert.setTitle("Logout");
            alert.setHeaderText("You're about to be logged out!");
            alert.setContentText("Are you sure you would like to logout?");
            Optional<ButtonType> result = alert.showAndWait();

            if (result.isEmpty()) {
                alertTimer.play();
            } else if (result.get() == ButtonType.OK) {
                stage = (Stage) root.getScene().getWindow();
                stage.close();
            } else if (result.get() == ButtonType.CANCEL) {
                alertTimer.play();
            }
        });
    }

 //   public static Parent load(final String location, Object controller) throws IOException{
//        FXMLLoader loader = new FXMLLoader(load(location));
//        if (controller!=null){
//            loader.setController(controller);
//        }
//        return loader.load();
//
//    }
//
//    public static URL load(final String location){
//        return Launcher.class.getResource(location);
//    }


}

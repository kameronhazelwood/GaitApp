package com.example.gaitlabapp.controllers;


import com.example.gaitlabapp.FxApplicationLauncher;
import com.example.gaitlabapp.services.PatientService;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
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
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import javax.swing.*;
import java.io.IOException;
import java.net.URL;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Consumer;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class UserLoginController  {
    @FXML
    public TextField nameTextField;
    @FXML
    private Button loginButton;
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
    @Autowired
    ConfigurableApplicationContext applicationContext;

    @FXML
    public void login(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/PatientModule.fxml"));
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

}

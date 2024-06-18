package com.example.gaitlabapp.controllers;

import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class FxViewController implements Initializable {
    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void start(Stage primaryStage) throws Exception {
        try {
            FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/UserLogin.fxml"));
            Parent root = fxmlLoader.load();

            Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

            primaryStage.getIcons().add(icon);
            primaryStage.setTitle("Login");
            primaryStage.setWidth(450);
            primaryStage.setHeight(250);

            primaryStage.setScene(new Scene(root));
            primaryStage.show();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }


}

package com.example.gaitlabapp;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import com.example.gaitlabapp.GaitLabAppApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.SecurityProperties;
import org.springframework.context.ConfigurableApplicationContext;

import java.io.IOException;
import java.util.Optional;

@SpringBootApplication
public class GaitApp extends Application {


    public static void main(String[] args){
        launch(args);
    }

    @Override
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

    private static final Optional<ConfigurableApplicationContext> SPRING_CONTEXT = Optional.empty();
    public static Optional<?> findBean(Class<?> type){
        return SPRING_CONTEXT.map(context -> context.getBean(type));
    }

}

package com.example.gaitlabapp;

import com.example.gaitlabapp.controllers.FxViewController;
import com.example.gaitlabapp.controllers.UserLoginController;
import com.example.gaitlabapp.events.StartUpEvent;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.io.IOException;
import java.util.Optional;

@SpringBootApplication
@EnableJpaRepositories("com.example.gaitlabapp.repo")
//@ComponentScan("com.example.gaitlabapp.repo")
public class FxApplication extends Application {

    private static String[] ARGS = null;

    private static Optional<ConfigurableApplicationContext> SPRING_CONTEXT = Optional.empty();

    public static void main(String[] args){
        launch(args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        fireStartUpEvent(new StartUpEvent(stage));
    }

    @Override
    public void init() throws Exception{
        super.init();
        ARGS = getParameters()
                .getRaw()
                .toArray(new String[0]);
        start();
    }

    public static String[] getArgs(){
        return ARGS;
    }

    public static Optional<?> findBean(Class<?> type){
        return SPRING_CONTEXT.map(context -> context.getBean(type));
    }

    private void fireStartUpEvent(ApplicationEvent event){
        SPRING_CONTEXT.ifPresentOrElse(context -> context.publishEvent(event), () ->{
        });
    }

    private void start(){
        SPRING_CONTEXT = Optional.ofNullable(
                new SpringApplicationBuilder(FxApplication.class).run(getArgs())
        );
    }

}

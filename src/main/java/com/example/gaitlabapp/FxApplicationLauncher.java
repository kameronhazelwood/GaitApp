package com.example.gaitlabapp;


import com.example.gaitlabapp.config.HostServicesProvider;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.PatientService;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.*;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;

import java.io.IOException;

@SpringBootApplication
@EnableJpaRepositories("com.example.gaitlabapp.repo")
public class FxApplicationLauncher {
    public static void main(String[] args) {

        Application.launch(FxApplication.class, args);

    }
    public static class FxApplication extends Application {
        private ConfigurableApplicationContext context;


        @Override
        public void init() throws IOException {


            context = new SpringApplicationBuilder()
                    .sources(FxApplicationLauncher.class)
                    .initializers((ApplicationContextInitializer<GenericApplicationContext>) applicationContext -> {
                        applicationContext.registerBean(Application.class, () -> this);
                        applicationContext.registerBean(Parameters.class, this::getParameters);
                        applicationContext.registerBean(HostServices.class, this::getHostServices);
                    })
                    .run(getParameters().getRaw().toArray(new String[0]));
        }
        @Override
        public void start(Stage stage) throws IOException {
            try {
                  this.context.publishEvent(new StageIsReadyEvent(stage));
                HostServicesProvider.setHostServices(getHostServices());
            } catch (Throwable t) {
                t.printStackTrace();
            }
        }
        @Override
        public void stop() throws Exception {
            context.close();
            Platform.exit();
            System.exit(0);
        }
        @Component
        public static class FxApplicationStageIsReadyListener implements ApplicationListener<StageIsReadyEvent>{
            @Value("${spring.application.name}")
            private  String applicationTitle;
            private final ConfigurableApplicationContext applicationContext;

            public  FxApplicationStageIsReadyListener(
                    @Value("${spring.application.name}") String applicationTitle,
                    ConfigurableApplicationContext applicationContext) {

                this.applicationTitle = applicationTitle;
                this.applicationContext = applicationContext;
        }
            @Override
            public void onApplicationEvent(StageIsReadyEvent event) {
                try {
                    System.out.println("java version: "+System.getProperty("java.version"));
                    System.out.println("javafx.version: " + System.getProperty("javafx.version"));
                    FXMLLoader fxmlLoader = new FXMLLoader();
                    fxmlLoader.setControllerFactory(applicationContext::getBean);

                    fxmlLoader.setLocation(getClass().getResource("/UserLogin.fxml"));
                    Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

                    Parent root = fxmlLoader.load();
                    Scene scene = new Scene(root, 450, 240);
                    Stage stage = event.getStage();
                    stage.getIcons().add(icon);
                    stage.setScene(scene);
                    stage.setTitle(this.applicationTitle);
                    stage.show();
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        public static class StageIsReadyEvent extends ApplicationEvent {
            public Stage getStage() {
                return (Stage) getSource();
            }

            public StageIsReadyEvent(Stage source) {
                super(source);
            }
        }

    }

}







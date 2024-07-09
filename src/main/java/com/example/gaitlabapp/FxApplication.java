package com.example.gaitlabapp;


import com.example.gaitlabapp.controllers.UserLoginController;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.example.gaitlabapp.repo")
@ComponentScan(basePackageClasses={FxApplication.class, UserLoginController.class})
public class FxApplication extends Application  {
    private ConfigurableApplicationContext springContext;
    private Parent root;
    @Autowired
    PatientRepo patientRepo;
    public static void main(String[] args){
        launch(FxApplication.class, args);
    }

    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader.setControllerFactory(springContext::getBean);
        fxmlLoader.setLocation(getClass().getResource("/UserLogin.fxml"));
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        Parent root = fxmlLoader.load();
        stage.setTitle("User Login");
        Scene scene = new Scene(root);
        stage.setScene(scene);
        stage.show();
    }

    @Override
    public void init() throws Exception{
      springContext = SpringApplication.run(FxApplication.class);

    }

    @Override
    public void stop() throws Exception{
        springContext.close();
    }

//    @Override
//    public void run(String... args) throws Exception {
//        IPatientModel patient = new IPatientModel();
//        patient.setFirstName("TestSpring2");
//        patient.setLastName("LastNameTest2");
//
//        patientRepo.save(patient);
//
//    }
}

package com.example.gaitlabapp.controllers;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.PatientService;
import com.example.gaitlabapp.services.impl.PatientServiceImpl;
import jakarta.persistence.criteria.CriteriaBuilder;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.scheduling.config.Task;
import org.springframework.stereotype.Component;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.sql.*;
import java.util.Objects;
import java.util.Optional;
import java.util.ResourceBundle;
import java.util.function.Predicate;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class NewPatientModuleController implements Initializable {

    @Autowired
    ConfigurableApplicationContext applicationContext;
    @FXML
    public Pane newPatientPane;
    @FXML
    public Button saveNewPatient;
    @FXML
    public TextField gender;
    @FXML
    public TextField referringPhys;
    @FXML
    public TextField formerLName;
    @FXML
    public TextField address;
    @FXML
    public TextField preferredName;
    @FXML
    public int patientId;
    @FXML
    public TextField lName;
    @FXML
    public TextField fName;
    @FXML
    public TextField mrn;
    @FXML
    public TextField dob;
    @FXML
    public AnchorPane scenePane;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @Autowired
    private final PatientService patientService;
    String mrnNumber = "9988";



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        mrn.setText(" " + "-" + mrnNumber);

        dob.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov, String t, String t1) {
                if(t1.length() == 2 || t1.length() == 6){
                    dob.setText(t1+" " + "/");
                }
            }
        });
    }

    @FXML
    public void onSaveNewPatient(ActionEvent event) throws SQLException {
        try {
            if (fName != null && lName != null) {
                IPatientModel patient = new IPatientModel();
                patient.setFirstName(fName.getText());
                patient.setLastName(lName.getText());
                System.out.println(lName.getText());
                patient.setDob(dob.getText());
                patient.setMrn(mrn.getText());
                patient.setFormerLastName(formerLName.getText());
                patient.setPreferredFirstName(preferredName.getText());




                // Specify the Directory Name
                String directoryName = fName.getText() + ", " + lName.getText()+ ", " + mrn.getText();
                String pngFiles = "PNG Files";
                String imagesName = "Patient Photos";
                String dataValues = "Data";

                // Address of Current Directory
                Path currentDirectory = Paths.get("C:\\dev\\GaitApp\\PatientDocuments");

                // Specify the path of the directory to be created
                String directoryPath = currentDirectory + File.separator + directoryName;
                String pngFilesPath = directoryPath + File.separator + pngFiles;
                String imagesPath = directoryPath + File.separator + imagesName;
                String dataPath = directoryPath + File.separator + dataValues;

                // Create a File object representing the directory
                File directory = new File(directoryPath);
                File pngDirectory = new File(pngFilesPath);
                File imagesDirectory = new File(imagesPath);
                File dataDirectory =  new File(dataPath);

                // Attempt to create the directory
                boolean directoryCreated = directory.mkdir();
                boolean pngDirectoryCreated = pngDirectory.mkdir();
                boolean imagesDirectoryCreated = imagesDirectory.mkdir();
                boolean dataDirectoryCreated = dataDirectory.mkdir();

                if (directoryCreated) {
                    System.out.println("Directory created successfully at: " + directoryCreated);
                    System.out.println(directoryName);
                } else {
                    System.out.println("Failed to create directory. It may already exist at: " + directoryCreated);
                }

                if (pngDirectoryCreated) {
                    System.out.println("Directory created successfully at: " + pngDirectoryCreated);
                    System.out.println(directoryName);
                } else {
                    System.out.println("Failed to create directory. It may already exist at: " + pngDirectoryCreated);
                }

                if (imagesDirectoryCreated) {
                    System.out.println("Directory created successfully at: " + imagesDirectoryCreated);
                    System.out.println(directoryName);
                } else {
                    System.out.println("Failed to create directory. It may already exist at: " + imagesDirectoryCreated);
                }

                if (dataDirectoryCreated) {
                    System.out.println("Directory created successfully at: " + dataDirectoryCreated);
                    System.out.println(directoryName);
                } else {
                    System.out.println("Failed to create directory. It may already exist at: " + dataDirectoryCreated);
                }

                patientService.save(patient);

            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Required Fields. ");
                alert.setContentText("First Name, Last Name and Date of Birth is required. ");
                alert.show();
            }
            clearFields();

        } catch (Throwable t) {
            t.printStackTrace();
        }


    }

    public void clearFields() {
        fName.clear();
        lName.clear();
        dob.clear();
        formerLName.clear();
        preferredName.clear();
        mrn.clear();
        mrn.setText(" " + "-" + mrnNumber);
    }

    @FXML
    public void onPatientClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/PatientModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));
        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onFormClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/FormsModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onSchedulerClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/SchedulerModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onReportClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/ReportsModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onAdminClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/AdminModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onQueriesClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/QueriesModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));


        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    public void OnNewPatientClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/NewPatientModule.fxml"));
        Parent root = loader.load();

        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void logout(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
    }


    public void onSaveAndSchedule(ActionEvent event) throws IOException {
        try {
            if (fName != null && lName != null) {
                IPatientModel patient = new IPatientModel();
                patient.setFirstName(fName.getText());
                patient.setLastName(lName.getText());
                patient.setDob(dob.getText());
                patient.setMrn(mrn.getText());
                patient.setFormerLastName(formerLName.getText());
                patient.setPreferredFirstName(preferredName.getText());
                patientService.save(patient);
            }else {
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Required Fields. ");
                alert.setContentText("First Name, Last Name and Date of Birth is required. ");
                alert.show();
            }
            clearFields();

        } catch (Throwable t) {
            t.printStackTrace();
        }

        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/SchedulerModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();


    }
}

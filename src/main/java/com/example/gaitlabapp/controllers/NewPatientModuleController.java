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
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
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

import java.io.IOException;
import java.net.URL;
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


    Integer recordNumber = 1;
    Integer newVersion = recordNumber++;
    Pattern mrnPattern = Pattern.compile("-99887");
    Integer mrnNumber = 99887;
    Integer mrnIncrease = mrnNumber++;


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        // mrn.setText(recordNumber + mrnNumber);
//        System.out.println(recordNumber);
//        System.out.println(newVersion);
    }



    @FXML
    public void onSaveNewPatient(ActionEvent event) throws SQLException {
        try {
            if (fName != null) {
                IPatientModel patient = new IPatientModel();
                patient.setFirstName(fName.getText());
                patient.setLastName(lName.getText());
                patient.setDob(dob.getText());
                patient.setMrn(mrn.getText());
                patient.setFormerLastName(formerLName.getText());
                patient.setPreferredFirstName(preferredName.getText());
                patientService.save(patient);
            }
//            recordNumber++;
//            mrnNumber++;
//
//            mrn.setText(recordNumber + "-" + mrnNumber);
//
//            Integer currentNumber = recordNumber + mrnNumber;
//            System.out.println(currentNumber);
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
    }

    public void mrnNumberPattern() {

    }

    private void saveAlert(Optional<IPatientModel> patientModel) {

        Alert alert = new Alert(Alert.AlertType.INFORMATION);
        alert.setTitle("User saved successfully.");
        alert.setHeaderText(null);
        // alert.setContentText("The user "+patientModel.getFirstName()+" "+patientModel.getLastName() +" has been created and \n"+getGenderTitle(user.getGender())+" id is "+ user.getId() +".");
        alert.showAndWait();
    }

    private boolean validate(String field, String value, String pattern) {
        if (!value.isEmpty()) {
            Pattern p = Pattern.compile(pattern);
            Matcher m = p.matcher(value);
            if (m.find() && m.group().equals(value)) {
                return true;
            } else {
                validationAlert(field, false);
                return false;
            }
        } else {
            validationAlert(field, true);
            return false;
        }
    }

    private boolean emptyValidation(String field, boolean empty) {
        if (!empty) {
            return true;
        } else {
            validationAlert(field, true);
            return false;
        }
    }

    private void validationAlert(String field, boolean empty) {
        Alert alert = new Alert(Alert.AlertType.WARNING);
        alert.setTitle("Validation Error");
        alert.setHeaderText(null);
        if (field.equals("Role")) alert.setContentText("Please Select " + field);
        else {
            if (empty) alert.setContentText("Please Enter " + field);
            else alert.setContentText("Please Enter Valid " + field);
        }
        alert.showAndWait();
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


}

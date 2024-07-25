package com.example.gaitlabapp.controllers;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.PatientService;
import com.example.gaitlabapp.services.impl.PatientServiceImpl;
import javafx.application.Application;
import javafx.application.HostServices;
import javafx.application.Platform;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
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
import java.sql.*;
import java.util.Objects;
import java.util.Optional;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class NewPatientModuleController {

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
    ObjectProperty<IPatientModel> newPatients = new SimpleObjectProperty<>();
    private final PatientService patientService;

    @FXML
    public void onSaveNewPatient(ActionEvent event) throws SQLException {
        try{
            if (fName != null) {
                IPatientModel patient = new IPatientModel();
                patient.setFirstName(fName.getText());
                patient.setLastName(lName.getText());
                patient.setDob(dob.getText());
                patient.setMrn(mrn.getText());
                patient.setFormerLastName(formerLName.getText());
                patient.setPreferredFirstName(preferredName.getText());
                System.out.println(patient);
                System.out.println(patientService);
                patientService.save(patient);


            }
        } catch(Throwable t){
            t.printStackTrace();
        }




//        connection = db.getDBConnection();
//        String fname = fName.getText();
//        String lname = lName.getText();
//        String DOB = dob.getText();
//        String MRN = mrn.getText();
//
//        if(fname.isEmpty() || lname.isEmpty() || MRN.isEmpty() || DOB.isEmpty() ){
//            Alert alert = new Alert(Alert.AlertType.ERROR);
//            alert.setHeaderText(null);
//            alert.setContentText("First Name, DOB, MRN,  and Last name are required fields.");
//            alert.showAndWait();
//        }else {
//            createPatients();
//            cleanQuery();
//        }
    }

//    @FXML
//    public void createPatients() {
//        javafx.concurrent.Task<IPatientModel> task = new Task() {
//            @Override
//            protected IPatientModel call() throws Exception{
//                IPatientModel patientModel = new IPatientModel();
//
//                patientModel.setFirstName(fName.getText());
//                Optional<IPatientModel> newPatient = patientService.save(patientModel);
//                return newPatient;
//            }
//        };


//        IPatientModel patientModel = new IPatientModel();
//
//        patientModel.setFirstName("");
//        patientModel.setLastName(patientModel.getLastName());
//        IPatientModel newPatient = patientRepo.save(patientModel);
//        saveAlert(Optional.of(newPatient));


//          String SQL =  "INSERT INTO Patients( firstName, lastName, MRN, DOB) VALUES(?,?,?, ?);";
//
//        try{
//
//            connection = db.getDBConnection();
//            PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);
//
//            ps.setString(1, fName.getText());
//            ps.setString(2, lName.getText());
//            ps.setString(3, mrn.getText());
//            ps.setString(4, dob.getText());
//
//            int affectedRows = ps.executeUpdate();
//
//            ResultSet rs = ps.getGeneratedKeys();
//            if(rs.next()){
//                patientId = rs.getInt(1);
//            }
//
//            if(affectedRows == 0 ){
//                throw new SQLException("Creating user failed, no rows affected");
//            }
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
    //   }
    //   private void cleanQuery(){
//        fName.setText(null);
//        lName.setText(null);
//        mrn.setText(null);
//        dob.setText(null);
    //   }


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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/PatientModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/FormsModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/SchedulerModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/ReportsModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/AdminModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/QueriesModule.fxml")));
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
        FXMLLoader fxmlLoader = new FXMLLoader();
        Parent root = fxmlLoader.load(Objects.requireNonNull(Launcher.class.getResource("/NewPatientModule.fxml")));

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

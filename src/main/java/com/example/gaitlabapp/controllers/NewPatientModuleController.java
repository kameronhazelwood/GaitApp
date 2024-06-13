package com.example.gaitlabapp.controllers;

import com.example.gaitlabapp.GaitLabAppApplication;
import com.example.gaitlabapp.config.Config;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.sql.*;
import java.util.Objects;

public class NewPatientModuleController {

    public Button saveNewPatient;
    public TextField gender;
    public TextField referringPhys;
    public TextField formerLName;
    public TextField address;

    public TextField preferredName;
    @FXML
    public int patientId;
    public TextField lName;
    public TextField fName;
    public TextField mrn;
    public TextField dob;
    public AnchorPane scenePane;

    private Stage stage;

    private Scene scene;
    Connection connection = null;
    Config db = new Config();

    @FXML
    public void onSaveNewPatient() throws SQLException {
        connection = db.getDBConnection();
        String fname = fName.getText();
        String lname = lName.getText();
        String DOB = dob.getText();
        String MRN = mrn.getText();

        if(fname.isEmpty() || lname.isEmpty() || MRN.isEmpty() || DOB.isEmpty() ){
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setHeaderText(null);
            alert.setContentText("First Name, DOB, MRN,  and Last name are required fields.");
            alert.showAndWait();
        }else {
            createPatients();
            cleanQuery();
        }
    }
    public void createPatients() throws SQLException {
          String SQL =  "INSERT INTO Patients( firstName, lastName, MRN, DOB) VALUES(?,?,?, ?);";

        try{

            connection = db.getDBConnection();
            PreparedStatement ps = connection.prepareStatement(SQL, Statement.RETURN_GENERATED_KEYS);

            ps.setString(1, fName.getText());
            ps.setString(2, lName.getText());
            ps.setString(3, mrn.getText());
            ps.setString(4, dob.getText());

            int affectedRows = ps.executeUpdate();

            ResultSet rs = ps.getGeneratedKeys();
            if(rs.next()){
                patientId = rs.getInt(1);
            }

            if(affectedRows == 0 ){
                throw new SQLException("Creating user failed, no rows affected");
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }
    private void cleanQuery(){
        fName.setText(null);
        lName.setText(null);
        mrn.setText(null);
        dob.setText(null);
    }

    @FXML
    public void onPatientClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/PatientModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
    public  void onFormClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/FormsModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
    public  void onSchedulerClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/SchedulerModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
    public  void onReportClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/ReportsModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
    public  void onAdminClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/AdminModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
    public  void onQueriesClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/QueriesModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
       Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));


        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    public  void OnNewPatientClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/NewPatientModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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
    public void logout(ActionEvent event){

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Logout");
        alert.setHeaderText("You're about to logout!");
        alert.setContentText("Are you sure you would like to logout?");

        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
        }
    }


}

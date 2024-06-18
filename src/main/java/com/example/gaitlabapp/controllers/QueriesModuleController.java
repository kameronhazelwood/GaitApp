package com.example.gaitlabapp.controllers;


import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.config.Config;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;

public class QueriesModuleController implements Initializable {


    public Button runQuery;
    public ListView listview;
    public Button exportToCsv;
    public TextArea output;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private AnchorPane scenePane;

    private final String[] operator = {" > ", " < ", " = ", "Starts with", "Ends with"};
    private final String[] testDataField = {"First Name", "Last Name", "Age"};
    @FXML
    private ChoiceBox<String> operatorChoiceBox;
    @FXML
    private ChoiceBox<String> dataFieldsChoiceBox;
    Connection connection = null;
    Config db = new Config();
    Statement statement = null;
    ResultSet resultSet;
    private final ObservableList<IPatientModel> patientList = FXCollections.observableArrayList();


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        operatorChoiceBox.getItems().addAll(operator);
        dataFieldsChoiceBox.getItems().addAll(testDataField);


    }


    public void exportToCSV(ActionEvent event) {

    }

//    public void onRunQuery(ActionEvent event) {
//        try{
//            connection = db.getDBConnection();
//            statement = connection.createStatement();
//            resultSet = statement.executeQuery("SELECT * FROM Patients");
//
//            while (resultSet.next()){
//                patientList.add(new IPatientModel(
//                        resultSet.getString("MRN"),
//                        resultSet.getString("lastName"),
//                        resultSet.getString("firstName"),
//                        resultSet.getInt("address"),
//                        resultSet.getString("city"),
//                        resultSet.getString("state"),
//                        resultSet.getString("DOB"),
//                        resultSet.getString("Gender"),
//                        resultSet.getString("comments"),
//                        resultSet.getString("genDiagnosis"),
//                        resultSet.getString("formerLastName"),
//                        resultSet.getString("prefferedFirstName")

//            }
//            listview.setItems(patientList);
//
//        } catch (SQLException e) {
//            throw new RuntimeException(e);
//        }
//
//    }

    @FXML
    public  void onFormClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/FormsModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public  void onSchedulerClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/SchedulerModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public  void onReportClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/ReportsModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public  void onAdminClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/AdminModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onPatientClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/PatientModule.fxml")));
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

    public  void OnNewPatientClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/NewPatientModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
        stage.setScene(scene);
        stage.show();
    }

}

package com.example.gaitlabapp.controllers;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.ButtonType;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class FormModuleController implements Initializable {

    public CheckBox chooseFormsCheckBox;

    public TextField changeDateTextfield;
    public CheckBox patientNams;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;

    @FXML
    private AnchorPane scenePane;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        patientNams.setSelected(true);
        changeDateTextfield.setText("04/03/2024");

    }

    public void onChoosePatients(MouseEvent event)throws IOException{
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/PatientFormsQuest/ChooseFilesAuto.fxml")));
        Stage stage1 = new Stage();
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));


        stage1.setTitle("Choose Patient Forms to Print:   ");
        stage1.getIcons().add(icon);
        //height 680 width 800
        stage1.setScene(new Scene(popUp, 800, 680));
        stage1.show();

    }
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


    public void onSchedulerClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/SchedulerModule.fxml")));
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

    public void onReportsClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/ReportsModule.fxml")));
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

    public void onAdminClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/AdminModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/QueriesModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
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

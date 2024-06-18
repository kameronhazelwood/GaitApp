package com.example.gaitlabapp.controllers;


import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class AdminModuleController {


    public Button newUserButton;
    public Button editUserButton;
    public Button deleteUserButton;
    public Button deleteAptTypeButton;
    public Button deleteResourceButton;
    public Button editResourceButton;
    public Button newResourceButton;
    public Button newAptTypeButton;
    public Button editAptTypeButton;
    public Button editTemplateButton;
    public Button newTemplateButton;
    public Button deleteTemplateButton;

    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    private Parent root;
    @FXML
    private AnchorPane scenePane;



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

    @FXML
    public  void onFormClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/FormsModule.fxml")));
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

    @FXML
    public  void onReportClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/ReportsModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(100);
//        stage.setY(100);
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
    public void OnNewPatientClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/NewPatientModule.fxml")));
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onDeleteButton(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Change");
       // alert.setHeaderText("Are you sure you wish to delete ");
        //will add in username
        alert.setHeaderText("Are you sure you wish to delete user?");
        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
        }
    }
    @FXML
    public void onEditButton() throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Wizards/EditUserWizard.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Edit User Information");
        stage1.setScene(new Scene(popUp, 600, 450));
        stage1.show();
    }
    @FXML
    public void onNewButton() throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Wizards/NewUserWizard.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("New User Information");
        stage1.setScene(new Scene(popUp, 600, 450));
        stage1.show();
    }
    @FXML
    public void onEditAptType() throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Wizards/EditAptTypeWizard.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Edit Appointment Type");
        stage1.setScene(new Scene(popUp, 330, 120));
        stage1.show();
    }

    @FXML
    public void onNewAptType() throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Wizards/NewAptTypeWizard.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("New Appointment Type");
        stage1.setScene(new Scene(popUp, 330, 120));
        stage1.show();
    }
    @FXML
    public void onDeleteAptType(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Delete");
        // alert.setHeaderText("Are you sure you wish to delete ");
        //will add in username
        alert.setHeaderText("Are you sure you wish to delete this Appointment Type?");
        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
        }
    }
    public void onEditResource() throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Wizards/EditResourceWizard.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Edit Appointment Resource");
        stage1.setScene(new Scene(popUp, 330, 120));
        stage1.show();
    }
    public void onNewResource() throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Wizards/NewResourceWizard.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("New Appointment Resource");
        stage1.setScene(new Scene(popUp, 330, 120));
        stage1.show();
    }
    public void onDeleteResource(){
        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.setTitle("Confirm Delete");
        // alert.setHeaderText("Are you sure you wish to delete ");
        //will add in resource name
        alert.setHeaderText("Are you sure you wish to delete this Appointment Resource?");
        if(alert.showAndWait().get() == ButtonType.OK) {
            stage = (Stage) scenePane.getScene().getWindow();
        }
    }


}

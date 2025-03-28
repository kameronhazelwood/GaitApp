package com.example.gaitlabapp.controllers;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.controllers.Visits.TestVisit.GaitTestVisitController;
import javafx.beans.binding.Bindings;
import javafx.beans.value.ObservableStringValue;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;
@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class FormModuleController implements Initializable {

    public CheckBox history;
    public Button start;
    public DatePicker aptDate;
    public ListView patientList;
    public CheckBox childPODSI;
    public CheckBox adolescentPODSI;
    public CheckBox sports;
    public CheckBox hip;
    public ComboBox<String> language;
    public ListView formsPatientList;
    @Autowired
    ConfigurableApplicationContext applicationContext;
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

    public void onClear(ActionEvent event) {
        patientList.getItems().clear();
    }


    public enum Form {HISTORY, CHILD_PODSI, ADULT_PODSI, SPORTS, HIP}
    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        language.getItems().addAll(
                "English ",
                "Spanish"
        );

        //start.setDisable(true);
       start.disableProperty().bind(history.selectedProperty().not().and(childPODSI.selectedProperty().not().and(adolescentPODSI.selectedProperty().not().and(sports.selectedProperty().not().and(hip.selectedProperty().not())))));

    }

    public void onSetDate(ActionEvent event) {
        patientList.getItems().addAll(
                "Rowan Hazelwood -- 33069893"
        );
    }

    public void onChangeDate(ActionEvent event){
        formsPatientList.getItems().addAll(
                "Rowan Hazelwood -- 33069893"
        );
    }

    public void onStart(ActionEvent event) throws IOException {
        if(history.isSelected()){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/MainPage.fxml"));
            // fxmlLoader.setControllerFactory(applicationContext::getBean);
            Parent popUp = fxmlLoader.load();

            Stage stage1 = new Stage((StageStyle.UTILITY));
            stage1.initModality(Modality.WINDOW_MODAL);
            stage1.setTitle("Questionnaire   ");
           // stage1.setFullScreen(true);
            stage1.setScene(new Scene(popUp, 950, 680));
            stage1.showAndWait();
        }
        if(childPODSI.isSelected()){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/ParentReported/MainPage.fxml"));
            // fxmlLoader.setControllerFactory(applicationContext::getBean);
            Parent popUp = fxmlLoader.load();

            Stage stage1 = new Stage((StageStyle.UTILITY));
            stage1.initModality(Modality.WINDOW_MODAL);
            stage1.setTitle("Questionnaire   ");
            // stage1.setFullScreen(true);
            stage1.setScene(new Scene(popUp, 950, 680));
            stage1.showAndWait();

        }
        if(adolescentPODSI.isSelected()) {
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/PODSI_Child/SelfReported/MainPage.fxml"));
            // fxmlLoader.setControllerFactory(applicationContext::getBean);
            Parent popUp = fxmlLoader.load();


            Stage stage1 = new Stage((StageStyle.UTILITY));
            stage1.initModality(Modality.WINDOW_MODAL);
            stage1.setTitle("Questionnaire   ");
            stage1.setFullScreen(true);
            stage1.setScene(new Scene(popUp, 950, 680));
            stage1.showAndWait();
        }
        if(sports.isSelected()){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Sports/MainPage.fxml"));
            // fxmlLoader.setControllerFactory(applicationContext::getBean);
            Parent popUp = fxmlLoader.load();

            Stage stage1 = new Stage((StageStyle.UTILITY));
            stage1.initModality(Modality.WINDOW_MODAL);
            stage1.setTitle("Questionnaire   ");
            // stage1.setFullScreen(true);
            stage1.setScene(new Scene(popUp, 950, 680));
            stage1.showAndWait();
        }
        if(hip.isSelected()){
            FXMLLoader fxmlLoader = new FXMLLoader();
            fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/Hip/MainPage.fxml"));
            // fxmlLoader.setControllerFactory(applicationContext::getBean);
            Parent popUp = fxmlLoader.load();

            Stage stage1 = new Stage((StageStyle.UTILITY));
            stage1.initModality(Modality.WINDOW_MODAL);
            stage1.setTitle("Questionnaire   ");
            // stage1.setFullScreen(true);
            stage1.setScene(new Scene(popUp, 950, 680));
            stage1.showAndWait();
        }

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
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/PatientModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
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
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Launcher.class.getResource("/SchedulerModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
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
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/ReportsModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
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
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/AdminModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
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
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/QueriesModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
        stage.setScene(scene);
        stage.show();
    }
    public void logout(ActionEvent event){
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
        //springContext.close();
    }

    public  void OnNewPatientClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/NewPatientModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
        stage.setScene(scene);
        stage.show();
    }
    @FXML
    public void onFormClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/FormsModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }


}

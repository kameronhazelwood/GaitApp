package com.example.gaitlabapp.controllers.Forms.Questionnaires.History;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.model.patients.IHealthHistoryModel;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.FileChooser;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HealthHistoryAddedRecord implements Initializable {
    public TableView<IHealthHistoryModel> healthHistoryTable;
    public TableColumn<IHealthHistoryModel, String> condition;
    public TableColumn<IHealthHistoryModel, String> conditionAge;
    public Button yesButton;
    public Button noButton;

    private Stage getMyStage() { return (Stage) yesButton.getScene().getWindow(); }

    ObservableList<IHealthHistoryModel> initialData() {
        IHealthHistoryModel hh1 = new IHealthHistoryModel(1, "Birth", "Asphyxia");
        return FXCollections.observableArrayList(hh1);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        conditionAge.setCellValueFactory((new PropertyValueFactory<IHealthHistoryModel, String>("conditionAge")));
        condition.setCellValueFactory((new PropertyValueFactory<IHealthHistoryModel, String>("condition")));
        healthHistoryTable.setItems(initialData());

    }


    public void onYesButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/HealthHistoryAddedRecords.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();

        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Questionnaire   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 950, 680));
        stage1.showAndWait();
        getMyStage().close();

    }

    public void onNoButton(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/HealthConditions.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();

        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Questionnaire   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 950, 680));
        stage1.showAndWait();
        getMyStage().close();
    }


}

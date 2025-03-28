package com.example.gaitlabapp.controllers.Forms.Questionnaires.History;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class HealthHistoryTable implements Initializable {
    public Button start;
    public ComboBox ageComboBox;

    private Stage getMyStage() { return (Stage) start.getScene().getWindow(); }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        ageComboBox.getItems().addAll(
                "Not Sure",
                "In Utero",
                "Birth",
                "2 Months",
                "4 Months",
                "6 Months",
                "12 Months",
                "18 Months",
                "2 Years",
                "3 Years",
                "4 Years",
                "5 Years",
                "6 Years",
                "7 Years",
                "8 Years",
                "9 Years",
                "10 Years",
                "11 Years",
                "12 Years",
                "13 Years",
                "14 Years",
                "15 Years",
                "16 Years",
                "17 Years",
                "18 Years"

        );
    }

    public void onAddRecord(ActionEvent event) throws IOException {
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

    public void onReturn(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/HealthHistory.fxml"));
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

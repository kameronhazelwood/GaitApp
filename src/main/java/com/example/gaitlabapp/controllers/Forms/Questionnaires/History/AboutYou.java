package com.example.gaitlabapp.controllers.Forms.Questionnaires.History;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;


import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AboutYou implements Initializable {
    public Button nextQuestion;
    public TextField youName;
    public ComboBox<String> relationshipToPatient;

    private Stage getMyStage() { return (Stage) nextQuestion.getScene().getWindow();}

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        youName.setText("Kam Hazelwood");
        relationshipToPatient.getItems().addAll(
                "Birth Mother",
                "Birth Father",
                "Birth Parent",
                "Adoptive Father",
                "Adoptive Mother",
                "Caretaker",
                "Family Friend",
                "Foster Parent",
                "Grandfather",
                "Grandmother",
                "Guardian",
                "Other Parent",
                "Patient",
                "Step-Father",
                "Step-Mother"
        );
        relationshipToPatient.setValue("Birth Parent");
    }
    public void onNextQuestion(ActionEvent event) throws IOException {
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

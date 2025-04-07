package com.example.gaitlabapp.controllers.Forms.Questionnaires.History;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;

public class WalkingSupport {
    public Button previousButton;
    public Button nextButton;
    public RadioButton tiresEasily;
    public RadioButton withoutSupport;
    public RadioButton requireSupport;

    private Stage getMyStageNext() { return (Stage) nextButton.getScene().getWindow(); }

    public void onPrevious(ActionEvent event) {
    }

    public void onNext(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/ShortDistances.fxml"));
        // fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent popUp = fxmlLoader.load();

        Stage stage1 = new Stage((StageStyle.UTILITY));
        stage1.initModality(Modality.WINDOW_MODAL);
        stage1.setTitle("Questionnaire   ");
        // stage1.setFullScreen(true);
        stage1.setScene(new Scene(popUp, 950, 680));
        stage1.showAndWait();
        getMyStageNext().close();
    }

    public void onrequireSupport(ActionEvent event) {
        if(requireSupport.isSelected()){
            tiresEasily.setSelected(false);
            withoutSupport.setSelected(false);
        }
    }

    public void onwithoutSupport(ActionEvent event) {
        if(withoutSupport.isSelected()){
            tiresEasily.setSelected(false);
            requireSupport.setSelected(false);
        }
    }

    public void ontiresEasily(ActionEvent event) {
        if(tiresEasily.isSelected()){
            requireSupport.setSelected(false);
            withoutSupport.setSelected(false);
        }
    }
}

package com.example.gaitlabapp.controllers.Forms.Questionnaires.History;

import com.example.gaitlabapp.Launcher;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.RadioButton;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class AroundClass implements Initializable {
    public Button previousButton;
    public Button nextButton;

    public RadioButton six;
    public RadioButton five;
    public RadioButton four;
    public RadioButton three;
    public RadioButton two;
    public RadioButton one;
    public RadioButton c;
    public RadioButton n;

    private Stage getMyStageNext() { return (Stage) nextButton.getScene().getWindow(); }

    public void onNext(ActionEvent event) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader();
        fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Forms/Questionnaires/History/LongDistances.fxml"));
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

    public void onPrevious(ActionEvent event) {
    }
    public void onSix(ActionEvent event) {
        if(six.isSelected()){
            five.setSelected(false);
            four.setSelected(false);
            three.setSelected(false);
            two.setSelected(false);
            one.setSelected(false);
            n.setSelected(false);
            c.setSelected(false);
        }
    }

    public void onfive(ActionEvent event) {
        if (five.isSelected()){
            six.setSelected(false);
            four.setSelected(false);
            three.setSelected(false);
            two.setSelected(false);
            one.setSelected(false);
            n.setSelected(false);
            c.setSelected(false);
        }
    }

    public void onFour(ActionEvent event) {
        if(four.isSelected()){
            five.setSelected(false);
            six.setSelected(false);
            three.setSelected(false);
            two.setSelected(false);
            one.setSelected(false);
            n.setSelected(false);
            c.setSelected(false);
        }
    }

    public void onThree(ActionEvent event) {
        if (three.isSelected()){
            five.setSelected(false);
            four.setSelected(false);
            six.setSelected(false);
            two.setSelected(false);
            one.setSelected(false);
            n.setSelected(false);
            c.setSelected(false);
        }
    }

    public void onTwo(ActionEvent event) {
        if(two.isSelected()){
            five.setSelected(false);
            four.setSelected(false);
            three.setSelected(false);
            six.setSelected(false);
            one.setSelected(false);
            n.setSelected(false);
            c.setSelected(false);
        }
    }

    public void onOne(ActionEvent event) {
        if(one.isSelected()){
            five.setSelected(false);
            four.setSelected(false);
            three.setSelected(false);
            two.setSelected(false);
            six.setSelected(false);
            n.setSelected(false);
            c.setSelected(false);
        }
    }

    public void onC(ActionEvent event) {
        if(c.isSelected()){
            five.setSelected(false);
            four.setSelected(false);
            three.setSelected(false);
            two.setSelected(false);
            one.setSelected(false);
            n.setSelected(false);
            six.setSelected(false);
        }
    }

    public void onN(ActionEvent event) {
        if(n.isSelected()){
            five.setSelected(false);
            four.setSelected(false);
            three.setSelected(false);
            two.setSelected(false);
            one.setSelected(false);
            six.setSelected(false);
            c.setSelected(false);
        }
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        three.setSelected(true);
    }
}

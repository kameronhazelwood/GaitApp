package com.example.gaitlabapp.controllers.Wizards;

import com.example.gaitlabapp.model.patients.IHealthHistoryModel;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddSeizureMedsController implements Initializable {
    public ComboBox<String> seizureDropDown;
    public Button addButton;
    public Button cancelButton;
    public AnchorPane addSeizure;
    private IHealthHistoryModel healthHistoryModel;


    @Override
    public void initialize(URL location, ResourceBundle resources) {

        seizureDropDown.getItems().addAll(
                "Depakote",
                "Dilantin",
                "Felbatol",
                "Klonopin",
                "Lamictal",
                "Neurontin",
                "Phenobarbital",
                "Tegretol/Carbatrol",
                "Topamax",
                "Zarontin"
        );

    }

    private Stage getMyStage(){
        return (Stage) addButton.getScene().getWindow();
    }
    public void onAddButton(ActionEvent event) {
        healthHistoryModel.setSeizure(seizureDropDown.getSelectionModel().getSelectedItem());

        getMyStage().close();
    }

    private void setAddSeizure(IHealthHistoryModel healthHistoryModel){
        this.healthHistoryModel = healthHistoryModel;

        seizureDropDown.setValue(healthHistoryModel.getSeizure());
    }

    public void onCancel(ActionEvent event) {this.addSeizure.getScene().getWindow().hide();}
}

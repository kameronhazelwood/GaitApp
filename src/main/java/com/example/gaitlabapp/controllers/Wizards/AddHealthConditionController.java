package com.example.gaitlabapp.controllers.Wizards;

import com.example.gaitlabapp.model.patients.IHealthHistoryModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddHealthConditionController {
    public AnchorPane addHealthCondition;
    public Button cancelButton;
    public Button saveButton;
    public TextField condition;
    public TextField age;
    private boolean saved;
    private IHealthHistoryModel healthHistoryModel;

    @FXML
    void onCancel(){
        this.addHealthCondition.getScene().getWindow().hide();
    }

    private Stage getMyStage(){
        return (Stage) saveButton.getScene().getWindow();
    }

    public boolean isSaved(){
        return saved;
    }
    @FXML
    void onSaveHealth(ActionEvent event){

        healthHistoryModel.setCondition(condition.getText());
        healthHistoryModel.setConditionAge(age.getText());

        saved = true;
        getMyStage().close();
    }
    public void setHealthHistory(IHealthHistoryModel healthHistoryModel){
        this.healthHistoryModel = healthHistoryModel;

        condition.setText(healthHistoryModel.getCondition());
        age.setText(healthHistoryModel.getConditionAge());
    }
}

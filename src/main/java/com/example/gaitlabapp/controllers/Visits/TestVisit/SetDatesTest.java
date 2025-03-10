package com.example.gaitlabapp.controllers.Visits.TestVisit;

import javafx.event.ActionEvent;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class SetDatesTest {

    public Button setDate;

    private Stage getMyStage(){ return (Stage) setDate.getScene().getWindow();}


    public void onSetDate(ActionEvent event) {

        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
        alert.initModality(Modality.APPLICATION_MODAL);
       // alert.setTitle("Set Dates have been Saved");
        alert.setContentText("Set Dates have been selected.");
        alert.setHeight(400);
        alert.setWidth(400);
        alert.showAndWait();

        getMyStage().close();

    }
}

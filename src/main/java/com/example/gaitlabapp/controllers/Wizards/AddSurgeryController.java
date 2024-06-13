package com.example.gaitlabapp.controllers.Wizards;

import com.example.gaitlabapp.model.patients.ISurgeryModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddSurgeryController  {

    public AnchorPane addSurgery;

    @FXML
    private TextArea comments;

    @FXML
    private TextField date;

    @FXML
    private TextField facility;

    @FXML
    private TextField procedure;

    @FXML
    private Button saveButton;

    @FXML
    private TextField side;

    @FXML
    private TextField surgeon;

    private boolean saved;

    private ISurgeryModel surgeryModel;


    @FXML
    void onCancel(ActionEvent event) {
        this.addSurgery.getScene().getWindow().hide();
    }

    private Stage getMyStage(){
        return (Stage) saveButton.getScene().getWindow();
    }

    public boolean isSaved(){
        return saved;
    }
    @FXML
     void onSaveSurgery(ActionEvent event){

        surgeryModel.setSurgeryDate(date.getText());
        surgeryModel.setSurgeryProcedure(procedure.getText());
        surgeryModel.setSurgerySide(side.getText());
        surgeryModel.setSurgeon(surgeon.getText());
        surgeryModel.setFacility(facility.getText());
        surgeryModel.setComments(comments.getText());

        saved = true;
        getMyStage().close();

    }

    public void setSurgery(ISurgeryModel surgeryModel){
        this.surgeryModel = surgeryModel;

        date.setText(surgeryModel.getSurgeryDate());
        procedure.setText(surgeryModel.getSurgeryProcedure());
        side.setText(surgeryModel.getSurgerySide());
        surgeon.setText(surgeryModel.getSurgeon());
        facility.setText(surgeryModel.getFacility());
        comments.setText(surgeryModel.getComments());

    }
}

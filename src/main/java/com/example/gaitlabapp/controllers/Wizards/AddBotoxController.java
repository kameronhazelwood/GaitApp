package com.example.gaitlabapp.controllers.Wizards;

import com.example.gaitlabapp.model.patients.IBotoxModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class AddBotoxController {

    public AnchorPane addBotox;
    @FXML
    private TextField bodyLocation;

    @FXML
    private Button cancel;

    @FXML
    private TextField comments;

    @FXML
    private TextField date;

    @FXML
    private TextField facility;

    @FXML
    private TextField md;

    @FXML
    private Button saveButton;

    @FXML
    private TextField side;
    @FXML
    private boolean saved;
    private IBotoxModel botoxModel;

    @FXML
    void onCancel(ActionEvent event){
        this.addBotox.getScene().getWindow().hide();
    }

    private Stage getMyStage(){
        return (Stage) saveButton.getScene().getWindow();
    }

    public boolean isSaved(){
        return  saved;
    }

    @FXML
    void onSaveBotox(ActionEvent event){
        botoxModel.setBotoxDate(date.getText());
        botoxModel.setBotoxMd(md.getText());
        botoxModel.setBotoxSide(side.getText());
        botoxModel.setBotoxLocation(bodyLocation.getText());
        botoxModel.setBotoxComments(comments.getText());

        saved = true;
        getMyStage().close();
    }

    public void setBotox(IBotoxModel botoxModel){
        this.botoxModel = botoxModel;

        date.setText(botoxModel.getBotoxDate());
        side.setText(botoxModel.getBotoxSide());
        md.setText(botoxModel.getBotoxMd());
        bodyLocation.setText(botoxModel.getBotoxLocation());
        comments.setText(botoxModel.getBotoxComments());
    }
}

package com.example.gaitlabapp.controllers.Wizards;

import com.example.gaitlabapp.model.forms.IOrthosisModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;



public class AddOrthosisWizard implements Initializable {
    public Button saveButton;
    public Button cancel;
    public ComboBox<String> sideDropDown;
    private IOrthosisModel orthosisModel;
    @FXML
    private ComboBox<String> orthosisDropdown;
    @FXML
    private boolean saved;
    private Stage getMyStage(){
        return (Stage) saveButton.getScene().getWindow();
    }

    public boolean isSaved(){
        return  saved;
    }

    public void onSaveBotox(ActionEvent event) {
        orthosisModel.setSide(sideDropDown.getValue());
        orthosisModel.setOrthosis(orthosisDropdown.getValue());

        saved = true;
        getMyStage().close();
    }

    public void onCancel(ActionEvent event) {
        getMyStage().close();
        saved = false;
    }

    public void setOrthosis(IOrthosisModel orthosisModel){
        this.orthosisModel = orthosisModel;

        sideDropDown.setValue(orthosisModel.getSide());
        orthosisDropdown.setValue(orthosisModel.getOrthosis());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        String [] orthosisItems = { "KAFO",
                "GRAFO",
                "Art. Ankle AFO",
                "In-shoe Brace",
                "Leaf Spring",
                "Long Leg Twister Cables",
                "Rigid AFO",
                "Shoe Lift",
                "SMO",
                "Neoprene Sleeve - Knee",
                "DAFO",
                "FAFO" };

        String [] sideItems = { "None", "Right", "Left",  "Both"};
        orthosisDropdown.getItems().addAll(orthosisItems);
        sideDropDown.getItems().addAll(sideItems);


    }
}

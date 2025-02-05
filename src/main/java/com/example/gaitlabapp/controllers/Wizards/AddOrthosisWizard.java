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


@Component
@RequiredArgsConstructor
public class AddOrthosisWizard implements Initializable {
    public Button saveButton;
    private IOrthosisModel orthosisModel;
    @FXML
    private ComboBox<String> orthosisDropdown;
    @FXML
    private TextField sideTextfield;
    @FXML
    private boolean saved;
    private Stage getMyStage(){
        return (Stage) saveButton.getScene().getWindow();
    }

    public boolean isSaved(){
        return  saved;
    }

    public void onSaveBotox(ActionEvent event) {
        orthosisModel.setSide(sideTextfield.getText());
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

        sideTextfield.setText(orthosisModel.getSide());
        orthosisDropdown.setValue(orthosisModel.getOrthosis());
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        orthosisDropdown.getItems().addAll(
                "KAFO",
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
                "FAFO"
        );
    }
}

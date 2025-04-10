package com.example.gaitlabapp.controllers.Wizards;

import com.example.gaitlabapp.model.forms.ISeizureModel;
import com.example.gaitlabapp.model.patients.IHealthHistoryModel;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.util.ResourceBundle;

public class AddSeizureMedsController implements Initializable {
    public ComboBox<String> seizureDropDown;
    public Button addButton;
    public Button cancelButton;
    public AnchorPane addSeizure;
    private ISeizureModel seizureModel;
    private boolean saved;
    public boolean isSaved(){
        return saved;
    }



    @Override
    public void initialize(URL location, ResourceBundle resources) {

        String [] medicationItems= {"Depakote",
                "Dilantin",
                "Felbatol",
                "Klonopin",
                "Lamictal",
                "Neurontin",
                "Phenobarbital",
                "Tegretol/Carbatrol",
                "Topamax",
                "Zarontin"};

        seizureDropDown.getItems().addAll(medicationItems);

        seizureDropDown.setOnAction(event -> {
            String data = seizureDropDown.getSelectionModel().getSelectedItem();

//            String addItem = seizureDropDown.getValue();
//            seizureDropDown.getItems().add(addItem);
        });

    }

    private Stage getMyStage(){
        return (Stage) addButton.getScene().getWindow();
    }
    public void onAddButton(ActionEvent event) {
        seizureModel.setSeizureMedicineName(seizureDropDown.getSelectionModel().getSelectedItem());

        saved = true;
        getMyStage().close();
    }

    public void setAddSeizure(ISeizureModel seizureModel){
        this.seizureModel = seizureModel;

        seizureDropDown.setValue(seizureModel.getSeizureMedicineName());
    }

    public void onCancel(ActionEvent event) {this.addSeizure.getScene().getWindow().hide();}
}

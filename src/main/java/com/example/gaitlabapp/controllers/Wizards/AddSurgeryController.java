package com.example.gaitlabapp.controllers.Wizards;

import com.example.gaitlabapp.model.patients.ISurgeryModel;
import com.example.gaitlabapp.services.SurgeryService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class AddSurgeryController  {
    @Autowired
    ConfigurableApplicationContext applicationContext;
    @Autowired
    private final SurgeryService surgeryService;

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
        try {
            if(date != null){
                ISurgeryModel newSurgery = new ISurgeryModel();
                newSurgery.setSurgeryDate(date.getText());
                newSurgery.setSurgeryProcedure(procedure.getText());
                newSurgery.setSurgerySide(side.getText());
                newSurgery.setSurgeon(surgeon.getText());
                newSurgery.setFacility(facility.getText());
                newSurgery.setComments(comments.getText());
                surgeryService.save(surgeryModel);

                System.out.println(newSurgery);

            }else{
                Alert alert = new Alert(Alert.AlertType.INFORMATION);
                alert.setTitle("Required Fields: ");
                alert.setContentText("Surgery Date is required");
                alert.show();
            }

            saved = true;
            getMyStage().close();

        } catch (Exception e) {
            throw new RuntimeException(e);
        }



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

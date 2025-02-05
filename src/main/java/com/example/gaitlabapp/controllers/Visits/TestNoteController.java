package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.model.visits.IAppointmentModel;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

@Component
@RequiredArgsConstructor
public class TestNoteController {
    public TextArea reason;
    @Autowired
    ConfigurableApplicationContext applicationContext;

    IAppointmentModel appointmentModel;
    public Button saveAndClose;
    VisitDetailsGaitController visitDetailsGaitController;
    private Stage getMyStage(){ return (Stage) saveAndClose.getScene().getWindow();}
    @FXML
    private boolean saved;
    public boolean isSaved(){
        return  saved;
    }

    public void onSaveAndClose(ActionEvent event) {
        //update checkbox within the visitdetailsgaitcontroller

        getMyStage().close();

    }

    public void setTestNote(IAppointmentModel appointmentModel){
        this.appointmentModel = appointmentModel;
        reason.setText(appointmentModel.getTestReason());

    }
}

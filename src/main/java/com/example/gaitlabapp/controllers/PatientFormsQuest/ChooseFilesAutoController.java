package com.example.gaitlabapp.controllers.PatientFormsQuest;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

import java.awt.*;
import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class ChooseFilesAutoController implements Initializable {

    public Text patientMRN;
    public Button changeDate;
    public TextField aptDate;
    public CheckBox patientName;
    public Button printbutton;
    public CheckBox ueEvalForm;
    public CheckBox runEngForm;
    public CheckBox ptRunningForm;
    public CheckBox ueEngForm;
    public CheckBox shueeForm;
    public CheckBox ptFootEval;
    public CheckBox engineer;
    public CheckBox ptEval;
    public CheckBox anaylsisInfo;
    public CheckBox patientVisitForm;
    public Button selectAll;
    public Button unselectAll;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        aptDate.setText("04/03/2024");
        patientName.setText("Test Test");
        patientName.setSelected(true);
        patientMRN.setText("123");

        selectAll.setOnAction(e -> {
         patientName.setSelected(true);
        });

        unselectAll.setOnAction(e -> {
           patientName.setSelected(false);
        });
    }

    public void onPrint(ActionEvent event) throws IOException {
        if(ptEval.isSelected()){
            File ptEval = new File("src/main/resources/PT_Forms/PT_Evaluation.docx");
            Desktop.getDesktop().open(ptEval);
        }
        if(patientVisitForm.isSelected()){
            File patientVisit = new File("src/main/resources/PT_Forms/PatientVisitForm.docx");
            Desktop.getDesktop().open(patientVisit);
        }
        if(anaylsisInfo.isSelected()){
            File analysisSheet = new File("src/main/resources/PT_Forms/Anaylsis_Info_Sheet.docx");
            Desktop.getDesktop().open(analysisSheet);
        }
        if (engineer.isSelected()){
            File engineerForm = new File("src/main/resources/PT_Forms/Engineer.docx");
            Desktop.getDesktop().open(engineerForm);
        }
        if(ptFootEval.isSelected()){
            File ptFtEval = new File("src/main/resources/PT_Forms/PT_Foot_Eval.docx");
            Desktop.getDesktop().open(ptFtEval);
        }
        if(shueeForm.isSelected()){
            File shuee = new File("src/main/resources/PT_Forms/SHUEE_Forms.pdf");
            Desktop.getDesktop().open(shuee);
        }
        if(ueEngForm.isSelected()){
            File ueEng = new File("src/main/resources/PT_Forms/UE_Engineer_Form.docx");
            Desktop.getDesktop().open(ueEng);
        }
        if(runEngForm.isSelected()){
            File runEng = new File("src/main/resources/PT_Forms/Running_Evaluation_Form.docx");
            Desktop.getDesktop().open(runEng);
        }
        if(ueEvalForm.isSelected()){
            File ueEval = new File("src/main/resources/PT_Forms/UE_Eval_Form.docx");
            Desktop.getDesktop().open(ueEval);
        }

    }


}

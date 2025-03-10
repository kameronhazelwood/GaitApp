package com.example.gaitlabapp.controllers.Forms.Compendium;

import com.example.gaitlabapp.controllers.PatientModuleController;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import com.example.gaitlabapp.services.PatientService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
@RequiredArgsConstructor
public class CompendiumInfoPageController implements Initializable {

    public ImageView frontInfoPhoto;
    public AnchorPane anchorPane;
    @Autowired
    ConfigurableApplicationContext applicationContext;
    @FXML
    private Label age;

    @FXML
    private Label ageLabel;

    @FXML
    private Label bioMech;

    @FXML
    private Label bioMechLabel;

    @FXML
    private Label dateOfEval;

    @FXML
    private Label dateOfEvallLabel;

    @FXML
    private Label dob;

    @FXML
    private Label dobLabel;

    @FXML
    private Label examiningTher;

    @FXML
    private Label examiningTherLabel;

    @FXML
    private Label fName;

    @FXML
    private Label gender;

    @FXML
    private Label genderLabel;

    @FXML
    private Label mrn;

    @FXML
    private Label mrnLabel;

    @FXML
    private Label nameLabel;

    @FXML
    private Label patientBioComments;

    @FXML
    private Label referringPhys;

    @FXML
    private Label referringPhysLabel;

    @FXML
    private Label visitDiag;

    @FXML
    private Label visitDiagLabel;

    PatientModuleController patientModuleController;
    private final ObservableList<IPatientModel> listviewPatients = FXCollections.observableArrayList();

    @FXML
    private boolean saved;

    public boolean isSaved() {
        return saved;
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Image faceImage = new Image(String.valueOf(getClass().getResource("/Rowan/1/17/2025/32581055_011725_HeadShot.jpg")));
        ImageView imageView = new ImageView(faceImage);
        imageView.setFitHeight(180);
        imageView.setFitWidth(300);
        imageView.setX(176);
        imageView.setY(68);
        anchorPane.getChildren().add(imageView);


        fName.setText("Madeline Daum");
        dob.setText("1/1/2000");
        mrn.setText("32581055");
        gender.setText("Female");
        visitDiag.setText("Cerebral Palsy");
        bioMech.setText("John Henley");
        referringPhys.setText("Freeman Miller");
        examiningTher.setText("Chris Church");
        dateOfEval.setText("03/05/2025");

    }

    public void setInfoPage(IPatientModel patientModel) {



    }



}

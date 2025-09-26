package com.example.gaitlabapp.controllers.Forms.Compendium.FootEval;

import com.example.gaitlabapp.controllers.PatientModuleController;
import com.example.gaitlabapp.model.patients.IPatientModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.stereotype.Component;

import java.net.URL;
import java.util.ResourceBundle;

@Component
@RequiredArgsConstructor
public class FootEvalInfoPage implements Initializable {
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
        Image faceImage = new Image(String.valueOf(getClass().getResource("/Rowan/8/29/2025/IMG_20250910_182409.jpg")));
        ImageView imageView = new ImageView(faceImage);
        imageView.setFitHeight(335);
        imageView.setFitWidth(359);
        imageView.setX(176);
        imageView.setY(50);
        anchorPane.getChildren().add(imageView);


        fName.setText("Rowan Hazelwood");
        dob.setText("10/02/2024");
        mrn.setText("33069893     ");
        age.setText("1");
        gender.setText("Female");
//        visitDiag.setText("Cerebral Palsy");
//        bioMech.setText("John Henley");
//        referringPhys.setText("Freeman Miller");
//        examiningTher.setText("Chris Church");
        dateOfEval.setText("09/12/2025");

    }

    public void setInfoPage(IPatientModel patientModel) {



    }

}

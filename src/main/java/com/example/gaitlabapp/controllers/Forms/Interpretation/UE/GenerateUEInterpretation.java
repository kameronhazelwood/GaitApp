package com.example.gaitlabapp.controllers.Forms.Interpretation.UE;

import com.example.gaitlabapp.Launcher;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class GenerateUEInterpretation {
    @FXML
    private ToggleButton UEPhysButton;

    @FXML
    private AnchorPane ap;

    @FXML
    private ToggleButton assessmentFormButton;

    @FXML
    private BorderPane bp;

    @FXML
    private ToggleButton kinematicsButton;

    @FXML
    private ToggleButton photoButton;

    @FXML
    private ToggleButton recommendationsButton;

    @FXML
    private ToggleButton signaturesButton;

    @FXML
    private ToggleButton videoUEButton;

    public void onVideoAssessment(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationVideoUE.fxml")));
        bp.setCenter(root);
    }

    public void onUEPhys(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpUEPhysExam.fxml")));
        bp.setCenter(root);
    }

    public void onKinematics(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationKinematics.fxml")));
        bp.setCenter(root);
    }

    public void onPhotos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationPhotos.fxml")));
        bp.setCenter(root);
    }

    public void onAssessmentForm(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationAssessment.fxml")));
        bp.setCenter(root);
    }

    public void onRecomendations(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationRecommendations.fxml")));
        bp.setCenter(root);
    }

    public void onSignatures(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationSignature.fxml")));
        bp.setCenter(root);
    }
}

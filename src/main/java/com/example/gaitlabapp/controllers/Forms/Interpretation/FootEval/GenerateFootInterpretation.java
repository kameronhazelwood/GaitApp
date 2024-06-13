package com.example.gaitlabapp.controllers.Forms.Interpretation.FootEval;

import com.example.gaitlabapp.GaitApp;
import com.example.gaitlabapp.GaitLabAppApplication;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class GenerateFootInterpretation {
    public AnchorPane ap;
    public BorderPane bp;


    public void onVideoAssessment(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/UE/InterpretationVideoUE.fxml")));
        bp.setCenter(root);

    }
    public void onGAITPhys(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/GAIT/InterpGaitPhyExam.fxml")));
        bp.setCenter(root);
    }

    public void onKinematics(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/GAIT/InterpretationGAITKinematics.fxml")));
        bp.setCenter(root);
    }

    public void onKinetics(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/GAIT/InterpretationGaitKinetics.fxml")));
        bp.setCenter(root);
    }

    public void onFootModel(MouseEvent mouseEvent) {
    }

    public void onEMG(MouseEvent mouseEvent) {
    }

    public void onPedobaragraph(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/GAIT/IntrepertationPedobaragraphGait.fxml")));
        bp.setCenter(root);
    }

    public void onMetabolic(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/GAIT/InterpretationMetobolicGAIT.fxml")));
        bp.setCenter(root);
    }

    public void onStepWatch(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/GAIT/InterpretationStepWatch.fxml")));
        bp.setCenter(root);
    }

    public void onPhotographs(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/UE/InterpretationPhotos.fxml")));
        bp.setCenter(root);
    }

    public void onRecommendation(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/FootEval/FootEvalRecommendations.fxml")));
        bp.setCenter(root);
    }

    public void onSignatures(MouseEvent mouseEvent) {
    }

    public void onNeuro(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/FootEval/FootEvalNeuroCognitive.fxml")));
        bp.setCenter(root);
    }

    public void onBio(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/Forms/Interpretation/FootEval/FootEvalBiomech.fxml")));
        bp.setCenter(root);
    }
}

package com.example.gaitlabapp.controllers.Forms.Interpretation.MovementDisorder;

import com.example.gaitlabapp.Launcher;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;

public class GenerateMovementDisorderInterp {
    @FXML
    private BorderPane bp;
    @FXML
    private AnchorPane ap;

    @FXML
    void onMovementDisorder(MouseEvent event) throws IOException {
        //TODO
//        Parent root = null;
//        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/GAIT/InterpGaitPhyExam.fxml")));
//        bp.setCenter(root);
    }

    @FXML
    void onMovementVideo(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementVideoAssessment.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onEMGAssesssment(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementEMGAssessment.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onFootModel(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementFootModel.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onKinematics(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementKinematics.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onKinetics(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementKinematics.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onMetabolic(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementMetabolic.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onPedobarograph(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementPedobarograph.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onStepWatch(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementStepWatch.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onAssessmentForm(MouseEvent event) throws IOException{
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/MovementDisorder/MovementAssessmentForm.fxml")));
        bp.setCenter(root);
    }


}

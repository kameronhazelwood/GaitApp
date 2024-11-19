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
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Interpretation/GAIT/InterpGaitPhyExam.fxml")));
        bp.setCenter(root);
    }
}

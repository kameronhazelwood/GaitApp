package com.example.gaitlabapp.controllers.Details;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;

public class PatientVideoController {
    public Button addNewButton;
    public Pane pane;
    public ListView videos;

    public void onAddNew(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select file to add to Patient's account");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Select Media Files: ", "*.mp4*")
        );

        fileChooser.setInitialDirectory(new File("C:\\dev"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            videos.getItems().add(new File(selectedFile.getName()));
        };
    }
}

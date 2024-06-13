package com.example.gaitlabapp.controllers.Details;

import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;

public class PatientPhotosController implements Initializable {
    public Button addNewButton;
    public Pane pane;
    public Pane pane2;
    public GridPane gridPane;
    public ImageView imageview1;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void onAddNew(ActionEvent event) {
        FileChooser fileChooser = new FileChooser();
        fileChooser.setTitle("Select file to add to Patient's account");

        fileChooser.getExtensionFilters().add(
                new FileChooser.ExtensionFilter("Image Files", "*.png", "*jpg")
        );

        fileChooser.setInitialDirectory(new File("C:\\dev"));
        File selectedFile = fileChooser.showOpenDialog(new Stage());

        if (selectedFile != null) {
            Image newImage = new Image(selectedFile.toURI().toString());
            imageview1.setImage(newImage);
            imageview1.setFitWidth(250);
            imageview1.setFitHeight(250);
        };
    }



}

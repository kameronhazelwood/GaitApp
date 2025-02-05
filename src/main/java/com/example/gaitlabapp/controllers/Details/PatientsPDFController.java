package com.example.gaitlabapp.controllers.Details;

import com.example.gaitlabapp.services.WatchDirService;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

import javax.swing.filechooser.FileView;
import java.io.File;
import java.net.URL;
import java.nio.file.Path;
import java.util.HashMap;
import java.util.Map;
import java.util.ResourceBundle;

public class PatientsPDFController implements Initializable {
    public AnchorPane anchorPane;
    public Button addNewButton;
    public Pane pane;
    public ListView<File> files;
    private static final String PDF_FILE_EXT = ".pdf";
    //private static final String WATCH_DIR = System.getProperty("C:\\Users\\sh0184\\images");
    //private WatchDirService watchDirService;
    private Map<Path, FileView> fileViews = new HashMap<>();

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        addNewButton.setOnAction(e -> {

            FileChooser fileChooser = new FileChooser();
            fileChooser.setTitle("Select file to add to Patient's account");

            fileChooser.getExtensionFilters().add(
                    new FileChooser.ExtensionFilter("All Files", "*.*")
            );

            fileChooser.setInitialDirectory(new File("C:\\dev"));
            File selectedFile = fileChooser.showOpenDialog(new Stage());

            if (selectedFile != null) {
                files.getItems().add(new File(selectedFile.getName()));
            }




//                files.setCellFactory(file -> {
//                    ListCell<File> listCell = new ListCell<File>();
//                    listCell.setOnMouseClicked(event -> {
//                        if(selectedFile != null){
//                            Desktop.getDesktop().open(.);
//                        }
//                    });
//                });

//        });

        });

//        files.setCellFactory(files -> {
//            ListCell<File> cell = new ListCell<File>();
//            ContextMenu contextMenu = new ContextMenu();
//            MenuItem viewItem = new MenuItem("View");
//            MenuItem deleteItem = new MenuItem("Delete");
//
//            deleteItem.setOnAction(event1 -> {
//                files.getItems().remove(cell.getItem());
//            });
//            contextMenu.getItems().addAll(viewItem, deleteItem);
//
//            cell.emptyProperty().addListener((obs, wasEmpty, isEmpty) -> {
//                if(isEmpty){
//                    cell.setContextMenu(null);
//                }
//                else {
//                    cell.setContextMenu(contextMenu);
//                }
//            });
//            return cell;
//        });



        //  public void onAddNew(ActionEvent event){
//        FileChooser fileChooser = new FileChooser();
//        fileChooser.setTitle("Select file to add to Patient's account");
//
//        fileChooser.getExtensionFilters().add(
//                new FileChooser.ExtensionFilter("All Files", "*.*")
//        );
//
//        fileChooser.setInitialDirectory(new File("C:\\dev"));
//        File selectedFile = fileChooser.showOpenDialog(new Stage());
//
//        if (selectedFile != null) {
//            files.getItems().add(new File(selectedFile.getName()));
//        };
        //  }
    }
}


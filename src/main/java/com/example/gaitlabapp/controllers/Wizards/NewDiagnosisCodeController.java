package com.example.gaitlabapp.controllers.Wizards;


import com.example.gaitlabapp.model.patients.IDiagnosisModel;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.services.DiagnosisService;
import com.example.gaitlabapp.services.PatientService;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import net.fortuna.ical4j.model.property.RDate;
import org.controlsfx.control.PropertySheet;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.yaml.snakeyaml.events.Event;

import java.net.URL;
import java.util.*;

@Controller
@EnableJpaRepositories
public class NewDiagnosisCodeController implements Initializable {


    public TableView<IDiagnosisModel> newDiagCodeTable;
    public TableColumn<IDiagnosisModel, String> codeCol;
    public TableColumn<IDiagnosisModel, String> descripCol;
    public TextField searchCodes;
    public Button addCodes;

    public Button cancel;
    public AnchorPane diagCodePane;
    public TextField codeField;
    public TextField descripField;
    private boolean saved;
    @Autowired
    ConfigurableApplicationContext applicationContext;
    @Autowired
    DiagnosisService diagnosisService;
    @Autowired
    PatientService patientService;
    private ObservableList<IDiagnosisModel> listView = FXCollections.observableArrayList();


    @FXML
    void onCancel(ActionEvent event) {
        this.newDiagCodeTable.getScene().getWindow().hide();
    }

    private Stage getmyStage() {
        return (Stage) addCodes.getScene().getWindow();
    }

    public boolean isSaved() {
        return saved;
    }
    private IDiagnosisModel diagnosisModel;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        codeCol.setCellValueFactory((new PropertyValueFactory<>("Code")));
        descripCol.setCellValueFactory((new PropertyValueFactory<>("Description")));
        newDiagCodeTable.getColumns().setAll(codeCol, descripCol);

        listView.addAll(FXCollections.observableArrayList(diagnosisService.findAll()));
        newDiagCodeTable.setItems(listView);

        FilteredList<IDiagnosisModel> filteredData = new FilteredList<>(listView, b -> true);
        searchCodes.textProperty().addListener((obs, oldValue, newValue) -> {
            filteredData.setPredicate(diagnosisCode -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (diagnosisCode.getDiagnosisDescription().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } else return diagnosisCode.getDiagnosisCode().toLowerCase().contains(lowerCaseFilter);
            });
        });
        SortedList<IDiagnosisModel> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(newDiagCodeTable.comparatorProperty());
        newDiagCodeTable.setItems(sortedData);

        newDiagCodeTable.setOnMouseClicked(mouseEvent -> {
            IDiagnosisModel diagCode = newDiagCodeTable.getItems().get(0);

            codeCol = (TableColumn<IDiagnosisModel, String>) newDiagCodeTable.getColumns().get(0);
            descripCol = (TableColumn<IDiagnosisModel, String>) newDiagCodeTable.getColumns().get(1);

            String codeData = (String) codeCol.getCellObservableValue(diagCode).getValue();
            String descData = (String) descripCol.getCellObservableValue(diagCode).getValue();

            codeField.setText(codeData);
            descripField.setText(descData);

        });


    }

    @FXML
    public void onSaveDiagCode(ActionEvent event) {
//        IDiagnosisModel diagCode = newDiagCodeTable.getSelectionModel().getSelectedItem();
//
//        diagCode.setDescription(descripField.getText());
//        diagCode.setCode(codeField.getText());

        diagnosisModel.setDescription(descripField.getText());
        diagnosisModel.setCode(codeField.getText());

        saved = true;
        getmyStage().close();
    }
    public void setDiagCode(IDiagnosisModel diagnosisModel) {
        this.diagnosisModel = diagnosisModel;

        codeField.setText(diagnosisModel.getDiagnosisCode());
        descripField.setText(diagnosisModel.getDiagnosisDescription());

//        PatientModuleController patientModuleController = new PatientModuleController();
//        ObservableList<IDiagnosisModel> newData = FXCollections.observableArrayList();
//        newDiagCodeTable.setRowFactory(dct -> {
//            TableRow<IDiagnosisModel> row = new TableRow<>();
//            IDiagnosisModel rowData = row.getItem();
//            row.setOnMouseClicked(event -> {
//                newData.add(new IDiagnosisModel(
//                        rowData.getDiagnosisCode(),
//                        rowData.getDiagnosisDescription()
//                ));
//               newData.add(rowData);
//               patientModuleController.diagnosisCodeTable.setItems(newData);
//            });
//            return row;
//        });


        //IDiagnosisModel diagCode2 = newDiagCodeTable.getSelectionModel().getSelectedItem();

       // testField.setText(diagCode2.getCode());
    }
}

//ObservableList<IDiagnosisModel> newData = FXCollections.observableArrayList();
//        newDiagCodeTable.setRowFactory(dct -> {
//TableRow<IDiagnosisModel> row = new TableRow<>();
//IDiagnosisModel rowData = row.getItem();
//            row.setOnMouseClicked(event -> {
//        newData.add(new IDiagnosisModel(
//        rowData.getDiagnosisCode(),
//                        rowData.getDiagnosisDescription()
//                ));
//                        patientModuleController.diagnosisCodeTable.setItems(newData);
//            });
//                    return row;
//        });
//               String rowCode = String.valueOf(rowData.getDiagnosisCode());
//               String rowDes = rowData.getDiagnosisDescription();

//        ObservableList<TableColumn<IDiagnosisModel, String>> desCode = FXCollections.observableArrayList();
//
//

//
//        ObservableList<TableColumn<IDiagnosisModel, ?>> codes = codeCol.getColumns();
//        ObservableList<TableColumn<IDiagnosisModel, ?>> description = descripCol.getColumns();
//        newDiagCodeTable.getColumns().addAll(description);
//        newDiagCodeTable.getColumns().addAll(codes);





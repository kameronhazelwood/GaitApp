package com.example.gaitlabapp.controllers.Wizards;


import com.example.gaitlabapp.controllers.PatientModuleController;
import com.example.gaitlabapp.config.Config;
import com.example.gaitlabapp.model.patients.IDiagnosisModel;
import com.example.gaitlabapp.model.patients.IPatientModel;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.net.URL;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ResourceBundle;

public class NewDiagnosisCodeController implements Initializable {


    public TableView<IDiagnosisModel> newDiagCodeTable;
    public TableColumn<IDiagnosisModel, String> codeCol;
    public TableColumn<IDiagnosisModel, String> descripCol;
    public TextField searchCodes;
    public Button addCodes;

    public Button cancel;
    public AnchorPane diagCodePane;
    private boolean saved;
    int patientID = 13;

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
    Connection connection = null;
    Config db = new Config();
    Statement statement = null;
    ResultSet resultSet;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        codeCol.setCellValueFactory((new PropertyValueFactory<IDiagnosisModel, String>("code")));
        descripCol.setCellValueFactory((new PropertyValueFactory<IDiagnosisModel, String>("diagnosis")));
        newDiagCodeTable.getColumns().setAll(codeCol, descripCol);


        try {
            connection = db.getDBConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("SELECT * FROM DiagnosisCode");

            while (resultSet.next()) {
                listView.add((new IDiagnosisModel(
                        resultSet.getString("Code"),
                        resultSet.getString("Description")
                )));
            }
            newDiagCodeTable.setItems(listView);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }

        FilteredList<IDiagnosisModel> filteredData = new FilteredList<>(listView, b -> true);
        searchCodes.textProperty().addListener((obs, oldValue, newValue) -> {
            filteredData.setPredicate(diagnosisCode -> {
                if (newValue == null || newValue.isEmpty()) {
                    return true;
                }
                String lowerCaseFilter = newValue.toLowerCase();

                if (diagnosisCode.getDiagnosisDescription().toLowerCase().contains(lowerCaseFilter)) {
                    return true;
                } else if (diagnosisCode.getDiagnosisCode().toLowerCase().contains(lowerCaseFilter)) {
                    return true;

                } else return false;
            });
        });
        SortedList<IDiagnosisModel> sortedData = new SortedList<>(filteredData);
        sortedData.comparatorProperty().bind(newDiagCodeTable.comparatorProperty());
        newDiagCodeTable.setItems(sortedData);

    }

    @FXML
    public void onSaveDiagCode(ActionEvent event) {
        saved = true;

        IDiagnosisModel idiagnosisModel = newDiagCodeTable.getSelectionModel().getSelectedItem();

        String SQL = "UPDATE Patients SET "
                + "genDiagnosis= '" + idiagnosisModel + "' WHERE patientID = '" + patientID + "'";
        try {
            connection = db.getDBConnection();
            System.out.println("Connected to Database");
            statement.executeUpdate(SQL);
            System.out.println(SQL);

        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        getmyStage().close();
    }

    @FXML
    public void setDiagCode() {
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
//               patientModuleController.diagnosisCodeTable.setItems(newData);
//            });
//            return row;
//        });

    }

    public void setDiagCode(IDiagnosisModel diagnosisModel) {
//        this.diagnosisModel = diagnosisModel;
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





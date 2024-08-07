package com.example.gaitlabapp.controllers;



import com.example.gaitlabapp.controllers.Wizards.AddSurgeryController;
import com.example.gaitlabapp.controllers.Wizards.NewDiagnosisCodeController;
import com.example.gaitlabapp.controllers.Wizards.AddHealthConditionController;
import com.example.gaitlabapp.controllers.Wizards.AddBotoxController;
import com.example.gaitlabapp.model.Model;
import com.example.gaitlabapp.model.patients.*;
import com.example.gaitlabapp.repo.PatientRepo;
import com.example.gaitlabapp.services.DiagnosisService;
import com.example.gaitlabapp.services.PatientService;
import com.example.gaitlabapp.model.visits.IAppointmentModel;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.property.StringProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.collections.transformation.SortedList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.layout.*;
import javafx.stage.*;
import com.example.gaitlabapp.Launcher;
import javafx.util.converter.DateStringConverter;
import lombok.RequiredArgsConstructor;
import net.rgielen.fxweaver.core.FxmlView;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;

import java.io.IOException;
import java.net.URL;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Objects;
import java.util.ResourceBundle;

import static com.example.gaitlabapp.model.visits.IAppointmentModel.Type.*;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class PatientModuleController implements Initializable {

    @FXML
    public Button patient;
    @FXML
    public TableColumn<IAppointmentModel, String> referringMd;
    @FXML
    public TableColumn<IAppointmentModel, String> visitType;
    @FXML
    public TableColumn<IAppointmentModel, String> aptData;
    @FXML
    public Button dropDownBtn;
    @FXML
    public TableView<IAppointmentModel> tableView;
    @FXML
    public Button addSurgicalHistory;
    @FXML
    public Label lastName;
    @FXML
    public Pane demographicsPane;
    @FXML
    public Button addNewDiagnosis;
    @FXML
    public RadioButton photoRadio;
    @FXML
    public RadioButton videoRadio;
    @FXML
    public RadioButton PDFViewer;
    @FXML
    public TabPane patientTabPane;
    public Label dobLabel;
    public DatePicker picker;


    ObservableList<IAppointmentModel> initialData() {
        IAppointmentModel apt1 = new IAppointmentModel(1, "", "10/31/2023", "GAIT - Full Diagnostic", "Dr. Smith", GAIT);
        IAppointmentModel apt2 = new IAppointmentModel(2, "", "2/8/2023", "Upper Extremity - Full Diagnostic", "Dr. Smith", UE);
        IAppointmentModel apt3 = new IAppointmentModel(3, "", "3/12/2024", "Gait - Foot Evaluation", "Dr. Smith", FOOT);
        return FXCollections.observableArrayList(apt1, apt2, apt3);
    }

    @FXML
    public TableColumn<ISurgeryModel, String> surgeryDate;
    @FXML
    public TableColumn<ISurgeryModel, String> surgeryProcedure;
    @FXML
    TableColumn<ISurgeryModel, String> surgerySide;
    @FXML
    TableColumn<IBotoxModel, String> botoxDate;
    @FXML
    TableColumn<IBotoxModel, String> botoxLocation;
    @FXML
    TableColumn<IBotoxModel, String> botoxFacility;
    @FXML
    TableColumn<IHealthHistoryModel, String> conditionAge;
    @FXML
    TableColumn<IHealthHistoryModel, String> condition;
    @FXML
    TableColumn<IDiagnosisModel, String> diagnosisCode;
    @FXML
    TableColumn<IDiagnosisModel, String> diagDescription;

    @FXML
    public TableView<ISurgeryModel> surgeryTableView;
    @FXML
    public TableView<IBotoxModel> botoxTableView;
    @FXML
    public TableView<IHealthHistoryModel> healthTableView;
    @FXML
    public TableView<IDiagnosisModel> diagnosisCodeTable;

    ObservableList<ISurgeryModel> initialPTSurgData() {
        ISurgeryModel ptSur1 = new ISurgeryModel(12, "10/20/2023", "Other", "L", "surgeon", "facility", "comments");
        return FXCollections.observableArrayList(ptSur1);
    }

    ObservableList<IBotoxModel> initialPtBotData() {
        IBotoxModel ptBot1 = new IBotoxModel(12, "10/20/2023", "R - Arm", "botoxSide", "Dr. Smith", "Test Comments");
        return FXCollections.observableArrayList(ptBot1);
    }

    ObservableList<IHealthHistoryModel> initialPtHealthData() {
        IHealthHistoryModel ptHea1 = new IHealthHistoryModel(12, "3", "Stroke");
        return FXCollections.observableArrayList(ptHea1);
    }

    ObservableList<IDiagnosisModel> initialDiagCodeData() {
        IDiagnosisModel ptDiag1 = new IDiagnosisModel("G800", "Spastic Quadriplegic Cerebral Palsy");
        return FXCollections.observableArrayList(ptDiag1);
    }
    @FXML
    public Tab visits;
    @FXML
    private Stage stage;
    @FXML
    private Scene scene;
    @FXML
    public TextField LastNameTextField;
    @FXML
    private TextField dobTextfield;
    @FXML
    private TextField formerLastName;
    @FXML
    private TextField genderTextfield;
    @FXML
    private TextField mrnTextfield;
    @FXML
    private TextField patientNameTextField;
    @FXML
    private TextField preferredNameTextField;
    @FXML
    public TextArea commentsTextField;
    @FXML
    private AnchorPane scenePane;
    @Autowired
    ConfigurableApplicationContext applicationContext;




    @Override
    public void initialize(URL PatientModule, ResourceBundle resourceBundle) {
        dobTextfield.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> ov, String t, String t1) {
                if(t1.length() == 2 || t1.length() == 5){
                    dobTextfield.setText(t1+" " + "/");
                }
            }
        });

        preferredNameTextField.textProperty().addListener(new ChangeListener<String>() {
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
                if(newValue != null || newValue == null){
                    preferredNameTextField.setText(newValue);

                }
            }
        });

       /*
        apt data and context menu
         */
        tableView.setRowFactory(tv -> {
            TableRow<IAppointmentModel> row = new TableRow<>();
            ContextMenu contextMenu = new ContextMenu();
            MenuItem viewDetail = new MenuItem("View Visit Details");
            MenuItem compendium = new MenuItem("View Compendium");
            MenuItem interpretation = new MenuItem("View Interpretation");
            viewDetail.setOnAction(e -> {
                showDetails(row.getItem());
            });
            compendium.setOnAction(e -> {
                try {
                    showCompendium(row.getItem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            interpretation.setOnAction(e -> {
                try {
                    showInterpretation(row.getItem());
                } catch (IOException ex) {
                    throw new RuntimeException(ex);
                }
            });
            contextMenu.getItems().add(viewDetail);
            contextMenu.getItems().add(compendium);
            contextMenu.getItems().add(interpretation);
            row.itemProperty().addListener((obs, oldAppointment, newAppointment) -> {
                if (newAppointment == null) {
                    row.setContextMenu(null);
                } else {
                    row.setContextMenu(contextMenu);
                }
            });
            return row;
        });
        aptData.setCellValueFactory((new PropertyValueFactory<IAppointmentModel, String>("aptDate")));
        referringMd.setCellValueFactory((new PropertyValueFactory<IAppointmentModel, String>("referringPhys")));
        visitType.setCellValueFactory(new PropertyValueFactory<IAppointmentModel, String>("Type"));
        tableView.setItems(initialData());

        /*
        surgery data and context menu
         */
        surgeryDate.setCellValueFactory((new PropertyValueFactory<ISurgeryModel, String>("surgeryDate")));
        surgeryProcedure.setCellValueFactory((new PropertyValueFactory<ISurgeryModel, String>("surgeryProcedure")));
        surgerySide.setCellValueFactory((new PropertyValueFactory<ISurgeryModel, String>("surgerySide")));
        surgeryTableView.setItems(initialPTSurgData());

        ContextMenu surgContext = new ContextMenu();
        MenuItem viewSurgDetails = new MenuItem("View Surgery Details");
        MenuItem deleteSurg = new MenuItem("Delete Surgery");

        surgContext.getItems().add(viewSurgDetails);
        surgContext.getItems().add(deleteSurg);
        surgeryTableView.setContextMenu(surgContext);

        deleteSurg.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<ISurgeryModel> surgeryToRemove = surgeryTableView.getSelectionModel().getSelectedItems();

                if (surgeryToRemove.isEmpty()) {
                    return;
                }
                surgeryTableView.getItems().removeAll(
                        surgeryTableView.getSelectionModel().getSelectedItems()
                );
            }
        });
        viewSurgDetails.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ISurgeryModel selectedSurgery = surgeryTableView.getSelectionModel().getSelectedItem();
                if (selectedSurgery == null) {
                    return;
                }
                try {
                    ISurgeryModel surgeryModel1 = showSurgeryDialog(
                            selectedSurgery,
                            "View Surgery Details"
                    );

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });

        /*
        botox data
         */
        botoxDate.setCellValueFactory((new PropertyValueFactory<IBotoxModel, String>("botoxDate")));
        botoxLocation.setCellValueFactory((new PropertyValueFactory<IBotoxModel, String>("botoxLocation")));
        botoxFacility.setCellValueFactory((new PropertyValueFactory<IBotoxModel, String>("botoxFacility")));
        botoxTableView.setItems(initialPtBotData());

        ContextMenu botoxContext = new ContextMenu();
        MenuItem viewBotoxDetails = new MenuItem("View Botox Details");
        MenuItem deleteBotox = new MenuItem("Delete Botox");

        botoxContext.getItems().add(viewBotoxDetails);
        botoxContext.getItems().add(deleteBotox);
        botoxTableView.setContextMenu(botoxContext);

        viewBotoxDetails.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                IBotoxModel selectedBotox = botoxTableView.getSelectionModel().getSelectedItem();
                if (selectedBotox == null) {
                    return;
                }
                try {
                    IBotoxModel botoxModel = showBotoxDialog(
                            selectedBotox
                    );

                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        deleteBotox.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<IBotoxModel> botoxToRemove = botoxTableView.getSelectionModel().getSelectedItems();
                if (botoxToRemove.isEmpty()) {
                    return;
                }
                botoxTableView.getItems().removeAll(
                        botoxTableView.getSelectionModel().getSelectedItems()
                );
            }
        });

        /*
        condition data
         */
        conditionAge.setCellValueFactory((new PropertyValueFactory<IHealthHistoryModel, String>("conditionAge")));
        condition.setCellValueFactory((new PropertyValueFactory<IHealthHistoryModel, String>("condition")));
        healthTableView.setItems(initialPtHealthData());

        ContextMenu healthContext = new ContextMenu();
        MenuItem viewHealth = new MenuItem("View Health Condition");
        MenuItem deleteHealth = new MenuItem("Delete Health Condition");

        healthContext.getItems().add(viewHealth);
        healthContext.getItems().add(deleteHealth);
        healthTableView.setContextMenu(healthContext);

        deleteHealth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                ObservableList<IHealthHistoryModel> healthToRemove = healthTableView.getSelectionModel().getSelectedItems();
                if (healthToRemove.isEmpty()) {
                    return;
                }
                healthTableView.getItems().removeAll(
                        healthTableView.getSelectionModel().getSelectedItems()
                );
            }
        });

        viewHealth.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                IHealthHistoryModel selectedHealth = healthTableView.getSelectionModel().getSelectedItem();
                if (selectedHealth == null) {
                    return;
                }
                try {
                    IHealthHistoryModel healthHistoryModel = showHealthDialog(
                            selectedHealth,
                            ""
                    );
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            }
        });
        /*
        diagnosis code table
         */
        diagnosisCode.setCellValueFactory((new PropertyValueFactory<IDiagnosisModel, String>("code")));
        diagDescription.setCellValueFactory((new PropertyValueFactory<IDiagnosisModel, String>("diagnosis")));

        ContextMenu diagContext = new ContextMenu();
        MenuItem deleteDiag = new MenuItem("Delete Diagnosis Code");
        diagContext.getItems().add(deleteDiag);
        diagnosisCodeTable.setContextMenu(diagContext);

        deleteDiag.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent actionEvent) {
                ObservableList<IDiagnosisModel> diagCodeRemove = diagnosisCodeTable.getSelectionModel().getSelectedItems();
                if (diagCodeRemove.isEmpty()) {
                    return;
                }
                diagnosisCodeTable.getItems().removeAll(
                        diagnosisCodeTable.getSelectionModel().getSelectedItems()
                );
            }
        });
        /*
        patient filter
         */
//        TextField patientSearch = new TextField();
//        patientSearch.setPrefWidth(200);
//        FilteredList<IPatientModel> filteredList = new FilteredList<>(listviewPatient, b -> true);
//        patientSearch.textProperty().addListener((obs, oldValue, newValue) -> {
//            filteredList.setPredicate(patient -> {
//                if (newValue == null || newValue.isEmpty()) {
//                    return true;
//                }
//                String lowerCaseFilter = newValue.toLowerCase();
//
//                if (patient.getFname().toLowerCase().contains(lowerCaseFilter)) {
//                    return true;
//                } else if(patient.getLname().toLowerCase().contains(lowerCaseFilter)) {
//                    return true;
//                }else if(String.valueOf(patient.getMrn()).contains(lowerCaseFilter)){
//                    return true;
//                }else return false;
//            });
//        });
//        SortedList<IPatientModel> sortedList = new SortedList<>(filteredList);
//        sortedList.comparatorProperty().bind(patientTable.comparatorProperty());
//        patientTable.setItems(sortedList);

    }

    private static void showDetails(IAppointmentModel appointmentModel) {
        try {
            switch (appointmentModel.getType()) {
                case GAIT -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Visits/VisitDetailsGait.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("GAIT Visit Details:   ");
                    //height 680 width 800
                    stage1.setScene(new Scene(popUp, 800, 680));
                    stage1.show();
                }
                case UE -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Visits/VisitDetailsUE.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("UE Visit Details:   ");
                    //height 680 width 800
                    stage1.setScene(new Scene(popUp, 800, 680));
                    stage1.show();
                }
                case FOOT -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Visits/VisitDetailsFootEval.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("Foot Eval Visit Details:   ");
                    //height 680 width 800
                    stage1.setScene(new Scene(popUp, 800, 680));
                    stage1.show();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void showCompendium(IAppointmentModel appointmentModel) throws IOException {
        try {
            switch (appointmentModel.getType()) {
                case GAIT -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/GenerateCompendiumSide.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("Patient Compendium:   ");
                    //height 680 width 800
                    stage1.setScene(new Scene(popUp, 800, 690));
                    stage1.show();
                }
                case UE -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/UE/GenerateUECompendium.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("Patient Compendium:   ");
                    stage1.setScene(new Scene(popUp, 800, 690));
                    stage1.show();
                }
                case FOOT -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/FootEval/GenerateFootCompendium.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("Patient Compendium:   ");
                    stage1.setScene(new Scene(popUp, 800, 690));
                    stage1.show();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private static void showInterpretation(IAppointmentModel appointmentModel) throws IOException {
        try {
            switch (appointmentModel.getType()) {
                case GAIT -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/GAIT/GenerateGAITInterpretation.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("Patient Interpretation:   ");
                    //height 680 width 800
                    stage1.setScene(new Scene(popUp, 900, 700));
                    stage1.show();
                }
                case UE -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/GenerateUEInterpretation.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("Patient Interpretation:   ");
                    stage1.setScene(new Scene(popUp, 800, 637));
                    stage1.show();
                }
                case FOOT -> {
                    Parent popUp;
                    popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/FootEval/GenerateFootInterpretation.fxml")));
                    Stage stage1 = new Stage();
                    stage1.setTitle("Patient Interpretation:   ");
                    stage1.setScene(new Scene(popUp, 780, 600));
                    stage1.show();
                }
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

   TextField patientSearch = new TextField();
    private final ObservableList<IPatientModel> listviewPatient = FXCollections.observableArrayList();

    private final String defaultVal = "Select...";
    ObjectProperty<IPatientModel> valueObj = new SimpleObjectProperty<>();
    TableView<IPatientModel> patientTable = buildTable(valueObj);
    @Autowired
    PatientService patientService;

    public void onDisplayPatients() {
        Popup popup = new Popup();
        popup.getContent().addAll(patientTable);
        popup.setAutoHide(true);
       patientTable.setItems(FXCollections.observableArrayList(patientService.findAll()));

        Label valueLabel = new Label(defaultVal);
        valueLabel.setMaxWidth(Double.POSITIVE_INFINITY);
        HBox.setHgrow(valueLabel, Priority.ALWAYS);

        StackPane arrow = new StackPane();
        arrow.setStyle("-fx-background-color:#444444;-fx-shape:\"M 0 0 h 7 l -3.5 4 z\";-fx-padding: 4px;");
        arrow.setMaxSize(8, 8);

        HBox pane = new HBox(100, valueLabel);
        pane.setSpacing(100);

        pane.setAlignment(Pos.CENTER);
        pane.setMaxWidth(Double.POSITIVE_INFINITY);
        dropDownBtn.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        dropDownBtn.setPrefWidth(300);
        dropDownBtn.setGraphic(pane);
        dropDownBtn.setOnAction(e -> {
            if (!popup.isShowing()) {
                Bounds bounds = dropDownBtn.localToScreen(dropDownBtn.getLayoutBounds());
                popup.show(dropDownBtn, bounds.getMinX(), bounds.getMaxY());
            }
        });

        valueObj.addListener((obs, old, val) -> {
            if (val != null) {
                valueLabel.setText(val.getMrn() + " ");
               // valueLabel.setText(val.getMrn() + "  " + val.getFirstName()) + "  " + val.getLastName());
                patientNameTextField.setText(val.getFirstName());
                LastNameTextField.setText(val.getLastName());
                preferredNameTextField.setText(val.getPreferredFirstName());
                formerLastName.setText(val.getFormerLastName());
                mrnTextfield.setText(val.getMrn());
                genderTextfield.setText(val.getGender());
                dobTextfield.setText(val.getDob());
                commentsTextField.setText(val.getComments());
            } else {
                valueLabel.setText(defaultVal);
            }
            popup.hide();
        });

    }

    private final ObservableList<IPatientModel> listView = FXCollections.observableArrayList();


    private TableView<IPatientModel> buildTable(ObjectProperty<IPatientModel> valueObj) {

        TableView<IPatientModel> tableView1 = new TableView<>();

        TableColumn<IPatientModel, String> fnCol = new TableColumn<>("First Name");
        TableColumn<IPatientModel, String> lnCol = new TableColumn<>("Last Name");
        TableColumn<IPatientModel, String> mrnCol = new TableColumn<>("MRN");

        fnCol.setCellValueFactory((new PropertyValueFactory<>("firstName")));
        lnCol.setCellValueFactory((new PropertyValueFactory<>("lastName")));
        mrnCol.setCellValueFactory((new PropertyValueFactory<>("mrn")));

        ObservableList<IPatientModel> items = FXCollections.observableArrayList();

        tableView1.getColumns().addAll(mrnCol, fnCol, lnCol);

        tableView1.setRowFactory(param -> new TableRow<>() {
            {
                setOnMouseClicked(e -> {
                    if (getItem() != null) {
                        valueObj.set(getItem());
                    }
                });
            }
        });
        return tableView1;
    }

    /*
    add surgery actions
     */
    public void addSurgery() {
        int selectedIndex = surgeryTableView.getSelectionModel().getSelectedIndex();

        try {
            ISurgeryModel newSurgery = showSurgeryDialog(
                    new ISurgeryModel(), "Add Surgery"
            );
            if (newSurgery != null) {
                surgeryTableView.getItems().add(
                        selectedIndex + 1,
                        newSurgery
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private ISurgeryModel showSurgeryDialog(ISurgeryModel surgeryModel, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Wizards/AddSurgery.fxml"));
        Parent surgeryPane = fxmlLoader.load();
        AddSurgeryController addSurgeryController = fxmlLoader.getController();

        addSurgeryController.setSurgery(surgeryModel);

        Stage addSurgeryStage = new Stage((StageStyle.UTILITY));
        addSurgeryStage.initModality(Modality.WINDOW_MODAL);
        addSurgeryStage.initOwner(getMyWindow());
        addSurgeryStage.setTitle(title);
        addSurgeryStage.setScene(new Scene(surgeryPane, 600, 480));
        addSurgeryStage.showAndWait();

        return addSurgeryController.isSaved() ? surgeryModel : null;
    }
    private Window getMyWindow() {
        return surgeryTableView.getScene().getWindow();
    }

    /*
    add diagnosis codes
     */
    private final DiagnosisService diagnosisService;
    public void addDiagnosisCode() {
        int selectedIndex = diagnosisCodeTable.getSelectionModel().getSelectedIndex();
        String selectedItem = String.valueOf(diagnosisCodeTable.getSelectionModel().getSelectedItems());

        try {
            IDiagnosisModel newDiagnosisCode = showDiagnosisDialog(
                    new IDiagnosisModel(null, null)
            );
            if (newDiagnosisCode != null) {
                diagnosisCodeTable.getItems().add(
                        selectedIndex + 1,
                        newDiagnosisCode
                );
            }
            System.out.println(newDiagnosisCode);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private IDiagnosisModel showDiagnosisDialog(IDiagnosisModel diagnosisModel) throws IOException {
        IDiagnosisModel iDiagnosisModel = diagnosisCodeTable.getSelectionModel().getSelectedItem();
        FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("/Wizards/NewDiagnosisCode.fxml"));
        fxmlLoader.setControllerFactory(applicationContext::getBean);
        Parent diagCodePane = fxmlLoader.load();
        NewDiagnosisCodeController newDiagnosisCodeController = fxmlLoader.getController();
        newDiagnosisCodeController.setDiagCode(diagnosisModel);

        Stage addDiagStage = new Stage((StageStyle.UTILITY));
        addDiagStage.initModality(Modality.WINDOW_MODAL);
        addDiagStage.initOwner(getDiagWindow());
        addDiagStage.setScene(new Scene(diagCodePane, 600, 460));
        addDiagStage.showAndWait();

        return newDiagnosisCodeController.isSaved() ? diagnosisModel : null;
    }

    private Window getDiagWindow() {
        return diagnosisCodeTable.getScene().getWindow();
    }


    /*
    add botox actions
     */
    public void addBotox() {
        int selectedItem = botoxTableView.getSelectionModel().getSelectedIndex();

        try {
            IBotoxModel newBotox = showBotoxDialog(
                    new IBotoxModel(null, null, null, null, null, null)
            );
            if (newBotox != null) {
                botoxTableView.getItems().add(
                        selectedItem + 1,
                        newBotox
                );
            }
        } catch (IOException ignored) {

        }
    }

    private IBotoxModel showBotoxDialog(IBotoxModel botoxModel) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Wizards/AddBotox.fxml"));
        Parent botoxPane = fxmlLoader.load();
        AddBotoxController addBotoxController = fxmlLoader.getController();

        addBotoxController.setBotox(botoxModel);
        Stage addBotoxStage = new Stage((StageStyle.UTILITY));
        addBotoxStage.initModality(Modality.WINDOW_MODAL);
        addBotoxStage.initOwner(getBotoxWindow());
        addBotoxStage.setScene(new Scene(botoxPane, 600, 480));
        addBotoxStage.showAndWait();

        return addBotoxController.isSaved() ? botoxModel : null;
    }

    private Window getBotoxWindow() {
        return botoxTableView.getScene().getWindow();
    }

    /*
    health history actions
     */
    public void addHealthHistory() {
        int selectedIndex = healthTableView.getSelectionModel().getSelectedIndex();
        try {
            IHealthHistoryModel newHealthHistory = showHealthDialog(
                    new IHealthHistoryModel(), ""

            );
            if (newHealthHistory != null) {
                healthTableView.getItems().add(
                        selectedIndex + 1,
                        newHealthHistory
                );
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private IHealthHistoryModel showHealthDialog(IHealthHistoryModel healthHistoryModel, String title) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(Launcher.class.getResource("/Wizards/AddHealthCondition.fxml"));
        Parent healthPane = fxmlLoader.load();
        AddHealthConditionController addHealthConditionController = fxmlLoader.getController();

        addHealthConditionController.setHealthHistory(healthHistoryModel);

        Stage addHealthStage = new Stage((StageStyle.UTILITY));
        addHealthStage.initModality(Modality.WINDOW_MODAL);
        addHealthStage.initOwner(getHealthWindow());
        addHealthStage.setScene(new Scene(healthPane, 350, 195));
        addHealthStage.showAndWait();

        return addHealthConditionController.isSaved() ? healthHistoryModel : null;
    }

    private Window getHealthWindow() {
        return healthTableView.getScene().getWindow();
    }

    /*
    module onclick actions
     */
    @FXML
    public void onFormClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/FormsModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onSchedulerClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/SchedulerModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onReportClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/ReportsModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    public void onAdminClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/AdminModule.fxml"));
        Parent root =loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }


    @FXML
    public void onQueriesClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/QueriesModule.fxml"));
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    public void logout() {
            stage = (Stage) scenePane.getScene().getWindow();
            stage.close();
    }

    public void OnNewPatientClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setControllerFactory(applicationContext::getBean);
        loader.setLocation(getClass().getResource("/NewPatientModule.fxml"));
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));
        Parent root = loader.load();
        NewPatientModuleController newPatientModuleController = loader.getController();



        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.getIcons().add(icon);
        stage.setTitle("Nemours");
        stage.setScene(scene);
        stage.show();
    }


//    public void onNewForm(ActionEvent event) throws IOException {
//        Parent popUp;
//        popUp = FXMLLoader.load(Objects.requireNonNull(GaitApplication.class.getResource("Forms/GAITPhysExam.fxml")));
//        Stage stage1 = new Stage();
//        stage1.setTitle("Gait Physical Examination");
//        stage1.setScene(new Scene(popUp, 800, 620));
//        stage1.show();
//    }

    public void onNewForm(ActionEvent event) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/FormComboBox.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Patient Forms");
        stage1.setScene(new Scene(popUp, 320, 150));
        stage1.show();
    }

    public BorderPane bp;

    public void onVideo(ActionEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Details/PatientVideos.fxml")));
        bp.setCenter(root);
        if (videoRadio.isSelected()) {
            photoRadio.setSelected(false);
            PDFViewer.setSelected(false);
        }
    }

    public void onPhoto(ActionEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Details/PatientPhotos.fxml")));
        bp.setCenter(root);
        if (photoRadio.isSelected()) {
            videoRadio.setSelected(false);
            PDFViewer.setSelected(false);
        }
    }

    public void onPDFViewer(ActionEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Details/PatientsPDF.fxml")));
        bp.setCenter(root);
        if (PDFViewer.isSelected()) {
            photoRadio.setSelected(false);
            videoRadio.setSelected(false);
        }
    }

}

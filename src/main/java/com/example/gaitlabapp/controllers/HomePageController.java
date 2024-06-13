//package com.example.gaitlabapp.controllers;
//
//import com.example.gaitlabapp.GaitLabAppApplication;
//
//import com.example.gaitlabapp.model.patients.IPatientModel;
//import javafx.beans.property.ObjectProperty;
//import javafx.beans.property.SimpleObjectProperty;
//import javafx.collections.FXCollections;
//import javafx.collections.ObservableList;
//import javafx.event.ActionEvent;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.geometry.Bounds;
//import javafx.geometry.Pos;
//import javafx.scene.Node;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.scene.image.Image;
//import javafx.scene.layout.AnchorPane;
//import javafx.scene.layout.HBox;
//import javafx.scene.layout.Priority;
//import javafx.stage.Popup;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.util.Objects;
//
//public class HomePageController {
//    public Button newPatient;
//    public Button dropDownBtn;
//    @FXML
//    private Button patient;
//    @FXML
//    private Button scheduler;
//    @FXML
//    private Button forms;
//    @FXML
//    private Button reports;
//    @FXML
//    private Button queries;
//    @FXML
//    private Button admin;
//    @FXML
//    private Button users;
//    @FXML
//    private Button logout;
//    @FXML
//    private Label nameLabel;
//    private Stage stage;
//
//    private Scene scene;
//    private Parent root;
//    @FXML
//    private AnchorPane scenePane;
//
//
//  //  ObjectProperty<PatientModuleController.TableObj> valueObj = new SimpleObjectProperty<>();
//    private final String defaultVal = "Select...";
//
//    ObjectProperty<IPatientModel> valueObj = new SimpleObjectProperty<>();
//    public void onDisplayPatients(){
//        TableView<IPatientModel> patientTable = buildTable(valueObj);
//        Popup popup = new Popup();
//        popup.getContent().add(patientTable);
//        popup.setAutoHide(true);
//
//        Label valueLabel = new Label(defaultVal);
//        valueLabel.setMaxWidth(Double.POSITIVE_INFINITY);
//        HBox.setHgrow(valueLabel, Priority.ALWAYS);
//
//        HBox pane = new HBox(10, valueLabel);
//        pane.setAlignment(Pos.CENTER_LEFT);
//        pane.setMaxWidth(Double.POSITIVE_INFINITY);
//
//        dropDownBtn.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
//        dropDownBtn.setPrefWidth(300);
//        dropDownBtn.setGraphic(pane);
//        dropDownBtn.setOnMousePressed(e -> {
//            if (!popup.isShowing()) {
//                Bounds bounds = dropDownBtn.localToScreen(dropDownBtn.getLayoutBounds());
//                popup.show(dropDownBtn, bounds.getMinX(), bounds.getMaxY());
//            }
//        });
//
//        valueObj.addListener((obs, old, val) -> {
//            if (val != null) {
//                valueLabel.setText(val.getMrn()+ "  " + val.getFname() + "  " +  val.getLname());
//            } else {
//                valueLabel.setText(defaultVal);
//            }
//            popup.hide();
//        });
//
//    }
//
//    private TableView<IPatientModel> buildTable(ObjectProperty<IPatientModel> valueObj){
//        TableView<IPatientModel> tableView1 = new TableView<>();
//        TableColumn<IPatientModel, String> fnCol = new TableColumn<>("First Name");
//        TableColumn<IPatientModel, String> lnCol = new TableColumn<>("Last Name");
//        TableColumn<IPatientModel, String> mrnCol = new TableColumn<>("MRN");
//
//        fnCol.setCellValueFactory(param ->
//                param.getValue().fnameProperty());
//        lnCol.setCellValueFactory(param ->
//                param.getValue().lnameProperty());
//        mrnCol.setCellValueFactory(param ->
//                param.getValue().mrnProperty());
//        ObservableList<IPatientModel> items = FXCollections.observableArrayList();
//
//        tableView1.getColumns().addAll(mrnCol, fnCol, lnCol);
//        tableView1.setItems(items);
//        tableView1.setRowFactory(param -> new TableRow<>(){
//            {
//                setOnMouseClicked(e -> {
//                    if(getItem() !=null){
//                        valueObj.set(getItem());
//                    }
//                });
//            }
//        });
//        return tableView1;
//    }
//
//
//    @FXML
//    public void onPatientClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/PatientModule.fxml")));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        Image icon = new Image("C:\\dev\\gait-ui\\src\\images\\nemours_logo.png");
//
//
//        stage.getIcons().add(icon);
//        stage.setTitle("Nemours Children's Hospital Gait Lab");
////        stage.setX(200);
////        stage.setY(10);
//        stage.setScene(scene);
//        stage.show();
//
//    }
//
//    @FXML
//    public  void onFormClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/FormsModule.fxml")));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        Image icon = new Image("C:\\dev\\gait-ui\\src\\images\\nemours_logo.png");
//
//
//        stage.getIcons().add(icon);
//        stage.setTitle("Nemours Children's Hospital Gait Lab");
////        stage.setX(200);
////        stage.setY(10);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @FXML
//    public  void onSchedulerClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/SchedulerModule.fxml")));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        Image icon = new Image("C:\\dev\\gait-ui\\src\\images\\nemours_logo.png");
//
//
//        stage.getIcons().add(icon);
//        stage.setTitle("Nemours Children's Hospital Gait Lab");
////        stage.setX(200);
////        stage.setY(10);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @FXML
//    public  void onReportClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/ReportsModule.fxml")));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        Image icon = new Image("C:\\dev\\gait-ui\\src\\images\\nemours_logo.png");
//
//
//        stage.getIcons().add(icon);
//        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setScene(scene);
////        stage.setX(200);
////        stage.setY(10);
//        stage.show();
//    }
//
//    @FXML
//    public  void onAdminClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/AdminModule.fxml")));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        Image icon = new Image("C:\\dev\\gait-ui\\src\\images\\nemours_logo.png");
//
//
//        stage.getIcons().add(icon);
//        stage.setTitle("Nemours Children's Hospital Gait Lab");
////        stage.setX(200);
////        stage.setY(10);
//        stage.setScene(scene);
//        stage.show();
//    }
//
//    @FXML
//    public  void onQueriesClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/QueriesModule.fxml")));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        Image icon = new Image("C:\\dev\\gait-ui\\src\\images\\nemours_logo.png");
//
//
//        stage.getIcons().add(icon);
//        stage.setTitle("Nemours Children's Hospital Gait Lab");
////        stage.setX(200);
////        stage.setY(10);
//        stage.setScene(scene);
//        stage.show();
//    }
//    public void logout(ActionEvent event){
//
//        Alert alert = new Alert(Alert.AlertType.CONFIRMATION);
//        alert.setTitle("Logout");
//        alert.setHeaderText("You're about to logout!");
//        alert.setContentText("Are you sure you would like to logout?");
//
//        if(alert.showAndWait().get() == ButtonType.OK) {
//            stage = (Stage) scenePane.getScene().getWindow();
//            stage.close();
//        }
//    }
//
//    public  void OnNewPatientClick(ActionEvent event) throws IOException {
//        Parent root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("/NewPatientModule.fxml")));
//        stage = (Stage)((Node)event.getSource()).getScene().getWindow();
//        scene = new Scene(root);
//        Image icon = new Image("C:\\dev\\gait-ui\\src\\images\\nemours_logo.png");
//
//
//        stage.getIcons().add(icon);
//        stage.setTitle("Nemours Children's Hospital Gait Lab");
//        stage.setScene(scene);
//        stage.show();
//    }
//}

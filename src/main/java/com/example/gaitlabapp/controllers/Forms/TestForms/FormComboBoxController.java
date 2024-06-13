package com.example.gaitlabapp.controllers.Forms.TestForms;//package dev.gait.gaitui.Controller.Forms;
//
//import dev.gait.gaitui.GaitApplication;
//import javafx.beans.value.ChangeListener;
//import javafx.beans.value.ObservableValue;
//import javafx.fxml.FXML;
//import javafx.fxml.FXMLLoader;
//import javafx.fxml.Initializable;
//import javafx.scene.Parent;
//import javafx.scene.Scene;
//import javafx.scene.control.*;
//import javafx.stage.Stage;
//
//import java.io.IOException;
//import java.net.URL;
//import java.util.*;
//
//
//public class FormComboBoxController implements Initializable {
//
//
//    @FXML
//    public String scroll;
//    @FXML
//    public String tab;
//    @FXML
//    private ComboBox<String> formComboBox;
//    @FXML
//    private Button cancelButton;
//
//    private Scene scene;
//    private Stage stage;
//    private Parent root;
//
//    @FXML
//    private Label selectedForm;
//
//
//    @Override
//    public void initialize(URL FormComboBox, ResourceBundle resourceBundle) {
//        assert scroll != null : "fx:id = scroll";
//        assert tab != null : "fx:id=tab";
//        assert selectedForm != null : "fx:id=selectedForm";
//
//
//        formComboBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>() {
//            @Override
//            public void changed(ObservableValue<? extends String> observableValue, String newForm, String oldForm) {
//                if (scroll.equals("PT Evaluation_Scroll")) {
//                    switch (oldForm) {
//                        case "PT Evaluation_Scroll":
//                            try {
//                                Parent popUp;
//                                popUp = FXMLLoader.load(Objects.requireNonNull(GaitApplication.class.getResource("Forms/GAITPhysExam.fxml")));
//                                Stage stage1 = new Stage();
//                                stage1.setTitle("PT Eval Scroll");
//                                stage1.setScene(new Scene(popUp, 800, 620));
//                                stage1.show();
//                                break;
//                            } catch (IOException e) {
//                                throw new RuntimeException(e);
//                            }
//                        case "PT Evaluation_Tab":
//                            try {
//                                Parent popUp;
//                                popUp = FXMLLoader.load(Objects.requireNonNull(GaitApplication.class.getResource("Forms/PT Evaluation_Tab.fxml")));
//                                Stage stage1 = new Stage();
//                                stage1.setTitle("PT Eval Scroll");
//                                stage1.setScene(new Scene(popUp, 620, 620));
//                                stage1.show();
//                                break;
//                            } catch (IOException e) {
//                                throw new RuntimeException(e);
//                            }
//                    }
//                }
//            }
//        });
//
//    }
//
//    public void onCancel() {
//        this.formComboBox.getScene().getWindow().hide();
//    }
//}

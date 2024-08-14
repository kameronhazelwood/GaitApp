package com.example.gaitlabapp.controllers.Visits;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.config.Config;
import javafx.animation.PauseTransition;
import javafx.beans.value.ChangeListener;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.util.Duration;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Objects;
import java.util.ResourceBundle;


public class VisitDetailsUEController implements Initializable {

    public ComboBox ueFMS5;
    public TextField activeForProL;
    @FXML
    private RadioButton CPwK0;

    @FXML
    private RadioButton CPwK1;

    @FXML
    private RadioButton CPwK2;

    @FXML
    private RadioButton CPwK3;

    @FXML
    private RadioButton CPwK4;

    @FXML
    private RadioButton CPwK5;

    @FXML
    private RadioButton FP0;

    @FXML
    private RadioButton FP1;

    @FXML
    private RadioButton FP2;

    @FXML
    private RadioButton FP3;

    @FXML
    private RadioButton FP4;

    @FXML
    private RadioButton FP5;

    @FXML
    private ComboBox<?> FPFing;

    @FXML
    private ComboBox<?> FPThum;

    @FXML
    private RadioButton FS0;

    @FXML
    private RadioButton FS1;

    @FXML
    private RadioButton FS2;

    @FXML
    private RadioButton FS3;

    @FXML
    private RadioButton FS4;

    @FXML
    private RadioButton FS5;

    @FXML
    private RadioButton PAP0;

    @FXML
    private RadioButton PAP1;

    @FXML
    private RadioButton PAP2;

    @FXML
    private RadioButton PAP3;

    @FXML
    private RadioButton PAP4;

    @FXML
    private RadioButton PAP5;

    @FXML
    private RadioButton PSO0;

    @FXML
    private RadioButton PSO1;

    @FXML
    private RadioButton PSO2;

    @FXML
    private RadioButton PSO3;

    @FXML
    private RadioButton PSO4;

    @FXML
    private RadioButton PSO5;

    @FXML
    private RadioButton PSOB0;

    @FXML
    private RadioButton PSOB1;

    @FXML
    private RadioButton PSOB2;

    @FXML
    private RadioButton PSOB3;

    @FXML
    private RadioButton PSOB4;

    @FXML
    private RadioButton PSOB5;

    @FXML
    private RadioButton SB0;

    @FXML
    private RadioButton SB1;

    @FXML
    private RadioButton SB2;

    @FXML
    private RadioButton SB3;

    @FXML
    private RadioButton SB4;

    @FXML
    private RadioButton SB5;

    @FXML
    private ComboBox<?> SBFin;

    @FXML
    private ComboBox<?> SBThum;

    @FXML
    private RadioButton TP0;

    @FXML
    private RadioButton TP1;

    @FXML
    private RadioButton TP2;

    @FXML
    private RadioButton TP3;

    @FXML
    private RadioButton TP4;

    @FXML
    private RadioButton TP5;

    @FXML
    private ComboBox<?> TPFing;

    @FXML
    private ComboBox<?> TPThum;

    @FXML
    private RadioButton UBC0;

    @FXML
    private RadioButton UBC1;

    @FXML
    private RadioButton UBC2;

    @FXML
    private RadioButton UBC3;

    @FXML
    private RadioButton UBC4;

    @FXML
    private RadioButton UBC5;

    @FXML
    private TextField UEDateFinalized;

    @FXML
    private TextField UEDatePrinted;

    @FXML
    private ComboBox<?> UEFMS5;

    @FXML
    private TextField UEaptAttended;

    @FXML
    private TextField UEaptComment;

    @FXML
    private TextField UEaptDate;

    @FXML
    private TextField UEaptDateProcessed;

    @FXML
    private TextField UEaptDateSent;

    @FXML
    private TextField UEaptDiagnosis;

    @FXML
    private TextField UEaptMd;

    @FXML
    private TextField UEaptPT;

    @FXML
    private TextField UEaptReason;

    @FXML
    private TextField UEaptReferringMd;

    @FXML
    private TextField UEaptStartTime;

    @FXML
    private TextField UEaptStopTime;

    @FXML
    private TextField UEaptSubType;

    @FXML
    private TextField UEaptTime;

    @FXML
    private TextField UEaptVisitType;

    @FXML
    private TextField UEbiomech2;

    @FXML
    private TextField UEdate;

    @FXML
    private TextField UEdateSentToEpic;

    @FXML
    private TextField UEinterpDate;

    @FXML
    private TextField UEpt2;

    @FXML
    private TextField UEvisitBio;

    @FXML
    private TextField UEvisitPt;

    @FXML
    private ComboBox<?> UnscrewBotCapWrist1;

    @FXML
    private ComboBox<?> UnscrewBotCapWrist2;

    @FXML
    private ComboBox<?> acceptCoins;

    @FXML
    private TextField activeElbExL;

    @FXML
    private TextField activeElbExR;

    @FXML
    private TextField activeElbFexL;

    @FXML
    private TextField activeElbFexR;

    @FXML
    private TextField activeFinExtL;

    @FXML
    private TextField activeFinExtR;

    @FXML
    private TextField activeFinFlexL;

    @FXML
    private TextField activeFinFlexR;

    @FXML
    private TextField activeForProR;

    @FXML
    private TextField activeForeSupL;

    @FXML
    private TextField activeForeSupR;

    @FXML
    private TextField activeShouldExRot90L;

    @FXML
    private TextField activeShouldExRot90R;

    @FXML
    private TextField activeShouldInRot90L;

    @FXML
    private TextField activeShouldInRot90R;

    @FXML
    private TextField activeShoulderAbdL;

    @FXML
    private TextField activeShoulderAbdR;

    @FXML
    private TextField activeShoulderExRotL;

    @FXML
    private TextField activeShoulderExRotR;

    @FXML
    private TextField activeShoulderFlexL;

    @FXML
    private TextField activeShoulderFlexR;

    @FXML
    private TextField activeShoulderInRotL;

    @FXML
    private TextField activeShoulderInRotR;

    @FXML
    private TextField activeThuCMCPalL;

    @FXML
    private TextField activeThuCMCPalR;

    @FXML
    private TextField activeThuCMCRadL;

    @FXML
    private TextField activeThuCMCRadR;

    @FXML
    private TextField activeThuMCPL;

    @FXML
    private TextField activeThuMCPR;

    @FXML
    private TextField activeThuOppL;

    @FXML
    private TextField activeThuOppR;

    @FXML
    private TextField activeWristExL;

    @FXML
    private TextField activeWristExR;

    @FXML
    private TextField activeWristFlexL;

    @FXML
    private TextField activeWristFlexR;

    @FXML
    private TextField activeWristRadL;

    @FXML
    private TextField activeWristRadR;

    @FXML
    private TextField activeWristUlL;

    @FXML
    private TextField activeWristUlR;

    @FXML
    private ComboBox<?> crawl;

    @FXML
    private ComboBox<?> cutPlay1;

    @FXML
    private ComboBox<?> cutPlay2;

    @FXML
    private Tab dataTab;

    @FXML
    private TreeView<String> dataTable;

    @FXML
    private TextField distalMuscL;

    @FXML
    private ComboBox<?> distalMuscLinterp;

    @FXML
    private TextField distalMuscR;

    @FXML
    private ComboBox<?> distalMuscRinterp;

    @FXML
    private ComboBox<?> earWithPalm;

    @FXML
    private TextField elbExtL;

    @FXML
    private ComboBox<?> elbExtLInterp;

    @FXML
    private TextField elbExtR;

    @FXML
    private ComboBox<?> elbExtRInterp;

    @FXML
    private TextField elbFlexL;

    @FXML
    private ComboBox<?> elbFlexLinterp;

    @FXML
    private TextField elbFlexR;

    @FXML
    private ComboBox<?> elbFlexRInterp;

    @FXML
    private ComboBox<?> fastenShow;

    @FXML
    private CheckBox fastenerAssist;

    @FXML
    private TextField fastenersComments;

    @FXML
    private CheckBox fastenersDep;

    @FXML
    private CheckBox fastenersIndep;

    @FXML
    private ComboBox<?> handToMouth;

    @FXML
    private CheckBox hygieneAssist;

    @FXML
    private TextField hygieneComments;

    @FXML
    private CheckBox hygieneDept;

    @FXML
    private CheckBox hygieneIndep;

    @FXML
    private TextField lFootLength;

    @FXML
    private TextField lFootWidth;

    @FXML
    private CheckBox leAssist;

    @FXML
    private TextField leComments;

    @FXML
    private CheckBox leDependent;

    @FXML
    private CheckBox leIndependent;

    @FXML
    private RadioButton mfw1;

    @FXML
    private RadioButton mfw2;

    @FXML
    private RadioButton mfw3;

    @FXML
    private RadioButton mfw4;

    @FXML
    private RadioButton mfw5;

    @FXML
    private ComboBox<?> mfwFing;

    @FXML
    private ComboBox<?> mfwThum;

    @FXML
    private RadioButton mwf0;

    @FXML
    private CheckBox orthoAssist;

    @FXML
    private TextField orthoComm;

    @FXML
    private CheckBox orthoIndep;

    @FXML
    private CheckBox orthodep;

    @FXML
    private TextField passiveElbExL;

    @FXML
    private TextField passiveElbExR;

    @FXML
    private TextField passiveElbFexL;

    @FXML
    private TextField passiveElbFexR;

    @FXML
    private TextField passiveFinExtL;

    @FXML
    private TextField passiveFinExtR;

    @FXML
    private TextField passiveFinFlexL;

    @FXML
    private TextField passiveFinFlexR;

    @FXML
    private TextField passiveForProL;

    @FXML
    private TextField passiveForProR;

    @FXML
    private TextField passiveForeSupL;

    @FXML
    private TextField passiveForeSupR;

    @FXML
    private TextField passiveShouldExRot90L;

    @FXML
    private TextField passiveShouldExRot90R;

    @FXML
    private TextField passiveShouldInRot90L;

    @FXML
    private TextField passiveShouldInRot90R;

    @FXML
    private TextField passiveShoulderAbdL;

    @FXML
    private TextField passiveShoulderAbdR;

    @FXML
    private TextField passiveShoulderExRotL;

    @FXML
    private TextField passiveShoulderExRotR;

    @FXML
    private TextField passiveShoulderFlexL;

    @FXML
    private TextField passiveShoulderFlexR;

    @FXML
    private TextField passiveThuCMCPalL;

    @FXML
    private TextField passiveThuCMCPalR;

    @FXML
    private TextField passiveThuCMCRadL;

    @FXML
    private TextField passiveThuCMCRadR;

    @FXML
    private TextField passiveThuMCPL;

    @FXML
    private TextField passiveThuMCPR;

    @FXML
    private TextField passiveThuOppL;

    @FXML
    private TextField passiveThuOppR;

    @FXML
    private TextField passiveWristExL;

    @FXML
    private TextField passiveWristExR;

    @FXML
    private TextField passiveWristFlexL;

    @FXML
    private TextField passiveWristFlexR;

    @FXML
    private TextField passiveWristRadL;

    @FXML
    private TextField passiveWristRadR;

    @FXML
    private TextField passiveWristUlL;

    @FXML
    private TextField passiveWristUlR;

    @FXML
    private TextField passtiveShoulderInRotL;

    @FXML
    private TextField passtiveShoulderInRotR;

    @FXML
    private Tab physExamUE;

    @FXML
    private TextField promxMuscL;

    @FXML
    private ComboBox<?> promxMuscLinterp;

    @FXML
    private TextField promxMuscR;

    @FXML
    private ComboBox<?> promxMuscRinterp;

    @FXML
    private ComboBox<?> pullApartPlay1;

    @FXML
    private ComboBox<?> pullApartPlay2;

    @FXML
    private TextField rFootLength;

    @FXML
    private TextField rFootWidth;

    @FXML
    private ComboBox<?> recieve5;

    @FXML
    private Tab reportTab;

    @FXML
    private CheckBox shoesAssist;

    @FXML
    private TextField shoesComments;

    @FXML
    private CheckBox shoesDepen;

    @FXML
    private CheckBox shoesDepend;

    @FXML
    private CheckBox shoesIndep;

    @FXML
    private TextField shoulderExtL;

    @FXML
    private ComboBox<?> shoulderExtLInterp;

    @FXML
    private TextField shoulderExtR;

    @FXML
    private ComboBox<?> shoulderExtRInterp;

    @FXML
    private TextField shoulderFexL;

    @FXML
    private TextField shoulderFexR;

    @FXML
    private ComboBox<?> shoulderFexRInterp;

    @FXML
    private Button sideNavCompen;

    @FXML
    private Button sideNavInterp;

    @FXML
    private CheckBox socksAssist;

    @FXML
    private TextField socksComments;

    @FXML
    private CheckBox socksIndep;

    @FXML
    private ComboBox<?> socksOn;

    @FXML
    private ComboBox<?> stickerOnBall;

    @FXML
    private CheckBox ueAssist;

    @FXML
    private TextArea ueComments;

    @FXML
    private TextField ueComments2;

    @FXML
    private CheckBox ueDependent;

    @FXML
    private ComboBox<?> ueFMS50;

    @FXML
    private ComboBox<?> ueFMS500;

    @FXML
    private ComboBox<?> ueGMFCS;

    @FXML
    private TextField ueHeight;

    @FXML
    private CheckBox ueIndependent;

    @FXML
    private ComboBox<?> ueMACS;

    @FXML
    private TextField ueWeight;

    @FXML
    private ComboBox<?> wristExtGrasp;

    @FXML
    private TextField wristExtL;

    @FXML
    private ComboBox<?> wristExtLInterp;

    @FXML
    private TextField wristExtR;

    @FXML
    private ComboBox<?> wristExtRInterp;

    @FXML
    private ComboBox<?> wristExtRelease;

    @FXML
    private ComboBox<?> wristFlexGrasp;

    @FXML
    private TextField wristFlexL;

    @FXML
    private ComboBox<?> wristFlexLinterp;

    @FXML
    private TextField wristFlexR;

    @FXML
    private ComboBox<?> wristFlexRelease;

    @FXML
    private ComboBox<?> wristFlexRinterp;

    @FXML
    private ComboBox<?> wristNeutGrasp;

    @FXML
    private ComboBox<?> wristNeutRelease;


    //parent root
    TreeItem<String> parentDataRoot = new TreeItem<>("");
    TreeItem<String> parentPhotoVideoRoot = new TreeItem<>("");
    // data types
    TreeItem<String> showAll = new TreeItem<>("Show all");
    TreeItem<String> pngFiles = new TreeItem<String>("PNG Files");
    TreeItem<String> photos = new TreeItem<>("Photos");
    TreeItem<String> videos = new TreeItem<>("Videos");
    TreeItem<String> compendium = new TreeItem<>("Compendium");
    TreeItem<String> interpretation = new TreeItem<>("Interpretation");

    TreeItem<String> kinematics = new TreeItem<>("Kinematics");
    TreeItem<String> footKinematics = new TreeItem<>("Foot Kinematics");
    TreeItem<String> kinetics = new TreeItem<>("Kinetics");
    TreeItem<String> hipJointAngles = new TreeItem<>("Hip Joint Angles");
    TreeItem<String> ankleJointAngles = new TreeItem<>("Ankle Joint Angles");

    TreeItem<String> lateralForefoot = new TreeItem<>("Lateral Forefoot");
    TreeItem<String> medialForefoot = new TreeItem<>("Medial Forefoot");
    TreeItem<String> hipJoint = new TreeItem<>("Hip Joint Moments");
    TreeItem<String> kneeJoint = new TreeItem<>("Knee Joint Moments");
    TreeItem<String> ankleJoint = new TreeItem<>("Ankle Joint Moments");
    Connection connection;
    Config db = new Config();
    Statement statement = null;
    private TextField patientId;
    int patientID = 13;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {


        physExamUE.setOnSelectionChanged(e -> {
            PauseTransition delay = new PauseTransition(Duration.seconds(1));

            BorderPane borderPane = new BorderPane();
            Scene currentScene=new Scene(borderPane,200,10);
            Stage popoverStage= new Stage();

            popoverStage.alwaysOnTopProperty();
            popoverStage.initStyle(StageStyle.UTILITY);
            popoverStage.setTitle("All changes have been saved.");
            popoverStage.setScene(currentScene);
            popoverStage.setY(650);
            popoverStage.setX(100);
            popoverStage.show();
            delay.setOnFinished(event -> popoverStage.close());
            delay.play();
        });




















        // adding to the tree view
        kinematics.getChildren().addAll(hipJointAngles, ankleJointAngles);
        footKinematics.getChildren().addAll(lateralForefoot, medialForefoot);
        kinetics.getChildren().addAll(hipJoint, kneeJoint, ankleJoint);
        pngFiles.getChildren().addAll(kinematics);
        pngFiles.getChildren().addAll(footKinematics);
        pngFiles.getChildren().addAll(kinetics);

        parentDataRoot.getChildren().addAll(showAll);
        parentDataRoot.getChildren().addAll(pngFiles);

        parentDataRoot.setExpanded(true);
        dataTable.setRoot(parentDataRoot);
        this.dataTable.setShowRoot(false);
    }

    Image lateralForeFoot = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_LateralForeFoot.png")));
    Image kneeJointMoments = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_KneeJointMoments.png")));
    Image kneeJointAngles = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_KneeJointAngles.png")));
    Image hipJointMoments = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_HipJointMoments.png")));
    Image hipJointAnglesImage = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_HipJointAngles.png")));
    Image medialForeFoot = new Image(String.valueOf(getClass().getResource("/images/99999999_052223_MedialForeFoot.png")));
    Image comparisonPhoto = new Image(String.valueOf(getClass().getResource("/images/comparison.png")));

    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;


    public void selectedItem() throws IOException {
        TreeItem<String> item = dataTable.getSelectionModel().getSelectedItem();
        if (item.equals(showAll)) {
            Pane pane = new Pane();
            ImageView imageView1 = new ImageView(kneeJointAngles);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            ImageView imageView3 = new ImageView(hipJointAnglesImage);
            ImageView imageView4 = new ImageView(comparisonPhoto);
            ImageView imageView5 = new ImageView(hipJointAnglesImage);
            ImageView imageView6 = new ImageView(comparisonPhoto);
            ImageView imageView7 = new ImageView(lateralForeFoot);
            ImageView imageView8 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(300);
            imageView1.setFitHeight(300);
            imageView1.setTranslateY(0);
            imageView1.setTranslateX(0);
            //image2
            imageView2.setFitHeight(300);
            imageView2.setFitWidth(300);
            imageView2.setTranslateY(0);
            imageView2.setTranslateX(310);

            //image 3
            imageView3.setFitHeight(300);
            imageView3.setFitWidth(300);
            imageView3.setTranslateY(310);
            imageView3.setTranslateX(0);

            //image 4
            imageView4.setFitWidth(300);
            imageView4.setFitHeight(300);
            imageView4.setTranslateY(310);
            imageView4.setTranslateX(310);

            //image 5
            imageView5.setFitHeight(300);
            imageView5.setFitWidth(300);
            imageView5.setTranslateY(0);
            imageView5.setTranslateX(620);

            //image 6
            imageView6.setFitHeight(300);
            imageView6.setFitWidth(300);
            imageView6.setTranslateY(0);
            imageView6.setTranslateX(920);

            //image 7
            imageView7.setFitHeight(300);
            imageView7.setFitWidth(300);
            imageView7.setTranslateY(315);
            imageView7.setTranslateX(620);

            //image 8
            imageView8.setFitHeight(300);
            imageView8.setFitWidth(300);
            imageView8.setTranslateY(315);
            imageView8.setTranslateX(920);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            pane.getChildren().add(imageView3);
            pane.getChildren().add(imageView4);
            pane.getChildren().add(imageView5);
            pane.getChildren().add(imageView6);
            pane.getChildren().add(imageView7);
            pane.getChildren().add(imageView8);

            Scene scene = new Scene(pane, 1200, 650);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(kneeJoint)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(kneeJointAngles);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(hipJointAngles)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(hipJointAnglesImage);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(lateralForefoot)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(lateralForeFoot);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(medialForefoot)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(medialForeFoot);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(ankleJointAngles)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(kneeJointMoments);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }
        if (item.equals(hipJoint)) {
            Pane pane = new HBox(150);
            ImageView imageView1 = new ImageView(hipJointMoments);
            ImageView imageView2 = new ImageView(comparisonPhoto);
            //image1
            imageView1.setFitWidth(400);
            imageView1.setFitHeight(400);
            //image2
            imageView2.setFitHeight(400);
            imageView2.setFitWidth(400);

            pane.getChildren().add(imageView1);
            pane.getChildren().add(imageView2);
            Scene scene = new Scene(pane, 1000, 500);
            Stage stage = new Stage();
            stage.setScene(scene);
            stage.show();
        }

    }

    @FXML
    void onViewCompendium(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/UE/GenerateUECompendium.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Patient Compendium");
        stage1.setScene(new Scene(popUp, 800, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }

    @FXML
    private BorderPane bp;
    public void onVideoAssessment(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationVideoUE.fxml")));
        bp.setCenter(root);
    }

    public void onUEPhys(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/UpperExtremityForm.fxml")));
        bp.setCenter(root);
    }

    public void onKinematics(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationKinematics.fxml")));
        bp.setCenter(root);
    }

    public void onPhotos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationPhotos.fxml")));
        bp.setCenter(root);
    }

    public void onAssessmentForm(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationAssessment.fxml")));
        bp.setCenter(root);
    }

    public void onRecomendations(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationRecommendations.fxml")));
        bp.setCenter(root);
    }

    public void onSignatures(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/InterpretationSignature.fxml")));
        bp.setCenter(root);
    }

    public void onViewInterpretation(ActionEvent actionEvent) throws IOException {
        Parent popUp;
        popUp = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Interpretation/UE/GenerateUEInterpretation.fxml")));
        Stage stage1 = new Stage();
        stage1.setTitle("Patient Compendium");
        stage1.setScene(new Scene(popUp, 700, 680));
        stage1.setScene(popUp.getScene());
        stage1.show();
    }



}

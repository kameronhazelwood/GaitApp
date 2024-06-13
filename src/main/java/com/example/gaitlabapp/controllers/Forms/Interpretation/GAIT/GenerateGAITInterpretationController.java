package com.example.gaitlabapp.controllers.Forms.Interpretation.GAIT;

import com.example.gaitlabapp.GaitLabAppApplication;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.control.ToggleButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.IOException;
import java.util.Objects;


public class GenerateGAITInterpretationController {
    public ToggleButton downloadPDF;
    @FXML
    private ToggleButton GAITPhysButton;

    @FXML
    private AnchorPane ap;

    @FXML
    private ToggleButton assessmentButton;

    @FXML
    private BorderPane bp;

    @FXML
    private ToggleButton emgButton;

    @FXML
    private ToggleButton footModelButton;

    @FXML
    private ToggleButton kinematicsButton;

    @FXML
    private ToggleButton kineticsButton;

    @FXML
    private ToggleButton metabolicButton;

    @FXML
    private ToggleButton pedobaragraphButton;

    @FXML
    private ToggleButton photographsButton;

    @FXML
    private ToggleButton recommendationsButton;

    @FXML
    private ToggleButton signaturesButton;

    @FXML
    private ToggleButton stepWatchButton;

    @FXML
    private ToggleButton videoUEButton;

    @FXML
    void onAssessment(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/InterpretationAssessmentGait.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onEMG(MouseEvent event) {

    }

    @FXML
    void onFootModel(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/InterpretationFootModel.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onGAITPhys(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/InterpGaitPhyExam.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onKinematics(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/InterpretationGAITKinematics.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onKinetics(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/InterpretationGaitKinetics.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onMetabolic(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/InterpretationMetobolicGAIT.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onPedobaragraph(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/IntrepertationPedobaragraphGait.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onPhotographs(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/UE/InterpretationPhotos.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onRecommendation(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/GAITRecommendations.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void onSignatures(MouseEvent event) {

    }

    @FXML
    void onStepWatch(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/GAIT/InterpretationStepWatch.fxml")));
        bp.setCenter(root);

    }

    @FXML
    void onVideoAssessment(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(GaitLabAppApplication.class.getResource("Forms/Interpretation/UE/InterpretationVideoUE.fxml")));
        bp.setCenter(root);
    }

     InterpretationAssessmentGaitController interpretationAssessmentGaitController = new  InterpretationAssessmentGaitController();
    public void onDownloadPDF(MouseEvent mouseEvent)  {

    }



//    public void onDownloadPDF(MouseEvent mouseEvent) throws FileNotFoundException {
//        try(ByteArrayOutputStream boas = new ByteArrayOutputStream()) {
//            //step 1: create the pdf
//            Document document = new Document();
//            //step 2: create the pdf writer
//            PdfWriter pdfWriter = PdfWriter.getInstance(document, boas);
//            //step 3: open the document
//            document.open();
//            //step 4: add stuff
//            document.add(new Paragraph("This is a PDF Test"));
//            Chunk chunk = new Chunk("test");
//            Anchor anchor = new Anchor("Another test String");
//
//            pdfWriter.pause();
//            document.add(chunk);
//            document.add(anchor);
//            pdfWriter.resume();
//            document.close();
//
//        } catch (IOException e) {
//            throw new RuntimeException(e);
//        }
//    }

}

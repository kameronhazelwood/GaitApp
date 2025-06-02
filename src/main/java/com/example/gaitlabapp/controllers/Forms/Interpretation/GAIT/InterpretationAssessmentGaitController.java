package com.example.gaitlabapp.controllers.Forms.Interpretation.GAIT;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;

public class InterpretationAssessmentGaitController  implements Initializable{

    @FXML
    private TabPane allTabs;

    @FXML
    private RadioButton associateImpairB;

    @FXML
    private RadioButton associateImpairL;

    @FXML
    private RadioButton associateImpairN;

    @FXML
    private RadioButton associateImpairR;

    @FXML
    private TextArea behaviorComments;

    @FXML
    private AnchorPane behaviorFunctionTab;

    @FXML
    private Tab behaviorTab;

    @FXML
    private RadioButton impairmentB;

    @FXML
    private RadioButton impairmentL;

    @FXML
    private RadioButton impairmentN;

    @FXML
    private RadioButton impairmentR;

    @FXML
    private AnchorPane issuesTab;

    @FXML
    private Text issuesText;

    @FXML
    private TextArea issuesTextArea;

    @FXML
    private RadioButton negImpactB;

    @FXML
    private RadioButton negImpactL;

    @FXML
    private RadioButton negImpactN;

    @FXML
    private RadioButton negImpactR;

    @FXML
    private RadioButton noProbB;

    @FXML
    private RadioButton noProbL;

    @FXML
    private RadioButton noProbN;

    @FXML
    private RadioButton noProbR;
    public ScrollPane assessmentGait;
    public Tab issues;
//    public AnchorPane motorControlTab;
//    public AnchorPane muscleStrengthTab;
//    public AnchorPane movementDisorderTab;
//    public AnchorPane muscleToneTab;
//    public AnchorPane stanceTab;
//    public AnchorPane swingTab;
    public Tab behavior;
    public Button print;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

//        List<Node> nodesToBePrinted = new ArrayList<>();
//        VBox.setVgrow(allTabs, Priority.ALWAYS);
//
//        nodesToBePrinted.add(allTabs);
//
//        allTabs.getTabs().add(issues);
//        allTabs.getTabs().add(behavior);
//        System.out.println(allTabs);
//        System.out.println(nodesToBePrinted);
//
//        VBox root = new VBox(allTabs);
//
//        print.setOnAction(actionEvent -> {
//            onPrint(nodesToBePrinted);
//        });
    }


    public void onPrint(List<Node> nodesFromSameScene) {
//        Printer printer = Printer.getDefaultPrinter();
//        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.DEFAULT);
//        PrinterJob job = PrinterJob.createPrinterJob();
//
//        boolean control = true;
//
//        if(job.showPrintDialog(allTabs.getScene().getWindow())){
//            for(int i = 0; i < nodesFromSameScene.size(); i++){
//                if(!job.printPage(pageLayout, nodesFromSameScene.get(i))){
//                    control = false;
//                    break;
//                }
//            }
//            if(control){
//                job.endJob();
//            }
//        }else{
//            System.out.println("This did not work");
//        }

    }

//            double pagePrintableHeight = pageLayout.getPrintableHeight();
//            double pagePrintableWidth = pageLayout.getPrintableWidth();
//            double scaleX = pagePrintableWidth / allTabs.getBoundsInParent().getWidth();
//            double localScale = scaleX;
//            double numberOfPages = Math.ceil((allTabs.getPrefWidth()) * localScale) / pagePrintableHeight;
//            System.out.println(numberOfPages);

//    Pane printPane1 = new Pane();
//
//
//        printPane1.getChildren().add(issuesTextArea);
//
//       PrinterJob job = PrinterJob.createPrinterJob();
//        if (job != null && job.showPrintDialog(printPane1.getScene().getWindow())){
//            boolean success = job.printPage(printPane1);
//            if (success) {
//                job.endJob();
//            }
//        Printer printer = Printer.getDefaultPrinter();
//        PageLayout pageLayout = printer.createPageLayout(Paper.A4, PageOrientation.PORTRAIT, Printer.MarginType.HARDWARE_MINIMUM);
//        PrinterJob job = PrinterJob.createPrinterJob();
//        if((job != null) && job.showPrintDialog(printPane1.getScene().getWindow())){
//            boolean success = job.printPage(pageLayout, printPane1);
//            if (success){
//                job.endJob();
//            }
//        }
}

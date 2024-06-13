package com.example.gaitlabapp.controllers.Forms.Interpretation.GAIT;

import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.control.*;
import javafx.scene.layout.AnchorPane;
import javafx.scene.text.Text;

import java.net.URL;
import java.util.List;
import java.util.ResourceBundle;

public class InterpretationAssessmentGaitController  implements Initializable{

    public ScrollPane assessmentGait;


    public Tab issues;
    public Text issuesText;
    public TextArea issuesTextArea;
    public AnchorPane issuesTab;
    public AnchorPane behaviorFunctionTab;
//    public AnchorPane motorControlTab;
//    public AnchorPane muscleStrengthTab;
//    public AnchorPane movementDisorderTab;
//    public AnchorPane muscleToneTab;
//    public AnchorPane stanceTab;
//    public AnchorPane swingTab;
    public TabPane allTabs;
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

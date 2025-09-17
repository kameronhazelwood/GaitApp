package com.example.gaitlabapp.controllers.Forms.Compendium.FootEval;

import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.config.HostServicesProvider;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.print.Printer;
import javafx.print.PrinterJob;
import javafx.scene.Parent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;

import java.io.File;
import java.io.IOException;
import java.util.Objects;

public class GenerateFootCompendiumController {
    public AnchorPane ap;
    @FXML
    public BorderPane bp;

    public GenerateFootCompendiumController() throws IOException {
    }


    @FXML
    void infoPage(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/FootEvalInfoPage.fxml")));
        bp.setCenter(root);
    }

    @FXML
    public String ptHistory(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumPtHistory.fxml")));
        bp.setCenter(root);
        return null;
    }

    public void questionnaire(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumQuestionnaire.fxml")));
        bp.setCenter(root);
    }

    public void pediatricHealth(MouseEvent mouseEvent) {
    }

    public void tone(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("Forms/Compendium/UE/CompendiumUETone.fxml")));
        bp.setCenter(root);
    }
    @FXML
    void adolescentParent(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumAdolescentParent.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void adolescentSelf(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumAdolescentSelf.fxml")));
        bp.setCenter(root);
    }

    @FXML
    void lowerExam(MouseEvent event) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Visits/TestVisit/CompendiumLower2.fxml")));
        bp.setCenter(root);
    }

    public void png(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumPng.fxml")));
        bp.setCenter(root);
    }

    public void photos(MouseEvent mouseEvent) throws IOException {
        Parent root = null;
        root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumPhotos.fxml")));
        bp.setCenter(root);
    }

    Parent fxml1Root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/Questionnaire.fxml")));
    Parent fxml2Root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/PtHistory.fxml")));
    Parent fxml3Root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/FootEvalInfoPage.fxml")));
    Parent lowerPDF = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/Lower.fxml")));
    Parent motorControlPDF = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/MotorControl.fxml")));
    Parent tonePDF = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/Tone.fxml")));
    Parent painPDF = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/Pain.fxml")));
    Parent functionalStrengthPDF = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/FunctionalStrength.fxml")));
    Parent mobilityScalesPDF = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/MobilityScales.fxml")));
    Parent fxml7Root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/PDF/Png.fxml")));
    Parent fxml8Root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/Forms/Compendium/GAIT/CompendiumPhotos.fxml")));
    public void generatePDF(MouseEvent mouseEvent) {

//        Printer printer = Printer.getDefaultPrinter();
//
//        PrinterJob printerJob = PrinterJob.createPrinterJob();
//
//        if (printerJob != null) {
//
//            boolean success2 = printerJob.printPage(fxml3Root);
//            boolean success = printerJob.printPage(fxml1Root);
//            boolean success1 = printerJob.printPage(fxml2Root);
//            boolean lower = printerJob.printPage(lowerPDF);
//            boolean motorControl = printerJob.printPage(motorControlPDF);
//            boolean tone = printerJob.printPage(tonePDF);
//            boolean pain = printerJob.printPage(painPDF);
//            boolean functionalStrength = printerJob.printPage(functionalStrengthPDF);
//            boolean mobilityScales = printerJob.printPage(mobilityScalesPDF);
//            boolean success6 = printerJob.printPage(fxml7Root);
//            boolean success7 = printerJob.printPage(fxml8Root);
//
//            if (success && success1 && success2 && lower && motorControl && tone && pain && functionalStrength&& mobilityScales  &&  success6 && success7) {
//                printerJob.endJob();
//            }
//        }
        try {
            File pdfFile = new File("C:\\dev\\GaitApp\\src\\main\\resources\\Forms\\Compendium\\FootEval\\footevaltest.pdf");
            if (pdfFile.exists()) {
                // Get HostServices from the Application instance
                HostServicesProvider.getHostServices().showDocument(pdfFile.getAbsolutePath());

            } else {
                System.err.println("PDF file not found: " + pdfFile.getAbsolutePath());
            }
        } catch (Exception e) {
            e.printStackTrace();
            // Handle any potential exceptions, e.g., file not found, security issues
        }
    }
}

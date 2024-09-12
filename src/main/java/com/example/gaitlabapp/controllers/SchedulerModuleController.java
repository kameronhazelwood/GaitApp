package com.example.gaitlabapp.controllers;

import com.calendarfx.model.*;
import com.calendarfx.view.*;
import com.calendarfx.view.page.DayPage;

import java.time.LocalDate;
import java.time.LocalTime;

import com.calendarfx.model.Calendar;
import com.calendarfx.model.Calendar.Style;
import com.calendarfx.view.CalendarView;
import com.calendarfx.view.page.MonthPage;
import com.calendarfx.view.page.WeekPage;
import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.model.visits.popover.EntryPopOverContentPane;
import javafx.application.Platform;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import lombok.RequiredArgsConstructor;
import org.controlsfx.control.PopOver;
import org.kordamp.ikonli.fontawesome.FontAwesome;
import org.kordamp.ikonli.javafx.FontIcon;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.io.IOException;
import java.net.URL;
import java.time.ZonedDateTime;
import java.util.Objects;
import java.util.Random;
import java.util.ResourceBundle;
import java.util.function.Supplier;


@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
@RequiredArgsConstructor
public class SchedulerModuleController implements Initializable {

    public AnchorPane calendarPane;
    @Autowired
    ConfigurableApplicationContext applicationContext;
    @FXML
    private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    private AnchorPane scenePane;
    @FXML
    public CalendarView calendarView;

    public static final int DATA_GENERATION_SEED = 11011;

    final Random random = new Random(DATA_GENERATION_SEED);


    @Override
    public void initialize(URL location, ResourceBundle resourceBundle) {
        calendarView.setEnableTimeZoneSupport(false);
        calendarView.setCreateEntryClickCount(2);
        calendarView.setEntryDetailsPopOverContentCallback(param -> new EntryPopOverContentPane(param.getPopOver(), param.getDateControl(), param.getEntry()));


        Calendar<String> gaitFullEval = new Calendar<>("Gait - Full Diagnostic");
        Calendar<String> gaitFootEval = new Calendar<>("Gait - Foot Evaluation");
        Calendar<String> gaitStepWatch = new Calendar<>("Gait - Step Watch");
        Calendar<String> gaitStepWatchReturn = new Calendar<>("Gait - Step Watch Return");
        Calendar<String> upperExtShuee = new Calendar<>("Upper Extremity - SHUEE Only");
        Calendar<String> upperExtFull = new Calendar<>("Upper Extremity - Full Diagnostic");
        Calendar<String> movementDisorder = new Calendar<>("Movement Disorder - Evalulation");
        Calendar<String> videoOnly = new Calendar<>("Gait - Video Only");
        Calendar<String> postOpOutcome = new Calendar<>("Gait - Post-Op Outcome");
        Calendar<String> prostheticsClinic = new Calendar<>("Prosthetics Clinic");

        gaitFullEval.setShortName("Gait Full Eval");
        gaitFootEval.setShortName("Gait Foot Eval");
        gaitStepWatch.setShortName("Gait Step Watch");
        prostheticsClinic.setShortName("Prosthetics");
        gaitStepWatchReturn.setName("Gait Step Watch Return");
        upperExtShuee.setName("Upper Ext SHUEE Only");
        upperExtFull.setName("Upper Ext Full Diagnostic");
        movementDisorder.setName("Movement Disorder Evaluation");
        videoOnly.setName("Gait Video Only");
        postOpOutcome.setName("Gait Post-Op Outcome");

        gaitFullEval.setStyle(Style.STYLE1);
        gaitFootEval.setStyle(Style.STYLE2);
        gaitStepWatch.setStyle(Style.STYLE3);
        prostheticsClinic.setStyle(Style.STYLE4);
        gaitStepWatchReturn.setStyle(Style.STYLE5);
        upperExtShuee.setStyle(Style.STYLE6);
        upperExtFull.setStyle(Style.STYLE7);

        movementDisorder.setStyle(Style.STYLE7);
        videoOnly.setStyle(Style.STYLE7);
        postOpOutcome.setStyle(Style.STYLE7);

        Entry<String> entry = new Entry<>();
        entry.setLocation("Nemours Hospital Gait Lab");
        entry.setTitle("3333 -9988, Test Patient");
        entry.setCalendar(gaitFullEval);
        gaitFullEval.addEntry(entry);

        Entry<String> entry1 = new Entry<>();
        entry1.setLocation("Nemours Hospital Gait Lab");
        entry1.setTitle("4444 -9988, Example Patient");
        entry1.setCalendar(gaitStepWatch);
        gaitStepWatch.addEntry(entry1);

        Entry<String> entry2 = new Entry<>();
        entry2.setLocation("Nemours Hospital Gait Lab");
        entry2.setTitle("1111 -9988, Another Test Patient");
        entry2.setCalendar(gaitFootEval);
        gaitFootEval.addEntry(entry2);


        CalendarSource familyCalendarSource = new CalendarSource("Appointments");
        familyCalendarSource.getCalendars().addAll(gaitFullEval, gaitFootEval, gaitStepWatch, prostheticsClinic, gaitStepWatchReturn, upperExtFull, upperExtShuee, movementDisorder, videoOnly, postOpOutcome);

        calendarView.getCalendarSources().setAll(familyCalendarSource);
        calendarView.setRequestedTime(LocalTime.now());

        Thread updateTimeThread = new Thread("Calendar: Update Time Thread") {
            @Override
            public void run() {
                while (true) {
                    Platform.runLater(() -> {
                        calendarView.setToday(LocalDate.now());
                        calendarView.setTime(LocalTime.now());
                    });

                    try {
                        // update every 10 seconds
                        sleep(10000);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }

                }
            }
        };

        updateTimeThread.setPriority(Thread.MIN_PRIORITY);
        updateTimeThread.setDaemon(true);
        updateTimeThread.start();


    }


    class HelloDayViewCalendar extends Calendar {

        final Random dataRandom = new Random();

        public HelloDayViewCalendar(long dataSeed) {
            dataRandom.setSeed(dataSeed);
        }

        public void generateBaseEntries() {
            createEntries(LocalDate.now().minusDays(2), Entry::new);
            createEntries(LocalDate.now().minusDays(1), Entry::new);
            createEntries(LocalDate.now(), Entry::new);
            createEntries(LocalDate.now().plusDays(1), Entry::new);
            createEntries(LocalDate.now().plusDays(2), Entry::new);
        }

        static class TopEntry<T> extends Entry<T> {
        }

        public void generateTopEntries() {
            createEntries(LocalDate.now(), TopEntry::new);
        }

        private <T extends Entry<?>> void createEntries(LocalDate startDate, Supplier<T> entryProducer) {
            for (int j = 0; j < 5 + (int) (dataRandom.nextDouble() * 4); j++) {
                T entry = entryProducer.get();
                entry.changeStartDate(startDate);
                entry.changeEndDate(startDate);

                String s = entry.getClass().getSimpleName();
                entry.setTitle(s + (j + 1));

                int hour = (int) (dataRandom.nextDouble() * 23);
                int durationInHours = Math.max(1, Math.min(24 - hour, (int) (dataRandom.nextDouble() * 4)));

                LocalTime startTime = LocalTime.of(hour, 0);
                LocalTime endTime = startTime.plusHours(durationInHours);

                entry.changeStartTime(startTime);
                entry.changeEndTime(endTime);

                entry.setCalendar(this);
            }
        }
    }


    @FXML
    public void onSchedulerClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(Launcher.class.getResource("/SchedulerModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
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

    public void onFormClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/FormsModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
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
    public void onPatientClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/PatientModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
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

    @FXML
    public void onReportsClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/ReportsModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
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

    @FXML
    public void onAdminClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/AdminModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
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

    @FXML
    public void onQueriesClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/QueriesModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
        Parent root = loader.load();
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
        stage.setScene(scene);
        stage.show();
    }

    public void logout(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
        //springContext.close();
    }

    public void OnNewPatientClick(ActionEvent event) throws IOException {
        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(getClass().getResource("/NewPatientModule.fxml"));
        loader.setControllerFactory(applicationContext::getBean);
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


}



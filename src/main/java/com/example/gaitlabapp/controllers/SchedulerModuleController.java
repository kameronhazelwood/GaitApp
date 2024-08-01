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
import javafx.application.Platform;
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
    public void initialize(URL location, ResourceBundle resourceBundle ) {
        calendarView.setEnableTimeZoneSupport(false);
        calendarView.setCreateEntryClickCount(2);

        Calendar gaitFullEval = new Calendar("Gait - Full Diagnostic");
        Calendar gaitFootEval = new Calendar("Gait - Foot Evaluation");
        Calendar gaitStepWatch = new Calendar("Gait - Step Watch");
        Calendar prostheticsClinic = new Calendar("Prosthetics Clinic");

        gaitFullEval.setShortName("Gait Full Eval");
        gaitFootEval.setShortName("Gait Foot Eval");
        gaitStepWatch.setShortName("Gait Step Watch");
        prostheticsClinic.setShortName("Prosthetics");


        gaitFullEval.setStyle(Style.STYLE1);
        gaitFootEval.setStyle(Style.STYLE2);
        gaitStepWatch.setStyle(Style.STYLE3);
        prostheticsClinic.setStyle(Style.STYLE4);

        CalendarSource familyCalendarSource = new CalendarSource("Appointments");
        familyCalendarSource.getCalendars().addAll(gaitFullEval, gaitFootEval, gaitStepWatch, prostheticsClinic);

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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/SchedulerModule.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        stage.setTitle("Nemours Children's Hospital  Lab");
//        stage.setX(200);
//        stage.setY(10);
        stage.setScene(scene);
        stage.show();
    }

    public void onFormClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/FormsModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/PatientModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/ReportsModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/AdminModule.fxml")));
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
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/QueriesModule.fxml")));
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

    public void logout(ActionEvent event) {
        stage = (Stage) scenePane.getScene().getWindow();
        stage.close();
        //springContext.close();
    }

    public void OnNewPatientClick(ActionEvent event) throws IOException {
        Parent root = FXMLLoader.load(Objects.requireNonNull(Launcher.class.getResource("/NewPatientModule.fxml")));
        stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
        scene = new Scene(root);
        Image icon = new Image(String.valueOf(getClass().getResource("/images/nemours_logo.png")));

        stage.getIcons().add(icon);
        stage.setTitle("Nemours Children's Hospital Gait Lab");
        stage.setScene(scene);
        stage.show();
    }


}



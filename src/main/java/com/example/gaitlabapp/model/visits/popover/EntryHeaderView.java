package com.example.gaitlabapp.model.visits.popover;


import com.calendarfx.model.Calendar;
import com.calendarfx.model.Entry;
import com.calendarfx.view.CalendarSelector;
import com.calendarfx.view.CalendarView;
import com.example.gaitlabapp.Launcher;
import com.example.gaitlabapp.model.patients.IPatientModel;
import com.example.gaitlabapp.services.PatientService;
import javafx.beans.binding.Bindings;
import javafx.beans.property.ObjectProperty;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.WeakChangeListener;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.collections.transformation.FilteredList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Bounds;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.stage.Popup;
import org.springframework.beans.factory.annotation.Autowired;


import java.util.List;
import java.util.function.Predicate;

import static java.util.Objects.requireNonNull;


public class EntryHeaderView extends GridPane {
    private final CalendarSelector calendarSelector;
    private final Entry<?> entry;
    private final Button titleField = new Button();
   private final TextField patientSearch = new TextField();




    private final ChangeListener<Calendar> calendarChangeListener = (observable, oldCalendar, newCalendar) -> {
        if (oldCalendar != null) {
            titleField.getStyleClass().remove(oldCalendar.getStyle() + "-entry-popover-title");
        }
        if (newCalendar != null) {
            titleField.getStyleClass().add(newCalendar.getStyle() + "-entry-popover-title");
        }
    };

    private final WeakChangeListener<Calendar> weakCalendarChangeListener = new WeakChangeListener<>(calendarChangeListener);


    public EntryHeaderView(Entry<?> entry, List<Calendar> calendars) {
        this.entry = requireNonNull(entry);
        requireNonNull(calendars);

        getStylesheets().add(requireNonNull(Launcher.class.getResource("/calendar.css")).toExternalForm());

        Bindings.bindBidirectional(titleField.textProperty(), entry.titleProperty());

        titleField.setText(entry.getTitle());
        titleField.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                onDisplayPatients();
            }
        });
        titleField.disableProperty().bind(entry.getCalendar().readOnlyProperty());

        TextField locationField = new TextField(entry.getLocation());
        Bindings.bindBidirectional(locationField.textProperty(), entry.locationProperty());
        locationField.getStyleClass().add("location");
        locationField.setEditable(true);
        locationField.setPromptText("Nemours Children's Hospital - Gait Lab");
        locationField.setMaxWidth(500);
        locationField.disableProperty().bind(entry.getCalendar().readOnlyProperty());

        calendarSelector = new CalendarSelector();
        calendarSelector.disableProperty().bind(entry.getCalendar().readOnlyProperty());
        calendarSelector.getCalendars().setAll(calendars);
        calendarSelector.setCalendar(entry.getCalendar());
        Bindings.bindBidirectional(calendarSelector.calendarProperty(), entry.calendarProperty());

        titleField.getStyleClass().add("default-style-entry-popover-title");

        add(titleField, 0, 0);
        add(calendarSelector, 1, 0, 1, 2);
        add(locationField, 0, 1);

        RowConstraints row1 = new RowConstraints();
        row1.setValignment(VPos.TOP);
        row1.setFillHeight(true);

        RowConstraints row2 = new RowConstraints();
        row2.setValignment(VPos.TOP);
        row2.setFillHeight(true);

        getRowConstraints().addAll(row1, row2);

        ColumnConstraints col1 = new ColumnConstraints();
        col1.setFillWidth(true);
        col1.setHgrow(Priority.ALWAYS);

        ColumnConstraints col2 = new ColumnConstraints();
        col2.setFillWidth(true);
        col2.setHgrow(Priority.NEVER);

        getColumnConstraints().addAll(col1, col2);

        getStyleClass().add("popover-header");

        titleField.getStyleClass().add("title");
        titleField.setMaxWidth(500);

        Calendar calendar = entry.getCalendar();

        titleField.getStyleClass().add(calendar.getStyle() + "-entry-popover-title");
        entry.calendarProperty().addListener(weakCalendarChangeListener);
    }

    /**
     * Returns the currently selected calendar.
     *
     * @return the selected calendar
     */
    public final Calendar getCalendar() {
        Calendar calendar = calendarSelector.getCalendar();
        if (calendar == null) {
            calendar = entry.getCalendar();
        }

        return calendar;
    }

    ObservableList<IPatientModel> initialData(){
        IPatientModel patient = new IPatientModel("Kameron", "Hazelwood", "1111 -9988");
        IPatientModel patient1 = new IPatientModel("Another Test", "Patient", "2222 -9988");
        IPatientModel patient3 = new IPatientModel("Test", "Patient", "3333 -9988");
        IPatientModel patient4 = new IPatientModel("Example", "Patient", "4444 -9988");
        IPatientModel patient5 = new IPatientModel("Madeline", "Daum", "32581055");
        IPatientModel patient6 = new IPatientModel("Rowan", "Hazelwood", "33069893");
        return FXCollections.observableArrayList(patient, patient1, patient3,patient4, patient5, patient6 );
    }

    private final String defaultVal = "Select Patient...";
    ObjectProperty<IPatientModel> valueObj = new SimpleObjectProperty<>();
    TableView<IPatientModel> patientTable = buildTable(valueObj);
    private final ObservableList<IPatientModel> listviewPatient = FXCollections.observableArrayList();
    private PatientService patientService;


    public void onDisplayPatients() {
        Popup popup = new Popup();
        popup.getContent().addAll(patientTable, patientSearch);
        popup.setAutoHide(true);
        listviewPatient.addAll(initialData());
        patientTable.setItems(listviewPatient);

        //patientTable.setItems(FXCollections.observableArrayList(patientService.findAll()));

        VBox vBox = new VBox(1, patientSearch, patientTable);
        popup.getContent().add(vBox);
        patientTable.setPrefWidth(300);
        patientSearch.setPrefWidth(300);

        /*
        patient search filtering
         */
        ObjectProperty<Predicate<IPatientModel>> fnameFilter = new SimpleObjectProperty<>();
        ObjectProperty<Predicate<IPatientModel>> lnameFilter = new SimpleObjectProperty<>();
        ObjectProperty<Predicate<IPatientModel>> mrnFilter = new SimpleObjectProperty<>();

        fnameFilter.bind(Bindings.createObjectBinding(() ->
                        person -> person.getFirstName().toLowerCase().contains(patientSearch.getText().toLowerCase()),
                patientSearch.textProperty()));
        lnameFilter.bind(Bindings.createObjectBinding(() ->
                        person -> person.getLastName().toLowerCase().contains(patientSearch.getText().toLowerCase()),
                patientSearch.textProperty()));
        mrnFilter.bind(Bindings.createObjectBinding(() ->
                        person -> person.getMrn().toLowerCase().contains(patientSearch.getText().toLowerCase()),
                patientSearch.textProperty()));

        FilteredList<IPatientModel> filteredItems = new FilteredList<>(FXCollections.observableList(listviewPatient));
        patientTable.setItems(filteredItems);

        filteredItems.predicateProperty().bind(Bindings.createObjectBinding(
                () -> fnameFilter.get().or(lnameFilter.get().or(mrnFilter.get())),
                fnameFilter, lnameFilter, mrnFilter));

        /*
        styling of the dropdown
         */

        Label valueLabel = new Label(defaultVal);
        valueLabel.setMaxWidth(Double.POSITIVE_INFINITY);
        HBox.setHgrow(valueLabel, Priority.ALWAYS);
        //valueLabel.setStyle("-fx-background-color: #ee1717");
        valueLabel.setStyle("-fx-font-family: Arial");
        valueLabel.setTextFill(Color.rgb(126, 138, 119, 0.9));
        valueLabel.setStyle("-fx-alignment: center;");
      //  valueLabel.setStyle("-fx-text-fill: rgba(119.0, 192.0, 75.0, 0.9)");


        StackPane arrow = new StackPane();
        arrow.setStyle("-fx-background-color:#444444;-fx-shape:\"M 0 0 h 7 l -3.5 4 z\";-fx-padding: 4px;");
        arrow.setMaxSize(8, 8);

        HBox pane = new HBox(100, valueLabel);
        pane.setSpacing(100);
        patientSearch.setPromptText("Keywords");

        pane.setAlignment(Pos.CENTER);
        pane.setMaxWidth(Double.POSITIVE_INFINITY);
        titleField.setContentDisplay(ContentDisplay.GRAPHIC_ONLY);
        titleField.setPrefWidth(300);
        titleField.setGraphic(pane);
        titleField.setOnAction(e -> {
            if (!popup.isShowing()) {
                Bounds bounds = titleField.localToScreen(titleField.getLayoutBounds());
                popup.show(titleField, bounds.getMinX(), bounds.getMaxY());
            }
        });

//        dropDownBtn.setOnMouseClicked(new EventHandler<MouseEvent>() {
//            @Override
//            public void handle(MouseEvent event) {
//                patientSearch.clear();
//            }
//        });

        valueObj.addListener((obs, old, val) -> {
            if(val != null){
                valueLabel.setText(val.getMrn() + ",  " + val.getFirstName() + "  " + val.getLastName());
                titleField.setText(val.getMrn() + ",  " + val.getFirstName() + "  " + val.getLastName());
            }else {
                valueLabel.setText(defaultVal);
                titleField.setText(defaultVal);
            }
            popup.hide();
        });




    }

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

}

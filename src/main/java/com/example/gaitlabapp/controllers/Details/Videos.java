package com.example.gaitlabapp.controllers.Details;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.MediaView;
import javafx.util.Duration;

import java.io.File;
import java.net.URL;
import java.util.Objects;
import java.util.ResourceBundle;

public class Videos  implements Initializable {
    public BorderPane root;
    @FXML
    public Label lblDuration;
    @FXML
    private MediaView mediaViewer;
    @FXML
    private Button play;
    @FXML
    private Slider slider;
    @FXML
    private Button stop;

    private boolean isPlayed = false;
    private File file;
    private Media media;
    private MediaPlayer mediaPlayer;

    @FXML
    private Hyperlink labelOne;

    @FXML
    private Hyperlink labelTwo;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        labelOne.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                media = new Media(Objects.requireNonNull(getClass().getResource("/TestVideos/LanceG 30963671 082323.mp4")).toString());
                mediaPlayer = new MediaPlayer(media);
                mediaViewer.setMediaPlayer(mediaPlayer);
                mediaPlayer.currentTimeProperty().addListener(((observableValue, oldValue, newValue) -> {
                    slider.setValue(newValue.toSeconds());
                    lblDuration.setText("Duration: " + (int)slider.getValue() + " / " + (int)media.getDuration().toSeconds());
                }));

                mediaPlayer.setOnReady(() ->{
                    Duration totalDuration = media.getDuration();
                    slider.setMax(totalDuration.toSeconds());
                    lblDuration.setText("Duration: 00 / " + (int)media.getDuration().toSeconds());
                });
                mediaViewer.setFitHeight(300);
                mediaViewer.setFitWidth(300);

            }
        });

        labelTwo.setOnAction(new EventHandler<ActionEvent>() {
            @Override
            public void handle(ActionEvent event) {
                media = new Media(Objects.requireNonNull(getClass().getResource("/TestVideos/LanceG 30963671 082323.mp4")).toString());
                mediaPlayer = new MediaPlayer(media);
                mediaViewer.setMediaPlayer(mediaPlayer);
                mediaPlayer.currentTimeProperty().addListener(((observableValue, oldValue, newValue) -> {
                    slider.setValue(newValue.toSeconds());
                    lblDuration.setText("Duration: " + (int)slider.getValue() + " / " + (int)media.getDuration().toSeconds());
                }));

                mediaPlayer.setOnReady(() ->{
                    Duration totalDuration = media.getDuration();
                    slider.setMax(totalDuration.toSeconds());
                    lblDuration.setText("Duration: 00 / " + (int)media.getDuration().toSeconds());
                });
            }
        });

    }
    @FXML
    void onPlayButton(ActionEvent event){
        if(!isPlayed){
            play.setText("Pause");
            mediaPlayer.play();
            isPlayed = true;
        }else {
            play.setText("Play");
            mediaPlayer.pause();
            isPlayed = false;
        }
    }
    @FXML
    void onStopButton(ActionEvent event){
        play.setText("Play");
        mediaPlayer.stop();
        isPlayed = false;
    }
    @FXML
    void sliderPressed(MouseEvent event){
        mediaPlayer.seek(Duration.seconds(slider.getValue()));
    }
}

package com.example.weatherman;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;

public class HelloController {

    @FXML
    private ResourceBundle resources;

    @FXML
    private URL location;

    @FXML
    private TextField city;

    @FXML
    private Button getData;

    @FXML
    private Text pressure;

    @FXML
    private Text temp_feels;

    @FXML
    private Text temp_info;

    @FXML
    private Text temp_max;

    @FXML
    private Text temp_min;

    @FXML
    private Label welcomeText;

    @FXML
    void initialize() {
        assert city != null : "fx:id=\"city\" was not injected: check your FXML file 'Untitled'.";
        assert getData != null : "fx:id=\"getData\" was not injected: check your FXML file 'Untitled'.";
        assert pressure != null : "fx:id=\"pressure\" was not injected: check your FXML file 'Untitled'.";
        assert temp_feels != null : "fx:id=\"temp_feels\" was not injected: check your FXML file 'Untitled'.";
        assert temp_info != null : "fx:id=\"temp_info\" was not injected: check your FXML file 'Untitled'.";
        assert temp_max != null : "fx:id=\"temp_max\" was not injected: check your FXML file 'Untitled'.";
        assert temp_min != null : "fx:id=\"temp_min\" was not injected: check your FXML file 'Untitled'.";
        assert welcomeText != null : "fx:id=\"welcomeText\" was not injected: check your FXML file 'Untitled'.";

    }

}

package com.example.eksamen_2021_konte_oppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class HelloController {
    ArrayList<Double> register = new ArrayList<>();
    double min = 0;
    double maks = 0;
    double gjennomsnitt = 0;
    @FXML
    private TextField txtTemperatur;

    @FXML
    private Label lblMin;

    @FXML
    private Label lblMaks;

    @FXML
    private Label lblGjennomsnitt;

    @FXML
    private Label lblFeil;

    @FXML
    void registrer(ActionEvent event) {
        try {
            double temperatur = Double.parseDouble(txtTemperatur.getText());
            register.add(temperatur);
            register.sort(Comparator.naturalOrder());

            for (int i = 0; i < register.size(); i++){
                lblMaks.setText(String.valueOf(Collections.max(register)));

                lblMin.setText(String.valueOf(Collections.min(register)));

                gjennomsnitt = temperatur/register.size();
                lblGjennomsnitt.setText(String.valueOf(gjennomsnitt));
            }

        }catch (Exception e){
            lblFeil.setText("Skriv inn tall!");
        }
    }

    @FXML
    void nullstill(ActionEvent event) {
        min = 0;
        maks = 0;
        gjennomsnitt = 0;
        lblGjennomsnitt.setText("");
        lblMaks.setText("");
        lblMin.setText("");
        lblFeil.setText("");
    }
}
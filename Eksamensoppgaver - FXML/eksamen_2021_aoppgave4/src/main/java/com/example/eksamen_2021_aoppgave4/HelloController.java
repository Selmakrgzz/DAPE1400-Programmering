package com.example.eksamen_2021_aoppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    ArrayList<Double> register = new ArrayList<>();

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
        double temp = 0;
        double min = 0;
        double maks = 0;
        double sum = 0;
        double gjennomsnitt = 0;
        try {
            temp = Double.parseDouble(txtTemperatur.getText());
            register.add(temp);
            for (double i : register){
                sum += i;

                if (maks < i){
                    maks = i;
                }
                if (maks > i){
                    min = i;
                }
            }
            gjennomsnitt = Double.parseDouble(String.format("%.2f", sum / register.size()));

            lblGjennomsnitt.setText(String.valueOf(gjennomsnitt));
            lblMaks.setText(String.valueOf(maks));
            lblMin.setText(String.valueOf(min));

        }catch (Exception e){
            lblFeil.setText("Skriv inn tall!");
        }
    }

    @FXML
    void nullstill(ActionEvent event) {
        lblMin.setText("");
        lblMaks.setText("");
        lblFeil.setText("");
        lblGjennomsnitt.setText("");
        txtTemperatur.setText("");
    }
}
package com.example.eksamen_2021_oppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    public ArrayList<Double> temperaturer = new ArrayList<>() ;
    double temperatur = 0;
    double gjennomsnitt = 0;
    @FXML
    private Label lblResultat;
    @FXML
    private TextField txtTemperatur;
    @FXML
    void registrer(ActionEvent event) {
        try {
            temperatur = Double.parseDouble(txtTemperatur.getText());
            temperaturer.add(temperatur);

            gjennomsnitt = temperatur / temperaturer.size();
            lblResultat.setText("Gjennomsnitttemperatur: \n" +gjennomsnitt);

        } catch (Exception e){
            lblResultat.setText("Skriv inn tall!");
        }
    }
    @FXML
    void nullstill(ActionEvent event) {
        lblResultat.setText("");
        txtTemperatur.setText("");
    }
}
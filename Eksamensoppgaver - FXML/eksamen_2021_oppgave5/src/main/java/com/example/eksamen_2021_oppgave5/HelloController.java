package com.example.eksamen_2021_oppgave5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

public class HelloController {
    public ArrayList<Double> temperaturer = new ArrayList<>() ;

    @FXML
    private Label lblResultat;
    @FXML
    private TextField txtTemperatur;
    @FXML
    void registrer(ActionEvent event) {
        double temp = 0;
        double sum = 0;
        double gjennomsnitt = 0;

        try {
            temp = Double.parseDouble(txtTemperatur.getText());
            temperaturer.add(temp);

            for (double i : temperaturer){
                sum += i;
            }
            gjennomsnitt = Double.parseDouble(String.format("%.2f", sum/temperaturer.size()));
            lblResultat.setText("Gjennomsnitt \n" +gjennomsnitt+ " C");

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
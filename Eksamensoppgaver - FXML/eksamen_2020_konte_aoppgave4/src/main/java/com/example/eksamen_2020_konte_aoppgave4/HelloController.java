package com.example.eksamen_2020_konte_aoppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.util.ArrayList;

class Observarsjoner {
    private String dato;
    private double tempratur;
    private double nedbør;

    public Observarsjoner(String dato, double tempratur, double nedbør) {
        this.dato = dato;
        this.tempratur = tempratur;
        this.nedbør = nedbør;
    }

    public String getDato() {
        return dato;
    }

    public void setDato(String dato) {
        this.dato = dato;
    }

    public double getTempratur() {
        return tempratur;
    }

    public void setTempratur(double tempratur) {
        this.tempratur = tempratur;
    }

    public double getNedbør() {
        return nedbør;
    }

    public void setNedbør(double nedbør) {
        this.nedbør = nedbør;
    }
}

public class HelloController {
    // legg inn en ArrayList kalt register her (av type Observasjoner)
    private static final ArrayList<Observarsjoner> register = new ArrayList<>();
    @FXML
    private Label lblSnittRegn;
    @FXML
    private Label lblSnittTemp;
    @FXML
    private TextField txtDato;
    @FXML
    private TextField txtTemp;
    @FXML
    private TextField txtRegn;
    @FXML
    void btnRegistrerVær(ActionEvent event) {
        // legg inn kode her
        String dato = txtDato.getText();
        double temperatur = Double.parseDouble(txtTemp.getText());
        double nedbør = Double.parseDouble(txtRegn.getText());
        Observarsjoner nyObservasjon = new Observarsjoner(dato, temperatur, nedbør);
        register.add(nyObservasjon);
    }
    @FXML
    void btnSnittRegn(ActionEvent event) {
        // legg inn kode her
        double sum = 0;

        for (Observarsjoner observarsjoner : register){
            sum += observarsjoner.getNedbør();
        }
        double snitt = sum / register.size();
        lblSnittRegn.setText(String.valueOf(snitt));
    }
    @FXML
    void btnSnittTemperatur(ActionEvent event) {
        // legg inn kode her
        double sum = 0;

        for (Observarsjoner observarsjoner : register){
            sum += observarsjoner.getTempratur();
        }
        double snitt = sum / register.size();
        lblSnittTemp.setText(String.valueOf(snitt));
    }
    @FXML
    void btnSlettRegister(ActionEvent event) {
        // legg inn kode her
        lblSnittTemp.setText("");
        lblSnittRegn.setText("");
        txtDato.setText("");
        txtRegn.setText("");
        txtTemp.setText("");
    }
}
package com.example.eksamen_2019_konte_oppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

class Helse{

    public static String beregnHelse(String navn, double vekt, double hoyde, int fodselsar){
        // din kode her
        double bmi = vekt/(hoyde*hoyde);
        int alder = 2022 - fodselsar;
        double minFrekvens = (220 - alder)*0.5;
        double maksFrekvens = (220 - alder)*0.85;
        String ut = "";
        if (bmi < 18){
            ut = navn+ " født " +fodselsar+ " er undervektig\n"
                    +"Hjertefrekvens ved trening bør ligge mellom " +minFrekvens+ " og " +maksFrekvens;
        }

        if (bmi < 25){
            ut = navn+ " født " +fodselsar+ " er normalvektig\n"
                    +"Hjertefrekvens ved trening bør ligge mellom " +minFrekvens+ " og " +maksFrekvens;
        }

        if (bmi < 30){
            ut = navn+ " født " +fodselsar+ " er overvektig\n"
                    +"Hjertefrekvens ved trening bør ligge mellom " +minFrekvens+ " og " +maksFrekvens;
        }

        if (bmi >= 30){
            ut = navn+ " født " +fodselsar+ " er fet\n"
                    +"Hjertefrekvens ved trening bør ligge mellom " +minFrekvens+ " og " +maksFrekvens;
        }
        return ut;
    }
}

public class HelloController {
    @FXML
    private TextField txtNavn;

    @FXML
    private TextField txtFødt;

    @FXML
    private TextField txtHøyde;

    @FXML
    private TextField txtVekt;

    @FXML
    private Label lblResultat;

    @FXML
    void beregn(ActionEvent event) {
        // din kode her
        String navn = txtNavn.getText();
        int fodselsar = Integer.parseInt(txtFødt.getText());
        double hoyde = Double.parseDouble(txtHøyde.getText());
        double vekt = Double.parseDouble(txtVekt.getText());

        String resultat = Helse.beregnHelse(navn, vekt,hoyde, fodselsar);

        lblResultat.setText(resultat);
    }
}
package com.example.eksamen_2019_konte_aoppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


class Helse{

    public static String beregnHelse(String navn, double vekt, double høyde, int fødselsår){
        // din kode her
        double bmi = vekt / (høyde * høyde);
        double minFrekvens = (220 - (2020-fødselsår)) * 0.5;
        double maksFrekvens = (220 - (2020-fødselsår)) * 0.85;
        String resultat = navn+ " født " +fødselsår+ " er ";

        if (bmi < 18){
            resultat += "undervektig";
        }
        if (bmi >= 18 && bmi < 25){
            resultat += "normalvektig";
        }
        if (bmi >= 25 && bmi < 30){
            resultat += "overvektig";
        }
        if (bmi >= 30){
            resultat += "fet";
        }
        resultat += "\nHjertefreknvens ved trening bør ligge mellom " +minFrekvens+ " og " +maksFrekvens;

        return resultat;
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
        double vekt = Double.parseDouble(txtVekt.getText());
        double høyde = Double.parseDouble(txtHøyde.getText());
        int fødselsår = Integer.parseInt(txtFødt.getText());

        String resultat = Helse.beregnHelse(navn, vekt, høyde, fødselsår);
        lblResultat.setText(resultat);
    }
}
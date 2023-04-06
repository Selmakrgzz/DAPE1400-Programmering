package com.example.sparing;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    @FXML
    private Label lblResultat;

    @FXML
    private TextField txtBeløp;

    @FXML
    private TextField txtRente;

    @FXML
    private TextField txtAntallÅr;

    @FXML
    void Beregn(ActionEvent event) {
        double belop;
        double rente;
        int antallAr;
        long sparing;

        try {
            belop = Double.parseDouble(txtBeløp.getText());
            rente = Double.parseDouble(txtRente.getText());
            antallAr = Integer.parseInt(txtAntallÅr.getText());

            sparing = (long) Math.pow((belop*(1+(rente/100))),antallAr);
            lblResultat.setText("Du sparer " +sparing);

        }catch (Exception e){
            lblResultat.setText("Skriv riktig verdier!");
        }
    }
}
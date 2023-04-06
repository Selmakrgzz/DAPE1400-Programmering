package com.example.eksamen_2019_oppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    // opprett heltalls array med prisene pr. sone
    private static final int [] priser = {36, 59, 82, 105, 128};
    @FXML
    private Label lblResultat, lblFeilSoner, lblFeilAntall;
    @FXML
    private TextField txtAntall, txtSoner;
    @FXML
    private CheckBox chkRabatt;
    @FXML
    private void btnberegn(ActionEvent event) {
        //Skriv koden din her
        int antall, antallSoner, pris;

        //Reset av disse når de trykkes flere ganger
        lblFeilAntall.setText("");
        lblFeilSoner.setText("");
        lblResultat.setText("");

        //Sjekker om antall og soner er 0
        try {
            antall = Integer.parseInt(txtAntall.getText());
            antallSoner = Integer.parseInt(txtSoner.getText());
        } catch (Exception e){
            antall = 0;
            antallSoner = 0;
        }

        if ((antall > 0) && (antallSoner >= 1 && antallSoner <= 5)){
            pris = priser[antallSoner - 1];
            pris *= antall;
            if (chkRabatt.isSelected()){
                pris *= 0.5;
            }
            lblResultat.setText(pris+ " kr");
        } else {
            if (antall <= 0){
                lblFeilAntall.setText("Antall kan ikke være 0!");
            }

            if (antallSoner <= 0 || antallSoner > 5){
                lblFeilSoner.setText("Antall soner må være mellom 1 og 5!");
            }
        }
    }

}
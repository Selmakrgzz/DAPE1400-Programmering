package com.example.eksamen_2019_aaoppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    // opprett heltalls array med prisene pr. sone
    int [] priser = {36,59,82,105,128};
    @FXML
    private Label lblResultat, lblFeilSoner, lblFeilAntall;
    @FXML
    private TextField txtAntall, txtSoner;
    @FXML
    private CheckBox chkRabatt;
    @FXML
    private void btnBeregn(ActionEvent event) {
        //Skriv koden din her

        lblFeilSoner.setText("");
        lblFeilAntall.setText("");
        lblResultat.setText("");

        int antall = Integer.parseInt(txtAntall.getText());
        int soner = Integer.parseInt(txtSoner.getText());
        int pris;

        if (antall > 0 && (soner > 0 && soner <= 5)){
            pris = antall * priser[soner -1];
            lblResultat.setText(pris+ " kr");

            if (chkRabatt.isSelected()){
                pris *= 0.5;
                lblResultat.setText(pris+ " kr");
            }
        }

        if (antall <= 0){
            lblFeilAntall.setText("Antall må være større enn 0!");
        }

        if (soner <= 0 || soner >= 5){
            lblFeilSoner.setText("Soner må være mellom 1 og 5");
        }

    }
}
package com.example.eksamen_2019_aoppgave4;

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
    private void btnBeregn(ActionEvent event) {
        //Skriv koden din her
        int antall = 0;
        int soner = 0;

        lblResultat.setText("");
        lblFeilSoner.setText("");
        lblFeilAntall.setText("");

        try {
            antall = Integer.parseInt(txtAntall.getText());
            soner = Integer.parseInt(txtSoner.getText());

        } catch (Exception e){
            antall = 0;
            soner = 0;
        }

        if (antall > 0 && (soner >= 1 && soner <= 5)){
            int pris = antall * priser[soner -1];

            if (chkRabatt.isSelected()){
                pris *= 0.5;
            }
            String ut = pris+ " kr";
            lblResultat.setText(ut);
        }
        if (antall <= 0){
            lblFeilAntall.setText("Antall kan ikke være mindre enn 1!");
        }
        if (soner < 1 || soner > 5){
            lblFeilSoner.setText("Soner må være mellom 1 og 5!");
        }

    }
}
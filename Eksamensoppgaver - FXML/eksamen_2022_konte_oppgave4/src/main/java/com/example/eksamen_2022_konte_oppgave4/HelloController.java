package com.example.eksamen_2022_konte_oppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    double energibehov = 0;
    @FXML
    private ToggleGroup Kjonn;
    @FXML
    private TextField txtAlder;
    @FXML
    private TextField txtVekt;
    @FXML
    private TextField txtHoyde;
    @FXML
    private Label lblResultat;

    @FXML
    void btnBeregn(ActionEvent event) {
        RadioButton valgtKnapp = (RadioButton) Kjonn.getSelectedToggle();
        String radioKnapp = valgtKnapp.getText();
         try {
             int alder = Integer.parseInt(txtAlder.getText());
             double vekt = Double.parseDouble(txtVekt.getText());
             double hoyde = Double.parseDouble(txtHoyde.getText());
             if (radioKnapp.equals("Mann")){
                 energibehov = (10 * vekt) + (6.25 * hoyde) - (5 * alder) + 5;
                 lblResultat.setText(String.valueOf(energibehov));
             }

             if (radioKnapp.equals("Kvinne")){
                 energibehov = (10 * vekt) + (6.25 * hoyde) - (5 * alder) - 161;
                 lblResultat.setText(String.valueOf(energibehov));
             }

         }catch (Exception e){
             lblResultat.setText("Skriv inn tall!");
         }
    }
}
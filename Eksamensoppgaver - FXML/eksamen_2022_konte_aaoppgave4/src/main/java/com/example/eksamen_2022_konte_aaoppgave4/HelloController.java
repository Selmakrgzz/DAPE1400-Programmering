package com.example.eksamen_2022_konte_aaoppgave4;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.control.ToggleGroup;

public class HelloController {
    @FXML
    private ToggleGroup Kjonn; // Mann, Kvinne
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
        int alder;
        double vekt;
        double hoyde;
        double energibehov;

        RadioButton radioButton = (RadioButton) Kjonn.getSelectedToggle();
        String radioknapp = radioButton.getText();

        try {
            alder = Integer.parseInt(txtAlder.getText());
            vekt = Double.parseDouble(txtVekt.getText());
            hoyde = Double.parseDouble(txtHoyde.getText());

            if (radioknapp.equals("Mann")){
                energibehov = (10 * vekt)+(6.25 * hoyde)-(5 * alder) +5;
                String ut = "Forbrenning pr dag. " +energibehov+ " kalorier";
                lblResultat.setText(ut);
            }

            if (radioknapp.equals("Kvinne")){
                energibehov = (10 * vekt)+(6.25 * hoyde)-(5 * alder) - 161;
                String ut = "Forbrenning pr dag. " +energibehov+ " kalorier";
                lblResultat.setText(ut);
            }

        }catch (Exception e){
            lblResultat.setText("Skriv inn gyldig verdier!");
        }

    }
}
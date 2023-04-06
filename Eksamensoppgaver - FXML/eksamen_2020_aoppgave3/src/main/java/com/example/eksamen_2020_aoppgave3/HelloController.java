package com.example.eksamen_2020_aoppgave3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

import java.security.spec.ECField;

public class HelloController {
    int tall1 = 0;
    int tall2 = 0;
    @FXML
    private Label lblAntallRett;
    @FXML
    private Label lblAntallFeil;
    @FXML
    private Label lblRettProsent;
    @FXML
    private Label lblFeilProsent;
    @FXML
    private Label lblOppgave;
    @FXML
    private Label lblResultat;
    @FXML
    private TextField txtSvar;
    @FXML
    void nyOppgave(ActionEvent event) {
        tall1 = (int) (Math.random() * 10 + 1);
        tall2 = (int) (Math.random() * 10 + 1);

        String ut = "Hva blir " +tall1+ " * " +tall2+ " ?";
        lblOppgave.setText(ut);
    }
    @FXML
    void svar(ActionEvent event) {
        int riktigSvar = tall1 * tall2;
        String [] positiv = {"bra", "supert", "nydelig"};
        String [] negativ = {"dårlig", "feil", "neste gang"};
        int antallRett = 0;
        int antallFeil = 0;
        double rettProsent = 0;
        double feilProsent = 0;
        int svar = 0;

        try {
            svar = Integer.parseInt(txtSvar.getText());
            txtSvar.setText("");

            if (svar == riktigSvar){
                lblResultat.setText(positiv[(int) (Math.random()*3 +1)]);
                antallRett++;
                lblAntallRett.setText("Antall rett: " +antallRett);

            } else {
                lblResultat.setText(negativ[(int) (Math.random()*3 +1)]);
                antallFeil++;
                lblAntallFeil.setText("Antall feil: " +antallFeil);
            }

            rettProsent = (double) antallRett / (antallRett + antallFeil);
            lblRettProsent.setText(rettProsent+ " %");
            feilProsent = (double) 100 - rettProsent;
            lblFeilProsent.setText(feilProsent+ " %");

        } catch (Exception e){
            lblResultat.setText("Skriv inn tall!");
        }
    }
    @FXML
    void nullstill(ActionEvent event) {
        lblFeilProsent.setText("");
        lblRettProsent.setText("");
        lblResultat.setText("");
        lblAntallRett.setText("");
        lblAntallFeil.setText("");
    }
}
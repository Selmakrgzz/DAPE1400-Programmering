package com.example.eksamen_2020_oppgave3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class HelloController {
    private int tall1;
    private int tall2;
    private int antallRett = 0;
    private int antallFeil = 0;
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
        tall1 = (int) (Math.random()* 10 +1);
        tall2 = (int) (Math.random()* 10 +1);
        String ut = "Hva blir " +tall1+ " x " +tall2+ " ?";
        lblOppgave.setText(ut);
    }
    @FXML
    void svar(ActionEvent event) {
        int rettSvar = tall1 * tall2;
        String [] positiv = {"Bra!", "Supert!", "Riktig!"};
        String [] negativ = {"Feil!", "Dårlig!", "Neste gang!"};
        try {
            int svar = Integer.parseInt(txtSvar.getText());
            int tilbake = (int)(Math.random()*4);
            txtSvar.setText("");
            if (rettSvar == svar){
                lblResultat.setText(positiv[tilbake]);
                antallRett++;
                lblAntallRett.setText("Antall rett: " + antallRett);
            } else {
                lblResultat.setText(negativ[tilbake]);
                antallFeil++;
                lblAntallFeil.setText("Antall feil: " + antallFeil);
            }

            double prosentRettDes = (double) antallRett/(antallRett+antallFeil);
            int prosentRett = (int) prosentRettDes * 100;
            lblRettProsent.setText(prosentRett+ " %");
            lblFeilProsent.setText((100 - prosentRett)+ " %");
        }
        catch (Exception e){
            lblResultat.setText("Skriv inn et tall!");
        }
    }
    @FXML
    void nullstill(ActionEvent event) {
        antallFeil = 0;
        antallRett = 0;
        lblResultat.setText("");
        lblOppgave.setText("");
        lblAntallFeil.setText("");
        lblAntallRett.setText("");
        lblRettProsent.setText("");
        lblFeilProsent.setText("");
    }
}
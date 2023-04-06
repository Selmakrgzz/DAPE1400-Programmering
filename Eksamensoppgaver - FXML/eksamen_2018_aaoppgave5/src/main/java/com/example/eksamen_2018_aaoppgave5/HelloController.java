package com.example.eksamen_2018_aaoppgave5;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;


class Lodd{
    public String navn;
    public String telefonnr;
}

class Lotteri {
    public static final int MAKS_ANTALL = 1000;
    public int antallSolgte = 0;
    public Lodd[] loddbok = new Lodd[MAKS_ANTALL];

    public boolean kjøpLodd(Lodd nyttLodd) {
        // dersom det ikke er plass i array returner false
        // ellers legg inn et nytt lodd og returner true
        if (antallSolgte < MAKS_ANTALL){
            loddbok[antallSolgte] = nyttLodd;
            antallSolgte++;
            return true;
        }
        return false;
    }

    public String trekkVinner() {
        // return vinner;
        int vinnertall = (int) (Math.random() * antallSolgte);
        String resultat = "Vinneren er" +loddbok[vinnertall].navn;
        return resultat;
    }
}

    public class HelloController {
        private Lotteri lotteri = new Lotteri();

        @FXML
        private Label lblResultater;

        @FXML
        private TextField txtNavn, txtTelefonnr;

        @FXML
        public void regLoddsalg(ActionEvent event) {
            // opprett et lodd
            // prøv å kjøpe lodd
            // dersom det ikke er mulig legg ut en feilmelding i labelen
            Lodd lodd = new Lodd();
            lodd.navn = txtNavn.getText();
            lodd.telefonnr = txtTelefonnr.getText();

            if (!lotteri.kjøpLodd(lodd)){
                lblResultater.setText("For mange kjøp");
            }
        }

        @FXML
        public void foretaTrekning(ActionEvent event) {
            lblResultater.setText("Vinneren ble " +lotteri.trekkVinner());
        }

        @FXML
        public void nyttLotteri(ActionEvent event) {
            lotteri = new Lotteri();
            lblResultater.setText("");
        }
    }

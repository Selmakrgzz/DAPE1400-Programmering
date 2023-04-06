package ukesoppgaver.kodebrikke;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Label;

import java.util.Random;

class KodeGenerator {
    private int[] kodeArray;
    private Random random = new Random();
    private int nyKodeIndeks = 0;

    public KodeGenerator(int antall) {
        kodeArray = new int[antall];
        genererKoder();
        /* opprett array
           kall genererKoder for å legge kodene inn i arrayet */
    }

    private void genererKoder() {
        int randomTall = 0;
        int min = 100000;
        int max = 999999;
        for (int i = 0; i < kodeArray.length; i++){
            randomTall = random.nextInt(max + 1 - min) + min;
            kodeArray[i] = randomTall;
        }
        /* Fyller  kodeArray med tilfeldige, 6-sifrede tall.
           NB! Det laveste mulige tallet skal være 100000, og det høyeste 999999. */
    }

    public String nyKode(int maksAntall) {
        if(nyKodeIndeks < maksAntall){
            return Integer.toString(kodeArray[nyKodeIndeks++]);
        }
        return "Maks antall!";
        // returnerer ny kode fra arrayet eller en feilmelding ved array-slutt
    }

    public String formaterBrukteKoder() {
        String ut = " ";
        for( int i = 0; i < nyKodeIndeks; i++) {
            ut += kodeArray[i]+"\n";
        }
        return ut;
    }
        /* løp igjennom arrayet og formater kodene med \n i mellom
            kodene fra og med 0 til nyKodeIndeks er "brukte" koder */
}

public class KodebrikkeController {
    public final int MAKS_ANTALL = 10;
    KodeGenerator nyKodeGenerator = new KodeGenerator(MAKS_ANTALL);
    // opprett KodeGeneratoren her

    @FXML
    private Label lblGamleKoder;

    @FXML
    private Label lblNyKode;

    @FXML
    void gamleKoder(ActionEvent event) {
        lblGamleKoder.setText(nyKodeGenerator.formaterBrukteKoder());

        // kall til formaterBrukteKoder og legg resultatet i lblGamleKoder
    }

    @FXML
    void nyKode(ActionEvent event) {
        lblNyKode.setText(nyKodeGenerator.nyKode(MAKS_ANTALL));
        // kall til nyKode og legg resultat i lblNykode
    }




}
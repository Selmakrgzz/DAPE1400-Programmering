package oppgave1;

import static javax.swing.JOptionPane.*;

public class oppg {
    public static void main (String [] args){
        /*Lag et program som leser inn alderen din (et heltall).
         *Vis så denne i en meldingsbox sammen med en tekst
         * f.eks som ”Min alder er 19 år.”*/

        String innFornavn = showInputDialog("Skriv inn navnet ditt");
        String innAlder = showInputDialog("Skriv inn alderen din:");
        int tall1 = Integer.parseInt(innAlder);

        showMessageDialog(null,"Alderen til " +innFornavn+ " er " +innAlder);


    }

}
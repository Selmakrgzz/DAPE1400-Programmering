package oppgave1_1;

//Lag et program som regner ut hvor mye en bil bruker i bensin på ulike turer.
//Programmet skal lese inn to og to verdier, lengden på turen i km og hvor mye bensin som ble brukt.
//Les inn ved hjelp av inputbokser (JOptionPane). Når lengden på turen er 0 eller negativ avsluttes innlesningen og
//det skrives ut hvor mye gjennomsnittlig bensin bilen har brukt pr mil.

import javax.swing.*;

public class Oppg1_1 {
    public static void main(String [] args){
        double lengde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lengden på turen i km"));
        double bensin = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn hvor mye bensin som ble brukt"));

        double regnUtForbruket = (Double) lengde * (Double) bensin;
        System.out.println("Gjennomsnittlig bensin brukt per mil er : " +regnUtForbruket);

        if (lengde <= 0 || bensin <= 0){
            System.out.println("Lengde og mengde bensin kan ikke være 0, eller mindre!!");
            System.exit(1);
        }

    }

}

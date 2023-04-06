package oppgave4;

import javax.swing.*;

public class Oppg4 {
    public static void main(String [] args){
        //Lag et program som regner ut omkretsen til en sirkel Les først inn radiusen.
        //Regn så ut  omkretsen av sirkelen (2*3.14*radius) og
        //skriver ut svaret på følgende måte:
        //”Omkretsen av en sirkel med 20.0 cm som radius blir 125.60 cm.
        //”Tips: Bruk String omkretsenMedToDesimaler = String.format("%.2f" , omkretsen);
        //for å få 2 desimaler.

        double radius = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn radius av sirkelen"));
        double omkrets = 2 * 3.14 * radius;

        String omkretsenMedToDesimaler = String.format("%.2f" , omkrets);

        JOptionPane.showMessageDialog(null, "Omkretsen av en sirkel med " +radius+
                " cm som radius blir " +omkretsenMedToDesimaler+ " cm.");
    }
}

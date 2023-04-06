package oppgave3;

import javax.swing.*;

public class Oppg3 {
    public static void main(String [] args){
        //Lag et program som regner ut arealet av et rektangel.
        //Programmet skal lese inn lengden og bredden på rektangelet.
        //Regn så ut  arealet og skriver ut svaret på følgende måte:
        //”Et rektangel med bredde 20.0 cm og lengde 40.0 cm har et areal på 800.0 cm^2”.

        double lengde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn lengden på rektangel"));
        double bredde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn bredden på rektangel"));
        double areal = lengde * bredde;

        JOptionPane.showMessageDialog(null, "Et rektangel med bredde " +bredde+
                " cm og lengde " +lengde+ " cm har et areal på "+areal+ " cm^2.");


    }
}

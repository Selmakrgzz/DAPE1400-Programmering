package oppgave5;

import javax.swing.*;

public class Oppg5 {
    public static void main (String [] args){
        //Lag et program som regner om fra fahrenheit til celsius.
        //Les inn verdien for fahrenheit og regn ut tilsvarende
        //celsius med følgende formel: C = (F-32)/1.8.
        //Skriv så ut resultatet i Celsius.

        double fahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn verdi for fahrenheit"));
        double celsius = (fahrenheit - 32) / 1.8;

        String celsiusMedTreDesimaler = String.format("%.3f" , celsius);

        JOptionPane.showMessageDialog(null, fahrenheit+ " fahrenheit blir "
                +celsiusMedTreDesimaler+ " Celsius.");
    }
}

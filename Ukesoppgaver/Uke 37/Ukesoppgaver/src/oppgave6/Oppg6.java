package oppgave6;

import javax.swing.*;

public class Oppg6 {
    public static void main (String [] args){
        //Lag et program som leser inn et beløp i amerikanske dollar (USD)
        //og regner om og skriver ut tilsvarende beløp i norske kroner.
        //Benytt dagens valutakurs fra nettet.

        int usd = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn ønsket beløp i usd"));
        double kurs = 10.12;
        double nok = usd * kurs;

        String nokMedToDesimaler = String.format("%.2f" , nok);

        JOptionPane.showMessageDialog(null, usd+ " amerikanske dollar er "
                +nokMedToDesimaler+ " norske kroner med dagens valuta.");
    }
}

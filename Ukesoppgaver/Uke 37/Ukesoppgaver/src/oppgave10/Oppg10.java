package oppgave10;

import javax.swing.*;

public class Oppg10 {
    public static void main (String [] args){
        //Lag et program som leser inn et heltall, alder.
        //Avhengig av hva denne er så skal det skrives ut en tekst tilsvarende:
        //”Du kan ta førerkortet for bil da du er gammel nok” eller
        //”Du er for ung til å ta førerkort for bil”.
        //Gjør dette ved bruk to if-setninger.

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn ditt alder"));

        if (alder < 18){
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil.");
        }

        if (alder > 18){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort for bil, fordi du er gammel nok.");
        }



    }
}

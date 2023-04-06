package oppgave3;

//Gjør oppgave 2 ved hjelp av en else-setning (i tillegg til en if).

import javax.swing.*;

public class Oppg3 {

    public static void main(String [] args){

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn din alder"));

        if (alder >= 18){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkortet for bil, fordi du er gammel nok");
        }
        else {
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil.");
        }

    }
}

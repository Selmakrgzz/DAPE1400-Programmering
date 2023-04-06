package oppgave4;

//Definer så en variabel som indikerer høyeste alder man kan ta førerkort uten årlig legesjekk (= 70 år).
//Oppdater oppgavene over slik at programmet skriver ut meldingene
//Du er for ung til å ta førerkort for bil
//Du kan ta førerkort for bil og du trenger ikke årlige legesjekker
//Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker

import javax.swing.*;

public class Oppg4 {

    public static void main(String [] args){

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn din alder"));

        if (alder >= 18 && alder < 70){
            JOptionPane.showMessageDialog(null, "Du kan ta førerkort for bil, og du trenger ikke årlige legesjekker");
        }
        else if (alder >= 70) {
            JOptionPane.showMessageDialog(null, "Du er absolutt gammel nok for å kjøre bil, men må ha årlige legesjekker");
        }
        else {
            JOptionPane.showMessageDialog(null, "Du er for ung til å ta førerkort for bil.");
        }



    }
}

package oppgave1;

//Les inn en heltallsvariabel.
//Skriv så ut en tekst ”Du er myndig men kan ikke kjøpe alkohol med mer enn 22 % på polet”.
//Dvs. at du må ha en beslutning som tester på om alderen er mellom 18 og 20.
//Dersom dette ikke er tilfelle skriv ut ”Du er enten umyndig eller så kan du kjøpe hva du vil på polet”.

import javax.swing.*;

public class Oppg1 {
    public static void main(String [] args){

        int alder = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn alderen din"));

        if (alder < 18){
            JOptionPane.showMessageDialog(null, "Du er umyndig");
        }

        if (alder >= 18 && alder < 20){
            JOptionPane.showMessageDialog(null, "Du er mynding, men kan ikke kjøpe alkohol med mer enn 22% på polet.");
        }

        if (alder >= 20){
            JOptionPane.showMessageDialog(null, "Du kan kjøpe hva du vil på polet");
        }
    }



}

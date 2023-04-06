package oppgave1_2;

    //En salgsperson får kommisjon av salget sitt. Det betyr at vedkommende
    // får 9 % av salget i tillegg til vanlig månedslønn.
    //Skriv et program som leser prisen på et antall varer selgeren har
    // solgt og regn ut hvor mye tillegg vedkommende er berettiget til.
    //Bruk inputbokser og avslutt innlesningen når prisen er 0.

import javax.swing.*;

public class Oppg1_2 {
    public static void main(String [] args){

        int antallVarer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall varer"));
        int prisAntallVarer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn pris på antall varer"));
        int tillegg = ((antallVarer * prisAntallVarer) / 100) * 9;

        System.out.println("Selgeren har solgt " +antallVarer+ " varer, og har dermed opptjent et tillegg på " +tillegg+ " kr.");

        if (prisAntallVarer <= 0){

            System.out.println("Prisen på antall varer kan ikke være mindre enn null!");
            System.exit(1);
        }

    }
}

package oppg1;

import javax.swing.*;
import java.util.Random;

class UnikeTall {

    // Deklarasjon av array for lagring av tilfeldige heltall

    int[] tallListe;
    int min = 100;
    int max = 999;
    Random randomGenerator = new Random();

   /* Konstruktør som mottar arrayets lengde som parameter og
     oppretter arrayet.  */

    public UnikeTall(int inntall) {

        tallListe = new int[inntall];
        tilfeldig();
    }

    /* Metode som skal undersøke om et gitt tall finnes i arrayet fra før.
      Tallet det letes etter skal mottas som parameter.
      Metoden skal returnere true hvis tallet finnes i arrayet.
      Hvis ikke skal metoden returnere false. */

    public boolean undersøkeTall(int tall) {
        for (int i = 0; i < tallListe.length; i++) {

            if (tall == tallListe[i]) {
                return true;
            }
        }
        return false;
    }


  /* Metode som skal fylle arrayet med tilfeldige tall mellom 100 og 999,
     begge grenser inkludert. Metoden skal gjøre dette på en måte
     som sikrer at alle tallene er forskjellige. Metoden skal ikke ha
     parametre og heller ikke returnere noen verdi.
     Tips bruk (int)(Math.random()*(900)+100); for å generere tallene mellom 100 og 999
   */

    public void tilfeldig() {
        int randomTall = 0;

        for (int i = 0; i < tallListe.length; i++) {

            randomTall = randomGenerator.nextInt(max + 1 - min) + min;

            if (undersøkeTall(randomTall) == true) {
                i--;
            } else {
                tallListe[i] = randomTall;
            }
        }

    }

    // Metode som finner og returnerer det minste tallet i arrayet.

    public int lavesteTall() {
        int lavesteTall = Integer.MIN_VALUE;
        for (int i = 0; i < tallListe.length; i++) {
            if (lavesteTall > tallListe[i]) {
                lavesteTall = tallListe[i];
            }
        }

        return lavesteTall;
    }

    // Metode som finner og returnerer det største tallet i arrayet.

    public int storsteTall() {
        int storsteTall = Integer.MAX_VALUE;
        for (int i = 0; i < tallListe.length; i++) {
            if (storsteTall > tallListe[i]) {
                storsteTall = tallListe[i];
            }
        }

        return storsteTall;
    }

   /*  Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayet.  */

    public double gjennomsnitt() {
        double gjennomsnitt = 0;
        for (int i = 0; i < tallListe.length; i++) {
            gjennomsnitt = gjennomsnitt + tallListe[i];
        }

        gjennomsnitt = (double) gjennomsnitt / tallListe.length;

        return gjennomsnitt;
    }


   /* Metode som viser tallene i arrayet i en meldngsboks.
     I tillegg skal det, i meldingsboks, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst, og
     hva som er gjennomsnittsverdien, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Bruk gjerne String.format("%.2f,tall) til dette.
     Legg inn mellomrom mellom tallene og skriv ut et passende antall tall
     per linje. */

    public void skrivUt() {

        String ut = "";

        for (int i = 0; i < tallListe.length; i++) {
            ut += tallListe[i];


            if ((i + 1) % 8 == 0) {
                ut += "\n";
            }

        }

       ut+="\n";


        ut +=
                "Minste tall: " + lavesteTall()
                        + "\n Største tall: " + storsteTall()+
                         "\n Gjennomsnittet: " + String.format("%.2f",gjennomsnitt());



        JOptionPane.showMessageDialog(null, ut);
    }
}







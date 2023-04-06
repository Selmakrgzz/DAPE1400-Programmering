import javax.swing.*;
import java.util.*;

public class UnikeTall {

    int[] talliste; // Deklarasjon av array for lagring av tilfeldige heltall
    private static final int LOWERCONSTANT = 100; // Deklarasjon av nedre grense
    private static final int UPPERCONSTANT = 1000; // Deklarasjon av øvre grense
    JTextArea output = new JTextArea("");
    Random generator = new Random();
    private String utskrift = "";

    /* Deklarasjon av array for lagring av tilfeldige heltall og andre
     nødvendige variabler og/eller konstanter.  */
    public UnikeTall(int input) {
        talliste = new int[input];
    }
    /*Konstruktør som mottar arrayens lengde som parameter og
     oppretter arrayen.  */

    public boolean finnes(int tall) {

        for (int i = 0; i < talliste.length; i++) {
            if (tall == talliste[i]) {
                return true;
            }
        }
        return false;
    }
    /*Metode som skal undersøke om et gitt tall finnes i arrayen fra før.
     Tallet det letes etter skal mottas som parameter.
     Metoden skal returnere true hvis tallet finnes i arrayen.
     Hvis ikke skal metoden returnere false. */

    public void tilfeldig() {
        int random = 0;
        for (int i = 0; i < talliste.length; i++) {
            random = generator.nextInt((UPPERCONSTANT - LOWERCONSTANT) + 1) + LOWERCONSTANT;

            if (finnes(random) == true) {
                i--;
            } else {
                talliste[i] = random;
            }

        }
    }
    /*Metode som skal fylle arrayen med tilfeldige tall mellom 100 og 1000,
     begge grenser inkludert. Metoden skal gjøre dette på en måte som sikrer
     at alle tallene er forskjellige. Metoden skal ikke ha parametre og heller
     ikke returnere noen verdi.  */

    public int lavesteTall() {
        int lavesteTall = Integer.MAX_VALUE;
        for (int i = 0; i < talliste.length; i++) {
            if (lavesteTall > talliste[i]) {
                lavesteTall = talliste[i];

            }
        }
        return lavesteTall;
    }
    /*Metode som finner og returnerer det minste tallet i arrayen. */

    public int storsteTall() {
        int storsteTall = Integer.MIN_VALUE;
        for (int i = 0; i < talliste.length; i++) {
            if (storsteTall < talliste[i]) {
                storsteTall = talliste[i];

            }
        }
        return storsteTall;
    }
    /* Metode som finner og returnerer det største tallet i arrayen. */

    public double snitt() {
        double snitt = 0;
        for (int i = 0; i < talliste.length; i++) {
            snitt = snitt + talliste[i];
        }
        snitt = (double) snitt / talliste.length;
        return snitt;
    }
    /* Metode som beregner og returnerer den gjennomstnittlige verdien
     (double-verdi) av tallene i arrayen.  */



    /*Metode som returnerer den heltallsverdien som ligger nærmest
     gjennomsnittverdien. Hint! Her kan du bruke Math.abs(...) som returnerer
     absoluttverdien til uttrykket mellom parentesene. */
    public void output(JTextArea tekstomrade) {
        tilfeldig();
        for (int i = 0; i < talliste.length; i++) {
            tekstomrade.append(talliste[i] + "  ");

            if ((i + 1) % 8 == 0) {
                tekstomrade.append("\n");
            }

            if (i != talliste.length - 1) {
                tekstomrade.append(" ");
            } else {
                tekstomrade.append("");
            }

        }
        utskrift = "\n"
                + "Største tall: " + storsteTall() + "\n"
                + "Minste tall: " + lavesteTall() + "\n"
                + "Gjennomsnitt: " + snitt() + "\n";
        tekstomrade.append(utskrift);

        JOptionPane.showMessageDialog(null, tekstomrade, "Unike tall", JOptionPane.PLAIN_MESSAGE);
    }
    /*Metode som viser tallene i arrayen i et tekstområde, som mottas
     som parameter. I tillegg skal det, i tekstområdet, skrives ut
     opplysninger om hvilket tall som er minst, hvilket som er størst,
     hva som er gjennomsnittsverdien, og hvilken heltallsverdi som
     er nærmest gjennomnittet, jfr bildet over. Gjennomsnittverdien
     skal skrives ut med en desimal. Legg inn mellomrom mellom tallene
     og skriv ut et passende antall tall per linje. */
}


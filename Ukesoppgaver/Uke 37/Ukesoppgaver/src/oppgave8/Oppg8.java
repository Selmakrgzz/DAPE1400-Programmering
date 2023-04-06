package oppgave8;

public class Oppg8 {
    public static void main (String [] args){
        //Hva blir skrevet ut?  Bruk reglene for aritmetikken
        //for å løse oppgaven før du kopierer inn koden og
        //kjører den for å sjekke resutlatet.
        //Resultatet blir -1.0.

        double tall1=1;
        double tall2=2;
        double resultat;
        resultat = tall1 * 4 + (tall2 * 2 + tall1 ) / (tall2-tall1*3);
        System.out.println(resultat);
    }
}

package oppgave2;

//Bruk samme array som i oppgave 1. Legg til tallene 10 og 11 i arrayet.
//Slett så elementene med tallene 2 og 3. Skrivså ut hele arrayet med en for-løkke.
//Bruk size() for å finne lengden i arrayet.

import java.util.ArrayList;

public class Oppg2 {
    public static void main(String [] args){
        ArrayList<Integer> heltalltsListe = new ArrayList<>();
        heltalltsListe.add(1);
        heltalltsListe.add(2);
        heltalltsListe.add(3);
        heltalltsListe.add(4);
        heltalltsListe.add(5);
        heltalltsListe.add(6);
        heltalltsListe.add(7);
        heltalltsListe.add(8);
        heltalltsListe.add(9);
        heltalltsListe.add(10);
        heltalltsListe.add(11);

        int indeks1 = heltalltsListe.indexOf(3);
        int indeks2 = heltalltsListe.indexOf(2);
        heltalltsListe.remove(indeks1);
        heltalltsListe.remove(indeks2);

        for (int tall : heltalltsListe){
            System.out.print(tall+ " ");
        }

        System.out.println("Lengden er: " +heltalltsListe.size());

    }

}

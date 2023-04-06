package oppgave1;

    //Definer følgende helttalls-ArrayList: 1,2,3,4,5,6,7,8,9.
    //Skriv ut element nummer 3 og 6 med System.out

import java.util.ArrayList;

public class Oppg1 {
    public static void main(String [] args){
        ArrayList <Integer> heltalltsListe = new ArrayList<>();
        heltalltsListe.add(1);
        heltalltsListe.add(2);
        heltalltsListe.add(3);
        heltalltsListe.add(4);
        heltalltsListe.add(5);
        heltalltsListe.add(6);
        heltalltsListe.add(7);
        heltalltsListe.add(8);
        heltalltsListe.add(9);

        System.out.println(heltalltsListe.get(2));
        System.out.println(heltalltsListe.get(5));

    }


}

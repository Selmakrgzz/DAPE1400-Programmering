package oppgave4;

    //Definer et ArrayList attay : 1,2,3,4,5,6,7,8,9.
    //Skriv kode for å konvertere dette til et vanlig heltalls-array.
    //Skriv så kode for å skrive ut det nye heltalls-arrayet

import java.util.*;

public class Oppg4 {
    public static void main(String [] args){
        ArrayList <Integer> arrayListe =  new ArrayList<>();
            arrayListe.add(1);
            arrayListe.add(2);
            arrayListe.add(3);
            arrayListe.add(4);
            arrayListe.add(5);
            arrayListe.add(6);
            arrayListe.add(7);
            arrayListe.add(8);
            arrayListe.add(9);

        Object[] objects = arrayListe.toArray();

        for (Object nyListe : objects) {
            System.out.print(nyListe + " ");
        }
    }
}

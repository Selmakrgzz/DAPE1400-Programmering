package oppgave3;

    //Definer et heltalls-arrayet  : 1,2,3,4,5,6,7,8,9.
    //Skriv kode for å konvertere dette til et ArrayList.
    //Skriv så ut denne ArrayListen.

import java.util.*;

public class Oppg3 {
    public static void main(String [] args){
        Integer [] arrayListe = {1,2,3,4,5,6,7,8,9};

        List konverter =  Arrays.asList(arrayListe);

        System.out.println(konverter);
    }

}

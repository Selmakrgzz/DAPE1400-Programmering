package oppgave6;

//Lag et program som sjekker om to heltalls-arrays er like.
//Bruk løkker, ikke innebygd java klasse/metode.

import java.util.Arrays;

public class Oppg6 {
    public static void main(String [] args){

        int [] liste1 = {1,2,3,4,5,9,7,8,9};

        int [] liste2 = {1,2,3,4,5,6,7,8,9};

        if (Arrays.equals(liste1, liste2)){
            System.out.println("De er like");
        } else {
            System.out.println("De er ikke like");
        }


    }
}
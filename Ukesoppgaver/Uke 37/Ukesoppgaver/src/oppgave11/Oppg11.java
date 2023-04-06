package oppgave11;

import static javax.swing.JOptionPane.*;

public class Oppg11 {
    public static void main (String [] args){
        //Les inn et tall mellom 0 og 1000 og
        //skriv ut summen av sifrene i tallet (tverrsummen).
        //F.eks inndata 751 skal gi utdata 7 + 5 + 1 = 13.
        //Tips: 751 % 10 = 1 og 751 / 10 = 75.
        // 3 % 2 = 1


        String tall = showInputDialog("Skriv inn et tall");


        int forsteTall = 0, andreTall = 0, tredjeTall = 0;
        try {
            forsteTall = Integer.parseInt(String.valueOf(tall.charAt(0)));
            andreTall = Integer.parseInt(String.valueOf(tall.charAt(1)));
            tredjeTall = Integer.parseInt(String.valueOf(tall.charAt(2)));
        } catch (Exception error) {
            System.out.println(error);
        }


        System.out.println(forsteTall + andreTall + tredjeTall);
    }
}

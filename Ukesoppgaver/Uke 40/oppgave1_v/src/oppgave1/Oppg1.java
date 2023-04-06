package oppgave1;

//Lag en primtallsgenerator. Det vil si liste ut alle primtall fra 0 og opp til et valgt tall.
//Et primtall er et tall som bare er delelig med 1 og seg selv.

import javax.swing.*;

public class Oppg1 {
    public static void main(String [] args){
     //   int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall"));
        //int count = 0;

        // primtall er bare delelig med 1 og seg selv.
        /*for (int i = 1; i <= tall; i++){

            primtall = (2*i - 1);

            // for-løkke j i % j == 0, count++;

            // hvis count > 2.
            // 15.
            // 1 til 15 (1 2 3 4 5 6 7 8  9 10 11 12 13 14 15)

                System.out.println(primtall);
        } */

        int tall = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall"));
        int i = 1;
        while (i <= tall ) {
            int count = 0;
            for (int j = 1; j <= i; j++) {
                if (i % j == 0) {
                    count++;
                }
            }

            if (count == 2) {
                System.out.println(i + " ");
            }
            i++;
        }

    }
}
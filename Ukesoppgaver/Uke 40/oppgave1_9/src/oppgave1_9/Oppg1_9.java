package oppgave1_9;

//Skriv et program som regner ut fakultet til et tall. n! = n*(n-1)*(n-2)*...*1.
//F. eks 5! = 5*4*3*2*1 = 120
//Programmet skal lese inn tallet og skrive ut resultatet.

import javax.swing.*;

public class Oppg1_9 {
    public static void main(String [] args){

        int fact = 1;

        int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall"));

        for (int i = 1; i <= nummer; i++){
            fact = fact*i;
        }

        System.out.println("Fakultet av " +nummer+ " er " +fact);

    }
}

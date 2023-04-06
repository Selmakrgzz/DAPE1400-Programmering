package oppgave1_7;

    //Lag et program som skriver ut en rettvinklet trekant med *.
    //Input hvor mange stjerner grunnflaten skal være. F.eks: 3 * gir
    //X
    //XX
    //XXX

import javax.swing.*;

public class Oppg1_7 {
    public static void main(String [] args){

        int grunnflate = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn ønsket grunnflate"));

        for (int i = 0; i <= grunnflate; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println("");
        }


    }
}

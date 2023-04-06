package oppgave1_5;

    //Ref. forrige oppgave. Lag et program som finner de to største tallene av 10 heltall.
    //En ekstra variabel må brukes.

import javax.swing.*;

public class Oppg1_5 {
    public static void main(String [] args){

        int storst1 = 0;
        int storst2 = 0;

        for (int teller = 1; teller <= 10; teller++){
            int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et heltall"));
            JOptionPane.showMessageDialog(null, "nummer " +teller+ ":" +nummer);

            if (nummer > storst1){
                storst2 = storst1;
                storst1 = nummer;
            } else if (nummer > storst2) {
                storst2 = nummer;
            }

        }

        JOptionPane.showMessageDialog(null, "Det første største tallet er " +storst1+ ", " +
                "og det andre største tallet er " +storst2);
    }
}

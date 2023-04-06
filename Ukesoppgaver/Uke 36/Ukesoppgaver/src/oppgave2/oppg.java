package oppgave2;

import static javax.swing.JOptionPane.*;

public class oppg { public static void main(String[] args) {


        /*Lag et program som leser inn tre desimaltall.
        *Programmet skal så summere disse tallene og
        *vise summen i System.out.*/

        String innStreng1 = showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = showInputDialog("Skriv inn et desimaltall til");
        String innStreng3 = showInputDialog("Vennligst skriv inn enda et desimaltall tall til");

        double tall3 = Double.parseDouble(innStreng1);
        double tall4 = Double.parseDouble(innStreng2);
        double tall5 = Double.parseDouble(innStreng3);
        Double sum = tall3 + tall4 + tall5;

        System.out.println("Summen av desimaltallene blir " + sum);

        try {
                tall3 = Double.parseDouble(innStreng1);
                tall4 = Double.parseDouble(innStreng2);
                tall5 = Double.parseDouble(innStreng3);
        }

        catch (Exception e) {
                tall3 = Double.valueOf(innStreng1);
                tall4 = Double.valueOf(innStreng2);
                tall5 = Double.valueOf(innStreng3);
                System.out.println(e);
                }


        }
}
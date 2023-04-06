package oppgave1_3;

    //Lag et program som beregner skatten til tre personer.
    //Skatten er 30 % frem til 500.000 kr og 50 % over.
    //Les inn navn og inntekt på de 3 personene og
    //vis den samme informasjonen med hvor mye skatt de kan forvente seg.

import javax.swing.*;

public class Oppg1_3 {
    public static void main(String [] args){

        String navn1 = JOptionPane.showInputDialog("Skriv inn ditt navn (1)");
        int inntekt1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn inntekten din(1)"));

        String navn2 = JOptionPane.showInputDialog("Skriv inn ditt navn(2)");
        int inntekt2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn inntekten din(2)"));

        String navn3 = JOptionPane.showInputDialog("Skriv inn ditt navn(3)");
        int inntekt3 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn inntekten din(3)"));

        double skatt1 = 0.30;
        double skatt2 = 0.50;


        if (inntekt1 < 500000){

            double skattInntekt = inntekt1 * skatt1;
            System.out.println(navn1+ " har en inntekt under 500.000,-, og må derfor forvente å betale ca. "
                    +String.format("%.2f", skattInntekt)+ " kr i skatt.");

        } else if (inntekt1 > 500000) {

            double skattInntekt = inntekt1 * skatt2;
            System.out.println(navn1+ " har en inntekt over 500.000,-, og må derfor forvente å betale ca. "
                    +String.format("%.2f", skattInntekt)+ " kr i skatt.");
        }

        if (inntekt2 < 500000){

            double skattInntekt = inntekt2 * skatt1;
            System.out.println(navn2+ " har en inntekt under 500.000,-, og må derfor forvente å betale ca. "
                    +String.format("%.2f", skattInntekt)+ " kr i skatt.");

        } else if (inntekt2 > 500000) {

            double skattInntekt = inntekt2 * skatt2;
            System.out.println(navn2+ " har en inntekt over 500.000,-, og må derfor forvente å betale ca. "
                    +String.format("%.2f", skattInntekt)+ " kr i skatt.");
        }

        if (inntekt3 < 500000){

            double skattInntekt = inntekt3 * skatt1;
            System.out.println(navn3+ " har en inntekt under 500.000,-, og må derfor forvente å betale ca. "
                    +String.format("%.2f", skattInntekt)+ " kr i skatt.");

        } else if (inntekt3 > 500000) {

            double skattInntekt = inntekt3 * skatt2;
            System.out.println(navn3+ " har en inntekt over 500.000,-, og må derfor forvente å betale ca. "
                    +String.format("%.2f", skattInntekt)+ " kr i skatt.");
        }

    }
}

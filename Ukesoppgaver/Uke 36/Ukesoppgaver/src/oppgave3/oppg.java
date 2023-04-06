package oppgave3;

import static javax.swing.JOptionPane.*;

public class oppg {

        public static void main(String[] args) {

                /*Utvid programmet i oppgave 2 og beregn gjennomsnittet
                 *av tallene som er lest inn. Vis så dette resultatet via
                 * 1) Meldingsboks og 2) System.out.*/

                String innStreng1 = showInputDialog("Skriv inn et desimaltall");
                String innStreng2 = showInputDialog("Skriv inn et desimaltall til");
                String innStreng3 = showInputDialog("Vennligst skriv inn enda et desimaltall tall til");

                double tall3 = Double.parseDouble(innStreng1);
                double tall4 = Double.parseDouble(innStreng2);
                double tall5 = Double.parseDouble(innStreng3);
                Double sum = (tall3 + tall4 + tall5) / 3;

                System.out.println("Summen av desimaltallene blir " + sum);




        }
}
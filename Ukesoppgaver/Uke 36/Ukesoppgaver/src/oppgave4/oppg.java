package oppgave4;

import static javax.swing.JOptionPane.*;

public class oppg {

    public static void main(String[] args) {

            /*Endre på programmet i oppgave 3 slik at du sikrer
             *at det skrives inn tall og ikke vanlig tekst i
             *input-boksene. Bruk try og catch for å få dette til.
             *Dersom det ikke skrives inn tall sett input til 0.*/


            String innStreng1 = showInputDialog("Skriv inn et desimaltall");
            String innStreng2 = showInputDialog("Skriv inn et desimaltall til");
            String innStreng3 = showInputDialog("Vennligst skriv inn enda et desimaltall tall til");

            double tall3 = Double.parseDouble(innStreng1);
            double tall4 = Double.parseDouble(innStreng2);
            double tall5 = Double.parseDouble(innStreng3);
            Double sum = (tall3 + tall4 + tall5) / 3;

            System.out.println("Summen av desimaltallene blir " + sum);

            try{
                tall3 = Double.parseDouble(innStreng1);
                tall4 = Double.parseDouble(innStreng2);
                tall5 = Double.parseDouble(innStreng3);
            }

            catch (
                    Exception e) {
                tall3 = Double.valueOf(innStreng1);
                tall4 = Double.valueOf(innStreng2);
                tall5 = Double.valueOf(innStreng3);
                System.out.println(e);
            }

        }
    }



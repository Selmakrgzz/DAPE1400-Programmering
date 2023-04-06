package oppgave1_4;

    //Et program skal finne det største tallet av 10 heltall.
    //Tallene skal leses inn via Inputbokser og vises som en meldingsboks.
    //Programmet skal bruke tre heltallsvariabler:
    //telller; som teller 0 til 10
    //nummer; som er tallet som er lest inn
    //størst; det til en hver tid største tallet

import javax.swing.*;

public class Oppg1_4 {
    public static void main(String [] args){

        int storst = 0;

        for (int teller = 0; teller <= 10; teller++){
            int nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn heltall"));
            JOptionPane.showMessageDialog(null, "nummer" +teller+ ":" +nummer);

             if (nummer > storst){
                 storst = nummer;
             }
        }
        System.out.println("Største nummer er: " +storst);
    }
}

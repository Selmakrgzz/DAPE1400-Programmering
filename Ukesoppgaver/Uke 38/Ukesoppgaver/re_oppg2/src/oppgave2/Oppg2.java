package oppgave2;

//Utvid oppgave 1 til å lese inn de nødvendige dataene
//fra input-bokser og skrive resultatet ut i en meldingsboks.

import javax.swing.*;
import java.util.jar.JarOutputStream;

class Boker {
    public String tittel;
    public String forfatter;
    public double pris;
    public int iSBN_nummer;

    public void skrivUtBok(){
        String ut = "Her er info om boken: \n";
        ut += "Tittel: " +tittel+ "\n";
        ut += "Forfatter: " +forfatter+ "\n";
        ut += "Pris: " +pris+ "\n";
        ut += "iSBN: " +iSBN_nummer+ "\n";

        JOptionPane.showMessageDialog(null, ut);
    }
}

public class Oppg2 {
    public static void main(String [] args){
        String tittel = JOptionPane.showInputDialog("Skriv inn tittel");
        String forfatter = JOptionPane.showInputDialog("Skriv inn forfatter");
        int pris = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn pris"));
        int iSBN_nummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn iSBN nummer"));

        Boker nyBok = new Boker();
        nyBok.tittel = tittel;
        nyBok.forfatter = forfatter;
        nyBok.pris = pris;
        nyBok.iSBN_nummer = iSBN_nummer;
        nyBok.skrivUtBok();



    }

}
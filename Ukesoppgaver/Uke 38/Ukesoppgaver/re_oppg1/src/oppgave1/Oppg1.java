package oppgave1;

//Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
//- tittel
//- pris
//- forfatter
//- iSBN-nummer
//Videre skal klassen ha en metode som skriver
//ut de enkelte attributtene via System.out.
//Skriv nødvendig kode i main for å opprette et objekt av denne
//klassen og sette attributtene til noen verdier.
//Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.

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

        System.out.println(ut);

    }
}

public class Oppg1 {
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

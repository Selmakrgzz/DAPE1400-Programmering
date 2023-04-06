package oppgave2;

//Utvid oppgave 1 til å lese inn de nødvendige dataene
//fra input-bokser og skrive resultatet ut i en meldingsboks.

import static javax.swing.JOptionPane.*;

class Boker{
    public String tittel;
    public String forfatter;
    public double pris;
    public int iSBN_nummer;

    // Skriver ut data
    public void skrivUtBoker(){
        String ut = "Her er informasjon om boka: \n";
        ut += "Tittel: " +tittel+ "\n";
        ut += "Forfatter: " +forfatter+ "\n";
        ut += "Pris: " +pris+ "\n";
        ut += "iSBN nummer: " +iSBN_nummer+ "\n";
        showMessageDialog(null, ut);
    }
}

public class Oppg2 {
    public static void main (String [] args){
        // Setter inn data
        String tittel = showInputDialog("Skriv inn tittel på boka");
        String forfatter = showInputDialog("Skriv inn navn på forfatter");
        double pris = Double.parseDouble(showInputDialog("Skriv inn pris"));
        int iSBN_nummer = Integer.parseInt(showInputDialog("Skriv inn iSBN nummer"));

        // Oppretter ny bok
        Boker bok1 = new Boker();
        bok1.tittel = tittel;
        bok1.forfatter = forfatter;
        bok1.pris = pris;
        bok1.iSBN_nummer = iSBN_nummer;
        bok1.skrivUtBoker();
    }
}

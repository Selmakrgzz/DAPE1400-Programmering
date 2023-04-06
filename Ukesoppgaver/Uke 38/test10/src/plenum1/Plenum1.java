package plenum1;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Bok{
    public String tittel;
    public String forfatter;
    public double pris;

    // Regner rabatt
    public double regnUtRabatt(double prosent){
        double rabatt = pris * (prosent / 100);
        return rabatt;
    }

    // Skriver ut boka
    public void skrivUtBoka(){
        String ut = "Her finner du bokinformasjon \n";
        ut += "Tittel: " +tittel+ "\n";
        ut += "Forfatter: " +forfatter+ "\n";
        ut += "Pris: " +pris+ "\n";
        showMessageDialog(null, ut);
    }
}

public class Plenum1 {
    public static void main (String [] args){
        // Leser inn data
        String tittel = showInputDialog("Skriv inn tittel på boka");
        String forfatter = showInputDialog("Skriv inn navn på forfatter");
        double pris = Double.parseDouble(showInputDialog("Skriv inn pris på boka"));

        // Lager ny bok
        Bok nyBok = new Bok();
        nyBok.tittel = tittel;
        nyBok.forfatter = forfatter;
        nyBok.pris = pris;

        // Sjekker rabatten
        String person = showInputDialog("Student eller Ansatt");

        if (person.equals("student")){
            double rabatt = nyBok.regnUtRabatt(20);
            nyBok.pris = pris - rabatt;
        }

        nyBok.skrivUtBoka();

    }
}
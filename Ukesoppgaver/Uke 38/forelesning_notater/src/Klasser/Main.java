package Klasser;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


class Bok {
    public String tittel;
    public String forfatter;
    public double pris;

    public double regnUtRabatt(double prosent){
        double rabatt = pris * (prosent / 100);
        return rabatt;
        // return pris * (prosent / 100);
    }

    public void skrivUtBok(){ // () er en tom parameter
        String ut = "Her er informasjonen om boka \n";
        ut += "Tittel " +tittel+ "\n";
        ut += "Forfatter " +forfatter+ "\n";
        ut += "Pris " +pris+ "\n";
        showMessageDialog(null, ut);
    }

}


public class Main {
    public static void main (String [] args){

        String tittel = showInputDialog("Skriv inn tittel");
        String forfatter = showInputDialog("Skriv inn forfatter");
        String innPris = showInputDialog("Skriv inn pris");
        double pris = Double.parseDouble(innPris);

        Bok bok1 = new Bok();
        bok1.tittel = tittel;
        bok1.forfatter = forfatter;
        bok1.pris = pris;

        String person = showInputDialog("Ansatt eller student");
        if (person.equals("Student")) {
            double rabatt = bok1.regnUtRabatt(15);
            bok1.pris = pris - rabatt;
        }

        bok1.skrivUtBok();

    }
}

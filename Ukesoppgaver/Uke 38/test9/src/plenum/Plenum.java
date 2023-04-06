package plenum;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Bok {
     public String tittel;
     public String forfatter;
     public double pris;

    public double regnUtRabatt(double prosent){
        double rabatt = pris * (prosent/100);
        return rabatt;
    }

    public void skrivUtBok(){
        String ut = "Her er bokinformasjonen: \n";
        ut += "Tittel: " +tittel+ "+\n";
        ut += "Forfatter: " +forfatter+ "\n";
        ut += "Pris: " +pris+ "\n";
        showMessageDialog(null, ut);
    }

}

public class Plenum
{
    public static void main (String [] args){

        // Leser inn data
        String tittel = showInputDialog("Skriv inn tittel på boka");
        String forfatter = showInputDialog("Skriv inn navnet på forfatteren");
        double pris = Double.parseDouble(showInputDialog("Skriv inn pris på boka"));

        // Oppretter boken

        Bok bok1 = new Bok();
        bok1.tittel = tittel;
        bok1.forfatter = forfatter;
        bok1.pris = pris;

        // Sjekker rabatt

        String person = showInputDialog("Ansatt eller Student");
        if (person.equals("Ansatt")){
            double rabatt = bok1.regnUtRabatt(15);
            bok1.pris = bok1.pris - rabatt;
        }

        bok1.skrivUtBok();

    }

}
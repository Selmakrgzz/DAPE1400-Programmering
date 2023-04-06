import javax.swing.*;

/*import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showMessageDialog;*/

public class main {
    public static void main(String[] args) {

        /*String fornavn, etternavn, alder, adresse, poststed, postnr;
        fornavn = "";
        etternavn = "";
        alder = "";
        adresse = "";
        poststed = "";
        postnr = "";*/

        /*System.out.println("Navnet er : " +fornavn);
        System.out.println("Etternavnet er : " +etternavn);
        System.out.println("Alderen er : " +alder);
        System.out.println("Adressen er : " +adresse);
        System.out.println("Poststed er : " +poststed);
        System.out.println("Postnr er : " +postnr);*/



        /*String innFornavn = showInputDialog("Skriv inn fornavnet");
        String innEtternavn = showInputDialog("Skriv inn etternavnet");
        String innAlder = showInputDialog("Skriv inn alderen");

        String out = "Alderen til "+innFornavn+" "+innEtternavn+" er "+innAlder;

        showMessageDialog(null, out);*/

        String innFornavn = JOptionPane.showInputDialog("Skriv inn fornavnet");
        String innEtternavn = JOptionPane.showInputDialog("Skriv inn etternavnet");
        String innAlder = JOptionPane.showInputDialog("Skriv inn alderen");
        String innAdresse = JOptionPane.showInputDialog("Skriv inn adresse");
        String innPoststed = JOptionPane.showInputDialog("Skriv inn poststed");
        String innPostnr = JOptionPane.showInputDialog("Skriv inn postnr");


        /*String out = innFornavn +" "+ innEtternavn +" "+" bor i "+" "+ innAdresse +" "+" som har postnummer "+" "+ innPostnr +
                " "+" i "+ " "+ innPoststed +" "+"."+" "+ innFornavn +""+"'s"+" "+" alder er "+" "+ innAlder +" "+" år"+" ";*/

        String out = " Navn: " + innFornavn+ " " + innEtternavn+ "\n" +
    " Adresse: "+ innAdresse +  "\n" +
    " Postnummer: "+ innPostnr + "\n" +
    " Poststed: "+ innPoststed+ "\n" +
    " Alder: " + innAlder+ " "+ "år";

        System.out.println(out);

        /*showMessageDialog(null, out);*/


    }
}

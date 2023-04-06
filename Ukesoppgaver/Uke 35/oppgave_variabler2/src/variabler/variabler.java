package variabler;
import static javax.swing.JOptionPane.*;

public class variabler {
    public static void main(String[] args) {

        String innFornavn = showInputDialog("Skriv inn fornavn: ");
        String innEtternavn = showInputDialog("Skriv inn etternavn: ");
        String innAlder = showInputDialog("Skriv inn alder: ");
        String innAdresse = showInputDialog("Skriv inn adresse: ");
        String innPoststed = showInputDialog("Skriv inn poststed: ");
        String innPostnr = showInputDialog("Skriv inn postnr: ");

        /*String out = "Navnet er: " +innFornavn+ " " +innEtternavn;*/

        /*String out = "Alderen til "+innFornavn+" "+innEtternavn+" er "+innAlder+" år";*/

       /* String out = innFornavn+" "+innEtternavn+" bor i "+innAdresse+" som har postnummer "+innPostnr+" i " +
                ""+innPoststed+" . "+innFornavn+" 's alder er "+innAlder+" år.";*/

        /* IKKE SKRIV PÅ DENNE MÅTEN.
        Vær obs på mellomrommene du har mellom "anførselstegnene", og hvor du plasserer dem.
        String out = "Alderen til " +innFornavn+ " " +innEtternavn+ "er" +innAlder+  "år";*/

        String out = "Navn: " +innFornavn+ " " +innEtternavn+ "\n" +
                "Adresse: " +innAdresse+ "\n" +
                "Postnummer: " +innPostnr+ "\n" +
                "Poststed: " +innPoststed+ "\n" +
                "Alder: " +innAlder+" "+ "år.";

        System.out.println(out);




        /*showMessageDialog(null, out);*/







    }
}

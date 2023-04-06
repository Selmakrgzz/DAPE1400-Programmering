import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class main {
    public static void main (String [] args){

        String navnOgEtternavn, epostadresse, telefonNr,
                adresse, postAdresse, postNr;
        navnOgEtternavn = "Sarah McChicken";
        epostadresse = "Sarah_Mc@outlook.com";
        telefonNr = "12345678";
        adresse = "Rubergvegen 34";
        postAdresse = "Kongsvinger";
        postNr = "3848";

        System.out.println("Navnet er :"+navnOgEtternavn);
        System.out.println("Epostadressen er: "+epostadresse);
        System.out.println("Telefonnummer er :"+telefonNr);
        System.out.println("Adressen er :"+adresse);
        System.out.println("Postadressen er :"+postNr+" "+postAdresse);

        String innNavnOgEtternavn = showInputDialog("Skriv inn navnet");
        String innEpostadresse = showInputDialog("Skriv inn epostadresse");
        String innTelefonNr = showInputDialog("Skriv inn telefonnummer");
        String innAdresse = showInputDialog("Skriv inn adresse");
        String innPostNr = showInputDialog("Skriv inn postnummer");
        String innPostAdresse = showInputDialog("Skriv inn postadresse");

        String out = "Navnet er : "+innNavnOgEtternavn+"\n"+
                "Epostadressen er : "+innEpostadresse+"\n"+
                "Telefonnummeret er : "+innTelefonNr+"\n"+
                "Adressen er : "+innAdresse+" "+innPostAdresse+" "+innPostNr;

        showMessageDialog(null, out);
    }

}

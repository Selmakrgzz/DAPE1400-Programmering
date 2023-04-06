import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showMessageDialog;

public class main {
    public static void main (String [] args){
       /* String navn, adresse;
        navn = "Sarah McChicken";
        adresse ="Akersgata 21";
        String postAdresse = "Oslo";
        String postNr = "0347";
        System.out.println("Navnet er : "+navn);
        System.out.println("Adressen er : "+adresse);
        System.out.println("Postnummeret er : "+postNr+" "+postAdresse);*/

        String innNavn = showInputDialog("Skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnummer");
        String innPostadresse = showInputDialog("Skriv inn postadressen");

        String out = "Navnet : "+innNavn+"\n"+ "Adressen er : "+innAdresse+" "+innPostNr+" "+innPostadresse;

        showMessageDialog(null, out);




    }
}

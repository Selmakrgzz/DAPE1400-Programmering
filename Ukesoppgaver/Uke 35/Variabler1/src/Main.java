import static javax.swing.JOptionPane.*;
import static javax.swing.JOptionPane.showMessageDialog;
public class Main {
    public static void main (String [] args){
       /* String navn, adresse;
        navn = "Per Hansen";
        adresse = "Askerveien 29";
        String postAdresse = "Oslo";
        String postNr = "0394";
        System.out.println("Navnet er : "+navn);
        System.out.println("Adressen er : "+adresse);
        System.out.println("Postnummeret er : "+postNr+" "+postAdresse);*/

        String innNavnet = showInputDialog("Skriv inn navnet");
        String innAdresse = showInputDialog("Skriv inn adressen");
        String innPostNr = showInputDialog("Skriv inn postnummeret");
        String innPostadresse = showInputDialog("Skriv inn postadressen");

        String out = "Navnet : "+innNavnet+"\n"+ "Adressen er : "+innAdresse+" "+innPostNr+" "+innPostadresse;

        showMessageDialog(null, out);


    }
}

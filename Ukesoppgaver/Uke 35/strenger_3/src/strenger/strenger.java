package strenger;

import javax.swing.*;

public class strenger {
    public static void main (String [] args){
        String id_nummer = JOptionPane.showInputDialog("Hva er ditt id nummer?");
        String name = JOptionPane.showInputDialog("Hva er ditt navn?");
        String email = JOptionPane.showInputDialog("Hva er epostadressen din?");
        String out = id_nummer +" "+ name +" "+ email;
        // Ønsker å få informasjonen skrevet ut med mellomrom, og bruker derfor å printe ut out.
        System.out.print(out);
    }
}

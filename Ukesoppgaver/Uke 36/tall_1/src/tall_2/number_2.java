package tall_2;

import static javax.swing.JOptionPane.*;

public class number_2 {
    public static void main (String [] args){
        String innStreng1 = showInputDialog("Skriv inn et heltall: ");
        String innStreng2 = showInputDialog("Skriv inn et heltall til: ");
        int tall1 = Integer.parseInt(innStreng1);
        int tall2 = Integer.parseInt(innStreng2);
        Integer multiplikasjon = tall1*tall2;
        System.out.println("Multiplikasjonen ble " +multiplikasjon);

        try {
            tall1 = Integer.parseInt(innStreng1);
        }

        catch (Exception e){
            tall1 = Integer.valueOf(0);
            System.out.println(e);
        }



    }
}

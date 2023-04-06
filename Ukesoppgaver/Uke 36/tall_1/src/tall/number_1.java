package tall;

import static javax.swing.JOptionPane.*;

public class number_1 {
    public static void main (String [] args){

        String innString1 = showInputDialog("Skriv inn et desimaltall: ");
        String innString2 = showInputDialog("Skriv inn et desimaltall til: ");
        Double tall1 = Double.parseDouble(innString1);
        Double tall2 = Double.parseDouble(innString2);
        Double divisjon = tall1/tall2;
        System.out.println("Divisjonen ble " +divisjon);

        try{
            tall1 = Double.parseDouble(innString1);
        }

        catch (Exception e){
            tall1 = Double.valueOf(0);
            System.out.println(e);
        }

    }
}

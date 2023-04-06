package strenger2;

import javax.swing.*;

public class strenger2 {
    public static void main (String [] args){
        String name = JOptionPane.showInputDialog("Hva heter du?");
        String idnumber = JOptionPane.showInputDialog("Hva er idnummeret ditt?");
        String adress = JOptionPane.showInputDialog("Hva er adressen din?");
        String email = JOptionPane.showInputDialog("Hva er eposten din?");
        System.out.print(name);
        System.out.print(idnumber);
        System.out.print(adress);
        System.out.print(email);

    }
}

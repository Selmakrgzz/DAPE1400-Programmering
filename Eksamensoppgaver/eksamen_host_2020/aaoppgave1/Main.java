package eksamen_host_2020.aaoppgave1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String velg = JOptionPane.showInputDialog("C eller F");

            if (velg.equals("C")){
                double innC = Double.parseDouble(JOptionPane.showInputDialog("skrivC"));
                Double fahrenheit = innC * 1.8 + 32;
                System.out.println(innC+ " er " +fahrenheit+ " F");
            }

            if (velg.equals("F")){
                double innF = Double.parseDouble(JOptionPane.showInputDialog("skriv F"));
                Double celcius = (innF - 32) / 1.8;
                System.out.println(innF+ " er " +celcius+ " C");
            } else {
                System.out.println("Enten C eller F");
            }
    }
}

package eksamen_var_2021_konte.aoppgave2;

import javax.swing.*;

public class Bmi {
    public static void main(String[] args) {
        double vekt;
        double hoyde;

        try {
             vekt = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn vekt"));
             hoyde = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn høyde"));

        } catch (Exception e){
            vekt = 0;
            hoyde = 0;
        }

        if (vekt != 0 && hoyde != 0){
            double bmi = (1.3 * vekt) / (Math.pow((hoyde/100), 2.5));
            JOptionPane.showMessageDialog(null, "Bmi: " +bmi);
        } else {
            System.out.println("Skriv inn tall!");
        }

    }
}

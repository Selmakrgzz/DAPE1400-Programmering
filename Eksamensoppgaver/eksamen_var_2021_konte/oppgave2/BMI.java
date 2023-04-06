package eksamen_var_2021_konte.oppgave2;

import javax.swing.*;

public class BMI {
    public static void main(String[] args) {
        try {
            double vekt = Double.parseDouble(JOptionPane.showInputDialog("Skriv vekt"));
            double hoyde = Double.parseDouble(JOptionPane.showInputDialog("Skriv høyde"));
            double bmi = (1.3 * vekt) / (Math.pow((hoyde/100), 2.5));
            JOptionPane.showMessageDialog(null, String.format("%.2f", bmi));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Skriv inn gyldig tegn!");
        }
    }
}

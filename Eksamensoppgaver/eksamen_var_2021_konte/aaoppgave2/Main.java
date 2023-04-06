package eksamen_var_2021_konte.aaoppgave2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        double vekt;
        double hoyde;
        try {
            vekt = Double.parseDouble(JOptionPane.showInputDialog("Skriv vekt"));
            hoyde = Double.parseDouble(JOptionPane.showInputDialog("SKriv høyde"));

            double bmi = (1.3 * vekt)/(Math.pow((hoyde/100), 2.5));

            JOptionPane.showMessageDialog(null, "Din bmi: " +String.format("%.2f", bmi));

        } catch (Exception e){
            System.out.println("Skriv tall!");
        }

    }
}

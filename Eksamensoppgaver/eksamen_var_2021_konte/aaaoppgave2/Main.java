package eksamen_var_2021_konte.aaaoppgave2;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String innVekt = JOptionPane.showInputDialog("Skriv vekt");
        String innHoyde = JOptionPane.showInputDialog("Skriv høyde");

        try {
            double vekt = Double.parseDouble(innVekt);
            double hoyde = Double.parseDouble(innHoyde);

            double bmi = (1.3 * vekt)/(Math.pow((hoyde/100), 2.5));
            JOptionPane.showMessageDialog(null, String.format("%.2f", bmi));
        } catch (Exception e){
            System.out.println("skriv tall");
        }
    }
}

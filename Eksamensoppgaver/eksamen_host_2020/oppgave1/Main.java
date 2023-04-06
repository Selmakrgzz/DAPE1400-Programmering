package eksamen_host_2020.oppgave1;

import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        String velg = JOptionPane.showInputDialog("Fra C eller F?");

            if (velg.equals("C")){
                double innCelcius = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn Celcius"));
                double fahrenheit = innCelcius * 1.8 + 32;
                System.out.println(innCelcius+ " er " +fahrenheit+ " F");
            }else if (velg.equals("F")){
                double innFahrenheit = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn Fahrenheit"));
                double celcius = (innFahrenheit - 32) / 1.8;
                System.out.println(innFahrenheit+ " er " +celcius+ " C");
            } else {
                System.out.println("Skriv inn C eller F!");
            }
    }
}

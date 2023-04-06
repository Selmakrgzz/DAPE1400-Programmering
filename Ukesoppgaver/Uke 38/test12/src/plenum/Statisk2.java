package plenum;

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;


class Konverter{
    public static double fraCelsius(double graderCelsius){
        double fahrenheit = (graderCelsius * 9/5) + 32;
        return fahrenheit;
    }
    public static double fraFahrenheit(double graderFahrenheit){
        double celsius = (graderFahrenheit-32) * 5/9;
        return celsius;
    }
}

public class Statisk2 {
    public void main (String [] args){
        String valg = showInputDialog("Konverter fra Celsius eller Fahrenheit");
        if (valg.equals("celsius")){
            double celsius = Double.parseDouble(showInputDialog("Skriv inn celsius"));
            String ut = celsius+ " grader celsius er " +Konverter.fraCelsius(celsius)+ " Fahrenheit";
            showMessageDialog(null, ut);
        }

        if (valg.equals("fahrenheit")){
            double fahrenheit = Double.parseDouble(showInputDialog("Skriv inn fahrenheit"));
            String ut = fahrenheit+ " grader fahrenheit er " +Konverter.fraFahrenheit(fahrenheit)+ " Celsius";
            showMessageDialog(null, ut);
        }
    }


}

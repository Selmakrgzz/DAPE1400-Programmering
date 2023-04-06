package eksamen_var_2020_konte.oppgave2;

public class Main {
    public static void main(String [] args){
        double celcius = 28.4;
        System.out.println(celcius+ " C er " +KonverterTemperatur.tilFahrenheit(celcius)+ " F \n");

        double fahrenheit = 100.3;
        System.out.println(fahrenheit+ " F er " +KonverterTemperatur.tilCelcius(fahrenheit)+ " C");


    }
}

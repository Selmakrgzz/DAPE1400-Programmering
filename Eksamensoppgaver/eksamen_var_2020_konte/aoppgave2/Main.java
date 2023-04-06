package eksamen_var_2020_konte.aoppgave2;

public class Main {
    public static void main(String[] args) {
        double fahrenheit = 245;
        double celsius = 23;
        System.out.println(fahrenheit+ " F er " +String.format("%.2f", KonverterTemperatur.tilCelsius(fahrenheit))+ " C");
        System.out.println(celsius+ " C er " +String.format("%.2f", KonverterTemperatur.tilFahrenheit(celsius))+ " F");
    }
}

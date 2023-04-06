package eksamen_var_2020_konte.aaoppgave2;

public class Main {
    public static void main(String[] args) {
        double innFahrenheit = 250;
        double innCelcius = 23.4;

        System.out.println(String.format(innFahrenheit + " F er " +String.format("%.2f", KonverterTemperatur.tilCelcius(innFahrenheit)))+ " C");
        System.out.println(innCelcius+ " C er " +KonverterTemperatur.tilFahrenheit(innCelcius)+ " F");
    }
}

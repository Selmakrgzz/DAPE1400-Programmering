package eksamen_var_2020_konte.aoppgave2;

class KonverterTemperatur {
    public static double tilCelsius(double fahrenheit){
        return (fahrenheit - 32) / 1.8;
    }

    public static double tilFahrenheit(double celsius){
         return celsius * 1.8 + 32;
    }
}

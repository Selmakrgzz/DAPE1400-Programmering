package eksamen_var_2020_konte.aaoppgave2;

class KonverterTemperatur {
    public static double tilCelcius(double innFahrenheit){
        return  (innFahrenheit - 32) / 1.8;
    }

    public static double tilFahrenheit(double innCelcius){
        return  innCelcius * 1.8 + 32;
    }
}

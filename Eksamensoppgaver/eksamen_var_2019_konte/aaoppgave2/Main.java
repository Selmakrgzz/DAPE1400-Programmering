package eksamen_var_2019_konte.aaoppgave2;

public class Main {
    public static void main(String[] args) {
        Skatt nySkatt = new Skatt("Fatima", "Akervei 22", 100_000);
        nySkatt.beregn();
        System.out.println(nySkatt);
    }
}

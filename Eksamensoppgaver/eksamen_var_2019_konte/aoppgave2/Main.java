package eksamen_var_2019_konte.aoppgave2;

public class Main {
    public static void main(String[] args) {
        Skatt skatt1  = new Skatt("Heidi", "Akervei 33", 160000);
        skatt1.beregn();
        System.out.println(skatt1);

    }
}

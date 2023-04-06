package eksamen_var_2020_konte.aoppgave3;

public class Main {
    public static void main(String[] args) {
        Forfatter enForfatter = new Forfatter("Maria Karl", "23 Januar 1998");
        Bok enBok = new Bok("Heidi", enForfatter);
        System.out.println(enBok);
    }
}

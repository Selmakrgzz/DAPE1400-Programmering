package eksamen_host_2020.aaoppgave3;

public class Main {
    public static void main(String[] args) {
        Pasient kari = new Pasient("Kari", "292929", 23, "Migrene");
        Pasient linda = new Pasient("Linda", "1663743", 23, "Frisk");
        Lege fatima = new Lege("Fatima", "72535535", 93);

        fatima.pasienter[0] = kari;
        fatima.pasienter[1] = linda;

        System.out.println(fatima);
    }
}

package eksamen_host_2020.aoppgave2;

public class Main {
    public static void main(String[] args) {
        Pasient pasient1 = new Pasient("Heidi", "8383883", 34, "Migrene");
        Pasient pasient2 = new Pasient("Karl", "93939932", 23, "Hodeskade");

        Lege lege1 = new Lege("Hege", "9393993", 34);
        lege1.pasienter[0] = pasient1;
        lege1.pasienter[1] = pasient2;

        String ut = lege1.toString();
        System.out.println(ut);
    }
}

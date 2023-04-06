package eksamen_host_2020.oppgave2;

public class Main {
    public static void main(String [] args){
        Pasient pasient1 = new Pasient("Mari Kari", "199292", 33, "Vondt i mage");
        Pasient pasient2 = new Pasient("Lana Kore", "939993", 29, "Søvnproblemer");

        Lege lege1 = new Lege("Fali Mons", "939399", 48);
        lege1.pasient[0] = pasient1;
        lege1.pasient[1] = pasient2;
        System.out.println(lege1);
    }
}

package eksamen_var_2020_konte.oppgave3;

public class Main {
    public static void main(String [] args){
        Forfatter enForfatter = new Forfatter("Heidi Mersen", "22 januar 1998");
        Bok bok1 = new Bok("Haryy potter", enForfatter);
        Bok bok2 = new Bok("Til Mars", enForfatter);

        System.out.println(bok2);
        System.out.println(bok2);
    }
}

package eksamen_var_2021_konte.aaaaoppgave3;

public class Main {
    public static void main(String[] args) {
        Student kari = new Student("Kari", "8484884");
        Student maia = new Student("Maia", "244244423");
        Student [] studenter = new Student[10];
        studenter[0] = kari;
        studenter[1] = maia;
        Fag programmering = new Fag("Programmering", "2020", studenter);

        System.out.println(programmering);
    }
}

package eksamen_var_2021_konte.aaaoppgave3;

public class Main {
    public static void main(String[] args) {
        Student kari = new Student("Kaari", "3939393");
        Student mustafa = new Student("Mustafa", "99763663");

        Student [] studenter = new Student[10];
        studenter[0] = kari;
        studenter[1] = mustafa;

        Fag programmering = new Fag("Programmering", "2020", studenter);

        System.out.println(programmering);

    }
}

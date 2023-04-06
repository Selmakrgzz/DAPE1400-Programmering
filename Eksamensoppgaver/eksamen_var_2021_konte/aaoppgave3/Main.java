package eksamen_var_2021_konte.aaoppgave3;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("Mari", "838388");
        Student student2 = new Student("Mais","7272727");
        Student [] studenter = new Student[10];
        studenter[0] = student1;
        studenter[1] = student2;
        Fag programmering = new Fag("Programmering", "2020",studenter);

        System.out.println(programmering);

    }
}

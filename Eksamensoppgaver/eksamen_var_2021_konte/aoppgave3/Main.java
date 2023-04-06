package eksamen_var_2021_konte.aoppgave3;

public class Main {
    public static void main(String[] args) {
        Student [] studentListe = new Student[10];
        Student kari = new Student("Kari", "888383");
        studentListe[0] = kari;
        Student Fatima = new Student("Fatima", "124533");
        studentListe[1] = Fatima;

        Fag fag1 = new Fag("Programmering", "2022", studentListe);
        System.out.println(fag1);
    }
}

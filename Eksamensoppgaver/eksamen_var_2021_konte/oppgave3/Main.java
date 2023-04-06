package eksamen_var_2021_konte.oppgave3;

public class Main {
    public static void main(String[] args) {
        Student [] studentlist = new Student[10];
        Student student1 = new Student("Heidi", "9929292");
        studentlist[0] = student1;
        Student student2 = new Student("Pia", "9929292");
        studentlist[1] = student2;

        Fag fag1 = new Fag("Programmering", "2002", studentlist);
        System.out.println(fag1);
    }
}

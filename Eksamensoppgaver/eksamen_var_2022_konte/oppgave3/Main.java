package eksamen_var_2022_konte.oppgave3;

public class Main {
    public static void main(String[] args) {
        Personlia enPersonlia1 = new Personlia("Heidi", "Akervei33", "848484884");
        Student enStudent = new Student(enPersonlia1, "93999393");
        Personlia enPersonlia2 = new Personlia("Mark", "Lakervei38", "72936248");
        Ansatt enAnsatt =new Ansatt(enPersonlia2, "Professor");

        System.out.println(enStudent);
        System.out.println();
        System.out.println(enAnsatt);
    }
}

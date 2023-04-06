package eksamen_var_2022_konte.aoppgave3;

public class Main {
    public static void main(String[] args) {
        Personlia kari = new Personlia("Kari", "akevei 44", "838383883");
        Personlia Mahmod = new Personlia("Mahmod", "Berkvei 43", "10993772");
        Student student1 = new Student(kari, "299299");
        Ansatt ansatt1 = new Ansatt(Mahmod, "Professor");
        System.out.println(student1);
        System.out.println();
        System.out.println(ansatt1);
    }
}

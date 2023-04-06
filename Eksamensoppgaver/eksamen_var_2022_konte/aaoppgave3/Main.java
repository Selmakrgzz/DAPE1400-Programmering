package eksamen_var_2022_konte.aaoppgave3;

public class Main {
    public static void main(String[] args) {
        Personlia kari = new Personlia("Kari", "Akervei 45", "393939939");
        Personlia fatima = new Personlia("Fatima", "okervei 23", "83873532");

        Student student1 = new Student(kari, "1414242424");
        Ansatt ansatt1 = new Ansatt(fatima, "Professor");

        System.out.println(student1);
        System.out.println();
        System.out.println(ansatt1);
    }
}

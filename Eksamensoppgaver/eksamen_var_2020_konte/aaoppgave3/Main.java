package eksamen_var_2020_konte.aaoppgave3;

public class Main {
    public static void main(String[] args) {
        Forfatter forfatter1 = new Forfatter("Maia kari", "22.juli");
        Bok bok1 = new Bok("Harry Potter", forfatter1);
        System.out.println(bok1);
    }
}

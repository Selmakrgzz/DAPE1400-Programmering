package eksamen_var_2022_konte.aaoppgave2;

public class Main {
    public static void main(String[] args) {
        String valuta = "DKK";
        ValutaKalkulator valutaKalkulator = new ValutaKalkulator();
       String ut = String.valueOf(valutaKalkulator.beregnKurs(valuta));
        System.out.println(ut);
    }
}

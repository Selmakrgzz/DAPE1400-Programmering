package eksamen_var_2022_konte.aoppgave2;

public class Main {
    public static void main(String[] args) {
    Valutakalkulator valutakalkulator1 = new Valutakalkulator();
        System.out.println("NOK: " +valutakalkulator1.beregnKurs("NOK"));
        System.out.println("SEK: " +valutakalkulator1.beregnKurs("SEK"));
    }
}

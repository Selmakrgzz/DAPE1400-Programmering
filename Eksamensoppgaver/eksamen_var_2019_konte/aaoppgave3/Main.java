package eksamen_var_2019_konte.aaoppgave3;

public class Main {
    public static void main(String[] args) {
        double [] list = {-0.4 , -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4};
        Temperatur nyTemp = new Temperatur();
        System.out.println("Gjennomsnitt temp: " +nyTemp.gjennomsitt(list));
        System.out.println("Minumum temp: " +nyTemp.minumum(list));
    }
}

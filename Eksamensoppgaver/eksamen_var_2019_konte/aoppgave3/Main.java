package eksamen_var_2019_konte.aoppgave3;

public class Main {
    public static void main(String[] args) {
        double [] tempList = {-0.4 , -2.9, -2.8, -3.8, 1.6, -2.4, -0.9, -2.2, 0.5, -4.0};

        System.out.println("Gjennomsnitt temp: " +String.format("%.2f", Temperatur.gjennomsnitt(tempList))+ " C");
        System.out.println("Minste temp: " +Temperatur.minimum(tempList)+ " C");
    }
}

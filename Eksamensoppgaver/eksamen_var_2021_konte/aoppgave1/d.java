package eksamen_var_2021_konte.aoppgave1;

public class d {
    public static void main(String[] args) {
        int [] list = {20, 34,-4,4,5,11,-23};
        int sum = 0;
        for (int i : list){
            sum += i;
        }
        System.out.println("Sum: " +sum);
        double gjennomsnitt = (double) sum / list.length;
        System.out.println("Gjennomsnitt: " +String.format("%.2f", gjennomsnitt));
    }
}

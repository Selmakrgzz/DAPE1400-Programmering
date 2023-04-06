package eksamen_var_2021_konte.oppgave1;

public class d {
    public static void main(String[] args) {
        int [] list = new int[] {20, 34,-4,4,5,11,-23};
        int sum = 0;
        int teller = 0;

        for (int i : list){
            sum += i;
            teller++;
        }
        double gjennomsnitt = (double) sum/teller;
        System.out.println("Gjennomsnitt: " +gjennomsnitt);
    }
}

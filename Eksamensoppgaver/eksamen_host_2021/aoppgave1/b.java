package eksamen_host_2021.aoppgave1;

public class b {
    public static void main(String[] args) {
        int i = 5;
        int sum = 0;
        int teller = 0;
        while (i <= 100){
            System.out.print(i+ " ");
            sum += i;
            teller++;
            i+=5;
        }
        System.out.println("\n Sum: " +sum);
        double gjennomsnitt = (double) sum / teller;
        System.out.println("Gjennomsnitt: " +gjennomsnitt);
    }
}

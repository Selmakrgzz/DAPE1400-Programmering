package eksamen_host_2019.oppgave1;

public class b {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        int teller = 0;
        while (i <= 100){
            System.out.println(i+ " ");
            sum += i;
            teller++;
            i+=2;
        }
        System.out.println("Sum: " +sum);
        double gjennomsnitt = (double) sum/teller;
        System.out.println("Gjennomsnitt: " +gjennomsnitt);
    }
}

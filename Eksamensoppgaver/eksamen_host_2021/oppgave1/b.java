package eksamen_host_2021.oppgave1;

public class b {
    public static void main(String[] args) {
        int i = 5;
        int teller = 0;
        int sum = 0;
        while (i <= 100){
            System.out.println(i+" ");
            sum += i;
            teller++;
            i+=5;
        }
        System.out.println("Sum: " +sum);
        double gjennomsnitt = sum/teller;
        System.out.println("Gjennomsnitt: " +gjennomsnitt);
    }
}

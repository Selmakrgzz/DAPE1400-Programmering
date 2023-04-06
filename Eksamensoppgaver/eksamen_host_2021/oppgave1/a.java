package eksamen_host_2021.oppgave1;

public class a {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;
        for (int i = 5; i <= 100; i+=5){
            System.out.println(i+ " ");
            sum += i;
            teller++;
        }
        double gjennomsnitt = sum/teller;
        System.out.println("Sum: " +sum);
        System.out.println("Gjennomsnitt: " +gjennomsnitt);
    }
}

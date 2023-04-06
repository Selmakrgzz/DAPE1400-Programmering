package eksamen_host_2021.aoppgave1;

public class a {
    public static void main(String[] args) {
        int sum = 0;
        int teller = 0;
        for (int i = 5; i <= 100; i+=5){
            sum += i;
            teller++;
            System.out.print(i+ " ");
        }
        System.out.println("Sum: " +sum);
        double gjennomsnitt = (double) sum/teller;
        System.out.println("Gjennomsnitt: " +gjennomsnitt);
    }
}
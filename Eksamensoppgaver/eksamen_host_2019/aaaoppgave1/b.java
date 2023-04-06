package eksamen_host_2019.aaaoppgave1;

public class b {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;
        int teller = 0;
        while (i <= 100){
            System.out.print(i+ " ");
            sum += i;
            teller++;
            i+=2;
        }
        System.out.println();
        System.out.println("Gjennomsnitt: " +sum / teller);
    }
}

package eksamen_host_2021.aaoppgave1;

public class a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 5; i <= 100; i+=5){
            sum += i;
            System.out.print(i+ " ");
        }
        System.out.println("\nSum: " +sum);
    }
}

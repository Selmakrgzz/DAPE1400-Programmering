package eksamen_host_2021.aaoppgave1;

public class b {
    public static void main(String[] args) {
        int i = 5;
        int sum = 0;
        while (i <= 100){
            System.out.print(i+ " ");
            sum += i;
            i+=5;
        }
        System.out.println("\nsum:" +sum);
    }
}

package eksamen_host_2019.aaaaaoppgave1;

public class b {
    public static void main(String[] args) {
        int i = 2;
        int sum = 0;

        while (i <= 100){
            System.out.print(i+ " ");
            sum += i;
            i+=2;
        }
        System.out.println("Sum: " +sum);
    }
}

package eksamen_var_2019_konte.oppgave1;

public class a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 100; i <= 200; i++){
            sum += i;
            System.out.print(i+ " ");
        }
        System.out.println();
        System.out.println("Sum: " +sum);
    }
}

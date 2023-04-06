package eksamen_var_2022_konte.oppgave1;

public class a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i < 1000; i+=10){
            sum += i;
            System.out.println(i+ " ");
        }
        System.out.println("Sum: " +sum);
    }
}

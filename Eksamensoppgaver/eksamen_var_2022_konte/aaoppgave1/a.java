package eksamen_var_2022_konte.aaoppgave1;

public class a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 10; i <= 1000; i+=10){
            System.out.print(i+" ");
            sum += i;
        }
        System.out.println("Sum: " +sum);
    }
}

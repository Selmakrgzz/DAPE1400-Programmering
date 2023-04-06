package eksamen_var_2022_konte.aoppgave1;

public class a {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 0; i <= 1000; i+=10){
            sum += i;
            System.out.print(i+ " ");
        }
        System.out.println("Sum: " +sum);
    }
}

package eksamen_var_2022_konte.aoppgave1;

public class b {
    public static void main(String[] args) {
        int i = 0;
        int sum = 0;
        while (i <= 1000){
            System.out.print(i+ " ");
            sum += i;
            i+=10;
        }
        System.out.println("Sum: " +sum);
    }
}

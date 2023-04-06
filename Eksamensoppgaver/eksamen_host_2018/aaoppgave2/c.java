package eksamen_host_2018.aaoppgave2;

public class c {
    public static void main(String[] args) {
        int [] liste = {-3,41,5,-3,2,49};
        int sum = 0;

        for (int i : liste){
            if (i > 0){
                sum += i;
            }
        }
        System.out.println("Sum: " +sum);
    }
}

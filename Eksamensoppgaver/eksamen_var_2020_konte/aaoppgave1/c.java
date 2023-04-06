package eksamen_var_2020_konte.aaoppgave1;

public class c {
    public static void main(String[] args) {
        int [] liste = {1,3,6,2,7,10,23,6,3,6};
        int sum = 0;
        int i = 0;

        while (i < liste.length){
            sum += i;
            i++;
        }
        System.out.println("Gjennomsnitt: " +sum / liste.length);
    }
}

package eksamen_var_2021_konte.aaoppgave1;

public class d {
    public static void main(String[] args) {
        int [] list = {20, 34,-4,4,5,11,-23};
        int sum = 0;

        for (int i = 0; i < list.length; i++){
            sum += list[i];
        }
        System.out.println(sum/ list.length);
    }
}

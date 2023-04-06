package eksamen_host_2018.aoppgave2;

public class d {
    public static void main(String[] args) {
        int [] list = {-3,41,5,-3,2,49};
        int sum = 0;
        int teller = 0;
        for (int i : list){
            if (i > 0){
                sum += i;
                teller++;
                System.out.println(i+ " ");
            }
        }
        System.out.println("Sum: " +sum);
        double gjennomsnitt = (double) sum/ teller;
        System.out.println("Gjennomsnitt: " +gjennomsnitt);
    }
}

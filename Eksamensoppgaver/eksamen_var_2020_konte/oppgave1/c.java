package eksamen_var_2020_konte.oppgave1;

public class c {
    public static void main(String[] args) {
        int [] liste = {1,3,6,2,7,10,23,6,3,6};
        int sum = 0;
        int i = 0;
        int teller = 0;
        while (i < liste.length){
            System.out.print(liste[i]+ " ");
            sum += liste[i];
            teller++;
            i++;
        }
        System.out.println("\n Sum: " +sum);
        double gjennomsnitt = (double) sum / teller;
        System.out.println("Gjennomsnitt: " +gjennomsnitt);

    }
}

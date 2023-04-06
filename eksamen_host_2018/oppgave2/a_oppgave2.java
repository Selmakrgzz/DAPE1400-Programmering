package eksamen_host_2018.oppgave2;

public class a_oppgave2 {
    public static void main(String [] args){
        int [] list = {-3,41,5,-3,2,49};
        int teller = 0;
        for (int i : list){
            if (i > 10){
                teller++;
            }
        }
        System.out.println(teller);
    }
}
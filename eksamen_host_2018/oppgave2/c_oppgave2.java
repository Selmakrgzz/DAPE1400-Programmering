package eksamen_host_2018.oppgave2;

public class c_oppgave2 {
    public static void main(String [] args){
        int [] list = {-3,41,5,-3,2,49};
        int sum = 0;
        int teller = 0;
        for (int i : list){
            if (i > 0){
                sum += i;
                teller++;
            }
        }
        System.out.println("Sum: " +sum);
        System.out.println("Gjennomsnitt: "+sum/teller);
    }
}

//if (i > 0){
//                sum += list[i];
//                System.out.print(list[i]+ " ,");
//            }//
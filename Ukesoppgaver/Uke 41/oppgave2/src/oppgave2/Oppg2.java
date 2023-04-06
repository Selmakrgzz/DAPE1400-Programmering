package oppgave2;

//Bruk arrayet i oppgave 1. Summer alle tallene med en for-løkke.
//Finn så gjennomsnittet av alle tallene. Summer så alle tallene som er større enn 5.
//Finn så gjennomsnittet av disse. Summer så tallene med en forenklet for-løkke.

public class Oppg2 {
    public static void main(String [] args){

        int liste[] = {1,2,3,4,5,6,7,8,9};
        int sum1 = 0;
        int sum2 = 0;
        int sum3 = 0;
        double antall = 0;
        double gjennomsnitt2 = 0;

        for (int i = 0; i <= liste.length; i++){
            sum1+=i;

            if (i > 5) {
                int[] liste2 = new int[4];
                sum2 += i;
                 antall = liste2.length;
                 gjennomsnitt2 = sum2 / antall;
            }

        }

        int [] liste2 = {1,2,3,4,5,6,7,8,9};
        for (int tall : liste2){
            sum3 += tall;

        }


        System.out.println(sum1);

        int gjennomsnitt1 = sum1 / liste.length;

        System.out.println(gjennomsnitt1);

        System.out.println(sum2);

        System.out.println(gjennomsnitt2);

        System.out.print(sum3+" ");


        /*if (i > 5){
            sum2+=i;

            gjennomsnitt2 = sum2 / ;

            System.out.println(gjennomsnitt2);
        }*/


    }
}

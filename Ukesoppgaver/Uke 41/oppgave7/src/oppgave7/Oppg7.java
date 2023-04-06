package oppgave7;

//Lag et program som teller opp antall partall og antall oddetall i et helttalls-array.

public class Oppg7 {
    public static void main(String [] args){

        int [] liste = {1,2,3,4,5,6,7,8,9};
        int partall = 0;
        int oddetall = 0;

        System.out.println("Partall: ");
        for (int i = 1; i <= liste.length; i++){

            if (i % 2 == 0){
                partall = i;
                System.out.print(partall+ ", ");
            }
        }

        System.out.println();
        System.out.println("Oddetall: ");
        for (int j = 1; j <= liste.length; j++){

            if (j % 2 != 0){
                oddetall = j;
                System.out.print(oddetall+ ", ");
            }
        }

    }
}

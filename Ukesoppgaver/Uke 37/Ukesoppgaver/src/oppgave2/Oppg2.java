package oppgave2;

public class Oppg2 {
    public static void main (String [] args){

        //Lag et program som definerer en variabel int antall=0.
        //Skriv så ut partallene mellom 0 og 10 (2,4,6,8)
        //ved å øke variabelen med 2 mellom hver gang.

        int antall = 0;
        int partall1 = antall + 2;
        int partall2 = partall1 + 2;
        int partall3 = partall2 + 2;
        int partall4 = partall3 + 2;



        System.out.println("Partallene mellom 0 og 10 er (" +partall1+ "," +partall2+ "," +partall3+ "," +partall4+")");
    }
}

package oppgave8;

//Lag en while-løkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 98).
//Finn også gjennomsnittet.

public class Oppg8 {
    public static void main(String [] args){
        int i = 0;
        int sum = 0;

        while (i < 100){
            i+=2;
            sum += i;
        }
        System.out.println("Summen blir: " +sum);
        double gjennomsnitt = (double) sum / (double) i;
        System.out.println("Gjennomsnittet blir: " +gjennomsnitt);
    }
}

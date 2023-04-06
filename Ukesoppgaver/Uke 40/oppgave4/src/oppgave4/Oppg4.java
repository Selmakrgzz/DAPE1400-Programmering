package oppgave4;

//Lag en forløkke som summerer alle partallene fra 0 til 100 og viser gjennomsnittet (0 til og med 99)

public class Oppg4 {
    public static void main(String [] args){
        int sum = 0;
        int tall = 0;
        for (int i = 0; i < 100; i+=2){
            sum += i;
            tall++;
        }
        System.out.println("Summen av partallene blir" +sum);
        double gjennomsnitt = (double) sum / (double) tall;
        System.out.println("Gjennomsnittet blir" +gjennomsnitt);
    }
}

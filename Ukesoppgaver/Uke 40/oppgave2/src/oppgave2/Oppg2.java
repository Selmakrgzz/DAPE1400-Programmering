package oppgave2;

//Lag en forløkke som summerer alle tallene fra 0 til 10 og viser summen (0 til og med 9)

public class Oppg2 {
    public static void main(String [] args){
        int sum = 0;

        for (int i = 0; i < 10; i++){
            sum = sum + i;
        }
        System.out.println(sum);
    }
}

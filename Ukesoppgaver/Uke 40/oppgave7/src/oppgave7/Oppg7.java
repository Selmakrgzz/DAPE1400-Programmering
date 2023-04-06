package oppgave7;

//Lag en while-løkke som viser alle partall mellom fra 0 til 20 med et mellomrom mellom tallene (0 til og med 18).

public class Oppg7 {
    public static void main(String [] args){
        int i = 0;

        while (i < 20){
            System.out.print(i+ " ");
            i+=2;
        }
    }
}

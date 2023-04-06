package oppgave9;

public class Oppg9 {
    public static void main (String [] args){
        //Hva gir de ulike logiske uttrykkene under
        //(anngi om de blir true eller false etter kolon):
        //sett tall1 = 5
        //sett tall2 = 4
        //tall1 == tall2 : ? false
        //tall1 != tall2 : ? true
        //tall1 <= tall2 : ? false
        //tall1 >= tall2 : ? false
        //tall1 < tall2  : ? false
        //tall1 > tall2  : ? true

        int tall1 = 5;
        int tall2 = 4;

        if (tall1 == tall2){
            System.out.println("false");
        }

        if (tall1 != tall2){
            System.out.println("true");
        }

        if (tall1 <= tall2){
            System.out.println("false");
        }

        if (tall1 >= tall2){
            System.out.println("false");
        }

        if (tall1 < tall2){
            System.out.println("false");
        }

        if (tall1 > tall2){
            System.out.println("true");
        }
    }
}

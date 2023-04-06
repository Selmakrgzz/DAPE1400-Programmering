package oppgave5;

//Bruk arrayet i oppgave 4 og skriv kode for å finne det største og minste tallet i arrayet via en løkke.
//Tips: Sett største og minste tallet til første elementet i arrayet før løkken.

public class Oppg5 {

    public static int min(int[] innArray) {
        int minste = innArray[0];
        for (int tall : innArray) {
            if (tall < minste) {
                minste = tall;
            }
        }
        return minste;
    }

    public static int maks(int[] innArray) {
        int største = innArray[0];
        for (int tall : innArray) {
            if (tall > største) {
                største = tall;
            }
        }
        return største;
    }


    public static void main(String[] args) {

        int[] liste = {45, 34, 5, 8, 10, 2, 13, 25};
        int storst = 0;
        int minst = 0;


        System.out.println("Største tallet er " + maks(liste));

        System.out.println("Minste tallet er " + min(liste));

        /*for (int i = 0; i < liste1.length; i=0){

            if (liste1[i] > storst) {

                storst = liste1[i];
                System.out.println(storst);
            }

            if (liste2[i] > minst) {
                minst = liste2[i];
                System.out.println(minst);
            }
        }*/


    }
}

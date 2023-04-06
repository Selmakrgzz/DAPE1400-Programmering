package oppgave1;

public class Oppg1 {
    public static void main (String [] args){

        //Les inn to variabler; navn, alder.
        //Skriv så følgende historie (et eksempel): Per Olsen er i dag 32 år.
        //Han er født i 1986. I 2053 er han 67 år og da vil han være pensjonist.

        String navn = "Per Olsen";
        int alder = 32;
        int årstall = 2018;
        int pensjonalder = 67;
        int fødselsår = årstall - alder;
        int pensjonår = (pensjonalder - alder) + årstall;

        System.out.println(navn+ " er i dag " +alder+ " år. Han er født i "
                +fødselsår+ ". I " +pensjonår+ " er han " +pensjonalder+
                " år og da vil han være pensjonist.");





    }
}

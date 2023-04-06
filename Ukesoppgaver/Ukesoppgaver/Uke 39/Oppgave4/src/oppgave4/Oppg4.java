package oppgave4;

    //Lag en klasse kalt Klokke. Klassen skal ha tre private heltalls- attributter, time, minutter, sekunder.
    //Klassen skal ha en konstruktør som initialiserer alle attributtene. Lag også get/set metoder for disse.
    //Set metodene skal sjekke om inndataene er korrekte (0-24 timer, 0-59 på de to andre).
    //Lag så en metode "visTiden" som skriver ut tiden enten på System.out eller
    //som meldingsboks på følgende format tt : mm : ss.
    //Skriv så kode i main for å teste ut denne klassen.

class Klokke{
    private int time;
    private int minutter;
    private int sekunder;


    public Klokke(int time, int minutter, int sekunder){
        this.time = time;
        this.minutter = minutter;
        this.sekunder = sekunder;
    }

    public int getTime(){
        return time;
    }

    public void setTime(int time){
        if(time >= 0 && time <= 24){
            this.time = time;
        } else if (time <= 0 || time >= 24) {
            System.out.println("error");
        }
    }

    public int getMinutter(){
        return minutter;
    }

    public void setMinutter(int minutter){
        if(minutter >= 0 && minutter <= 59){
            this.minutter = minutter;
        } else if (minutter <= 0 || minutter <= 59) {
            System.out.println("error");
        }

    }

    public int getSekunder(){
        return sekunder;
    }

    public void setSekunder(int sekunder){
        if (sekunder >= 0 && sekunder <= 59) {
            this.sekunder = sekunder;
        } else if (sekunder <= 0 || sekunder >= 59) {
            System.out.println("error");
        }

    }

    public void visTiden(){
        System.out.println(getTime()+ " : " +getMinutter()+ " : " +getSekunder());
    }
}

public class Oppg4 {
    public static void main (String [] args){
        Klokke nyKlokke = new Klokke(30, 22, 22);
        nyKlokke.setTime(12);
        int time = nyKlokke.getTime();
        nyKlokke.setMinutter(2);
        int minutter = nyKlokke.getMinutter();
        nyKlokke.setSekunder(120);
        int sekunder = nyKlokke.getSekunder();

        nyKlokke.visTiden();
    }
}
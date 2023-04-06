package oppgave1;

//Lag en klasse kalt Bøker. Denne klassen skal ha følgende attributter:
//- tittel
//- pris
//- forfatter
//- iSBN-nummer
//Videre skal klassen ha en metode som skriver
//ut de enkelte attributtene via System.out.
//Skriv nødvendig kode i main for å opprette et objekt av denne
//klassen og sette attributtene til noen verdier.
//Tilslutt skal metoden for å skrive disse dataene ut igjen kalles.


class Boker{
    public String tittel;
    public String forfatter;
    public double pris;
    public int iSBN_nummer;

    // Skriver ut data
    public void skrivUtBoker(){
        String ut = "Her er informasjon om boka: \n";
        ut += "Tittel: " +tittel+ "\n";
        ut += "Forfatter: " +forfatter+ "\n";
        ut += "Pris: " +pris+ "\n";
        ut += "iSBN nummer: " +iSBN_nummer+ "\n";
        System.out.println(ut);
    }
}

public class Oppg1 {
    public static void main (String [] args){
        // Setter inn data
        String tittel = "Harry Potter";
        String forfatter = "Mary Jane";
        double pris = 299;
        int iSBN_nummer = 377482;

        // Oppretter ny bok
        Boker bok1 = new Boker();
        bok1.tittel = tittel;
        bok1.forfatter = forfatter;
        bok1.pris = pris;
        bok1.iSBN_nummer = iSBN_nummer;
        bok1.skrivUtBoker();
    }
}

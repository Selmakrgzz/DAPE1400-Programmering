class Dato {
    private int dag, maaned, aar;

    public Dato( int dag, int maaned, int aar ) {
        this.dag = dag;
        this.maaned = maaned;
        this.aar =aar;
    }

    private static String maanedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){

        // lag denne
        return "Dato: " +dag+ "." +maaned+ "." +aar;
    }
}

class Bil{
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer

    String typeBetegnelse = "Audi A6";
    Dato forstegangsregistrert = new Dato(3, 5, 2022);
    String kjennemerke = "DN65746";


    // lag også konstruktør for alle attributtene
    public Bil(){
        this.typeBetegnelse = typeBetegnelse;
        this.forstegangsregistrert = forstegangsregistrert;
        this.kjennemerke = kjennemerke;
    }

    // lag så en toString metode for å vise alle attributtene
    public String toString() {
    return "Bil type: " +typeBetegnelse+ "Førstegangsregistrert: " +forstegangsregistrert+ "Kjennemerke" +kjennemerke;
    }

}


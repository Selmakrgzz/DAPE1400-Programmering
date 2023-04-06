package eksamen_host_2019.oppgave3;

class Bok {
    String tittel;
    String forfatter;
    double pris;

    public Bok(String tittel, String forfatter, double pris){
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "\nTittel: " +tittel+ "\n Forfatter: " +forfatter+ "\n Pris: " +pris;
    }
}

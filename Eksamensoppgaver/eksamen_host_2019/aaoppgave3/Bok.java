package eksamen_host_2019.aaoppgave3;

class Bok {
    private String tittel;
    private String forfatter;
    private double pris;

    public Bok(String tittel, String forfatter, double pris){
        this.tittel = tittel;
        this.forfatter = forfatter;
        this.pris = pris;
    }

    @Override
    public String toString() {
        return "Tittel: " +tittel+ "\n"
                +"Forfatter: " +forfatter+ "\n"
                +"Pris: " +pris;
    }
}

package eksamen_var_2020_konte.aaoppgave3;

public class Bok {
    private String tittel;
    private Forfatter forfatter;

    public Bok(String tittel, Forfatter forfatter){
        this.tittel = tittel;
        this.forfatter = forfatter;
    }

    public String getTittel(){
        return tittel;
    }

    public void setTittel(String tittel){
        this.tittel = tittel;
    }

    public Forfatter getForfatter() {
        return forfatter;
    }

    public void setForfatter(Forfatter forfatter) {
        this.forfatter = forfatter;
    }

    @Override
    public String toString() {
        return "Tittel: " +tittel+ "\n"
                +forfatter;
    }
}

package eksamen_var_2020_konte.aoppgave3;

public class Forfatter {
    private String navn;
    private String fodt;

    public Forfatter(String navn, String fodt){
        this.navn = navn;
        this.fodt = fodt;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getFodt() {
        return fodt;
    }

    public void setFodt(String fodt) {
        this.fodt = fodt;
    }

    @Override
    public String toString() {
        return "Navn: " +navn+ "\n"
                +"Født: " +fodt;
    }
}

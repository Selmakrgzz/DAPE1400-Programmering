package eksamen_host_2018.aoppgave4;

class Ansatt {
    private String navn;
    private Dato fodt;
    private Dato tiltradt;

    public Ansatt(String navn, Dato fodt, Dato tiltradt){
        this.navn = navn;
        this.fodt = fodt;
        this.tiltradt = tiltradt;
    }

    @Override
    public String toString() {
        return "Navn: " +navn+ "\n"
                +"Født: " +fodt+ "\n"
                + "Tiltrådt: " +tiltradt;
    }
}

package eksamen_host_2018.aaoppgave4;

class Ansatt {
    // opprett 3 attributter
    // navn, født og tiltrådt, de to siste skal være av type Dato.
    public String navn;
    public Dato fodt;
    public Dato tiltradt;

    // opprett også en konstruktør for disse
    public Ansatt(String navn, Dato fodt, Dato tiltradt){
        this.navn = navn;
        this.fodt = fodt;
        this.tiltradt = tiltradt;
    }

    // lag også en toString-metode for klassens attributter

    @Override
    public String toString() {
        return "Navn: " +navn+ "\n"
                +"Født: " +fodt+ "\n"
                +"Tiltrådt: " +tiltradt;
    }
}

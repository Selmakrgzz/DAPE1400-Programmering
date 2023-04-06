package eksamen_var_2022_konte.aoppgave3;

class Ansatt {
    private Personlia personlia;
    private String tittel;

    public Ansatt(Personlia personlia, String tittel){
        this.personlia = personlia;
        this.tittel = tittel;
    }

    @Override
    public String toString() {
        return "Personlia(Ansatta)\n"
                +personlia+ "\n"
                +"Tittel: " +tittel;
    }
}

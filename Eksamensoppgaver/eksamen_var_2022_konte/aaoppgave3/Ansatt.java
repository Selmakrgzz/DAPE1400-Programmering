package eksamen_var_2022_konte.aaoppgave3;

class Ansatt {
    private Personlia personlia;
    private String tittel;

    public Ansatt(Personlia personlia, String tittel){
        this.personlia = personlia;
        this.tittel = tittel;
    }

    @Override
    public String toString() {
        return "Ansatte: \n"
                +personlia+ "\n"
                +"Tittel: " +tittel;
    }
}

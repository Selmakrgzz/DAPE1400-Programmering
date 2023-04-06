package eksamen_var_2022_konte.aaoppgave3;

class Personlia {
    private String navn;
    private String adresse;
    private String telefonnr;

    public Personlia(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "Navn: " +navn+ "\n"
                +"Adresse: " +adresse+ "\n"
                +"Telefonnr: " +telefonnr;
    }
}

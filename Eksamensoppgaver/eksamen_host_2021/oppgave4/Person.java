package eksamen_host_2021.oppgave4;
class Person1 {
    private String navn;
    private String adresse;
    private String telefonnr;

    public Person1(String navn, String adresse, String telefonnr){
        this.navn = navn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    @Override
    public String toString() {
        return "Navn: " +navn+ "\n Adresse: " +adresse+ "\n Telefonnr: " +telefonnr;
    }
}

package eksamen_host_2021.aoppgave4;

class Person {
    private String navn;
    private String adresse;
    private String telefonnr;

    public Person(String navn, String adresse, String telefonnr){
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

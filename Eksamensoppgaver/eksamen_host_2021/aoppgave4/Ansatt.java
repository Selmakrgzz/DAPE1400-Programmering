package eksamen_host_2021.aoppgave4;

class Ansatt extends Person {
    private String intituttnavn;
    private double lonn;

    public Ansatt(String navn, String adresse, String telefonnr, String intituttnavn, double lonn){
        super(navn, adresse, telefonnr);
        this.intituttnavn = intituttnavn;
        this.lonn = lonn;
    }

    @Override
    public String toString() {
        return "Ansatte:\n"
                +super.toString()+ "\n"
                +"Intituttnavn: " +intituttnavn+ "\n"
                +"Lønn: " +lonn;
    }
}

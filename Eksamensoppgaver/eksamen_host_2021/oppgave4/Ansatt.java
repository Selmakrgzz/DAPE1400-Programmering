package eksamen_host_2021.oppgave4;

class Ansatt extends Person1{
    private String intituttnavn;
    private double lonn;

    public Ansatt(String navn, String adresse, String telefonnr, String intituttnavn, double lonn) {
        super(navn, adresse, telefonnr);
        this.intituttnavn = intituttnavn;
        this.lonn = lonn;
    }

    @Override
    public String toString() {
        return super.toString()+ " Intituttnavn: " +intituttnavn+ " Lønn: " +lonn;
    }
}

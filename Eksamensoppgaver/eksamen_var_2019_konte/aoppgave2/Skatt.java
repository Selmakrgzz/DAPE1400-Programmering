package eksamen_var_2019_konte.aoppgave2;

class Skatt {
    private String navn;
    private String adresse;
    private double lonn;
    private double skatt;

    public Skatt(String navn, String adresse, double lonn){
        this.navn = navn;
        this.adresse = adresse;
        this.lonn = lonn;
    }

    public void beregn(){
        if (lonn < 50_000){
            skatt = 0;
        }

        if (lonn > 50_000 && lonn < 150_000){
            skatt = lonn * 0.25;
        }

        if (lonn > 150_000){
            skatt = lonn * 0.35;
        }
    }

    @Override
    public String toString() {
        return navn+ ", " +adresse+ "\n"
                + "Lønn: " +lonn+ " Skatt: " +String.format("%.2f", skatt);
    }
}

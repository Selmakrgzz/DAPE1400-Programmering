package eksamen_var_2019_konte.aaoppgave2;

class Skatt {
    public String navn;
    public String adresse;
    public double lonn;
    public double skatt;

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
        return navn+ ", " +adresse+ "\nLønn: " +lonn+ " Skatt: " +skatt;
    }
}

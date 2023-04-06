package eksamen_var_2019_konte.oppgave2;

class Skatt {
    String navn;
    String adresse;
    double lonn;
    double skatt;

    public Skatt(String navn, String adresse, double lonn){
        this.navn = navn;
        this.adresse = adresse;
        this.lonn = lonn;
    }

    public void beregn(){
        if (lonn < 50000){
            skatt = 0;
        }

        if (lonn > 50000 && lonn < 150000){
            skatt = lonn * 0.25;
        }

        if (lonn > 150000){
            skatt = lonn * 0.35;
        }
    }

    @Override
    public String toString() {
        String ut = " ";
        ut += navn+ ", " +adresse+ "\n" +
                "Lønn: " +lonn+ " Skatt: " +skatt;
        return ut;
    }
}

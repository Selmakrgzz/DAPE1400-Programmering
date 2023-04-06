package eksamen_host_2020.aaoppgave3;

class Lege extends Person{
    Pasient [] pasienter = new Pasient[100];

    public Lege(String navn, String personnummer, int alder) {
        super(navn, personnummer, alder);
    }

    @Override
    public String toString() {
        String ut = "Lege: \n"
                +super.toString()+ "\n";

        for (Pasient enPasient : pasienter){
            if (enPasient != null){
                ut += enPasient+ "\n";
            }
        }
        return ut;
    }
}

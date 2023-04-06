package eksamen_host_2020.oppgave2;

class Lege extends Person2{
    public Pasient [] pasient = new Pasient[100];
    public Lege(String navn, String personnummer, int alder) {
        super(navn, personnummer, alder);
    }

    @Override
    public String toString() {
        String ut = " ";
        for (Pasient enPasient : pasient){
            if (enPasient != null){
                ut += enPasient;
            }
        }
        return "Lege: \n"
                +super.toString()+ " "+ut;
    }
}

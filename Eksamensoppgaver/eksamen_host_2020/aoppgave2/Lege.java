package eksamen_host_2020.aoppgave2;

class Lege extends Person{
    Pasient [] pasienter = new Pasient[100];

    public Lege(String navn, String personnummer, int alder){
        super(navn, personnummer, alder);
    }

    @Override
    public String toString() {
        String ut = "Lege: \n" +super.toString();
        for (Pasient pasient : pasienter){
            if (pasient != null){
                ut += "\n"+pasient;
            }
        }
        return ut;
    }
}

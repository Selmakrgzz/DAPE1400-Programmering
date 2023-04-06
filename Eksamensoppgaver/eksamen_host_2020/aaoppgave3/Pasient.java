package eksamen_host_2020.aaoppgave3;

class Pasient extends Person{
    private String diagnose;

    public Pasient(String navn, String personnummer, int alder, String diagnose) {
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return "Pasient: "
                +super.toString()+ " "
                +"Diagnose: " +diagnose;
    }
}
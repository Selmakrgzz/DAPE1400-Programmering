package eksamen_host_2020.oppgave2;

class Pasient extends Person2{
    private String diagnose;
    public Pasient(String navn, String personnummer, int alder, String diagnose){
        super(navn, personnummer, alder);
        this.diagnose = diagnose;
    }

    @Override
    public String toString() {
        return "Pasient: \n"
        +super.toString()+ "Diagnose: " +diagnose+ "\n";
    }
}

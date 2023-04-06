package eksamen_host_2020.oppgave2;

class Person2 {
    private String navn;
    private String personnummer;
    private int alder;

    public Person2(String navn, String personnummer, int alder){
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Navn: " +navn+ "\n Personnummer: " +personnummer+ "\n Alder: " +alder+ "\n";
    }
}

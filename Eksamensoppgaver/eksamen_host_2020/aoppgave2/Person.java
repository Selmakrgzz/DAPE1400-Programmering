package eksamen_host_2020.aoppgave2;

class Person {
    private String navn;
    private String personnummer;
    private int alder;

    public Person(String navn, String personnummer, int alder){
        this.navn = navn;
        this.personnummer = personnummer;
        this.alder = alder;
    }

    @Override
    public String toString() {
        return "Navn: " +navn+ "\n"
                +"Personer: " +personnummer+ "\n"
                +"Alder: " +alder;
    }
}

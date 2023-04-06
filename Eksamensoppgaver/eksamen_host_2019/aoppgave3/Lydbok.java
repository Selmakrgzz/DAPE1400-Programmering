package eksamen_host_2019.aoppgave3;

public class Lydbok extends Bok {
    private int lengdeminutter;

    public Lydbok(String tittel, String forfatter, double pris, int lengdeminutter){
        super(tittel, forfatter, pris);
        this.lengdeminutter = lengdeminutter;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"
                +"Lenge i min: " +lengdeminutter;
    }
}

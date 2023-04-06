package eksamen_host_2019.aaoppgave3;

public class Lydbok extends Bok{
    private int lengdemin;
    public Lydbok(String tittel, String forfatter, double pris, int lengdemin){
        super(tittel, forfatter, pris);
        this.lengdemin = lengdemin;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"
                +"Lengde i min: " +lengdemin;
    }
}

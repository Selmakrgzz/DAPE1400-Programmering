package eksamen_host_2019.aaaoppgave3;

class Lydbok extends Bok{
    private int lengdemin;
    public Lydbok(String tittel, String forfatter, double pris, int lengdemin){
        super(tittel, forfatter, pris);
        this.lengdemin = lengdemin;
    }

    @Override
    public String toString() {
        return "Lydbok: \n"
                +super.toString()+ "\n"
                +"Lengde min: " +lengdemin;
    }
}

package eksamen_host_2019.aaaoppgave3;

class Papirbok extends Bok{
    private int iSBN;
    public Papirbok(String tittel, String forfatter, double pris, int iSBN){
        super(tittel, forfatter, pris);
        this.iSBN = iSBN;
    }

    @Override
    public String toString() {
        return "Papirbok: \n"
                +super.toString()+ "\n"
                +"ISBN: " +iSBN;
    }
}

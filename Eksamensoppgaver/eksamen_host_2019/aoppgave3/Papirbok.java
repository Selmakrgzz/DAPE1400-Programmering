package eksamen_host_2019.aoppgave3;

class Papirbok extends Bok{
    private int iSBN;

    public Papirbok(String tittel, String forfatter, double pris, int iSBN) {
        super(tittel, forfatter, pris);
        this.iSBN = iSBN;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n"
                +"iSBN: " +iSBN;
    }
}

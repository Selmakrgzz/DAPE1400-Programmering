package eksamen_host_2019.oppgave3;

class Papirbok extends Bok {
    public int iSBN;

    public Papirbok(String tittel, String forfatter, double pris, int iSBN){
        super(tittel, forfatter, pris);
        this.iSBN = iSBN;
    }

    @Override
    public String toString() {
        return super.toString()+
                "\nISBN: " +iSBN;
    }
}

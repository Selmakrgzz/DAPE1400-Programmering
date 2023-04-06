package motorvogn;

class Bil {
    // opprett følgende attributter
    // typebetegnelse f.eks Audi A6
    // førstegangsregistrert av type Dato
    // kjennetegn dvs. skiltnummer
    public String type;
    public Dato forstereg;
    public String kjennemerke;

    // lag også konstruktør for alle attributtene
    public Bil(String type, Dato forstereg, String kjennemerke){
        this.type = type;
        this.forstereg = forstereg;
        this.kjennemerke = kjennemerke;
    }

    // lag så en toString metode for å vise alle attributtene

    @Override
    public String toString() {
        return "Type: " +type+ "\n"
               + "Førstereg: " +forstereg+ "\n"
                + "Kjennemerke: " +kjennemerke;
    }
}

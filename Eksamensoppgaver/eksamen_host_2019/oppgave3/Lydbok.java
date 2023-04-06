package eksamen_host_2019.oppgave3;

import javax.xml.parsers.SAXParser;

class Lydbok extends Bok{
    public int lengeminutter;
    public Lydbok(String tittel, String forfatter, double pris, int lengeminutter){
        super(tittel, forfatter, pris);
        this.lengeminutter = lengeminutter;
    }

    @Override
    public String toString() {
        return super.toString() +
                "\n Lenge i minutter: " +lengeminutter;
    }
}

package oppgave3;

    //Lag en klasse kalt BensinKjøp for å representere informasjon om kjøp av bensin. Klassen skal ha 5 private attributter:
    //Bensinstasjonens sted (en streng)
    //Type bensin (en streng)
    //Antall liter fylt (et desimaltall)
    //Prisen pr. liter (et desimaltall)
    //Tidspunkt fylt (en streng)
    //Klassen skal ha en konstruktør som initialiserer alle attributtene.
    //Lag også get/set metoder for disse.

    //Lag så en metode finnTotalPrisen.
    //Denne skal ikke ha noen parametere inn, men skal returnere prisen som et desimaltall.
    //Metoden skal da multiplisere antall liter fylt med prisen pr. liter.
    //Lag så kode i main for å teste ut denne klassen. Bruk String.format("%.2f", prisen); for å få to desimaler.

class BensinKjop {

    private String bensinstasjon;
    private String bensinType;
    private double antallLiter;
    private double prisPerLiter;
    private String tidspunkt;

    //Konstruktør
    public BensinKjop(String bensinstasjon, String bensinType, double antallLiter, double prisPerLiter, String tidspunkt){
        this.bensinstasjon = bensinstasjon;
        this.bensinType = bensinType;
        this.antallLiter = antallLiter;
        this.prisPerLiter = prisPerLiter;
        this.tidspunkt = tidspunkt;
    }


    //Get / set metoder
    public String getBensinstasjon(){
        return bensinstasjon;
    }

    public void setBensinstasjon(String bensinstasjon){
        this.bensinstasjon = bensinstasjon;
    }

    public String getBensinType(){
        return bensinType;
    }

    public void setBensinType(String bensinType){
        this.bensinType = bensinType;
    }

    public double getAntallLiter(){
        return antallLiter;
    }

    public void setAntallLiter(double antallLiter){
        this.antallLiter = antallLiter;
    }

    public double getPrisPerLiter(){
        return prisPerLiter;
    }

    public void setPrisPerLiter(double prisPerLiter){
        this.prisPerLiter = prisPerLiter;
    }

    public String getTidspunkt(){
        return tidspunkt;
    }

    public void setTidspunkt(String tidspunkt){
        this.tidspunkt = tidspunkt;
    }

    //Metode
    public double finnTotalPrisen(){
        double totalPris = antallLiter * prisPerLiter;
        return totalPris;
    }

}

public class Oppg3 {
    public static void main(String [] args){

        BensinKjop nyBensinkjop = new BensinKjop("Shell", "Blyfri", 3.5, 16.28, "test");
        String totalPris2 = String.format("%.2f", nyBensinkjop.finnTotalPrisen());
        System.out.println(totalPris2);

    }
}
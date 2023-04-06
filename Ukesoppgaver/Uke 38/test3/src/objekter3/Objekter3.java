package objekter3;

class Sykkel {
    public String farge;
    public void visFarge(){
        System.out.println("Fargen på båten er " +farge);
    }
}

public class Objekter3 {
    public static void main(String[] args) {
        Sykkel nySykkel = new Sykkel();
        nySykkel.farge = "gul";
        nySykkel.visFarge();

    }
}

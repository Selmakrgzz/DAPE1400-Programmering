package objekter1;

class Bil {
    public String farge;

    public void visFarge(){
        System.out.println("Fargen på bilen er " +farge);

    }
}

public class Objekter1 {
    public static void main(String [] args){
        Bil nyBil = new Bil();
        nyBil.farge = "blå";
        nyBil.visFarge();
    }
}

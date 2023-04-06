package Objekter1;

class Bil {
    private String farge;

    //public void visFarge(){
    //    System.out.println("Fargen på bilen er " +farge);
    //}

    public void settFarge(String fargen){
        farge = fargen;
    }

    public String hentFarge(){
        return farge;//reutrnerer hit
    }
}

public class Objekter1 {
    public static void main(String[] args) {
        Bil nyBil = new Bil();
        //nyBil.farge = "blå";
        nyBil.settFarge("blå");
        //nyBil.visFarge();
        String bilFargen;
        bilFargen = nyBil.hentFarge();// returnerer fargen
        System.out.println("Fargen på bilen er " +bilFargen);


    }
}
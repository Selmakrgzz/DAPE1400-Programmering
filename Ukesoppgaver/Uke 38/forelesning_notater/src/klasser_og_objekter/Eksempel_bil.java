package klasser_og_objekter;

class Bil {
    public String farge;
}

public class Eksempel_bil {
    public static void main (String [] args){

        Bil bil1 = new Bil();
        bil1.farge = "Rød";

        Bil bil2 = new Bil();
        bil2.farge = "Grønn";

        Bil bil3 = new Bil();
        bil3.farge = "Blå";

        System.out.println("Fargen til bil 3 er " +bil3.farge);
    }
}

package objekter4;

class Traktor {
    public String farge;
    public void visFarge(){
        System.out.println("Fargen på traktoren er " +farge);
    }
}

public class Objekter4{
    public static void main (String [] args){
        Traktor nyTraktor = new Traktor();
        nyTraktor.farge = "Grønn";
        nyTraktor.visFarge();
    }
}

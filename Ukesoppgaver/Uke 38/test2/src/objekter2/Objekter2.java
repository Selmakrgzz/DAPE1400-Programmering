package objekter2;

class Moped{
    public String farge;
    public void visFarge(){
        System.out.println("Fargen på mopeden er " +farge);
    }
}

public class Objekter2 {
    public static void main (String [] args){
    Moped nyMoped = new Moped();
    nyMoped.farge = "Blå";
    nyMoped.visFarge();
    }
}
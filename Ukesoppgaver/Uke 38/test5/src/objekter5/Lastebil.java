package objekter5;

class Lastebil {
    public String farge;
    public void visFarge(){
        System.out.println("Fargen på lastebilen er " +farge);
    }
}

public class Objekter5{
    public static void main (String [] args){
        Lastebil nyLastebil = new Lastebil();
        nyLastebil.farge = "hvit";
        nyLastebil.visFarge();
    }
}
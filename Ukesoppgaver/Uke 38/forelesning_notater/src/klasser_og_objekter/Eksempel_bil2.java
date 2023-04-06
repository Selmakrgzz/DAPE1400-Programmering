package klasser_og_objekter;

class Bil2 {
    public int tank;
    public double rekkevidde(double forbruk){
        double rekkevidde = tank / forbruk;
        return rekkevidde;
    }
}

public class Eksempel_bil2{
    public static void main(String [] args){
        Bil2 volvo = new Bil2();
        volvo.tank = 80;
        double literPerMil = 0.8;
        double rekkevidde = volvo.rekkevidde(literPerMil);
        System.out.println("Bilen har rekkevidde " +rekkevidde);
    }
}

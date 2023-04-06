package plenum;

//Metode med en parameter

class Bil {
    public int tank;
    public double rekkevidde(double forbruk){
        double rekkevidde = tank / forbruk;
        return rekkevidde;
    }
}

public class Plenum {
    public static void main (String [] args){
        Bil volvo = new Bil();
        volvo.tank = 80;
        double literPerMil = 0.8;
        double rekkevidde = volvo.rekkevidde(literPerMil);
        System.out.println("Rekkevidden til bilden er " +rekkevidde+ " mil.");
    }
}
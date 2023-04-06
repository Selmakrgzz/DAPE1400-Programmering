package plenum2;

class Bil {
    public static double rekkevidde(double tank, double forbruk){
        double rekkevidde = tank / forbruk;
        return rekkevidde;
    }
}

public class plenum {
    public static void main (String [] args){
        double rekkevidde = Bil.rekkevidde(80, 0.8);
        System.out.println("Rekkevidde: " +rekkevidde);
    }
}

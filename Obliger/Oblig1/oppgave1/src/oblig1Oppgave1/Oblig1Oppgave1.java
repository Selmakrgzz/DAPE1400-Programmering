package oblig1Oppgave1;


class Sirkel{

    public static double innDiameter(double radius){
        double diameter = radius * 2;
        return diameter;
    }

    public static double innOmkrets(double radius){
        double omkrets = 2 * Math.PI * radius;
        return omkrets;
    }

    public static double innAreal(double radius){
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }
}

public class Oblig1Oppgave1 {
    public static void main(String [] args){
       double radius = 23.5;
        String diameterMedToDesimaler = String.format("%.2f", Sirkel.innDiameter(radius));
        String omkretsMedToDesimaler = String.format("%.2f", Sirkel.innOmkrets(radius));
        String arealMedToDesimaler = String.format("%.2f", Sirkel.innAreal(radius));

        String ut = "Arealet av sirkelen med radius " +radius+ " er " +arealMedToDesimaler+ " \n" +
                "Omkretsen av sirkelen med radius " +radius+ " er " +omkretsMedToDesimaler+ "\n" +
                "Diameteren til sirkelen er med radius " +radius+ " er " +diameterMedToDesimaler;

        System.out.println(ut);
    }

}
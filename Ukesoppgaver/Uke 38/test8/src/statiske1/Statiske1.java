package statiske1;

import java.text.DecimalFormat;

public class Statiske1 {
    private static double beregnAreal(double radius) {
        double areal = Math.PI * Math.pow(radius, 2);
        return areal;
    }


    public static void main(String[] args) {
        double radius = 23.23;
        double areal = beregnAreal(radius);
        String arealMedToDesimaler = String.format("%.2f", areal);
        //DecimalFormat df2 = new DecimalFormat(".##");
        //System.out.println("Arealet til en sirkel med " +radius+ " er " +df2.format(areal));
        System.out.println("Arealet til en sirkel med " +radius+ " er " +arealMedToDesimaler);

    }
}
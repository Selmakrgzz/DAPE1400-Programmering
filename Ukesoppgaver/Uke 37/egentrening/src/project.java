import java.util.Scanner;

public class project {
    public static void main (String [] args){
        //Lage et program, som vil finne hypotenus av et
        //triangel. Vi vil spørre brukeren om x og y.

        double x;
        double y;
        double z; //hypotenus

        Scanner scanner = new Scanner((System.in));

        System.out.println("Enter side x: ");
        x = scanner.nextDouble();
        System.out.println("Enter side y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x)+(y*y));

        System.out.println("The hypotenus is: "+z);

        scanner.close();


    }
}

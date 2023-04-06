package eksamen_host_2019.aaaoppgave3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lydbok lydbok1 = new Lydbok("Harry", "eilen mei", 233, 120);
        Papirbok papirbok1 = new Papirbok("Madhi", "onekø rdf", 332, 929292992);

        ArrayList<Bok> boker = new ArrayList<>();
        boker.add(lydbok1);
        boker.add(papirbok1);

        for (Bok enBok : boker){
            System.out.println();
            System.out.println(enBok);
        }
    }
}

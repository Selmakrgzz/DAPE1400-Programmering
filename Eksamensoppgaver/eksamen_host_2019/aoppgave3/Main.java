package eksamen_host_2019.aoppgave3;

import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Lydbok lydbok1 = new Lydbok("Heidi og ulven", "Marius Per", 233, 120);
        Papirbok papirbok1 = new Papirbok("Harry Potter", "Mary Jane", 299, 83949828);

        ArrayList<Bok> bokliste = new ArrayList<>();
        bokliste.add(lydbok1);
        bokliste.add(papirbok1);

        for (Bok boker : bokliste){
            System.out.println();
            System.out.println(boker);
        }

    }
}

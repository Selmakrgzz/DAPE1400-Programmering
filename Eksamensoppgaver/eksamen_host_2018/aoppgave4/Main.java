package eksamen_host_2018.aoppgave4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Ansatt> ansatte = new ArrayList<>();
        Dato kariFodt = new Dato(23, 6,2000);
        Dato kariTiltradt = new Dato(12, 4, 2019);
        Ansatt kari = new Ansatt("Kari", kariFodt, kariTiltradt);

        Dato fatimaFodt = new Dato(12, 2,1998);
        Dato fatimaTiltradt = new Dato(2, 8, 2020);
        Ansatt fatima = new Ansatt("Fatima", fatimaFodt, fatimaTiltradt);

        ansatte.add(kari);
        ansatte.add(fatima);

        for (Ansatt enAnsatt : ansatte){
            System.out.println();
            System.out.println(enAnsatt);
        }
    }
}

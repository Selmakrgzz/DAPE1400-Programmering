package eksamen_host_2018.aaoppgave4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        // opprett en ArrayListe og legg to ansatte inn i denne
        // skriv så alt innholdet i arrraylisten ut på system.out.
        ArrayList<Ansatt> ansatte = new ArrayList<>();

        Dato fridaFodt = new Dato(2, 4, 2000);
        Dato fridaTiltradt = new Dato(6, 11, 2020);
        Ansatt frida = new Ansatt("Frida", fridaFodt, fridaTiltradt);

        Dato fatimaFodt = new Dato(5, 2, 2010);
        Dato fatimaTiltradt = new Dato(7, 1, 2020);
        Ansatt fatima = new Ansatt("Fatima", fatimaFodt, fatimaTiltradt);

        ansatte.add(frida);
        ansatte.add(fatima);

        for (Ansatt enAnsatt : ansatte){
            System.out.println();
            System.out.println(enAnsatt);
        }
    }
}

package eksamen_host_2018.oppgave4;

import java.util.ArrayList;

public class AnsattArrayList {
    public static void main(String [] args){
        ArrayList<Ansatt> list = new ArrayList<>();

        String navn1 = "Heidi";
        Dato fodt1 = new Dato(3,6,1998);
        Dato tiltradt1 = new Dato(5, 2, 2017);
        Ansatt ansatt1 = new Ansatt(navn1, fodt1, tiltradt1);

        String navn2 = "Fatima";
        Dato fodt2 = new Dato(3,6,1998);
        Dato tiltradt2 = new Dato(5, 2, 2017);
        Ansatt ansatt2 = new Ansatt(navn2, fodt2, tiltradt2);

        list.add(ansatt1);
        list.add(ansatt2);

        System.out.println("Ansatte: ");
        for (Ansatt enAnsatt : list){
            System.out.println(enAnsatt+ " ");
        }
    }
}

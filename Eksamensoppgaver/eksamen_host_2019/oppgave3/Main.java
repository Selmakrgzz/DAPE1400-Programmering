package eksamen_host_2019.oppgave3;

import java.util.ArrayList;

public class Main {
    public static void main(String [] args){
        ArrayList<Bok> list = new ArrayList<>();

        Papirbok papirbok1 = new Papirbok("Harry Potter", "Mary Jane", 299, 1234456);
        Lydbok lydbok1 = new Lydbok("Heidi og ulven", "Olsen Olsen", 199, 120);

        list.add(papirbok1);
        list.add(lydbok1);

       for(Bok enBok : list){
           System.out.println(enBok);
       }
    }
}

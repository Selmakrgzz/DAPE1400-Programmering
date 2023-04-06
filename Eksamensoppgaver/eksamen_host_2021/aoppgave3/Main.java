package eksamen_host_2021.aoppgave3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SjekkeStorrelse sjekk = new SjekkeStorrelse();
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(7);
        list.add(2);
        list.add(44);

        System.out.println("Størst: " +sjekk.storst(list));
        System.out.println("Minst: " +sjekk.minst(list));
    }
}

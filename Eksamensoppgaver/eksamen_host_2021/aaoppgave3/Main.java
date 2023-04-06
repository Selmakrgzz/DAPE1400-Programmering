package eksamen_host_2021.aaoppgave3;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList <Integer> list = new ArrayList<>();
        list.add(3);
        list.add(5);
        list.add(8);
        list.add(1);

        System.out.println("Størst: " +FinnStorrelse.storst(list));
        System.out.println("Minst: " +FinnStorrelse.minst(list));
    }
}

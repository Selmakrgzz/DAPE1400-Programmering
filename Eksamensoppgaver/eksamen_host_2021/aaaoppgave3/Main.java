package eksamen_host_2021.aaaoppgave3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SjekkTall test = new SjekkTall();
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(6);
        list.add(-3);
        list.add(33);
        list.add(42);

        System.out.println(test.storst(list));
        System.out.println(test.minst(list));
    }
}

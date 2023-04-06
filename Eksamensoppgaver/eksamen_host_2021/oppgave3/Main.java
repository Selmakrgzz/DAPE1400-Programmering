package eksamen_host_2021.oppgave3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(3);
        list.add(1);
        list.add(7);
        list.add(8);

        System.out.println("Størst: " +Oppg3.storst(list));
        System.out.println("Minst: " +Oppg3.minst(list));
    }
}

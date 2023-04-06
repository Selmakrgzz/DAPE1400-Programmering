package eksamen_host_2021.oppgave3;

import java.util.ArrayList;

class Oppg3 {

    public static int storst(ArrayList<Integer> list){
        int storst = 0;
        for (int i : list){
            if (storst <= i){
                storst = i;
            }
        }
        return storst;
    }

    public static int minst(ArrayList<Integer> list){
        int minst = 0;
        int storst = 0;

        for (int i : list){
            if (storst <= i){
                storst = i;
            }
            if (storst > i){
                minst = i;
            }
        }
        return minst;
    }
}

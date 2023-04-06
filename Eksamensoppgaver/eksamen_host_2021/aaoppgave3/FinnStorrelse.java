package eksamen_host_2021.aaoppgave3;

import java.util.ArrayList;

class FinnStorrelse {
    public static int storst(ArrayList <Integer> list){
        int storst = 0;
        for (int i : list){
            if (storst < i){
                storst = i;
            }
        }
        return storst;
    }

    public static int minst(ArrayList <Integer> list){
        int storst = 0;
        int minst = 0;

        for (int i : list){
            if (storst < i){
                storst = i;
            }

            if (storst > i){
                minst = i;
            }
        }
        return minst;
    }
}

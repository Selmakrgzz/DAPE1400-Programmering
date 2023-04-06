package eksamen_host_2021.aoppgave3;

import java.util.ArrayList;

class SjekkeStorrelse {
    public int storst(ArrayList <Integer> list){
        int storst = 0;
        for (int i : list){
            if (storst < i){
                storst = i;
            }
        }
        return storst;
    }

    public int minst(ArrayList <Integer> list){
        int minst = 0;
        int storst  = 0;

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

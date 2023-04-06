package eksamen_host_2021.aaaoppgave3;

import java.util.ArrayList;

class SjekkTall {
    public int storst(ArrayList<Integer> list){
        int storst = 0;
        for (int i : list){
            if (storst < i){
                storst = i;
            }
        }
        return storst;
    }

    public int minst(ArrayList<Integer> list){
        int storst = 0;
        int minst = 0;
        for (int i : list){
            if (storst > i){
                minst = i;
            }
        }
        return minst;
    }
}

package eksamen_host_2019.aoppgave2;

import java.util.Arrays;
import java.util.Random;

class Trekning {

    public int[] vinnere(){
        Random random = new Random();
        int [] list = new int[7];
        int i = 0;

        while (i < 7){
            int vinnertall = random.nextInt(34);
            list[i] = vinnertall;
            i++;
        }

        Arrays.sort(list);
        return list;
    }
}

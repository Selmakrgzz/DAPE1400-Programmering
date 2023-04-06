package eksamen_host_2019.aaoppgave2;

import java.util.Arrays;
import java.util.Random;

class Trekning {
    public int[] vinnere(){
        int [] list = new int[7];
        Random random = new Random();
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

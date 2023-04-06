package eksamen_host_2019.oppgave2;

import java.lang.reflect.Array;
import java.util.Arrays;

class Trekning {
    public int[] vinnere(){
        int [] list = new int[7];
        int i = 0;

        while (i < 7 ){
            int vinnertall = (int )(Math.random() * 34 + 1);
            list[i] = vinnertall;
            i++;
        }

        Arrays.sort(list);
        return list;
    }
}

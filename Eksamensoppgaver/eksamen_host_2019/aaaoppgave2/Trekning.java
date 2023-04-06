package eksamen_host_2019.aaaoppgave2;

import java.util.Arrays;

class Trekning {
    public int [] vinnere(){
        int [] vinnere = new int[7];
        int i = 1;
        while (i < 7){
            int random = (int) (Math.random()* 34 +1);
            vinnere[i] = random;
            i++;
        }

        Arrays.sort(vinnere);
        return vinnere;
    }
}

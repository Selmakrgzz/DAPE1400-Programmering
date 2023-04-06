package eksamen_host_2019.aaaaoppgave2;

import java.util.Arrays;

class Trekning {
    public int [] vinnere(){
        int [] list = new int[7];

        for (int i = 0; i < list.length; i++){
            int vinnerTall = (int )(Math.random() * 34 + 1);
            list[i] = vinnerTall;
        }
        Arrays.sort(list);

        return list;
    }
}

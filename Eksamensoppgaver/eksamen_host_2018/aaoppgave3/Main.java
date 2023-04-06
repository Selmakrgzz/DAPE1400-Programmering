package eksamen_host_2018.aaoppgave3;

public class Main {
    public static void main(String[] args) {
        int [] list = {3,3,4,6,12,8,6,5,4,-3,-6,-7,-1};
        int tall = 6;
        System.out.println(Liste.storreEnnNull(list));
        System.out.println(Liste.forekomst(list, tall));
        System.out.println(Liste.storst(list));
    }
}

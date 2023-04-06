package eksamen_host_2018.aaaoppgave3;

public class Main {
    public static void main(String[] args) {
        int [] list = {2,4,6,5,3,2,6,7,-5,-2,-7,-9};
        int tall = 2;

        System.out.println(Liste.storreEnNull(list));
        System.out.println(Liste.forekomst(list, tall));
        System.out.println(Liste.storste(list));
    }
}

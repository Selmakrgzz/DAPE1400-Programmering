package eksamen_host_2018.oppgave3;

public class Main {
    public static void main(String[] args) {
        int [] list = {2,4,2,2,6,34,7,3,6,8,-2,-6,-4,-8,-9,-19};
        int tall = 6;
        System.out.println("Det er "+List.storreEnNull(list)+ " elementer som er større en null");
        System.out.println("Tallet " +tall+ " forekommer " +List.forekomst(list,tall)+ " ganger");
        System.out.println("Største tallet i listen er : " +List.storst(list));
    }
}

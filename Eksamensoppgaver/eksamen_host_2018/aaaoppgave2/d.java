package eksamen_host_2018.aaaoppgave2;

public class d {
    public static void main(String[] args) {
        int [] list = {-3,41,5,-3,2,49};
        int sum = 0;
        double gjennomsnitt = 0;
        for (int i : list){
            sum+=i;
        }
        gjennomsnitt = sum/ list.length;
        System.out.println(gjennomsnitt);
    }
}

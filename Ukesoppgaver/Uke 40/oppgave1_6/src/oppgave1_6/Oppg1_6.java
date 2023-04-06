package oppgave1_6;

    //Lag et program som viser følgene ut (med tab):
    //N       N^2        N^3          N^4
    //1       1           1            1
    //2       4           8            16
    //3       9           27           81
    //..... frem til N=10.
    //Bruk gjerne metoden i Java : MATH.pow(grunntall, eksponent).

public class Oppg1_6 {
    public static void main (String [] args){

        for (int N = 1; N <= 10; N++){

            int andre = (int) Math.pow(N, 2);

            int tredje = (int) Math.pow(N, 3);

            int fjerde = (int) Math.pow(N, 4);

            String ut = "N: " +N+ "\n";
            ut += "N^2: " +andre+ "\n";
            ut += "N^3: " +tredje+ "\n";
            ut += "N^4: " +fjerde+ "\n";

            System.out.println(ut);


        }

    }
}

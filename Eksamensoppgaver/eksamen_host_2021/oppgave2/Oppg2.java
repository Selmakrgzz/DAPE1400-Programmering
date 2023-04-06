package eksamen_host_2021.oppgave2;

class Oppg2 {
    public static boolean funnetTall(int [] liste, int tall){

        for (int i : liste){
            if (i == tall){
                return true;
            }
        }
        return false;
    }
}

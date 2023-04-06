package eksamen_host_2021.aoppgave2;

class FinneTall {
    public static boolean funnetTall(int [] list, int tall){
       for (int i : list){
           if (tall == i){
               return true;
           }
       }
        return false;
    }
}

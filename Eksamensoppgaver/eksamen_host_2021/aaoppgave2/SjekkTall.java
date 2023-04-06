package eksamen_host_2021.aaoppgave2;

class SjekkTall {
   public static boolean funetTall(int [] list, int tall){
       for (int i : list){
           if (i == tall){
               return true;
           }
       }
       return false;
   }
}

package eksamen_var_2019_konte.aoppgave3;

class Temperatur {
    public static double gjennomsnitt(double [] tempList){
        double sum = 0;
        for (int i = 0; i < tempList.length; i++){
            sum += i;
        }
        return sum / tempList.length;
    }

    public static double minimum(double [] tempList){
        double minst = 0;
        for (double i : tempList){
            if (minst > i){
                minst = i;
            }
        }
        return minst;
    }
}

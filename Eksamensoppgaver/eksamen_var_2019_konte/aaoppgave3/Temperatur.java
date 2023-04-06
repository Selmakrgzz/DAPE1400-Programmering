package eksamen_var_2019_konte.aaoppgave3;

class Temperatur {
    public double gjennomsitt(double [] list){
        double sum = 0;
        for (double i : list){
            sum += i;
        }
        return sum / list.length;
    }

    public double minumum(double [] list){
        double minst = 0;
        double storst = 0;
        for (double i : list){
            if (storst < i){
                storst = i;
            }
            if (storst > i){
                minst = i;
            }
        }
        return minst;
    }
}

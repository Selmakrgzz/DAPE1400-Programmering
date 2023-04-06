package eksamen_var_2019_konte.oppgave3;

class Temperatur {
    public static String gjennomsnitt(double [] innArray){
        double sum = 0;
        int teller = 0;
        for (int i = 0; i < innArray.length; i++){
            sum += innArray[i];
            teller++;
        }
        return "Gjenomsnitt: " +(sum/teller);
    }

    public static String minumum(double [] innArray){
        double min = innArray[0];
        for (int i = 0; i < innArray.length; i++){
            if (innArray[i] < min){
                min = innArray[i];
            }
        } return "Minste verdi: " +min;
    }

}

package eksamen_var_2022_konte.oppgave2;

import java.util.ArrayList;

class ValutaKalkulator {
    private ArrayList<Valuta> valutaKurser = new ArrayList<>();

    public ValutaKalkulator(){
        Valuta NOK = new Valuta("NOK", 11.23);
        Valuta USD = new Valuta("USD", 19.32);
        valutaKurser.add(NOK);
        valutaKurser.add(USD);
    }

    public double beregnKurs(String valuta){
        for (Valuta kurs : valutaKurser){
            if (kurs.getValuta().equals(valuta)){
                return kurs.getKurs();
            }
        }
        return 0;
    }
}

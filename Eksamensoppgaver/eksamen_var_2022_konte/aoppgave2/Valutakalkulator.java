package eksamen_var_2022_konte.aoppgave2;

import java.util.ArrayList;

class Valutakalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();

    public void ValutaKalkulator(){
        Valuta nok = new Valuta("NOK", 11.3);
        Valuta sek = new Valuta("SEK", 12.5);
        valutakurser.add(nok);
        valutakurser.add(sek);
    }
    public double beregnKurs(String valuta) {
        for (Valuta kurs : valutakurser){
            if (kurs.getValuta().equals(valuta)){
                return kurs.getKurs();
            }
        }
        return 0;
    }
}

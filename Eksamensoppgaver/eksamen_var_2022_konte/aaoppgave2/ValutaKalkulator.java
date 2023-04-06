package eksamen_var_2022_konte.aaoppgave2;

import java.util.ArrayList;

class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();
    public ValutaKalkulator(){
        // kode her
        Valuta usd = new Valuta("USD", 11.5);
        Valuta dkk = new Valuta("DKK", 75);
        valutakurser.add(usd);
        valutakurser.add(dkk);
    }
    public double beregnKurs(String valuta) {
        // kode her
        for (Valuta enValuta : valutakurser){
            if (enValuta.getValuta().equals(valuta)){
                return enValuta.getKurs();
            }
        }
        return 0;
    }
}

package eksamen_var_2022_konte.aaaoppgave2;

import java.util.ArrayList;

class ValutaKalkulator {
    private ArrayList<Valuta> valutakurser = new ArrayList<>();
    public ValutaKalkulator(){
        // kode her
        Valuta nok = new Valuta("NOK", 11.2);
        Valuta sek = new Valuta("SEK", 29.4);
        valutakurser.add(nok);
        valutakurser.add(sek);
    }
    public double beregnKurs(String valuta) {
        // kode her
        String ut = "";
        for (Valuta kurs : valutakurser){
            if (kurs.getValuta().equals(valuta)){
                return kurs.getKurs();
            }
        }
        return 0;
    }
}

package eksamen_host_2019.aaoppgave3;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Bok> bokListe = new ArrayList<>();

        String tittel1 = "Harry potter";
        String forfatter1 = "Mary jane";
        double pris1 = 233;
        int iSBN = 3888383;
        Papirbok papirbok1 = new Papirbok(tittel1, forfatter1, pris1,iSBN);

        String tittel2 = "heidi potter";
        String forfatter2 = "Hans jane";
        double pris2 = 100;
        int lengdemin = 120;
        Lydbok lydbok1 = new Lydbok(tittel2, forfatter2, pris2,lengdemin);

        bokListe.add(papirbok1);
        bokListe.add(lydbok1);

        for (Bok eBok : bokListe){
            System.out.println();
            System.out.println(eBok.toString());
        }
    }
}

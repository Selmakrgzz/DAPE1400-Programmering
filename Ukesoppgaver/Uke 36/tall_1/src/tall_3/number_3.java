package tall_3;

import static javax.swing.JOptionPane.*;

public class number_3 {
    public static void main (String [] args){

       /* int alderPer = 23;
        int alderLine, sumAlder;
        alderLine = 22;
        sumAlder = alderPer + alderLine;
        System.out.println("Summen av alderene er "+sumAlder);*/

        /*String innNavn = showInputDialog("Skriv inn navnet: ");
        String innAlder = showInputDialog("Skriv inn alderen");
        int alder = Integer.parseInt(innAlder);
        int fødselsår = 2022 - alder;
        showMessageDialog(null,innNavn+ " er født " +fødselsår);*/

        /*String innStreng1 = showInputDialog("Skriv inn et desimaltall");
        String innStreng2 = showInputDialog("Skriv inn et desimaltall til");
        double innTall1 = Double.parseDouble(innStreng1);
        double innTall2 = Double.parseDouble(innStreng2);
        double divisjon = innTall1/innTall2;
        showMessageDialog(null, innTall1+ " delt på " +innTall2+ " blir " +divisjon);*/

        /*String innStreng3 = showInputDialog("Skriv inn et heltall ");
        String innStreng4 = showInputDialog("Skriv inn et heltall til ");
        int inntall3 = Integer.parseInt(innStreng3);
        int innTall4 = Integer.parseInt(innStreng4);
        float divisjon1 = inntall3/innTall4;
        showMessageDialog(null, inntall3+ " delt på " +innTall4+ " blir " +divisjon1);*/

        double tall;
        String innStreng = showInputDialog("Skriv inn et desimaltall");
        try{
            tall = Double.parseDouble(innStreng);
        }

        catch (Exception e) {
            tall = 0;
        }

        showMessageDialog(null, "Resultat: " +tall);


    }


}

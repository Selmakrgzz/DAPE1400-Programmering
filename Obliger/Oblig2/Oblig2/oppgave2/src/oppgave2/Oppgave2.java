package oppgave2;

import javax.swing.*;
import java.lang.Math;

class Tallspill {

    public int nyttTall() {
        return (int) (Math.random() * 201);
    }

    public void visMelding(String melding) {
        JOptionPane.showMessageDialog(null, melding);
    }

    private void forLite(int tall) {
        JOptionPane.showMessageDialog(null, +tall + " er for lite. Prøv igjen");
    }

    private void forStort(int tall) {
        JOptionPane.showMessageDialog(null, +tall + " er for mye. Prøv igjen");
    }

    public void avsluttRunde(int antall, int gjetning) {
        JOptionPane.showMessageDialog(null, gjetning + " er riktig. Du gjettet riktig på " + antall + " forsøk.");
    }

    public void kjorSpill() {
        int antall = 0;
        int gjetning =  nyttTall();
        int tall = -1;

        String innGjetning = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et mellom 0 og 200. \n Prøv å gjette tallet!")));

        try {
            tall = Integer.parseInt(innGjetning);
        }

        catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Du må taste inn et tall, som er mellom 0 og 200!");
        }

        while (tall != gjetning){
             antall++;

             if (tall < gjetning){
                 forLite(tall);
                 innGjetning = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et mellom 0 og 200. \n Prøv å gjette tallet!")));

                 try {
                     tall = Integer.parseInt(innGjetning);
                 }

                 catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "Du må taste inn et tall, som er mellom 0 og 200!");
                 }
             } else if (tall > gjetning){
                 forStort(tall);
                 innGjetning = String.valueOf(Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et mellom 0 og 200. \n Prøv å gjette tallet!")));

                 try {
                     tall = Integer.parseInt(innGjetning);
                 }

                 catch (Exception e) {
                     JOptionPane.showMessageDialog(null, "Du må taste inn et tall, som er mellom 0 og 200!");
                 }

             }

        }

        avsluttRunde(antall, tall);
    }
}

    public class Oppgave2{
        public static void main (String [] args){
            Tallspill nySpill = new Tallspill();
            nySpill.kjorSpill();
        }
    }





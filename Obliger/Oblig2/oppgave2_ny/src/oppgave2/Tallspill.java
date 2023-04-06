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

            int antall = 1;

            for (int i = 0; i < antall; i++){

                int tall = Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et mellom 0 og 200. \n Prøv å gjette tallet!"));
                int gjetning = tall;

                if ( nyttTall()== tall){
                    avsluttRunde(antall, gjetning);

                } else if (nyttTall() < tall) {
                    forLite(tall);

                } else if (nyttTall() > tall) {
                    forStort(tall);
                }

            }
        }
    }

    public class Oppg2 {
        public void main(String[] args) {
            Tallspill.kjorspill();

        }

    }






            /*int tall = Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et mellom 0 og 200. \n Prøv å gjette tallet!"));

            if (tall < nyttTall()) {
                System.out.println(forLite());
            }

            if (tall > nyttTall()) {
                System.out.println(forStort());
            }*/































    /*
     if (tall < nyttTall()){
            JOptionPane.showMessageDialog(null, +tall+ " er for lite. Prøv igjen");
            System.exit(1);
        }

        if (tall > nyttTall()){
            JOptionPane.showMessageDialog(null, +tall+ " er for mye. Prøv igjen");
        }

         int tall = Integer.parseInt(JOptionPane.showInputDialog("Jeg tenker på et mellom 0 og 200. \n Prøv å gjette tallet!"));
    */







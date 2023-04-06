package oblig1Oppgave2;

import javax.swing.*;

class Vare{
    private String navn;
    private int antall;
    private double pris;

    public Vare(String navn, int antall, double pris){
        this.navn = navn;
        this.antall = antall;
        this.pris = pris;
    }

    public String getNavn(String navn1) {
        return navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public int getAntall(int antall1){
        return antall;
    }

   public void setAntall(int antall) {
       if (antall > 0) {
           this.antall = antall;
       }

   }
        public double getPris(double pris1){
        return pris;
    }

    public void setPris(double pris){
        if (pris > 0){
            this.pris = pris;
        }
    }
    public double totalpris(){
        double nyTotalpris = pris * antall;
        return nyTotalpris;
    }
}

public class Oblig1Oppgave2 {
    public static void main(String [] args){
        String navn1 = JOptionPane.showInputDialog("Skriv inn navn på første vare");
        int antall1 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall av varen"));
        double pris1 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris på varen"));

        String navn2 = JOptionPane.showInputDialog("Skriv inn navn på andre vare");
        int antall2 = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall av varen"));
        double pris2 = Double.parseDouble(JOptionPane.showInputDialog("Skriv inn pris på varen"));

        try{

            if (antall1 <= 0 || pris1 <= 0 || antall2 <= 0 || pris2 <= 0){
                System.out.println("error");

                System.exit(1);

            }

        }
        catch(Exception e){

            System.out.println("Antall og pris kan ikke være lik 0 eller mindre!");

        }

        Vare nyVare1 = new Vare(navn1, antall1, pris1);
        nyVare1.getNavn(navn1);
        nyVare1.getAntall(antall1);
        nyVare1.getPris(pris1);

        Vare nyVare2 = new Vare(navn2, antall2, pris2);
        nyVare2.getNavn(navn2);
        nyVare2.getAntall(antall2);
        nyVare2.getPris(pris2);

        double totalprisAlle = nyVare1.totalpris() + nyVare2.totalpris();
        String totalprisMedEnDesimal = String.format("%.1f", totalprisAlle);

        System.out.println("Totalprisen ble: " +totalprisMedEnDesimal+ " kr.");

    }
}
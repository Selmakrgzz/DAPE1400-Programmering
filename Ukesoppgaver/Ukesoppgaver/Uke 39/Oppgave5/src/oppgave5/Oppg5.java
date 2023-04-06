package oppgave5;

import javax.swing.*;

class Konto{
    private String navn;
    private int kontonummer;
    private long saldo;

    public Konto(String navn, int kontonummer, long saldo){
        this.navn = navn;
        this.kontonummer = kontonummer;
        this.saldo = saldo;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public int getKontonummer() {
        return kontonummer;
    }

    public void setKontonummer(int kontonummer){
        this.kontonummer = kontonummer;
    }

    public long getSaldo(){
        return saldo;
    }

    public void setSaldo(long saldo){
        this.saldo = saldo;
    }


    public String innBelop(long nyBelop){
        long nySaldo = this.saldo + nyBelop;
        return "Din nye saldo er: " +nySaldo;

    }

    public String utBelop(long nyBelop){
        long nySaldo = this.saldo - nyBelop;

        if (nyBelop > this.saldo){
            return "Kontoen din har ikke nok dekning";
        }
        return "Din nye saldo er: " +nySaldo;
    }

    public void kontoutskrift(){
        String ut = "Navn: " +getNavn()+ "\n";
        ut += "Kontonummer: " +getKontonummer()+ "\n";
        ut += "Saldo: " +getSaldo()+ "\n";

        System.out.println(ut);
    }
}

public class Oppg5 {
    public static void main(String [] args){


        String navn = JOptionPane.showInputDialog("Skriv inn navn");
        int kontonummer = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn kontonummer"));
        long saldo = Long.parseLong(JOptionPane.showInputDialog("Skriv inn saldo"));
        String valg = JOptionPane.showInputDialog("Vil du sette inn eller ta ut penger?");

        Konto nyKonto = new Konto("Selma", 8389283, 29399);
        nyKonto.setNavn(navn);
        nyKonto.setKontonummer(kontonummer);
        nyKonto.setSaldo(saldo);

        if (valg.equals("s")){
            long nyBelop = Long.parseLong(JOptionPane.showInputDialog("Skriv inn ønsket beløp"));

            JOptionPane.showMessageDialog(null, nyKonto.innBelop(nyBelop));
        }

        if (valg.equals("u")){
            long nyBelop = Long.parseLong(JOptionPane.showInputDialog("Skriv inn ønsket beløp"));

            JOptionPane.showMessageDialog(null, nyKonto.utBelop(nyBelop));

        }

        nyKonto.kontoutskrift();


    }
}
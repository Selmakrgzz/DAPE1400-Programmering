package oppgave6;

//Det skal lages en klasse kalt Vind. Denne klassen skal beregne ut i fra en oppgitt vindhastighet i
//km/t om det er stille (mindre enn 2 km/t) og om det er orkan (mer enn 120 km/t).
//Videre skal klassen kunne beregne hvor mye vindhastigheten tilsvarer på Beaufort-skala (1-12).
//Formelen for Beaufort er : (((vindhastighet i km/t) / 3.01)^0.6666)+0.5. ^ betyr opphøyd i.
//Bruk gjerne Math.pow funksjonen for å foreta beregningen.
//Til slutt skal det være mulig å regne ut antall knop i en metode. En knop er lik 1852 meter.

import javax.swing.*;
import java.lang.Math;

class Vind{
    public double vindHastighet = 0.0;

    public Vind(double vindHastighet){
        this.vindHastighet = vindHastighet;
    }

    public double getVindHastighet() {
        return vindHastighet;
    }

    public void setVindHastighet(double vindHastighet){
        this.vindHastighet = vindHastighet;
    }

    public boolean erOrkan(double vindHastighet){
        if (this.vindHastighet > 120){
            System.out.println("Det er orkan");
        } else if (this.vindHastighet > 2 && this.vindHastighet < 120) {
            System.out.println("Det er ikke orkan");
        }

        return false;
    }

    public boolean erVindstille(double vindHastighet){
        if (this.vindHastighet < 2){
            System.out.println("Det er vindstille");
        } else if (this.vindHastighet > 2 && this.vindHastighet < 120) {
            System.out.println("Det er ikke vindstille");
        }
        return false;
    }

    public int getBeaufort(){
        double beaufort =  Math.round(Math.pow(0.6666, (this.vindHastighet / 3.01)) + 0.5);
        boolean nyBeaufort = beaufort >= 1 && beaufort <= 12;

        return (int) beaufort;
    }

    public double getKnop(){
        double knop = (double) (this.vindHastighet * 1852);
        return knop;
    }

    public void skrivUtVinden(){
        String ut = "Her er info om vinden \n";
        ut += "Vindhastigheten er: " +this.vindHastighet+ " km/t \n";
        ut += "Beaufort skala: " +getBeaufort()+ "\n";
        ut += "Knop: " +getKnop()+ "\n";

        JOptionPane.showMessageDialog(null, ut);
    }

}

public class Oppg6 {
    public static void main(String [] args){

        int vindHastighet = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn vindhastigheten"));
        Vind nyVind = new Vind(50);
        nyVind.setVindHastighet(vindHastighet);

        if (nyVind.erOrkan(nyVind.getVindHastighet())){
            JOptionPane.showMessageDialog(null, nyVind.erOrkan(vindHastighet));
        }

        if (nyVind.erVindstille(nyVind.getVindHastighet())){
            JOptionPane.showMessageDialog(null, nyVind.erVindstille(vindHastighet));
        }

        nyVind.skrivUtVinden();



    }
}
package oppgave7;

import javax.swing.*;

public class Oppg7 {
    public static void main (String [] args){
        //Les inn verdier for antall pizza, antall personer
        //og antallSlicesPerPizza. Regn så ut hvor mange
        //pizza-slices hver person får dersom man deler likt
        //gitt at en pizza har f.eks 6 slices hver.
        //Hvor mange slices er det til overs dersom man deler likt?
        //Bruk modulus operatoren. Skriv ut resultatet på
        //følgende form: ”Dersom man er 4 personer og
        //har 3 pizzaer får hver person 4 slices og 2 blir til overs”.

        int antallPizza = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall pizza"));
        int antallPersoner = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall personer"));
        int antallSlicesPerPizza = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn antall slices per pizza"));
        int antallPizzaSlicesPerPerson = (antallPizza * antallSlicesPerPizza) / antallPersoner;

        int antallSlicesIRest = (antallPizza * antallSlicesPerPizza) % antallPersoner;

        JOptionPane.showMessageDialog(null, "Dersom man er " +antallPersoner+ " personer og har " +antallPizza+
                " pizzaer, får hver person " +antallPizzaSlicesPerPerson+ " slices og det blir "
                +antallSlicesIRest+ " til overs.");


    }
}

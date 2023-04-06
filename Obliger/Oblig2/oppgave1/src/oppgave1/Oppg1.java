package oppgave1;

import javax.swing.*;

public class Oppg1 {
    public static void main(String [] args){

        int nedreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall for nedre grense"));
        int ovreGrense = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn et tall for øvre grense"));
        int sum = 0;

        if (ovreGrense <= nedreGrense){

            System.out.println("Øvre grense kan ikke være mindre eller lik nedre grense!");
            return;
        }

        for (int i = nedreGrense; i < ovreGrense; i++){
            sum += i;

            if( i % 10 == 0){
                System.out.println("\n");
            }

            System.out.print(i+"+");
        }

        System.out.print(ovreGrense+"="+sum);

    }
}

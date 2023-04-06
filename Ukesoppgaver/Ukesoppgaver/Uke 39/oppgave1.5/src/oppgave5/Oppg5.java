package oppgave5;

//Lag et program som leser inn et månedsnavn. Så skal programmet skrive ut hvilken årstid det er. Reglene er:
//Sommer : juni, juli, august
//Høst : september, oktober, november
//Vinter: desember, januar, februar,
//Vår : mars, april, mai,
//a) Lag først et program som løser det med if /else
//b) Lag deretter et program som løser det med bruk av switch.

import javax.swing.*;

public class Oppg5 {
    public static void main(String [] args){

        String maanedsnavn = JOptionPane.showInputDialog("Skriv inn måned");
/*
        if (maanedsnavn.equals("juni")){
            JOptionPane.showMessageDialog(null, "Det er sommer");
        }
        if (maanedsnavn.equals("juli")){
            JOptionPane.showMessageDialog(null, "Det er sommer");
        }
        if (maanedsnavn.equals("august")){
            JOptionPane.showMessageDialog(null, "Det er sommer");
        }
        if (maanedsnavn.equals("september")){
            JOptionPane.showMessageDialog(null, "Det er høst");
        }
        if (maanedsnavn.equals("oktober")){
            JOptionPane.showMessageDialog(null, "Det er høst");
        }
        if (maanedsnavn.equals("november")){
            JOptionPane.showMessageDialog(null, "Det er høst");
        }
        if (maanedsnavn.equals("desember")){
            JOptionPane.showMessageDialog(null, "Det er vinter");
        }
        if (maanedsnavn.equals("januar")){
            JOptionPane.showMessageDialog(null, "Det er vinter");
        }
        if (maanedsnavn.equals("februar")){
            JOptionPane.showMessageDialog(null, "Det er vinter");
        }
        if (maanedsnavn.equals("mars")){
            JOptionPane.showMessageDialog(null, "Det er vår");
        }
        if (maanedsnavn.equals("april")){
            JOptionPane.showMessageDialog(null, "Det er vår");
        }
        if (maanedsnavn.equals("mai")){
            JOptionPane.showMessageDialog(null, "Det er vår");
        }
*/

        switch (maanedsnavn){
            case "juni", "juli", "august":
                JOptionPane.showMessageDialog(null, "Det er sommer");
                break;
            case "september", "oktober", "november":
                JOptionPane.showMessageDialog(null, "Det er høst");
                break;
            case "desember", "januar", "februar":
                JOptionPane.showMessageDialog(null, "Det er vinter");
                break;
            case "mars", "april", "mai":
                JOptionPane.showMessageDialog(null, "Det er vår");
                break;

        }


    }
}

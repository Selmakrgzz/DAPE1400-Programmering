package strenger;

public class strenger {
    public static void main (String [] args){
        String name = "Selma Karagøz";
        String idnumber ="jk484848";
        String adress = "Holbergs plass 12";
        String email = "selma23@gmail.com";
        String out = name +" "+ idnumber +" "+ adress +" "+ email;
        //Skriver inn name, idnumber, adress og email med +" "+ imellom for å få verdiene skrevet
        // ut separert fra hverandre. I tillegg, så tar vi også String til out for å definere
        //de verdiene vi ønsker å få skrevet ut. Dette er mer effektivt enn å gjøre det hver for seg.
        System.out.print(out);
        //Her koder vi for å skrive ut informasjonen vi har definert oppe.


    }
}


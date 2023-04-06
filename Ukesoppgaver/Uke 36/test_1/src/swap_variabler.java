public class swap_variabler {
    public static void main(String [] args){
        String x = "water";
        String y = "Kool-Aid";
        String temp;

        temp = x; //"overfører" innholdet i variabelen x til temp(temporary)
        x=y; //"overfører" innholdet i variabelen y til x
        y=temp; //"overfører" innholdet i temp(altså x) til y
        //Altså vi har nå klart å bytte innholdet i x og y ved å bruke den midlertidige variabelen "temp"

        System.out.println("x: " +x);
        System.out.println("y: " +y);

    }
}

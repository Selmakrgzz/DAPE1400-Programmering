package eksamen_var_2019_konte.oppgave2;

public class Main {
    public static void main(String [] args){
        String navn = "Frida";
        String adresse = "Akervei 23, 0384 Oslo";
        double lonn = 100000;
        Skatt nySkatt = new Skatt(navn, adresse, lonn);
        nySkatt.beregn();
        System.out.println(nySkatt);


    }
}

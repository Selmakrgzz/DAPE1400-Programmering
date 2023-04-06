package oppgave3;

    //Lag en klasse kalt Person. Denne skal inneholde følgende attributter:
    //- navn
    //- adresse
    //- telefonnr
    //- fødselsår
    //Lag en metode for å regne ut alderen til en person.
    //Metoden skal ikke ta inn noen parametere, den skal regne ut alderen ut i fra fødselsår.
    //Metoden skal returnere alderen. Lag så en metode som, tar inn alderen,
    //og som skriver ut alle vitale data for personen på følgende måte:
    //"Per Hansen med adresse Osloveien 82 med telefonnummer 22124512 er 21 år."
    //Opprett et eller flere person objekter i main-metoden for å teste ut.

    import static javax.swing.JOptionPane.showInputDialog;
    import static javax.swing.JOptionPane.showMessageDialog;

    import java.util.Calendar;

    class Person {
            public String navn;
            public String adresse;
            public int telefonnr;
            public int fodselsar;

            public int alder;

            // Regner ut alder
            public int regnUtAlder(int dagensAr){
                int alder = dagensAr - fodselsar;
                return alder;
            }

            // Skriver ut data

            public void skrivUtPerson(){
                String ut = navn+ " med adresse " +adresse+ " med telefonnummer " +telefonnr+ " er " +alder+ " år.";
                showMessageDialog(null, ut);
            }

        }

    public class Oppg3 {
        public static void main(String [] args){
            // Setter inn data
            String navn = showInputDialog("Skriv inn navnet ditt");
            String adresse = showInputDialog("Skriv inn adressen din");
            int telefonnr = Integer.parseInt(showInputDialog("Skriv inn ditt telefonnummer"));
            int fodselsar = Integer.parseInt(showInputDialog("Skriv inn ditt fødelsår"));
            //int currentYear = Date().getYear();
            int year = Calendar.getInstance().get(Calendar.YEAR);
            int alder= 20;

            // Setter inn data for å regne ut alder

            //int dagensAr = Integer.parseInt(showInputDialog("Skriv inn dagens årstall"));

            // Oppretter ny person
            Person nyPerson = new Person();
            nyPerson.navn = navn;
            nyPerson.adresse = adresse;
            nyPerson.telefonnr = telefonnr;
            nyPerson.fodselsar = fodselsar;
            nyPerson.alder = alder;
            int nyAlder = nyPerson.regnUtAlder(2022); // objektet (nyPerson) kaller på en metode (regnUtAlder) og får verdi returnert

            nyPerson.skrivUtPerson();

        }
}
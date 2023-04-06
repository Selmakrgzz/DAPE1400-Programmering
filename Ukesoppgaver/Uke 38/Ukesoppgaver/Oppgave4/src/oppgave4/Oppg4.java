package oppgave4;

    //Utvid oppgave 3 med å lese inn dataene fra input-bokser og
    //vise resultatet i en meldingsboks på følgende format:
    //Navn: Per Hansen
    //Adresse : Osloveien 82
    //Telefonnr : 22124512
    //Alder : 21 år.
    //Tips: bruk \n for å få ny linje

    import static javax.swing.JOptionPane.showInputDialog;
    import static javax.swing.JOptionPane.showMessageDialog;

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
            String ut = "Navn: " +navn+ "\n";
            ut += "Adresse: " +adresse+ "\n";
            ut += "Telefonnummer: " +telefonnr+ "\n";
            ut += "Alder: " +alder+ "\n";
            showMessageDialog(null, ut);
        }

    }

    public class Oppg4 {
        public static void main(String [] args){
            // Setter inn data
            String navn = showInputDialog("Skriv inn navnet ditt");
            String adresse = showInputDialog("Skriv inn adressen din");
            int telefonnr = Integer.parseInt(showInputDialog("Skriv inn ditt telefonnummer"));
            int fodselsar = Integer.parseInt(showInputDialog("Skriv inn ditt fødelsår"));

            // Setter inn data for å regne ut alder
            int dagensAr = Integer.parseInt(showInputDialog("Skriv inn dagens årstall"));

            // Oppretter ny person
            Person nyPerson = new Person();

            nyPerson.navn = navn;
            nyPerson.adresse = adresse;
            nyPerson.telefonnr = telefonnr;
            nyPerson.fodselsar = fodselsar;
            int alder = nyPerson.regnUtAlder(dagensAr); // objektet (nyPerson) kaller på en metode (regnUtAlder) og får verdi returnert
            //linjen over må komme før alder, for at det skal fungere
            nyPerson.alder = alder;


            nyPerson.skrivUtPerson();

        }
    }
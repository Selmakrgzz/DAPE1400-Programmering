package oppgave5;
    //Lag en klasse kalt Kalkulator. Denne klassen skal ha 4 statiske metoder
    //som tar inn 2 parametere hver. Disse statiske metodene skal henholdsvis addere,
    //subtrahere, multiplisere og dividere to desimaltall.
    //Skriv også kode i main-metoden for å kalle
    //disse metodene for å sjekke at de fungerer.

import static javax.swing.JOptionPane.showInputDialog;
import static javax.swing.JOptionPane.showMessageDialog;

class Kalkulator {

        public Kalkulator() {

        }
        public static double regnMedAddisjon(double desimaltall1, double desimaltall2){
            double addisjon = desimaltall1 + desimaltall2;
            return addisjon;
        }

        public static double regnMedSubtraksjon(double desimaltall1, double desimaltall2){
            double subtraksjon = desimaltall1 - desimaltall2;
            return subtraksjon;
        }

        public static double regnMedMultipliksajon(double desimaltall1, double desimaltall2){
            double multiplikasjon = desimaltall1 * desimaltall2;
            return multiplikasjon;
        }

        public static double regnMedDivisjon(double desimaltall1, double desimaltall2){
            double divisjon = desimaltall1 / desimaltall2;
            return divisjon;
        }
    }

    public class Oppg5 {
        public static void main(String[] args) {

            Kalkulator kalkulator1 = new Kalkulator();


            String valg = showInputDialog("Hva vil du regne med: addisjon, substraksjon, multiplikasjon eller divisjon?");

            if (valg.equals("addisjon")){
                double desimaltall1 = Double.parseDouble(showInputDialog("Skriv inn første desimaltall"));
                double desimaltall2 = Double.parseDouble(showInputDialog("Skriv inn andre desimaltall"));

                String ut = desimaltall1+ " pluss " +desimaltall2+ " blir " + kalkulator1.regnMedAddisjon(desimaltall1, desimaltall2);

                showMessageDialog(null, ut);
        }
            if (valg.equals("subtraksjon")){
                double desimaltall1 = Double.parseDouble(showInputDialog("Skriv inn første desimaltall"));
                double desimaltall2 = Double.parseDouble(showInputDialog("Skriv inn andre desimaltall"));

                String ut = desimaltall1+ " minus " +desimaltall2+ " blir " +kalkulator1.regnMedSubtraksjon(desimaltall1, desimaltall2);

                showMessageDialog(null, ut);
            }

            if (valg.equals("multiplikasjon")){
                double desimaltall1 = Double.parseDouble(showInputDialog("Skriv inn første desimaltall"));
                double desimaltall2 = Double.parseDouble(showInputDialog("Skriv inn andre desimaltall"));

                String ut = desimaltall1+ " multiplisert med " +desimaltall2+ " blir " +kalkulator1.regnMedMultipliksajon(desimaltall1, desimaltall2);

                showMessageDialog(null, ut);
            }

            if (valg.equals("divisjon")){
                double desimaltall1 = Double.parseDouble(showInputDialog("Skriv inn første desimaltall"));
                double desimaltall2 = Double.parseDouble(showInputDialog("Skriv inn andre desimaltall"));

                String ut = desimaltall1+ " delt med " +desimaltall2+ " blir " +kalkulator1.regnMedDivisjon(desimaltall1, desimaltall2);

                showMessageDialog(null, ut);
            }
    }
}
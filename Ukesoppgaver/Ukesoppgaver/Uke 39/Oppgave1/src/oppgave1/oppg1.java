package oppgave1;

    //Lag en klasse «Person» med følgende private attributter:
    //fornavn
    //etternavn
    //adresse
    //telefonnr
    //Lag en konstruktør som setter disse ved instansiering av klassen.
    //Lag så «get», «set» metoder for disse.
    //Lag så en metode som skriver ut dataene via Swing sin ShowMessageDialog med linjeskift mellom de ulike feltene.
    //Skriv så kode i «main» for å lese inn dataene via Swing sin input,
    //opprette et objekt og kalle metoden over for å vise disse.

import javax.swing.*;

class Person {
    private String fornavn;
    private String etternavn;
    private String adresse;
    private int telefonnr;

    public Person(String fornavn, String etternavn, String adresse, int telefonnr){
        this.fornavn = fornavn;
        this.etternavn = etternavn;
        this.adresse = adresse;
        this.telefonnr = telefonnr;
    }

    public String getFornavn(){
        return fornavn;
    }

    public void setFornavn(String fornavn){
        this.fornavn = fornavn;
    }

    public String getEtternavn(){
        return etternavn;
    }

    public void setEtternavn(String etternavn){
        this.etternavn = etternavn;
    }

    public String getAdresse(){
        return adresse;
    }

    public void setAdresse(String adresse){
        this.adresse = adresse;
    }

    public int getTelefonnr(){
        return telefonnr;
    }

    public void setTelefonnr(int telefonnr){
        this.telefonnr = telefonnr;
    }

    // public void skrivUtPerson(){
    //String ut = "Her er info om deg: \n";
    //ut += "Fornavn: " +fornavn+ "\n";
    //ut += "Etternavn: " +etternavn+ "\n";
    //ut += "Adresse: " +adresse+ "\n";
    //ut += "Telefonnummer : " +telefonnr+ "\n";
    //JOptionPane.showMessageDialog(null, ut);
    //}

}

public class oppg1 {
    public static void main(String [] args){
       // String fornavn = JOptionPane.showInputDialog("Skriv inn fornavn");
       // String etternavn = JOptionPane.showInputDialog("Skriv inn etternavn");
       // String adresse = JOptionPane.showInputDialog("Skriv inn adresse");
       // int telefonnr = Integer.parseInt(JOptionPane.showInputDialog("Skriv inn telefonnummer"));

        Person nyPerson = new Person("Sarah", "Olsen", "Akerveien 22", 38742604);

        System.out.println(nyPerson.getFornavn()+ " " +nyPerson.getEtternavn()+ " bor på " +nyPerson.getAdresse()+ " og har telefonnummer " + nyPerson.getTelefonnr());
    }
}



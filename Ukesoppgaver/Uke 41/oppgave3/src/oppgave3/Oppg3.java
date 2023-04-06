package oppgave3;

//Gitt følgende string-array : Per, Hansen, Line, Olsen, Ola, Pedersen, Kari, Finnsen.
//Skriv så ut for og etternavn på flere linjer med en løkke som vist under:
//Per Hansen
//Line Olsen
//....

class Person{
    public String fornavn;
    public String etternavn;
}

public class Oppg3 {
    public static void main(String [] args){

        String [] navn = {"Per", "Hansen", "Line", "Olsen", "Ola", "Pedersen", "Kari", "Finnsen"};

        Person [] liste = new Person[4];

        //
        Person person1 = new Person();

        person1.fornavn = navn[0];
        person1.etternavn = navn[1];

        liste[0] = person1;

        //
        Person person2 = new Person();

        person2.fornavn = navn[2];
        person2.etternavn = navn[3];

        liste[1] = person2;

        //
        Person person3 = new Person();

        person3.fornavn = navn[4];
        person3.etternavn = navn[5];

        liste[2] = person3;

        //
        Person person4 = new Person();

        person4.fornavn = navn[6];
        person4.etternavn = navn[7];

        liste[3] = person4;


        for (Person enPerson : liste){
            System.out.println(enPerson.fornavn+ " " +enPerson.etternavn);
        }
    }
}

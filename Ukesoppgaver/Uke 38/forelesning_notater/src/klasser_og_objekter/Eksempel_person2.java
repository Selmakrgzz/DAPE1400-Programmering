package klasser_og_objekter;

//flere klasser i en pakke

class Person2 { //klasse er en mal for et objekt. Det defineres en antributt i klassen
    public String navn; //antributt
    public int fodselsar; //må være public for at en annen klasse og se/bruke den

    public void alder(){
        int alder = 2019 - fodselsar;
        System.out.println(alder+ " år");
    }
}

public class Eksempel_person2 { //en public class i hver fil
    public static void main (String [] args){ //main er metode
        Person2 person1 = new Person2();
        person1.navn = "Line Jensen"; //settes verdi i antributten
        person1.fodselsar = 1999;
        System.out.println(person1.navn+ " er"); // out er en klasse og println er en metode
        person1.alder();
    }
}

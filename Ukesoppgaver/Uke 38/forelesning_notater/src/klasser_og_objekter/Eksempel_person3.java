package klasser_og_objekter;

class Person3 {
    public String navn;
    public int fødselsår;
    public String alder;

    public int alder(){
        int alder = 2019 - fødselsår;
        return alder;
    }
}

public class Eksempel_person3 {

    public static void main (String [] args){
        Person3 person1 = new Person3();
        person1.navn = "Line Jensen";
        person1.fødselsår = 1999;
        int alder = person1.alder();
        System.out.println(person1.navn+ " er" +person1.alder+ " år");
    }
}

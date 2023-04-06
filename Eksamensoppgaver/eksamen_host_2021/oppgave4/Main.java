package eksamen_host_2021.oppgave4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student nyStudent = new Student("Mari", "Akervei22", "38383883", "1234", "Dataing");
        Ansatt nyAnsatt = new Ansatt("Hamse", "Vestervei44", "93826432", "Medisin", 700000);
        ArrayList<Person1> list = new ArrayList<>();
        list.add(nyStudent);
        list.add(nyAnsatt);

        for (Person1 enPerson : list){
            System.out.println(enPerson);
        }
    }
}

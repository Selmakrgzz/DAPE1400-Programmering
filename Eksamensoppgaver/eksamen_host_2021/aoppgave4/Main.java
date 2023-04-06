package eksamen_host_2021.aoppgave4;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Student kari = new Student("Kari", "Akervei 33", "933993993", "292992929", "Web");
        Ansatt matio = new Ansatt("Matio", "Østrevei 22", "83838838", "Helse og fag", 345_000);

        ArrayList<Person> list = new ArrayList<>();
        list.add(kari);
        list.add(matio);

        for (Person enPerson : list){
            System.out.println();
            System.out.println(enPerson);
        }
    }
}

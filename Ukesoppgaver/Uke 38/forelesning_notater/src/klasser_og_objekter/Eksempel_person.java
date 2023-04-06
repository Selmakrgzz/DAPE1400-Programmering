package klasser_og_objekter;

 class Person {
    public String navn (String fornavn, String etternavn){

        String navn = fornavn+ " " +etternavn;
        return navn;
    }

}
     public class Eksempel_person {
         public static void main(String [] args){

             Person enPerson = new Person();
             String etNavn = enPerson.navn("Lene", "Jensen");
             System.out.println(etNavn);

         }
}
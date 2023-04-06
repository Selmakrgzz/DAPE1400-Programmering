package eksamen_host_2020.aoppgave2;

 class Pasient extends Person{
     private String diagnose;
     public Pasient(String navn, String personnummer, int alder, String diagnose){
         super(navn, personnummer, alder);
         this.diagnose = diagnose;
     }

     @Override
     public String toString() {
         return "Pasienter: \n" +super.toString()+ "\n"
                 +"Diagnose: " +diagnose;
     }
 }

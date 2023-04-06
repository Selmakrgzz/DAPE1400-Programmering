package eksamen_host_2021.aoppgave4;

class Student extends Person{
    private String studentnr;
    private String studienavn;

    public Student(String navn, String adresse, String telefonnr, String studentnr, String studienavn){
        super(navn, adresse, telefonnr);
        this.studentnr = studentnr;
        this.studienavn = studienavn;
    }

    @Override
    public String toString() {
        return "Studenter: \n"
                +super.toString()+ "\n"
                +"Studentnr: " +studentnr+ "\n"
                +"Studienavn: " +studienavn;
    }
}

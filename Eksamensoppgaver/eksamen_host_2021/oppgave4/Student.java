package eksamen_host_2021.oppgave4;

class Student extends Person1{
    private String studentnr;
    private String studienavn;

    public Student (String navn, String adresse, String telefonnr, String studentnr, String studienavn){
        super(navn, adresse, telefonnr);
        this.studentnr = studentnr;
        this.studienavn = studienavn;
    }

    @Override
    public String toString() {
        return super.toString()+ "\n Studentnr: " +studentnr+ " Studienavn: " +studienavn;
    }
}

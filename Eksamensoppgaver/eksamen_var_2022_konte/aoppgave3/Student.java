package eksamen_var_2022_konte.aoppgave3;

class Student {
    private Personlia personlia;
    private String studentnr;

    public Student(Personlia personlia, String studentnr){
        this.personlia = personlia;
        this.studentnr = studentnr;
    }

    @Override
    public String toString() {
        return "Personlia(studenter): \n"
                +personlia+ "\n"
                +"Studentnr: " +studentnr;
    }
}

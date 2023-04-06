package eksamen_var_2021_konte.aaaoppgave3;

class Student {
    private String navn;
    private String studNr;

    public Student(String navn, String studNr){
        this.navn = navn;
        this.studNr = studNr;
    }

    public String getNavn() {
        return navn;
    }

    public void setNavn(String navn) {
        this.navn = navn;
    }

    public String getStudNr() {
        return studNr;
    }

    public void setStudNr(String studNr) {
        this.studNr = studNr;
    }

    @Override
    public String toString() {
        return "Student: " +navn+ ", Studnr: " +studNr;
    }
}

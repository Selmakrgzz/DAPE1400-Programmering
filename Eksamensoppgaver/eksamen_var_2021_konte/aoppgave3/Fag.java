package eksamen_var_2021_konte.aoppgave3;

class Fag {
    private String navn;
    private String ar;
    private Student[] studenter;

    public Fag(String navn, String ar, Student [] studenter){
        this.navn = navn;
        this.ar = ar;
        this.studenter = studenter;
    }

    public String getNavn(){
        return navn;
    }

    public void setNavn(String navn){
        this.navn = navn;
    }

    public String getAr() {
        return ar;
    }

    public void setAr(String ar) {
        this.ar = ar;
    }

    public Student [] getStudenter(){
        return studenter;
    }

    public void setStudenter(Student [] studenter){
        this.studenter = studenter;
    }

    @Override
    public String toString() {
        String ut = "Fag: " +navn+ " Kull: " +ar;
        for (Student enStudent : studenter){
            ut += "\n";
            if (enStudent != null){
                ut += enStudent;
            }
        }
        return ut;
    }
}

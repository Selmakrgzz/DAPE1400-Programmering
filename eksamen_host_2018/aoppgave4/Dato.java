package eksamen_host_2018.aoppgave4;

class Dato {
    private int dag;
    private int mnd;
    private int ar;

    public Dato(int dag, int mnd, int ar){
        this.dag = dag;
        this.mnd = mnd;
        this.ar = ar;
    }

    private static String manedsnavn(int mnd){
        String [] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };

        if (mnd > 0 && mnd < 13){
            return navn[mnd - 1];
        }else {
            return "Ukjent måned";
        }
    }

    @Override
    public String toString() {
        return dag+ " " +manedsnavn(mnd)+ " " +ar;
    }
}

package eksamen_host_2018.oppgave4;

public class Dato {

    private int dag, maned, ar;

    public Dato(int dag, int maned, int ar){
        this.dag = dag;
        this.maned = maned;
        this.ar = ar;
    }

    private static String manedsnavn(int mnd){
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if (mnd > 0 && mnd < 13){
            return navn[mnd -1];
        } else {
            return "Ukjent måned";
        }
    }

    @Override
    public String toString() {
        return dag+ " " +manedsnavn(maned)+ " " +ar;
    }
}

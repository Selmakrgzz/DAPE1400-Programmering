package eksamen_host_2018.aaoppgave4;

class Dato {
    private int dag, måned, år;

    public Dato( int dag, int måned, int år ) {
        this.dag = dag;
        this.måned = måned;
        this.år =år;
    }

    private static String månedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    // skriv en toString metode slik at datoen kommer ut på følgende format:
    // dd månedsnavn år, f.eks 1 januar 2019


    @Override
    public String toString() {
        return dag+ " " +månedsnavn(måned)+ " " +år;
    }
}

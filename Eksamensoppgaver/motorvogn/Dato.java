package motorvogn;

class Dato {
    private int dag, maned, ar;

    public Dato( int dag, int maned, int ar ) {
        this.dag = dag;
        this.maned = maned;
        this.ar =ar;
    }

    private static String manedsnavn( int mnd ) {
        String[] navn = { "januar", "februar", "mars", "april", "mai",
                "juni", "juli", "august", "september", "oktober", "november",
                "desember" };
        if ( mnd > 0 && mnd < 13 )
            return navn[ mnd - 1 ];
        else
            return "ukjent måned";
    }

    public String toString(){
        // lag denne
        return dag+ " " +manedsnavn(maned)+ " " +ar;
    }
}

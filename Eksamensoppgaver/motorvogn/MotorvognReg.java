package motorvogn;

public class MotorvognReg {
    public static void main(String[] args) {
        // opprett et array av Biler
        Bil [] biler = new Bil[2];
        // Sett inn noen biler i arrayet
        String type = "uadi3 3";
        Dato dato1 = new Dato(12, 4, 2020);
        String kjennemrke = "99399393";

        String type2 = "merce 54";
        Dato dato2 = new Dato(22, 9, 2010);
        String kjennemrke2 = "2992992";

        Bil bil1 = new Bil(type, dato1, kjennemrke);
        Bil bil2 = new Bil(type2, dato2, kjennemrke2);

        biler[0] = bil1;
        biler[1] = bil2;

        // List motorvognregisteret (arrayet) ved hjelp av en løkke

        for (Bil enBil : biler){
            System.out.println();
            System.out.println(enBil);
        }

    }
}

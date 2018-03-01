public class FysiskAktivitet extends Kursus {

    private boolean medbringHaandklaede = false; //False er default

    public FysiskAktivitet(String navn, Underviser underviser, Lokale lokalenr, boolean medbringHaandklaede) {
        super(navn, underviser, lokalenr); //Constructor er nedarvet fra klassen Kursus
        this.medbringHaandklaede = medbringHaandklaede;
    }

}
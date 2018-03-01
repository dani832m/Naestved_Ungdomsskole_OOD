public class Fag extends Kursus {

    private int antalBoeger = 0; //0 bøger er default

    public Fag(String navn, Underviser underviser, Lokale lokalenr, int antalBoeger) {
        super(navn, underviser, lokalenr); //Constructor er nedarvet fra klassen Kursus
        this.antalBoeger = antalBoeger;
    }

}

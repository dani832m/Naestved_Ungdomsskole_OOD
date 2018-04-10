public class Fag extends Kursus {

    //Instansvariabler for Fag
    private int antalBoeger = 0; //0 bøger er default

    //Constructor for Fag
    public Fag(String kursusNavn, Underviser underviser, Lokale lokalenr, Ugedag ugedag, boolean afsluttendeProeve, int antalBoeger) {
        super(kursusNavn, underviser, lokalenr, ugedag, afsluttendeProeve); //Constructor er nedarvet fra klassen Kursus
        this.antalBoeger = antalBoeger;
    }
}

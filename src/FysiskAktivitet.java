public class FysiskAktivitet extends Kursus {

    //Instansvariabler for FysiskAktivitet
    private boolean medbringHaandklaede = false; //False er default

    //Constructor for FysiskAktivitet
    public FysiskAktivitet(String kursusNavn, Underviser underviser, Lokale lokalenr, Ugedag ugedag, boolean afsluttendeProeve, boolean medbringHaandklaede) {
        super(kursusNavn, underviser, lokalenr, ugedag, afsluttendeProeve); //Constructor er nedarvet fra klassen Kursus
        this.medbringHaandklaede = medbringHaandklaede;
    }

}
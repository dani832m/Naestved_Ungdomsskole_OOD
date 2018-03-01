public class Vaerkstedsfag extends Kursus {

    //Instansvariabler for Vaerkstedsfag
    private boolean vaerktoejPaakraevet = false; //False er default

    //Constructor for Vaerkstedsfag
    public Vaerkstedsfag(String kursusNavn, Underviser underviser, Lokale lokalenr, Ugedag ugedag, boolean afsluttendeProeve, boolean vaerktoejPaakraevet) {
        super(kursusNavn, underviser, lokalenr, ugedag, afsluttendeProeve); //Constructor er nedarvet fra klassen Kursus
        this.vaerktoejPaakraevet = vaerktoejPaakraevet;
    }

}

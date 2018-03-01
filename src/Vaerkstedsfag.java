public class Vaerkstedsfag extends Kursus {

    private boolean vaerktoejPaakraevet = false; //False er default

    public Vaerkstedsfag(String navn, Underviser underviser, Lokale lokalenr, boolean vaerktoejPaakraevet) {
        super(navn, underviser, lokalenr); //Constructor er nedarvet fra klassen Kursus
        this.vaerktoejPaakraevet = vaerktoejPaakraevet;
    }

}

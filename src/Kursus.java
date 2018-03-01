public abstract class Kursus {

    private String navn;
    private Underviser underviser;
    private Lokale lokalenr;

    public Kursus(String navn, Underviser underviser, Lokale lokalenr) {
        this.navn = navn;
        this.underviser = underviser;
        this.lokalenr = lokalenr;
    }

}
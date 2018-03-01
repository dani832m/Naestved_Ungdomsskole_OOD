public class Kursist {

    //Instansvariabler for Kursist
    private String kursistNavn;
    private int alder;
    private String skole;
    private int klasse;
    private int telefonnr;
    private int id;
    private String password;
    private Kursus[] tilmeldteKurser;

    //Constructor for Kursist
    public Kursist(String kursistNavn, int alder, String skole, int klasse, int telefonnr, int id, String password) {
        this.kursistNavn = kursistNavn;
        this.alder = alder;
        this.skole = skole;
        this.klasse = klasse;
        this.telefonnr = telefonnr;
        this.id = id;
        this.password = password;

        if (alder < 13 || alder > 18) {
            throw new IllegalArgumentException("Kursisten skal være mellem 14 og 18 år.");
        }
    }

    //toString-metode
    public String toString() {
        return "Kursistnavn: " + kursistNavn + ", Alder: " + alder + ", Klasse: " + klasse + "., Telefonnummer: " + telefonnr;
    }

}

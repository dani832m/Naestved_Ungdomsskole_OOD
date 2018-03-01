public abstract class Kursus {

    //Instansvariabler for Kursus
    private String kursusNavn;
    private Underviser underviser;
    private Lokale lokalenr;
    private Ugedag ugedag;
    private boolean afsluttendeProeve = false; //Som default er der ingen afsluttende prøve

    //Constructor for Kursus
    public Kursus(String kursusNavn, Underviser underviser, Lokale lokalenr, Ugedag ugedag, boolean afsluttendeProeve) {
        this.kursusNavn = kursusNavn;
        this.underviser = underviser;
        this.lokalenr = lokalenr;
        this.ugedag = ugedag;
        this.afsluttendeProeve = afsluttendeProeve;
    }

    //toString-metode
    public String toString() {
        return "Kursusnavn: " + kursusNavn + ", Underviser: " + underviser + ", Lokale nr. " + lokalenr + ", Ugedag: " + ugedag + ", Afsluttes med en prøve: " + afsluttendeProeve;
    }

}
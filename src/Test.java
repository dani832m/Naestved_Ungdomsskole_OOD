public class Test {

    public static void main(String[] args) {

        //Testkurser oprettes som objekt
        Kursus fransk1 = new Fag("Fransk for begyndere", Underviser.JONATHAN, Lokale.A1, 2);
        Kursus keramik1 = new Vaerkstedsfag("Keramik for begyndere", Underviser.MOGENS, Lokale.A2, true);
        Kursus parkour1 = new FysiskAktivitet("Parkout for begyndere", Underviser.OLE, Lokale.A3, false);

    }

}

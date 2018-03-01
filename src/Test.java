public class Test {

    public static void main(String[] args) {

        //Testkurser oprettes som objekt
        Kursus fransk1 = new Fag("Fransk for begyndere", Underviser.JONATHAN, Lokale.A1, Ugedag.MANDAG, true, 3);
        Kursus keramik1 = new Vaerkstedsfag("Keramik for begyndere", Underviser.MOGENS, Lokale.A2, Ugedag.TIRSDAG,true, false);
        Kursus parkour1 = new FysiskAktivitet("Parkout for begyndere", Underviser.OLE, Lokale.A3, Ugedag.ONSDAG, false, false);

        System.out.println(fransk1); //Tester toString()

        //Opretter kursister
        try {
            Kursist kursist1 = new Kursist("Benjamin Petersen", 14, "Bøgemarkskolen", 7, 25665566, 1, "hejmeddig");
            System.out.println(kursist1); //Tester toString()
        } catch (IllegalArgumentException e) {
            System.out.println("Kursisten skal være mellem 14 og 18 år.");
        }

    }

}

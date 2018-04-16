/**
 * I denne klasse testes nogle af systemets objekter og metoder.
 *
 * @author Daniel
 */
public class Test {

    public static void main(String[] args) {

        //Testkurser oprettes som objekt
        Kursus fransk1 = new Fag("Fransk for begyndere", Underviser.JONATHAN, Lokale.A1, Ugedag.MANDAG, true, 3);
        Kursus keramik1 = new Vaerkstedsfag("Keramik for begyndere", Underviser.MOGENS, Lokale.A2, Ugedag.TIRSDAG,true, false);
        Kursus parkour1 = new FysiskAktivitet("Parkout for begyndere", Underviser.OLE, Lokale.A3, Ugedag.ONSDAG, false, false);

        System.out.println(fransk1); //Tester toString()

        //Opretter kursister
        Kursist kursist1 = new Kursist("Benjamin Petersen", 14, "Bøgemarkskolen", 7, 25665566, 1, "hejmeddig");
        System.out.println(kursist1); //Tester toString()
        Kursist kursist2 = new Kursist("Ole Olesen", 16, "Bøgemarkskolen", 9,21987754,2,"oleersej123");
        System.out.println(kursist2); //Tester toString()

        //Array med kursister
        Kursist[] hold1 = new Kursist[2];
        hold1[0] = kursist1;
        hold1[1] = kursist2;
    }
}
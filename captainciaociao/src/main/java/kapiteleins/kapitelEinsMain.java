package kapiteleins;

public class kapitelEinsMain {
    public static void main(String[] args) {
        /**
         * Problem: Cannot make a static reference to the non-static field ueins
         * 
         * @code
         *       ueins.captainAusgabe();
         * 
         * Erklärung: Das Problem besteht darin, dass versucht wurde, die Methode
         * aus der Klasse UebungEinsEinsEins aufzurufen, ohne ein Objekt in der
         * Main-Methode zu erzeugen. Alternativ hätte die Methode als static
         * deklariert werden können.
         * 
         */

        /**
         * Übung 1.1.1
         * Gebe "Aye Captain!" auf der Konsole aus
         */
        UebungEinsEinsEins.captainAusgabe();

    }
}

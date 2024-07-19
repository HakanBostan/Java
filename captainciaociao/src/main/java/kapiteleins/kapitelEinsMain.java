package kapiteleins;

public class kapitelEinsMain {
    public static void main(String[] args) {
        /**
         * Problem: Cannot make a static reference to the non-static field ueins
         * 
         * @code
         *       ueins.captainAusgabe();
         * 
         *       Erklärung: Das Problem besteht darin, dass versucht wurde, die Methode
         *       aus der Klasse UebungEinsEinsEins aufzurufen, ohne ein Objekt in der
         *       Main-Methode zu erzeugen. Alternativ hätte die Methode als static
         *       deklariert werden können.
         * 
         */

        /**
         * Übung 1.1.1
         * Gebe "Aye Captain!" auf der Konsole aus
         */
        UebungEinsEinsEinsss.captainAusgabe();

        System.out.println("ä");

        /**
         * Übung 1.2.1
         * Fehler bewusst in den Programmcode eintragen.
         * 
         * Änderung 1:
         * Ändere den Dateinamen.
         * 
         * Auswirkung auf Änderung 1:
         * Der Dateiname passt sich sowohl im Explorer als auch in der Datei selbst an.
         * 
         * 
         * Änderung 2:
         * Ändere die Groß-Kleinschreibung. Beispiel: Class statt class.
         * 
         * Auswirkung auf Änderung 2:
         * Ein Syntaxfehler wird angezeigt, der darauf hinweist, dass "class"
         * kleingeschrieben werden muss.
         * Das liegt daran, dass "class" ein Schlüsselwort ist und Schlüsselwörter
         * klein geschrieben werden.
         * 
         * 
         * Änderung 3:
         * Ändere den Namen der Main-Methode auf 'Letsgo'.
         * 
         * Auswirkung auf Änderung 3:
         * Der Compiler weiß nicht, von wo aus das Programm gestartet werden soll.
         * 
         * Änderung 4:
         * Gib Umlaute oder Herzchen aus und sieh, ob es funktioniert.
         * 
         * Auswirkung auf Änderung 4:
         * Umlaute und Herzchen können ausgegeben werden.
         * 
         * Änderung 5:
         * public class Application{public static void
         * main(String[]args){System.out.println("Aye Captain!");}} -> Ist dieser Aufruf
         * möglich?
         * 
         * Auswirkung auf Änderung 5:
         * Ja, es ist möglich, da Java nicht whitespace-sensitiv ist.
         * 
         */

    }
}

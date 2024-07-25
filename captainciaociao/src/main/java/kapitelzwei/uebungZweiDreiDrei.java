package kapitelzwei;

import java.util.Scanner;

public class uebungZweiDreiDrei {

    /**
     * Die Methode prüft ob zwei Integer gemeinsame Ziffern haben
     * 
     * @param n.A.
     * @return boolean.
     */

    public boolean ausgabe6() {

        System.out.println("gib 2 Zahlen zwischen 0 und 99 an");
        String x = new Scanner(System.in).nextLine();
        String y = new Scanner(System.in).nextLine();

        for (int i = 0; i < x.length(); i++) {
            char digit = x.charAt(i);

            if (digit == y.charAt(i)) {
                return true;
            }

        }

        return false;

    }

}

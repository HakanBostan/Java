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

        // if( x.length() > 2){

        //     int temp1;
            
        //     for (int i = 1; i < x.length(); i++) {
        //         char digit = x.charAt(i);
    
        //         if (digit == y.charAt(i)) {
    
                    
    
        //         }
    
        //     }
        // }

        for (int i = 0; i < x.length(); i++) {
            char digit = x.charAt(i);

            if (digit == y.charAt(i)) {

                System.out.println( x + " und " + y + " haben eine gemeinsame Ziffer");
                return true;

            }

        }
        System.out.println( x + " und " + y + " haben keine gemeinsame Ziffer");
        return false;

    }

}

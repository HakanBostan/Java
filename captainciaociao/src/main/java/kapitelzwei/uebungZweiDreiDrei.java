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

        for (int i = 0; i <= 2; i++) {

            for (int j = 0; j <= 2; j++) {

                char digit1 = x.charAt(x.length()-1);
                int temp1 = -1;

                if(digit1 == y.charAt(y.length()- temp1)){
                    System.out.println( x + " und " + y + " haben eine gemeinsame Ziffer");
                    return true;
                };

                temp1 -= 1;
            }

            char digit2 = x.charAt(x.length()-2);
            int temp2 = -1;
            if (digit2 == y.charAt(y.length()-temp2)) {
                
                System.out.println( x + " und " + y + " haben eine gemeinsame Ziffer");
                return true;

            }
            temp2 -= 1;

        }
        System.out.println( x + " und " + y + " haben keine gemeinsame Ziffer");
        return false;

    

    }

}

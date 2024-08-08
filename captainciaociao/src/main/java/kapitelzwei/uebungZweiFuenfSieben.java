package kapitelzwei;

import java.util.Scanner;

public class uebungZweiFuenfSieben {

    /**
     * 
     * Die Methode prüft ob die eingegebene Zahl eine Fakultät ist. 
     * 
     * @param int n
     * @return n.A.
     */
 
     public void a257() {
        System.out.print("gib eine Zahl ein und prüfe ob Sie eine Fakultät ist: ");
        Scanner scan = new Scanner(System.in);
        int zahl = scan.nextInt();
        int n = 9;
        int fak = 1;

        for (int i = 1; i < 10; i++) {
            if (zahl % i != 0) {
                System.out.println(zahl + " ist keine Fakultät");
                break;
            }
        }


        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                if (i == zahl) {
                    System.out.println(zahl + " ist eine Faktultät: \n" + zahl + " = " + i + "!");
                    break;
                }
                i *= j;
            }


        }


    }
}

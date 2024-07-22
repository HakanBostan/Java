package kapitelzwei;

import java.util.Random;

public class uebungZweiZweiVier {

    /**
     * Die Methode gibt einen formatierten String aus. Der Radiuswert wird zufällig generiert.
     * 
     * @param x,y
     * @return n.A.
     */

    public void ausgabe3(int x, int y) {

        Random rand = new Random();

        double r = rand.nextInt(10) + 10;

        System.out.printf("<svg height=\"400\" width=\"1000\"> %n <circle cx=\"%d\" cy=\"%d\" r=\"%.3f\" /> %n</svg>",
                x, y, r);
    }

}

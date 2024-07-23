package kapitelzwei;

import java.util.Random;

public class uebungZweiZweiSechs {

    /**
     * Die Methode gibt einen formatierten String aus. Der Radiuswert wird zufällig
     * generiert. und der x sowie y wert werden per commandozeile angegeben.
     * 
     * @param n.A.
     * @return n.A.
     */

    public void ausgabe4() {

        System.out.println("gibt x koordinate an");
        int x = new java.util.Scanner(System.in).nextInt();

        System.out.println("gib y Kooridnate an");
        int y = new java.util.Scanner(System.in).nextInt();

        Random rand = new Random();

        double r = rand.nextInt(10) + 10;

        System.out.printf("<svg height=\"400\" width=\"1000\"> %n <circle cx=\"%d\" cy=\"%d\" r=\"%.3f\" /> %n</svg>",
                x, y, r);

    }

}

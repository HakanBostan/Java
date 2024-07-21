package kapitelzwei;

public class uebungZweiZweiEins {

    /**
     * Die Methode gibt einen formatierten String aus.
     * 
     * @param x,y,r
     * @return n.A.
     */

    public void ausgabe2(int x, int y, double r) {
        System.out.printf("<svg height=\"400\" width=\"1000\"> %n <circle cx=\"%d\" cy=\"%d\" r=\"%.3f\" /> %n</svg>",
                x, y, r);
    }

}

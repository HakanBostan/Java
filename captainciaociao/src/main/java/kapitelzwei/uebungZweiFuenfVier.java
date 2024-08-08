package kapitelzwei;

public class uebungZweiFuenfVier {

    /**
     * 
     * Die Methode ist Gay
     * 
     * @param n.A.
     * @return n.A.
     */

    public void a254() {

        double t = Math.random() * 10;

        while (t > 0) {

            if (t < 1.0) {
                t *= 2;
                System.out.println(t);
            }

            if (t >= 1.0) {
                t -= 1;
                System.out.println(t);
            }

        }

    }

}

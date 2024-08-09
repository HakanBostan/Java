package kapitelzwei;

public class uebungZweiFuenfSechs {

    /**
     * 
     * Die Methode berechnet die Fakultät.
     * 
     * @param int n
     * @return n.A.
     */

    public void a256(int n) {
        int fak = 1;

        for (int i = 1; i <= n; i++) {
            fak *= i;
        }
        System.out.println(fak);
    }

}
